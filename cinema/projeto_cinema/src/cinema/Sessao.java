package cinema;

import java.util.Date;
public class Sessao {
    private String id;
    private String idFilme;
    private String idSala;
    private Date horario;
    private int duracao;
    private int classificacao;

    public Sessao(String id, String idFilme, String idSala, Date horario, int duracao, int classificacao) {
        this.id = id;
        this.idFilme = idFilme;
        this.idSala = idSala;
        this.horario = horario;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }
}
