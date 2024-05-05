INSERT INTO ItensPedidos (OrderId, OrderItemId, ItemPrice, BuyerEmail, BuyerName, ProductName, QuantityPurchased)
SELECT OrderId, OrderItemId, ItemPrice, BuyerEmail, BuyerName, ProductName, QuantityPurchased
FROM Carga_Temporaria;
