package marketPlaceAV1;

public class Produto {
    private int id;
    private String codigoBarras;
    private String sku;
    private String nome;
    private String descricao;
    private String categoria;
    private float preco;
    private float peso;
    private String fabricante;

    public Produto(int id, String codigoBarras, String sku, String nome, String descricao, String categoria, float preco, float peso, String fabricante) {
        this.id = id;
        this.codigoBarras = codigoBarras;
        this.sku = sku;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
        this.peso = peso;
        this.fabricante = fabricante;
    }

    public int getId() { return this.id; }
    public String getCodigoBarras() { return this.codigoBarras; }
    public String getSku() { return this.sku; }
    public String getNome() { return this.nome; }
    public String getDescricao() { return this.descricao; }
    public String getCategoria() { return this.categoria; }
    public double getPreco() { return this.preco; }
    public double getPeso() { return this.peso; }
    public String getFabricante() { return this.fabricante; }

    public void setCodigoBarras(String codigoBarras) { this.codigoBarras = codigoBarras; }
    public void setSku(String sku) { this.sku = sku; }
    public void setNome(String nome) { this.nome = nome; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setPreco(float preco) { this.preco = preco; }
    public void setPeso(float peso) { this.peso = peso; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }
}