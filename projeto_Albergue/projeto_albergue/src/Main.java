import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException, SQLException {

        String url = "jdbc:mysql://localhost:3306/albergue";
        String username = "root";
        String password = "mySql1199";

        // Aqui será feita a conexão com o banco de dados e teste dos métodos de alguma classe
        // Os testes CRUD completos de cada classe estão no arquivo teste_para_cada_classe.txt

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database conectado!");
            Statement statement = connection.createStatement();

            // Coloque aqui os testes dos métodos de alguma classe

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}