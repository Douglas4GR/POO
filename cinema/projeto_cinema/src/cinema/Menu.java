package cinema;

public class Menu {
    public int menuPrincipal() {
        System.out.println("1 - Gerenciar Filmes");
        System.out.println("2 - Gerenciar Salas");
        System.out.println("3 - Gerenciar Sessões");
        System.out.println("4 - Gerenciar Clientes");
        System.out.println("5 - Gerenciar Assentos");
        System.out.println("6 - Gerenciar Vendas");
        System.out.println("7 - Gerenciar Relatórios");
        System.out.println("0 - Sair");
        System.out.print("Digite a opção desejada: ");
        return Integer.parseInt(System.console().readLine());
    }


}
