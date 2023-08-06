package br.edu.faeterj;

public class Servidor extends Pessoa {
    private String cargo;

    public Servidor(String nome, int matricula, String dtNascimento, String dtIngresso, String senha, String cargo) {
        super(nome, matricula, dtNascimento, dtIngresso, senha);
        this.cargo = cargo;
    }


    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String recuperaSenha() {
        return super.getSenha();
    }
}
