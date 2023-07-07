import java.sql.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException, SQLException {

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/albergue", "root", "mySql1199");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM Cliente");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("nome"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}