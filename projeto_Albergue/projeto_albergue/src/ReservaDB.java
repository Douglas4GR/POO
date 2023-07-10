import java.sql.*;

public class ReservaDB {
    private Connection connection;

    public ReservaDB(Connection connection) {
        this.connection = connection;
    }

    public void inserirReserva(Reserva reserva) throws SQLException {
        String sql = "INSERT INTO Reserva (id, idCliente, idQuarto, idCama, dataEntrada, dataSaida)" +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, reserva.getId());
            statement.setInt(2, reserva.getIdCliente());
            statement.setInt(3, reserva.getIdQuarto());
            statement.setInt(4, reserva.getIdCama());
            statement.setDate(5, new java.sql.Date(reserva.getDataEntrada().getTime()));
            statement.setDate(6, new java.sql.Date(reserva.getDataSaida().getTime()));

            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarReserva(Reserva reserva) throws SQLException {
        String sql = "DELETE FROM Reserva WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, reserva.getId());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarReserva(Reserva reserva) throws SQLException {
        String sql = "UPDATE Reserva SET idCliente = ?, idQuarto = ?, idCama = ?, dataEntrada = ?, dataSaida = ? WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, reserva.getIdCliente());
            statement.setInt(2, reserva.getIdQuarto());
            statement.setInt(3, reserva.getIdCama());
            statement.setDate(4, new java.sql.Date(reserva.getDataEntrada().getTime()));
            statement.setDate(5, new java.sql.Date(reserva.getDataSaida().getTime()));
            statement.setInt(6, reserva.getId());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Reserva buscarReserva(int id) throws SQLException {
        Reserva reserva = null;
        String sql = "SELECT * FROM Reserva WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int idCliente = resultSet.getInt("idCliente");
                int idQuarto = resultSet.getInt("idQuarto");
                int idCama = resultSet.getInt("idCama");
                Date dataEntrada = resultSet.getDate("dataEntrada");
                Date dataSaida = resultSet.getDate("dataSaida");
                reserva = new Reserva(id, idCliente, idQuarto, idCama, dataEntrada, dataSaida);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reserva;
    }
}