package cinema;

public class assento {
    private String id;
    private String idSesaao;
    private String idCliente;
    private int linha;
    private int coluna;
    private boolean disponivel;

    public assento(String id, String idSesaao, String idCliente, int linha, int coluna, boolean disponivel) {
        this.id = id;
        this.idSesaao = idSesaao;
        this.idCliente = idCliente;
        this.linha = linha;
        this.coluna = coluna;
        this.disponivel = disponivel;
    }
    public String getId() {
        return id;
    }
    public String getIdSesaao() {
        return idSesaao;
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
}
