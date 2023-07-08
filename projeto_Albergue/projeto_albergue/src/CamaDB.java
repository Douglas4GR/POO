import java.sql.*;

public class CamaDB {
    private Connection connection;

    public CamaDB(Connection connection) {
        this.connection = connection;
    }

    public void inserirCama(Cama cama) throws SQLException {
        String sql = "INSERT INTO Cama (id, codigoCama, ehBeliche, posicao, descricao) " +
                "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, cama.getId());
            statement.setInt(2, cama.getCodigoCama());
            statement.setBoolean(3, cama.getEhBeliche());
            statement.setString(4, cama.getPosicao());
            statement.setString(5, cama.getDescricao());

            statement.executeUpdate();
        }
    }

    public void deletarCama(Cama cama) throws SQLException {
        String sql = "DELETE FROM Cama WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, cama.getId());

            statement.executeUpdate();
        }
    }

    public void atualizarCama(Cama cama) throws SQLException {
        String sql = "UPDATE Cama SET codigoCama = ?, ehBeliche = ?, posicao = ?, descricao = ? WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, cama.getCodigoCama());
            statement.setBoolean(2, cama.getEhBeliche());
            statement.setString(3, cama.getPosicao());
            statement.setString(4, cama.getDescricao());
            statement.setInt(5, cama.getId());

            statement.executeUpdate();
        }
    }

    public Cama buscarCama(int id) throws SQLException {
        Cama cama = null;
        String sql = "SELECT * FROM Cama WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int codigoCama = resultSet.getInt("codigoCama");
                    boolean ehBeliche = resultSet.getBoolean("ehBeliche");
                    String posicao = resultSet.getString("posicao");
                    String descricao = resultSet.getString("descricao");

                    cama = new Cama(id, codigoCama, ehBeliche, posicao, descricao);
                }
            }
        }

        return cama;
    }
}
