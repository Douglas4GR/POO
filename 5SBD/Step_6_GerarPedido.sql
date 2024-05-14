INSERT INTO Pedido (OrderId, OrderItemId, OrderTotalValue, PurchaseDate, PaymentsDate, BuyerName, Cpf, ShipAddress1, ShipCity, ShipState, ShipPostalCode, ShipCountry, IossNumber)
SELECT 
    Carga_Temporaria.OrderId,
    Carga_Temporaria.OrderItemId,
    SUM(Carga_Temporaria.ItemPrice * Carga_Temporaria.QuantityPurchased) AS OrderTotalValue,
    Carga_Temporaria.PurchaseDate,
    Carga_Temporaria.PaymentsDate,
    Carga_Temporaria.BuyerName,
    Carga_Temporaria.Cpf,
    Carga_Temporaria.ShipAddress1,
    Carga_Temporaria.ShipCity,
    Carga_Temporaria.ShipState,
    Carga_Temporaria.ShipPostalCode,
    Carga_Temporaria.ShipCountry,
    Carga_Temporaria.IossNumber
FROM 
    Carga_Temporaria
JOIN 
    ItensPedidos ON Carga_Temporaria.OrderItemId = ItensPedidos.OrderItemId
GROUP BY 
    Carga_Temporaria.OrderId,
    Carga_Temporaria.OrderItemId,
    Carga_Temporaria.PurchaseDate,
    Carga_Temporaria.PaymentsDate,
    Carga_Temporaria.BuyerName,
    Carga_Temporaria.Cpf,
    Carga_Temporaria.ShipAddress1,
    Carga_Temporaria.ShipCity,
    Carga_Temporaria.ShipState,
    Carga_Temporaria.ShipPostalCode,
    Carga_Temporaria.ShipCountry,
    Carga_Temporaria.IossNumber;
