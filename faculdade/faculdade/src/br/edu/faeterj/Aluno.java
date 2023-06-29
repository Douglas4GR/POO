package br.edu.faeterj;

public class Aluno extends Pessoa{
    private int cr;
    private boolean bolsista;
    private String tipoIngresso;

    public Aluno(String nome, int matricula, String dtNascimento, String dtIngresso, String senha, int cr, boolean bolsista, String tipoIngresso) {
        super(nome, matricula, dtNascimento, dtIngresso, senha);
        this.cr = cr;
        this.bolsista = bolsista;
        this.tipoIngresso = tipoIngresso;
    }

    public int getCr() {
        return this.cr;
    }

    public boolean getBolsista() {
        return this.bolsista;
    }

    public String getTipoIngresso() {
        return this.tipoIngresso;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    @Override
    public String recuperaSenha() {
        return "Senha: " + "qwertyui\n";
    }
}
