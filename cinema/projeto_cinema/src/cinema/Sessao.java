package cinema;

import java.time.LocalDateTime;
import java.util.ArrayList;
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

    // Verifica se a sessão existe
    public boolean sessaoExiste(Sessao sessao, ArrayList<Filme> filmes, ArrayList<Sala> salas) {
        for (Filme filme : filmes) {
            if (filme.getId().equals(sessao.idFilme)) { // Verifica se o filme existe
                for (Sala sala : salas) {
                    if (sala.getId().equals(sessao.idSala)) { // Verifica se a sala existe
                        return true;
                    }
                }
            }
        }
        return false;
    }
    // Mostra as sessões disponíveis no cinema e retorna a sessão escolhida
    public Sessao escolheSessao(ArrayList<Sessao> sessoes, ArrayList<Filme> filmes, ArrayList<Sala> salas) {
        System.out.println("Sessões disponíveis:");
        for (Sessao sessao : sessoes) {
            if (sessao.sessaoExiste(sessao, filmes, salas)) {
                System.out.println(sessao.id + " - " + filmes.get(Integer.parseInt(sessao.idFilme)).getNome() + " - " + sessao.horario + " - " + salas.get(Integer.parseInt(sessao.idSala)).getNome());
            }
        }
        System.out.println("Digite o ID da sessão desejada:");
        String idSessao = Main.scanner.nextLine();
        for (Sessao sessao : sessoes) {
            if (sessao.id.equals(idSessao)) {
                if (sessao.sessaoExiste(sessao, filmes, salas)) {
                    return sessao;
                }
            }
        }
        System.out.println("Sessão não encontrada.");
        return null;
    }
    // Mostra os assentos disponiveis na sessão e retorna o assento escolhido

}
