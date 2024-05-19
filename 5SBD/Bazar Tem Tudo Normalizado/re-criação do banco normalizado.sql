CREATE DATABASE BAZAR_TEM_TUDO;

USE BAZAR_TEM_TUDO;
CREATE TABLE CARGA (
    order_ID INT NOT NULL,
	pucharse_date VARCHAR(20),
    paymants_date VARCHAR(20),
	IOSS_number INT,
    currency VARCHAR(140),
    recipient_name VARCHAR(140),

    order_item_ID INT NOT NULL,
    quantity_pucharsed INT,

    SKU VARCHAR(100) NOT NULL,
    product_name VARCHAR(140),
    item_price DECIMAL(10, 2),

    CPF VARCHAR(20) NOT NULL,
	buyer_name VARCHAR(140),
    buyer_email VARCHAR(200),
    buyer_phone_number VARCHAR(100),

	adress_ID VARCHAR (100) NOT NULL,
    ship_adress_1 VARCHAR(200),
    ship_city VARCHAR(200),
    ship_state VARCHAR(200),
    ship_country VARCHAR(100),
    ship_postal_code VARCHAR(20),
    ship_service_level VARCHAR(200),
);


CREATE TABLE CLIENTES (
    CPF VARCHAR(20) PRIMARY KEY,
	buyer_name VARCHAR(140),
    buyer_email VARCHAR(200),
    buyer_phone_number VARCHAR(100),
);

CREATE TABLE ENDERECOS (
	adress_ID INT PRIMARY KEY,
    ship_adress_1 VARCHAR(200),
    ship_city VARCHAR(200),
    ship_state VARCHAR(200),
    ship_country VARCHAR(100),
    ship_postal_code VARCHAR(20),
    ship_service_level VARCHAR(200),
	CPF VARCHAR(20) FOREIGN KEY REFERENCES CLIENTES(CPF),
);

CREATE TABLE PRODUTOS (
    SKU VARCHAR(100) PRIMARY KEY,
    product_name VARCHAR(140),
    item_price DECIMAL(10, 2),
	stock INT,
);

CREATE TABLE PEDIDOS (
    order_ID INT PRIMARY KEY,
	pucharse_date VARCHAR(20),
    paymants_date VARCHAR(20),
	IOSS_number INT,
    currency VARCHAR(140),
    recipient_name VARCHAR(140),
	CPF VARCHAR(20) FOREIGN KEY REFERENCES CLIENTES(CPF),
	adress_ID INT FOREIGN KEY REFERENCES ENDERECOS(adress_ID),
);

CREATE TABLE ITENS_DO_PEDIDO (
    order_item_ID INT PRIMARY KEY,
    quantity_pucharsed INT,
    SKU VARCHAR(100) FOREIGN KEY REFERENCES PRODUTOS(SKU),
	order_ID INT FOREIGN KEY REFERENCES PEDIDOS(order_ID),
);

CREATE TABLE PEDIDOS_NAO_FINALIZADOS(
    await_order_ID INT PRIMARY KEY,
	order_ID INT FOREIGN KEY REFERENCES PEDIDOS(order_ID),
);

CREATE TABLE PEDIDOS_FINALIZADOS(
    finalized_order_ID INT PRIMARY KEY,
	order_ID INT FOREIGN KEY REFERENCES PEDIDOS(order_ID),
);