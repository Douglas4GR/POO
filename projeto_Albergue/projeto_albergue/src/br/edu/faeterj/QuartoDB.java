package br.edu.faeterj;

import java.sql.Connection;
import java.sql.SQLException;

public class QuartoDB {
    private Connection connection;
    public QuartoDB() throws SQLException {
        connection = Conexao.getConnection();
    }
}