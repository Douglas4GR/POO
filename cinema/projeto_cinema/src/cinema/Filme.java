package cinema;

public class Filme {
    private String id;
    private String nome;
    private int duracao;
    private int classificacao;
    private String sinopse;
    private String elenco;
    private String pais;
    private String idioma;
    private String dataLancamento;

    public Filme(String id, String nome, int duracao, int classificacao, String sinopse, String elenco, String pais, String idioma, String dataLancamento) {
        this.id = id;
        this.nome = nome;
        this.duracao = duracao;
        this.classificacao = classificacao;
        this.sinopse = sinopse;
        this.elenco = elenco;
        this.pais = pais;
        this.idioma = idioma;
        this.dataLancamento = dataLancamento;
    }
    public String getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public int getDuracao() {
        return duracao;
    }
    public int getClassificacao() {
        return classificacao;
    }
    public String getSinopse() {
        return sinopse;
    }
    public String getElenco() {
        return elenco;
    }
    public String getPais() {
        return pais;
    }
    public String getIdioma() {
        return idioma;
    }
    public String getDataLancamento() {
        return dataLancamento;
    }
}
