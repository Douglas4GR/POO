import java.sql.*;

public class ClienteDB {
    private Connection connection;

    public ClienteDB(Connection connection) { this.connection = connection; }

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
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarCliente(Cliente cliente) throws SQLException {
        String sql = "DELETE FROM Cliente WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, cliente.getId());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarCliente(Cliente cliente) throws SQLException {
        String sql = "UPDATE Cliente SET nome = ?, endereco = ?, postalCode = ?, pais = ?, CPF = ?, passaporte = ?, email = ?, dataNascimento = ? WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getEndereco());
            statement.setInt(3, cliente.getPostalCode());
            statement.setString(4, cliente.getPais());
            statement.setString(5, cliente.getCPF());
            statement.setString(6, cliente.getPassaporte());
            statement.setString(7, cliente.getEmail());
            statement.setDate(8, new java.sql.Date(cliente.getDataNascimento().getTime()));
            statement.setInt(9, cliente.getId());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Cliente buscarCliente(int id) throws SQLException {
        Cliente cliente = null;
        String sql = "SELECT * FROM Cliente WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String endereco = resultSet.getString("endereco");
                int postalCode = resultSet.getInt("postalCode");
                String pais = resultSet.getString("pais");
                String CPF = resultSet.getString("CPF");
                String passaporte = resultSet.getString("passaporte");
                String email = resultSet.getString("email");
                Date dataNascimento = resultSet.getDate("dataNascimento");
                cliente = new Cliente(id, nome, endereco, postalCode, pais, CPF, passaporte, email, dataNascimento);
            }
        }
        return cliente;
    }
}
