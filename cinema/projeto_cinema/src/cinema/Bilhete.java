package cinema;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Bilhete {
    private String id;
    private String idSessao;
    private String idCliente;
    private String idAssento;
    private String idFilme;
    private String idSala;
    private LocalDateTime horario;
    private int linha;
    private int coluna;
    private float preco;

    public Bilhete(String id, String idSessao, String idCliente, String idAssento, String idFilme, String idSala, LocalDateTime horario, int linha, int coluna, float preco) {
        this.id = id;
        this.idSessao = idSessao;
        this.idCliente = idCliente;
        this.idAssento = idAssento;
        this.idFilme = idFilme;
        this.idSala = idSala;
        this.horario = horario;
        this.linha = linha;
        this.coluna = coluna;
    }
    public String getId() { return id; }
    public String getIdSessao() { return idSessao; }
    public String getIdCliente() { return idCliente; }
    public String getIdAssento() { return idAssento; }
    public String getIdFilme() { return idFilme; }
    public String getIdSala() { return idSala; }
    public LocalDateTime getHorario() { return horario; }
    public int getLinha() { return linha; }
    public int getColuna() { return coluna; }
    public float getPreco() { return preco; }
    public static void mostraBilhete(Bilhete bilhete, ArrayList<Sessao> sessoes, ArrayList<Cliente> clientes, ArrayList<Assento> assentos, ArrayList<Filme> filmes, ArrayList<Sala> salas) {
        System.out.println("Bilhete: " + bilhete.id);
        System.out.println("Filme: " + filmes.get(Integer.parseInt(bilhete.idFilme)).getNome());
        System.out.println("Sala: " + salas.get(Integer.parseInt(bilhete.idSala)).getNome());
        System.out.println("Sessão: " + sessoes.get(Integer.parseInt(bilhete.idSessao)).getId());
        System.out.println("Cliente: " + clientes.get(Integer.parseInt(bilhete.idCliente)).getNome());
        System.out.println("Assento: " + assentos.get(Integer.parseInt(bilhete.idAssento)).getId());
        System.out.println("Horário: " + bilhete.horario);
        System.out.println("Linha: " + bilhete.linha);
        System.out.println("Coluna: " + bilhete.coluna);
        System.out.println("Preço: " + bilhete.preco);
    }
}
