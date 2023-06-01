package cinema;

public class Sala {
    private String id;
    private int numero;
    private int capacidade;
    private int linhas;
    private int colunas;

    public Sala(String id, int numero, int capacidade, int linhas, int colunas) {
        this.id = id;
        this.numero = numero;
        this.capacidade = capacidade;
        this.linhas = linhas;
        this.colunas = colunas;
    }
    public String getId() {
        return id;
    }
    public int getNumero() {
        return numero;
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
