package cinema;

import java.time.LocalDateTime;
import java.util.Date;
public class Sessao {
    private String id;
    private String idFilme;
    private String idSala;
    private LocalDateTime horario;
    private int duracao;
    private int classificacao;

    public Sessao(String id, String idFilme, String idSala, LocalDateTime horario, int duracao, int classificacao) {
        this.id = id;
        this.idFilme = idFilme;
        this.idSala = idSala;
        this.horario = horario;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }
    public String getId() {
        return id;
    }
    public String getIdFilme() {
        return idFilme;
    }
    public String getIdSala() {
        return idSala;
    }
    public LocalDateTime getHorario() {
        return horario;
    }
    public int getDuracao() {
        return duracao;
    }
    public int getClassificacao() {
        return classificacao;
    }
}
