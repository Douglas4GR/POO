import java.sql.*;

public class Quarto {
    int id;
    String nomeQuarto;
    String qtdeCamas;
    boolean temBanheiro;
    String descricao;

// construtor
    public Quarto(int id, String nomeQuarto, String qtdeCamas, boolean temBanheiro, String descricao) {
        this.id = id;
        this.nomeQuarto = nomeQuarto;
        this.qtdeCamas = qtdeCamas;
        this.temBanheiro = temBanheiro;
        this.descricao = descricao;
    }

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

// métodos para DB
    public void inserir(Connection connection) throws SQLException {
        QuartoDB quartoDB = new QuartoDB(connection);
        quartoDB.inserirQuarto(this);
    }

    public void deletar(Connection connection) throws SQLException {
        QuartoDB quartoDB = new QuartoDB(connection);
        quartoDB.deletarQuarto(this);
    }

    public void atualizar(Connection connection) throws SQLException {
        QuartoDB quartoDB = new QuartoDB(connection);
        quartoDB.atualizarQuarto(this);
    }

    public static Quarto buscarQuarto(Connection connection, int id) throws SQLException {
        QuartoDB quartoDB = new QuartoDB(connection);
        return quartoDB.buscarQuarto(id);
    }
}
