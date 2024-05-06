INSERT INTO Pedido (OrderId, OrderItemId, OrderTotalValue, PurchaseDate, PaymentsDate, BuyerName, Cpf, ShipAddress1, ShipCity, ShipState, ShipPostalCode, ShipCountry, IossNumber)
SELECT OrderId, OrderItemId, SUM(ItemPrice * QuantityPurchased) AS OrderTotalValue, PurchaseDate, PaymentsDate, BuyerName, Cpf, ShipAddress1, ShipCity, ShipState, ShipPostalCode, ShipCountry, IossNumber
FROM Carga_Temporaria
GROUP BY OrderId, OrderItemId, PurchaseDate, PaymentsDate, BuyerName, Cpf, ShipAddress1, ShipCity, ShipState, ShipPostalCode, ShipCountry, IossNumber;
