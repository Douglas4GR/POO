package cinema;

import java.util.Scanner;
public class Cliente {
    private String id;
    private String nome;

    public Cliente(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public void criaClienteManual() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o id do cliente: ");
        this.id = teclado.nextLine();
        System.out.println("Digite o nome do cliente: ");
        this.nome = teclado.nextLine();
    }
    public String getId() {
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }
}
