import java.sql.Connection;
import java.sql.SQLException;

public class CamaDB {
    private Connection connection;
    public CamaDB() throws SQLException {
        connection = Conexao.getConnection();
    }
}