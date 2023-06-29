package br.edu.faeterj;

public abstract class Pessoa {
    private String nome;
    private int matricula;
    private String dtNascimento;
    private String dtIngresso;
    private String senha;

    /*construtor*/
    public Pessoa(String nome, int matricula, String dtNascimento, String dtIngresso, String senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.dtNascimento = dtNascimento;
        this.dtIngresso = dtIngresso;
        this.senha = senha;
    }

    /*getters*/
    public String getNome() { return this.nome; }
    public int getMatricula() { return this.matricula; }
    public String getDtNascimento() { return this.dtNascimento; }
    public String getDtIngresso() { return this.dtIngresso; }
    String getSenha() { return this.senha; }

    /*setters*/
    public void setNome(String nome) { this.nome = nome; }
    public void setMatricula(int matricula) { this.matricula = matricula; }
    public void setDtNascimento(String dtNascimento) { this.dtNascimento = dtNascimento; }
    public void setDtIngresso(String dtIngresso) { this.dtIngresso = dtIngresso; }
    void setSenha(String senha) { this.senha = senha; }
    public abstract String recuperaSenha();
}
