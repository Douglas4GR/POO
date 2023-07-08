import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException, SQLException {

        String url = "jdbc:mysql://localhost:3306/albergue";
        String username = "root";
        String password = "mySql1199";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            ClienteDB clienteDB = new ClienteDB(connection);


            // Exemplo de uso do Statement (com a tabela Cliente):
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Cliente");
            System.out.println("Clientes antes de alteração:");
            while (resultSet.next()) {System.out.println(resultSet.getString("nome"));}


            // Para testar o insert, delete e update, descomente as linhas abaixo:

            // Exemplo de insert do DB:
            /*Date dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1990");
            Cliente cliente = new Cliente(3, "João", "Rua Maria 1234", 123456789, "Brasil", "123.456.789-00", "54321-098", "joao4444@gmail.com", dataNascimento);
            clienteDB.inserirCliente(cliente);*/

            // Exemplo de delete do DB (Deleta pelo id do cliente, nesse caso, o id 3):
            /*Cliente cliente = new Cliente(3, null, null, 0, null, null, null, null, null);
            clienteDB.deletarCliente(cliente);*/

            // Exemplo de update do DB (Atualiza o nome do cliente com id 2):
            /*Date dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1990");
            Cliente cliente = new Cliente(2, "Robson", "Rua Maria 1234", 123456789, "Brasil", "123.456.789-00", "54321-098", "", dataNascimento);
            clienteDB.atualizarCliente(cliente);*/

            // Exemplo de busca do DB (Busca pelo id do cliente, nesse caso, o id 2):
            Cliente cliente = clienteDB.buscarCliente(2);
            System.out.println("Cliente buscado: " + cliente.getNome());

            //mostrando clientes após alterar a tabela:
            resultSet = statement.executeQuery("SELECT * FROM Cliente");
            System.out.println("Clientes após alteração:");
            while (resultSet.next()) {System.out.println(resultSet.getString("nome"));}

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}