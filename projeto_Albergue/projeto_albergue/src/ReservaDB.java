import java.sql.Connection;
import java.sql.SQLException;

public class ReservaDB {
    private Connection connection;
    public ReservaDB() throws SQLException {
        connection = Conexao.getConnection();
    }
}