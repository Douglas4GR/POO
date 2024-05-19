USE msdb;
GO

-- Criar o trabalho
EXEC dbo.sp_add_job
    @job_name = N'Cargar e Processar Dados';
GO

-- Adicionar o passo de carregar dados CSV
EXEC dbo.sp_add_jobstep
    @job_name = N'Cargar e Processar Dados',
    @step_name = N'Carregar Dados CSV',
    @subsystem = N'TSQL',
    @command = N'BULK INSERT BAZAR_TEM_TUDO.dbo.CARGA
                 FROM ''C:\dados\carga_completa.csv''
                 WITH (
                     FIELDTERMINATOR = '','',
                     ROWTERMINATOR = ''\n'',
                     FIRSTROW = 2
                 );',
    @database_name = N'BAZAR_TEM_TUDO';
GO

-- Adicionar o passo de distribuir dados
EXEC dbo.sp_add_jobstep
    @job_name = N'Cargar e Processar Dados',
    @step_name = N'Distribuir Dados',
    @subsystem = N'TSQL',
    @command = N'EXEC DistribuirDados;',
    @database_name = N'BAZAR_TEM_TUDO',
    @on_success_action = 3,  -- Continuar no próximo passo
    @on_fail_action = 2;     -- Parar o trabalho em caso de falha
GO

-- Adicionar o passo de verificar pedidos
EXEC dbo.sp_add_jobstep
    @job_name = N'Cargar e Processar Dados',
    @step_name = N'Verificar Pedidos',
    @subsystem = N'TSQL',
    @command = N'EXEC VerificarPedidos;',
    @database_name = N'BAZAR_TEM_TUDO',
    @on_success_action = 1,  -- Parar o trabalho em caso de sucesso
    @on_fail_action = 2;     -- Parar o trabalho em caso de falha
GO

-- Adicionar o trabalho ao SQL Server Agent
EXEC dbo.sp_add_jobserver
    @job_name = N'Cargar e Processar Dados';
GO
