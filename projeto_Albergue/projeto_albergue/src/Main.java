import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException, SQLException {

        String url = "jdbc:mysql://localhost:3306/albergue";
        String username = "root";
        String password = "mySql1199";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            ClienteDB clienteDB = new ClienteDB(connection);

            // Exemplo de insert do DB:
            Date dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1990");
            Cliente cliente = new Cliente(3, "João", "Rua Maria 1234", 123456789, "Brasil",
                    "123.456.789-00", "54321-098", "joao4444@gmail.com", dataNascimento);

            clienteDB.inserirCliente(cliente);


            // Exemplo de uso do Statement:
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Cliente");
            while (resultSet.next()) {System.out.println(resultSet.getString("nome"));}

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}