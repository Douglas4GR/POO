public class Cama {
    int id;
    int codigoCama;
    boolean ehBeliche;
    String posicao;
    String descricao;

// getters
    public int getId() {return id;}
    public int getCodigoCama() {return codigoCama;}
    public boolean getEhBeliche() {return ehBeliche;}
    public String getPosicao() {return posicao;}
    public String getDescricao() {return descricao;}

 // setters
    public void setId(int id) {this.id = id;}
    public void setCodigoCama(int codigoCama) {this.codigoCama = codigoCama;}
    public void setEhBeliche(boolean ehBeliche) {this.ehBeliche = ehBeliche;}
    public void setPosicao(String posicao) {this.posicao = posicao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}
}