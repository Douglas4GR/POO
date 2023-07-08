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
            Statement statement = connection.createStatement();

            /* Quartos */

            QuartoDB quartoDB = new QuartoDB(connection);

            // inserindo quartos
            Quarto quarto1 = new Quarto(1, "quarto 1", "4", true, "Quarto da frente, primeiro andar.");
            quartoDB.inserirQuarto(quarto1);
            Quarto quarto2 = new Quarto(2, "quarto 2", "6", true, "Quarto de trás, primeiro andar.");
            quartoDB.inserirQuarto(quarto2);
            Quarto quarto3 = new Quarto(3, "quarto 3", "4", true, "Quarto da frente, segundo andar.");
            quartoDB.inserirQuarto(quarto3);
            Quarto quarto4 = new Quarto(4, "quarto 4", "3", true, "Quarto de trás, segundo andar.");
            quartoDB.inserirQuarto(quarto4);

            // exibindo quartos
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Quarto");
            System.out.println("Quartos antes de alteração:");
            while (resultSet.next()) {System.out.println(resultSet.getInt("id") + " " + resultSet.getString("nomeQuarto") + " " + resultSet.getString("qtdeCamas") + " " + resultSet.getBoolean("temBanheiro") + " " + resultSet.getString("descricao"));}

            // alterando descrição do quarto 4
            quarto4.setDescricao("Segundo andar, com vista para o mar.");
            quartoDB.atualizarQuarto(quarto4);

            // deletando quarto 3
            quartoDB.deletarQuarto(quarto3);

            // exibindo quartos
            resultSet = statement.executeQuery("SELECT * FROM Quarto");
            System.out.println("Quartos depois de alteração:");
            while (resultSet.next()) {System.out.println(resultSet.getInt("id") + " " + resultSet.getString("nomeQuarto") + " " + resultSet.getString("qtdeCamas") + " " + resultSet.getBoolean("temBanheiro") + " " + resultSet.getString("descricao"));}

            // buscando quarto 2
            Quarto quartoBuscado = quartoDB.buscarQuarto(2);
            System.out.println("Quarto buscado: " + quartoBuscado.getId() + " " + quartoBuscado.getNomeQuarto() + " " + quartoBuscado.getQtdeCamas() + " " + quartoBuscado.getTemBanheiro() + " " + quartoBuscado.getDescricao());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}