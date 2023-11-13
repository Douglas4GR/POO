package Escola;

public class Aluno {
	private int matricula;
	private Turma turma;
	
	public Aluno(int matricula, Turma turma) {
		super();
		this.matricula = matricula;
		this.turma = turma;
	}

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
}
