package cinema;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        ArrayList<Filme> Filmes = new ArrayList<Filme>();
        Filme filme1 = new Filme("1", "O Poderoso Chefão", 175, 16, "Sinopse", "Elenco", "EUA", "Inglês", "24/03/1972");
        Filmes.add(filme1);
        Filme filme2 = new Filme("2", "E o Vento Levou", 238, 14, "Sinopse", "Elenco", "EUA", "Inglês", "17/12/1939");
        Filmes.add(filme2);
        Filme filme3 = new Filme("3", "Casablanca", 102, 12, "Sinopse", "Elenco", "EUA", "Inglês", "23/01/1943");
        Filmes.add(filme3);
        Filme filme4 = new Filme("4", "Cidadão Kane", 119, 12, "Sinopse", "Elenco", "EUA", "Inglês", "05/09/1941");
        Filmes.add(filme4);
        Filme filme5 = new Filme("5", "Os Bons Companheiros", 146, 16, "Sinopse", "Elenco", "EUA", "Inglês", "21/09/1990");
        Filmes.add(filme5);
        Filme filme6 = new Filme("6", "O Senhor dos Anéis: O Retorno do Rei", 201, 12, "Sinopse", "Elenco", "EUA", "Inglês", "19/12/2003");
        Filmes.add(filme6);
        Filme filme7 = new Filme("7", "A Lista de Schindler", 195, 14, "Sinopse", "Elenco", "EUA", "Inglês", "11/03/1994");
        Filmes.add(filme7);

        ArrayList Sala = new ArrayList();
        Sala sala1 = new Sala("1", 1, 100, 10, 10);
        Sala.add(sala1);
        Sala sala2 = new Sala("2", 2, 100, 10, 10);
        Sala.add(sala2);
        Sala sala3 = new Sala("3", 3, 100, 10, 10);
        Sala.add(sala3);

        ArrayList Sessao = new ArrayList();
        Sessao sessao1 = new Sessao("1", "1", "1", LocalDateTime.now(), 120, 18);
        Sessao.add(sessao1);
        Sessao sessao2 = new Sessao("2", "2", "2", LocalDateTime.now(), 240, 12);
        Sessao.add(sessao2);
        Sessao sessao3 = new Sessao("3", "3", "3", LocalDateTime.now(), 180, 14);
        Sessao.add(sessao3);

        Filmes.forEach((filme) -> {
            System.out.println(filme.getNome());
        });
    }
}