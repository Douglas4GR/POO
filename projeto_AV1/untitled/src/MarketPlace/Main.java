package MarketPlace;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO auto-generated method stub
        Scanner input = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        int opcao = 0;
        System.out.println("Bem vindo ao MarketPlace!");
        while (opcao != 5) {
            CRUDproduto.mostraOpcoes();
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> produtos.add(CRUDproduto.criaProduto());
                case 2 -> CRUDproduto.listaProdutos(produtos);
                case 3 -> CRUDproduto.editaProduto(produtos);
                case 4 -> CRUDproduto.deletaProduto(produtos);
                case 5 -> System.out.println("Obrigado por usar o MarketPlace!");
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}