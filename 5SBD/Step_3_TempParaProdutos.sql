INSERT INTO Products (Sku, ProductName, Currency, ItemPrice, ShipServiceLevel, IossNumber)
SELECT DISTINCT Sku, ProductName, Currency, ItemPrice, ShipServiceLevel, IossNumber
FROM Carga_Temporaria;
