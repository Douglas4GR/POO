BEGIN TRANSACTION;

BEGIN TRY
    -- Verifique se todos os itens do pedido estão em estoque suficiente
    IF EXISTS (
        SELECT 1
        FROM ItensPedidos ip
        JOIN Estoque e ON ip.Sku = e.Sku
        WHERE ip.QuantityPurchased > e.QuantidadeDisponivel
    )
    BEGIN
        THROW 50001, 'Estoque insuficiente para um ou mais itens.', 1;
    END
    
    -- Ordene os itens do pedido do maior valor para o menor
    DECLARE @ItensPedido TABLE (
        OrderItemId INT,
        Sku VARCHAR(20),
        QuantityPurchased INT,
        ItemPrice DECIMAL(10, 2)
    );

    INSERT INTO @ItensPedido (OrderItemId, Sku, QuantityPurchased, ItemPrice)
    SELECT OrderItemId, Sku, QuantityPurchased, ItemPrice
    FROM ItensPedidos
    ORDER BY ItemPrice DESC;

    -- Atualize o estoque, dando baixa nos itens vendidos
    DECLARE @OrderItemId INT, @Sku VARCHAR(20), @QuantityPurchased INT;

    DECLARE item_cursor CURSOR FOR
    SELECT OrderItemId, Sku, QuantityPurchased
    FROM @ItensPedido;

    OPEN item_cursor;
    FETCH NEXT FROM item_cursor INTO @OrderItemId, @Sku, @QuantityPurchased;

    WHILE @@FETCH_STATUS = 0
    BEGIN
        UPDATE Estoque
        SET QuantidadeDisponivel = QuantidadeDisponivel - @QuantityPurchased
        WHERE Sku = @Sku;

        -- Marque o item como processado, se necessário, na tabela ItensPedidos

        FETCH NEXT FROM item_cursor INTO @OrderItemId, @Sku, @QuantityPurchased;
    END

    CLOSE item_cursor;
    DEALLOCATE item_cursor;

    COMMIT TRANSACTION;
END TRY
BEGIN CATCH
    ROLLBACK TRANSACTION;
    -- Tratamento de erros
    PRINT 'Ocorreu um erro, a transação foi revertida.';
END CATCH;
