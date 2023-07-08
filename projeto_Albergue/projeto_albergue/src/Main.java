import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException, SQLException {

        String url = "jdbc:mysql://localhost:3306/albergue";
        String username = "root";
        String password = "mySql1199";

        // Aqui será feita a conexão com o banco de dados e teste dos métodos de alguma classe
        // Os testes CRUD completos de cada classe estão no arquivo teste_para_cada_classe.txt

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database conectado!");

            CamaDB camaDB = new CamaDB(connection);
            // usando o Statement para exibir a tabela Cama
            Statement statement = connection.createStatement();

            // inserindo camas
            Cama cama1 = new Cama(1, 1, true, "A", "Cama de baixo, proxima a janela");
            camaDB.inserirCama(cama1);
            Cama cama2 = new Cama(2, 2, true, "B", "Cama de cima, proxima a janela");
            camaDB.inserirCama(cama2);
            Cama cama3 = new Cama(3, 3, false, "C", "Cama de solteiro, proxima a porta");
            camaDB.inserirCama(cama3);
            Cama cama4 = new Cama(4, 4, false, "D", "Cama de solteiro, proxima a porta");
            camaDB.inserirCama(cama4);

            // exibindo camas
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Cama");
            System.out.println("Camas antes de alteração:");
            while (resultSet.next()) {System.out.println(resultSet.getInt("id") + " " + resultSet.getBoolean("ehBeliche") + " " + resultSet.getString("posicao") + " " + resultSet.getString("descricao"));}

            // alterando posiçao e descrição da cama 4
            cama4.setPosicao("E");
            cama4.setDescricao("Cama de solteiro, proxima a janela");
            camaDB.atualizarCama(cama4);

            // deletando cama 3
            camaDB.deletarCama(cama3);

            // exibindo camas
            resultSet = statement.executeQuery("SELECT * FROM Cama");
            System.out.println("Camas depois de alteração:");
            while (resultSet.next()) {System.out.println(resultSet.getInt("id") + " " + resultSet.getBoolean("ehBeliche") + " " + resultSet.getString("posicao") + " " + resultSet.getString("descricao"));}
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}