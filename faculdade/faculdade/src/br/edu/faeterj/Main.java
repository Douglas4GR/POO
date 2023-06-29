package br.edu.faeterj;

public class Main {
    public static void main(String[] args) {
        Servidor serv = new Servidor();
        serv.setSenha("123456");

        Aluno aluno = new Aluno();
        aluno.setSenha("qwertyui");
        aluno.recuperaSenha();
    }
}