package Escola;

public class Turma {
	private int codigo;
	private Professor prof;
	private Aluno[] alunos;
	
	public Turma(int codigo, Professor prof, Aluno[] alunos) {
		super();
		this.codigo = codigo;
		this.prof = prof;
		this.alunos = alunos;
	}

	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Professor getProf() {
		return prof;
	}
	public void setProf(Professor prof) {
		this.prof = prof;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
}
