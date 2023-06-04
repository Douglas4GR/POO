package cinema;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import static cinema.Bilhete.mostraBilhete;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

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

        ArrayList<Sala> Salas = new ArrayList<Sala>();
        Sala sala1 = new Sala("1", "Sala 1", 100, 10, 10);
        Salas.add(sala1);
        Sala sala2 = new Sala("2", "Sala 2", 100, 10, 10);
        Salas.add(sala2);
        Sala sala3 = new Sala("3", "Sala especial", 80, 8, 10);
        Salas.add(sala3);
        Sala sala4 = new Sala("4", "Sala 4", 100, 10, 10);
        Salas.add(sala4);
        Sala sala5 = new Sala("5", "Sala 5", 100, 10, 10);
        Salas.add(sala5);

        ArrayList<Sessao> Sessoes = new ArrayList<Sessao>();
        Sessao sessao1 = new Sessao("1", "1", "1", LocalDateTime.now(), 175, 18);
        Sessoes.add(sessao1);
        Sessao sessao2 = new Sessao("2", "2", "2", LocalDateTime.now(), 238, 12);
        Sessoes.add(sessao2);
        Sessao sessao3 = new Sessao("3", "6", "3", LocalDateTime.now(), 201, 14);
        Sessoes.add(sessao3);
        Sessao sessao4 = new Sessao("4", "7", "4", LocalDateTime.now(), 195, 16);
        Sessoes.add(sessao4);
        Sessao sessao5 = new Sessao("5", "3", "5", LocalDateTime.now(), 102, 12);
        Sessoes.add(sessao5);

        ArrayList<Assento> Assentos = new ArrayList<Assento>();
        for (int i = 0; i < Salas.size(); i++) { // Para cada sala
            for (int j = 0; j < Salas.get(i).getLinhas(); j++) {
                for (int k = 0; k < Salas.get(i).getColunas(); k++) {
                    Assento assento = new Assento(Integer.toString(Assentos.size() + 1), Integer.toString(i + 1), "", j + 1, k + 1, true);
                    Assentos.add(assento);
                }
            }
        }

        ArrayList<Cliente> Clientes = new ArrayList<Cliente>();
        Cliente cliente1 = new Cliente("1", "João");
        Clientes.add(cliente1);
        Cliente cliente2 = new Cliente("2", "Maria");
        Clientes.add(cliente2);
        Clientes.add(new Cliente("3", "José"));
        Clientes.add(new Cliente("4", "Ana"));
        Clientes.add(new Cliente("5", "Pedro"));

        ArrayList<Bilhete> Bilhetes = new ArrayList<Bilhete>();
        Bilhete bilhete1 = new Bilhete("1", "1", "1", "1", "1", "1", LocalDateTime.now(), 1, 1, 20);
        Bilhetes.add(bilhete1);
        Bilhete bilhete2 = new Bilhete("2", "2", "2", "2", "2", "2", LocalDateTime.now(), 2, 2, 20);
        Bilhetes.add(bilhete2);
        Bilhete bilhete3 = new Bilhete("3", "3", "3", "3", "3", "3", LocalDateTime.now(), 3, 3, 20);
        Bilhetes.add(bilhete3);
        Bilhete bilhete4 = new Bilhete("4", "4", "4", "4", "4", "4", LocalDateTime.now(), 4, 4, 20);
        Bilhetes.add(bilhete4);
        Bilhete bilhete5 = new Bilhete("5", "5", "5", "5", "5", "5", LocalDateTime.now(), 5, 5, 20);
        Bilhetes.add(bilhete5);

        Bilhetes.forEach((bilhete) -> {
            mostraBilhete(bilhete, Sessoes, Clientes, Assentos, Filmes, Salas);
        });


        /*Filmes.forEach((filme) -> {
            System.out.println(filme.getNome());
        });
        Salas.forEach((sala) -> {
            System.out.println(sala.getNome());
        });*/
    }
}