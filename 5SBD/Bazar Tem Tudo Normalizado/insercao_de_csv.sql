BULK INSERT BAZAR_TEM_TUDO.dbo.CARGA
FROM 'C:\Users\alien\Desktop\POO\5SBD\Bazar Tem Tudo Normalizado\csv2.csv'
WITH (
    FIELDTERMINATOR = ',',
    ROWTERMINATOR = '\n',
    FIRSTROW = 2  -- Caso o CSV tenha cabeçalho
);