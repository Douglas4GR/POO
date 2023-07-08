import java.sql.*;
import java.sql.SQLException;

public class Cama {
    int id;
    int codigoCama;
    boolean ehBeliche;
    String posicao;
    String descricao;

// construtor
    public Cama(int id, int codigoCama, boolean ehBeliche, String posicao, String descricao) {
        this.id = id;
        this.codigoCama = codigoCama;
        this.ehBeliche = ehBeliche;
        this.posicao = posicao;
        this.descricao = descricao;
    }

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

// métodos para DB
    public void inserir(Connection connection) throws SQLException {
        CamaDB camaDB = new CamaDB(connection);
        camaDB.inserirCama(this);
    }

    public void deletar(Connection connection) throws SQLException {
        CamaDB camaDB = new CamaDB(connection);
        camaDB.deletarCama(this);
    }

    public void atualizar(Connection connection) throws SQLException {
        CamaDB camaDB = new CamaDB(connection);
        camaDB.atualizarCama(this);
    }

    public static Cama buscarCama(Connection connection, int id) throws SQLException {
        CamaDB camaDB = new CamaDB(connection);
        return camaDB.buscarCama(id);
    }
}