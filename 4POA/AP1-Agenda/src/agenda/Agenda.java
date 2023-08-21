package agenda;

public class Agenda {
	
	public String Nome;
	public String Numero;
	
	public Agenda (String Nome, String Numero){
		this.Nome = Nome;
		this.Numero = Numero;
	}

	public String getNome() {return Nome;}

	public void setNome(String nome) {Nome = nome;}

	public String getNumero() {return Numero;}

	public void setNumero(String numero) {Numero = numero;}
	
}