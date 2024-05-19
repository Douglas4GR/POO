INSERT INTO Clientes (ClientEmail, ClientName, Cpf, ClientPhoneNumber, ClientAddress1, ClientAddress2, ClientAddress3, ClientCity, ClientState, ClientPostalCode, ClientCountry)
SELECT DISTINCT BuyerEmail, BuyerName, Cpf, BuyerPhoneNumber, ShipAddress1, ShipAddress2, ShipAddress3, ShipCity, ShipState, ShipPostalCode, ShipCountry
FROM Carga_Temporaria;
