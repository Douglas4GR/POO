import java.sql.Connection;
import java.sql.SQLException;

public class ClienteDB {
    private Connection connection;
    public ClienteDB() throws SQLException {
        connection = Conexao.getConnection();
    }
}