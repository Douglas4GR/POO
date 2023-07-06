public class Quarto {
    int id;
    String nomeQuarto;
    String qtdeCamas;
    boolean temBanheiro;
    String descricao;

// getters
    public int getId() {return id;}
    public String getNomeQuarto() {return nomeQuarto;}
    public String getQtdeCamas() {return qtdeCamas;}
    public boolean getTemBanheiro() {return temBanheiro;}
    public String getDescricao() {return descricao;}

 // setters
    public void setId(int id) {this.id = id;}
    public void setNomeQuarto(String nomeQuarto) {this.nomeQuarto = nomeQuarto;}
    public void setQtdeCamas(String qtdeCamas) {this.qtdeCamas = qtdeCamas;}
    public void setTemBanheiro(boolean temBanheiro) {this.temBanheiro = temBanheiro;}
    public void setDescricao(String descricao) {this.descricao = descricao;}
}
