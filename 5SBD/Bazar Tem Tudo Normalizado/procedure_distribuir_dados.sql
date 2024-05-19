-- Stored Procedure para Distribuir Dados
CREATE PROCEDURE DistribuirDados
AS
BEGIN
    -- Inserir novos clientes
    INSERT INTO CLIENTES (CPF, buyer_name, buyer_email, buyer_phone_number)
    SELECT DISTINCT CPF, buyer_name, buyer_email, buyer_phone_number
    FROM CARGA
    WHERE CPF NOT IN (SELECT CPF FROM CLIENTES);

    -- Inserir novos endereços
    INSERT INTO ENDERECOS (adress_ID, ship_adress_1, ship_city, ship_state, ship_country, ship_postal_code, ship_service_level, CPF)
    SELECT DISTINCT adress_ID, ship_adress_1, ship_city, ship_state, ship_country, ship_postal_code, ship_service_level, CPF
    FROM CARGA
    WHERE adress_ID NOT IN (SELECT adress_ID FROM ENDERECOS);

    -- Inserir novos produtos (com estoque inicial de 100)
    INSERT INTO PRODUTOS (SKU, product_name, item_price, stock)
    SELECT DISTINCT SKU, product_name, item_price, 100
    FROM CARGA
    WHERE SKU NOT IN (SELECT SKU FROM PRODUTOS);

    -- Inserir novos pedidos
    INSERT INTO PEDIDOS (order_ID, pucharse_date, paymants_date, IOSS_number, currency, recipient_name, CPF, adress_ID)
    SELECT DISTINCT order_ID, pucharse_date, paymants_date, IOSS_number, currency, recipient_name, CPF, adress_ID
    FROM CARGA
    WHERE order_ID NOT IN (SELECT order_ID FROM PEDIDOS);

    -- Inserir itens do pedido
    INSERT INTO ITENS_DO_PEDIDO (order_item_ID, quantity_pucharsed, SKU, order_ID)
    SELECT DISTINCT order_item_ID, quantity_pucharsed, SKU, order_ID
    FROM CARGA
    WHERE order_item_ID NOT IN (SELECT order_item_ID FROM ITENS_DO_PEDIDO);
END;
GO



-- Stored Procedure para Verificar Pedidos
CREATE PROCEDURE VerificarPedidos
AS
BEGIN
    DECLARE @order_ID INT, @sku VARCHAR(100), @quantity INT, @stock INT;
    
    DECLARE pedido_cursor CURSOR FOR
    SELECT order_ID, SKU, quantity_pucharsed
    FROM ITENS_DO_PEDIDO;
    
    OPEN pedido_cursor;
    FETCH NEXT FROM pedido_cursor INTO @order_ID, @sku, @quantity;
    
    WHILE @@FETCH_STATUS = 0
    BEGIN
        SELECT @stock = stock FROM PRODUTOS WHERE SKU = @sku;
        
        IF @stock >= @quantity
        BEGIN
            -- Atualizar estoque
            UPDATE PRODUTOS SET stock = stock - @quantity WHERE SKU = @sku;
            
            -- Inserir na tabela de pedidos finalizados
            INSERT INTO PEDIDOS_FINALIZADOS (finalized_order_ID, order_ID)
            VALUES (@order_ID, @order_ID);
        END
        ELSE
        BEGIN
            -- Inserir na tabela de pedidos não finalizados
            INSERT INTO PEDIDOS_NAO_FINALIZADOS (await_order_ID, order_ID)
            VALUES (@order_ID, @order_ID);
        END
        
        FETCH NEXT FROM pedido_cursor INTO @order_ID, @sku, @quantity;
    END
    
    CLOSE pedido_cursor;
    DEALLOCATE pedido_cursor;
END;
GO
