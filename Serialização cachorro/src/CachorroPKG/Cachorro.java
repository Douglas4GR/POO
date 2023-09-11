package CachorroPKG;
import java.io.Serializable;

public class Cachorro implements Serializable {
	
	private String Nome;
	private int DataNasc;
	private String TelefoneDono;
	
	//construtor
	public Cachorro (String nome, int dataNasc, String telefoneDono) {
		this.Nome = nome;
		this.DataNasc = dataNasc;
		this.TelefoneDono = telefoneDono;
	}
	
	//getters and setters
	public String getNome() { return Nome; }
		
	public int getDataNasc() { return DataNasc; }
	
	public String getTelefoneDono() {return TelefoneDono; }
	
	public void setNome(String nome) { Nome = nome; }

	public void setDataNasc(int dataNasc) { DataNasc = dataNasc; }

	public void setTelefoneDono(String telefoneDono) { TelefoneDono = telefoneDono; }
}
