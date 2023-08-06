package cinema;

public class Assento {
    private String id;
    private String idSessao;
    private String idCliente;
    private int linha;
    private int coluna;
    private boolean disponivel;

    public Assento(String id, String idSessao, String idCliente, int linha, int coluna, boolean disponivel) {
        this.id = id;
        this.idSessao = idSessao;
        this.idCliente = idCliente;
        this.linha = linha;
        this.coluna = coluna;
        this.disponivel = disponivel;
    }
    public String getId() {
        return id;
    }
    public String getIdSessao() {
        return idSessao;
    }
    public String getIdCliente() {
        return idCliente;
    }
    public int getLinha() {
        return linha;
    }
    public int getColuna() {
        return coluna;
    }
    public boolean getDisponivel() {
        return disponivel;
    }
    public boolean  comprar(String idCliente) {
        if (this.disponivel) {
            this.idCliente = idCliente;
            this.disponivel = false;
            return true;
        }
        return false;
    }
}
