package br.edu.faeterj;

public class Professor extends Servidor{
    private String titulacao;

    public Professor(String nome, int matricula, String dtNascimento, String dtIngresso, String cargo, String senha) {
        super(nome, matricula, dtNascimento, dtIngresso, cargo, senha);
    }
}
