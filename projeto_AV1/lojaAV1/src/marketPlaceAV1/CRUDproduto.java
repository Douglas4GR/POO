package marketPlaceAV1;

import java.util.ArrayList;
import java.util.Scanner;

public class CRUDproduto {
    public static void mostraOpcoes() {
        System.out.println("Digite a opção desejada: ");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Editar produto");
        System.out.println("4 - Excluir produto");
        System.out.println("5 - Sair");
    }

    public static Produto criaProduto() {
        Scanner input = new Scanner(System.in);
        int id;
        String codigoBarras;
        String sku;
        String nome;
        String descricao;
        String categoria;
        float preco;
        float peso;
        String fabricante;
        
        System.out.println("Digite o id do produto: ");
        id = input.nextInt();
        input.nextLine();
        System.out.println("Digite o código de barras do produto: ");
        codigoBarras = input.nextLine();
        System.out.println("Digite o sku do produto: ");
        sku = input.nextLine();
        System.out.println("Digite o nome do produto: ");
        nome = input.nextLine();
        System.out.println("Digite a descrição do produto: ");
        descricao = input.nextLine();
        System.out.println("Digite a categoria do produto: ");
        categoria = input.nextLine();
        System.out.println("Digite o preço do produto: ");
        preco = (float) input.nextDouble();
        System.out.println("Digite o peso do produto: ");
        peso = (float) input.nextDouble();
        input.nextLine();
        System.out.println("Digite o fabricante do produto: ");
        fabricante = input.nextLine();

    return new Produto(id, codigoBarras, sku, nome, descricao, categoria, preco, peso, fabricante);
    }
    
    public static void listaProdutos(ArrayList<Produto> produtos) {
        for (Produto produto : produtos) {
            System.out.println("Id: " + produto.getId());
            System.out.println("Código de barras: " + produto.getCodigoBarras());
            System.out.println("SKU: " + produto.getSku());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Peso: " + produto.getPeso());
            System.out.println("Fabricante: " + produto.getFabricante());
        }
    }
    
    
    public static void editaProduto(ArrayList<Produto> produtos) {
        Scanner input = new Scanner(System.in);
        int id;
        System.out.println("Digite o id do produto: ");
        id = input.nextInt();
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                System.out.println("Digite o id do produto: ");
                id = input.nextInt();
                input.nextLine();
                System.out.println("Digite o código de barras do produto: ");
                produto.setCodigoBarras(input.nextLine());
                System.out.println("Digite o sku do produto: ");
                produto.setSku(input.nextLine());
                System.out.println("Digite o nome do produto: ");
                produto.setNome(input.nextLine());
                System.out.println("Digite a descrição do produto: ");
                produto.setDescricao(input.nextLine());
                System.out.println("Digite a categoria do produto: ");
                produto.setCategoria(input.nextLine());
                System.out.println("Digite o preço do produto: ");
                produto.setPreco(input.nextFloat());
                System.out.println("Digite o peso do produto: ");
                produto.setPeso(input.nextFloat());
                input.nextLine();
                System.out.println("Digite o fabricante do produto: ");
                produto.setFabricante(input.nextLine());
            }
        }
    }
    
    public static void deletaProduto(ArrayList<Produto> produtos) {
        Scanner input = new Scanner(System.in);
        int id;
        System.out.println("Digite o id do produto: ");
        id = input.nextInt();
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtos.remove(produto);
            }
        }
    }
}
