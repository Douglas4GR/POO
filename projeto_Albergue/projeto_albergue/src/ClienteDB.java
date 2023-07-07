import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDB {
    private Connection connection;

    public ClienteDB() throws SQLException {
        connection = Conexao.getConnection();
    }

    public void inserirCliente(Cliente cliente) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO Cliente (id, nome, endereco, postalCode, pais, CPF, passaporte, email, dataNascimento) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"
            );
            statement.setInt(1, cliente.getId());
            statement.setString(2, cliente.getNome());
            statement.setString(3, cliente.getEndereco());
            statement.setInt(4, cliente.getPostalCode());
            statement.setString(5, cliente.getPais());
            statement.setString(6, cliente.getCPF());
            statement.setString(7, cliente.getPassaporte());
            statement.setString(8, cliente.getEmail());
            statement.setDate(9, new java.sql.Date(cliente.getDataNascimento().getTime()));

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
