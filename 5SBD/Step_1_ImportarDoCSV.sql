BULK INSERT Carga_Temporaria
FROM 'C:\Users\alien\Desktop\POO\5SBD\Tabelapreenchida.csv'
WITH (
   FIELDTERMINATOR = ';',
   ROWTERMINATOR = '\n',
   FIRSTROW = 2
);
