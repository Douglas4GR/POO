import java.sql.*;

public class QuartoDB {
    private Connection connection;

    public QuartoDB(Connection connection) {
        this.connection = connection;
    }

    public void inserirQuarto(Quarto quarto) throws SQLException {
        String sql = "INSERT INTO quarto (id, nomeQuarto, qtdeCamas, temBanheiro, descricao)" +
                "VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, quarto.getId());
            statement.setString(2, quarto.getNomeQuarto());
            statement.setString(3, quarto.getQtdeCamas());
            statement.setBoolean(4, quarto.getTemBanheiro());
            statement.setString(5, quarto.getDescricao());

            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarQuarto(Quarto quarto) throws SQLException {
        String sql = "DELETE FROM quarto WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, quarto.getId());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarQuarto(Quarto quarto) throws SQLException {
        String sql = "UPDATE quarto SET nomeQuarto = ?, qtdeCamas = ?, temBanheiro = ?, descricao = ? WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, quarto.getNomeQuarto());
            statement.setString(2, quarto.getQtdeCamas());
            statement.setBoolean(3, quarto.getTemBanheiro());
            statement.setString(4, quarto.getDescricao());
            statement.setInt(5, quarto.getId());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Quarto buscarQuarto(int id) throws SQLException {
        Quarto quarto = null;
        String sql = "SELECT * FROM quarto WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String nomeQuarto = resultSet.getString("nomeQuarto");
                String qtdeCamas = resultSet.getString("qtdeCamas");
                boolean temBanheiro = resultSet.getBoolean("temBanheiro");
                String descricao = resultSet.getString("descricao");
                quarto = new Quarto(id, nomeQuarto, qtdeCamas, temBanheiro, descricao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return quarto;
    }
}