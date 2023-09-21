package Escola;

public class Professor {
	private int id;
	private Turma turma;
	
	public Professor(int id, Turma turma) {
		super();
		this.id = id;
		this.turma = turma;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
}
