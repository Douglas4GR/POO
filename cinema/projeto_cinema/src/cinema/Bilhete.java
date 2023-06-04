package cinema;

import java.util.ArrayList;

public class Bilhete {
    private String id;
    private String idSessao;
    private String idCliente;
    private String idAssento;
    private String idFilme;
    private String idSala;
    private String data;
    private String horario;
    private int linha;
    private int coluna;
    private float preco;

    public Bilhete(String id, String idSessao, String idCliente, String idAssento, String idFilme, String idSala, String data, String horario, int linha, int coluna, float preco) {
        this.id = id;
        this.idSessao = idSessao;
        this.idCliente = idCliente;
        this.idAssento = idAssento;
        this.idFilme = idFilme;
        this.idSala = idSala;
        this.data = data;
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
    public String getData() { return data; }
    public String getHorario() { return horario; }
    public int getLinha() { return linha; }
    public int getColuna() { return coluna; }
    public float getPreco() { return preco; }
    public void mostraBilhete( ArrayList<Sessao> sessoes, ArrayList<Cliente> clientes, ArrayList<Assento> assentos, ArrayList<Filme> filmes, ArrayList<Sala> salas) {
        System.out.println("Bilhete: " + this.id);
        System.out.println("Filme: " + filmes.get(Integer.parseInt(this.idFilme)).getNome());
        System.out.println("Sala: " + salas.get(Integer.parseInt(this.idSala)).getNome());
        System.out.println("Sessão: " + sessoes.get(Integer.parseInt(this.idSessao)).getId());
        System.out.println("Cliente: " + clientes.get(Integer.parseInt(this.idCliente)).getNome());
        System.out.println("Assento: " + assentos.get(Integer.parseInt(this.idAssento)).getId());
        System.out.println("Data: " + this.data);
        System.out.println("Horário: " + this.horario);
        System.out.println("Linha: " + this.linha);
        System.out.println("Coluna: " + this.coluna);
        System.out.println("Preço: " + this.preco);
    }
}
