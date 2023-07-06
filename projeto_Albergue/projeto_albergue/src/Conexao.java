import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            String url = "jdbc:mysql://localhost:3306/albergue";
            String username = "root";
            String password = "mySql1199";
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }
}
