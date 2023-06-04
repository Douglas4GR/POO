package cinema;

public class assento {
    private String id;
    private String idSessao;
    private String idCliente;
    private String fileira;
    private int coluna;
    private boolean disponivel;

    public assento(String id, String idSessao, String idCliente, String fileira, int coluna, boolean disponivel) {
        this.id = id;
        this.idSessao = idSessao;
        this.idCliente = idCliente;
        this.fileira = fileira;
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
    public String getFileira() {
        return fileira;
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
