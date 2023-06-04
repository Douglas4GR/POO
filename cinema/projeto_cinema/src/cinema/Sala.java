package cinema;

public class Sala {
    private String id;
    private String nome;
    private int capacidade;
    private int linhas;
    private int colunas;

    public Sala(String id, String nome, int capacidade, int linhas, int colunas) {
        this.id = id;
        this.nome = nome;
        this.capacidade = capacidade;
        this.linhas = linhas;
        this.colunas = colunas;
    }
    public String getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public int getLinhas() {
        return linhas;
    }
    public int getColunas() {
        return colunas;
    }
}
