CREATE DATABASE Bazar_Have_All;

USE Bazar_Have_All;

CREATE TABLE Carga_Temporaria (
    OrderId INT NOT NULL,
    OrderItemId INT NOT NULL,
    PurchaseDate DATETIME NOT NULL,
    PaymentsDate DATETIME,
    BuyerEmail VARCHAR(200),
    BuyerName VARCHAR(140),
    Cpf VARCHAR(11),
    BuyerPhoneNumber VARCHAR(20),
    Sku VARCHAR(20) NOT NULL,
    ProductName VARCHAR(140),
    QuantityPurchased INT,
    Currency VARCHAR(140),
    ItemPrice DECIMAL(10, 2),
    ShipServiceLevel VARCHAR(140),
    RecipientName VARCHAR(140),
    ShipAddress1 VARCHAR(140),
    ShipAddress2 VARCHAR(140),
    ShipAddress3 VARCHAR(140),
    ShipCity VARCHAR(140),
    ShipState VARCHAR(140),
    ShipPostalCode VARCHAR(20),
    ShipCountry VARCHAR(40),
    IossNumber INT,
);

CREATE TABLE Clientes (
    ClientId INT PRIMARY KEY,
    ClientEmail VARCHAR(200) NOT NULL,
    ClientName VARCHAR(140) NOT NULL,
    Cpf VARCHAR(11) NOT NULL,
    ClientPhoneNumber VARCHAR(20),
    ClientAddress1 VARCHAR(140),
    ClientAddress2 VARCHAR(140),
    ClientAddress3 VARCHAR(140),
    ClientCity VARCHAR(140),
    ClientState VARCHAR(140),
    ClientPostalCode VARCHAR(20),
    ClientCountry VARCHAR(40)
);

CREATE TABLE Products (
    Sku VARCHAR(20) PRIMARY KEY,
    ProductName VARCHAR(140) NOT NULL,
    Currency VARCHAR(140),
    ItemPrice DECIMAL(10, 2),
    ShipServiceLevel VARCHAR(140),
    IossNumber INT
);

CREATE TABLE ItensPedidos (
    OrderId INT NOT NULL,
    OrderItemId INT NOT NULL,
    ItemPrice DECIMAL(10, 2),
    BuyerEmail VARCHAR(200),
    BuyerName VARCHAR(140),
    ProductName VARCHAR(140),
    QuantityPurchased INT,
	PRIMARY KEY (OrderItemId)
);

CREATE TABLE Pedido (
    OrderId INT PRIMARY KEY,
    OrderItemId INT NOT NULL,
    OrderTotalValue DECIMAL(10, 2),
    PurchaseDate DATETIME NOT NULL,
    PaymentsDate DATETIME,
    BuyerName VARCHAR(140),
    Cpf VARCHAR(11),
    ShipAddress1 VARCHAR(140),
    ShipCity VARCHAR(140),
    ShipState VARCHAR(140),
    ShipPostalCode VARCHAR(20),
    ShipCountry VARCHAR(40),
    IossNumber INT,
	FOREIGN KEY (OrderItemId) REFERENCES ItensPedidos(OrderItemId)
);