import java.sql.*;

public class ClienteDB {
    private Connection connection;

    public ClienteDB(Connection connection) {
            this.connection = connection;
        }

        public void inserirCliente(Cliente cliente) throws SQLException {
            String sql = "INSERT INTO Cliente (id, nome, endereco, postalCode, pais, CPF, passaporte, email, dataNascimento) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
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
            }
        }

        public void deletarCliente(Cliente cliente) throws SQLException {
            String sql = "DELETE FROM Cliente WHERE id = ?";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, cliente.getId());

                statement.executeUpdate();
            }
        }
}
