package DogSerializable;

import java.io.Serializable;

public class Cachorro implements Serializable {
	
	//private static final long serialVersionUID = 1L;
	private String nome;
	private int idade;
	private String raca;
	
	public Cachorro(String nome, int idade, String raca) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
	}
	
	public String toString() {
		return "Cachorro [nome=" + nome + ", idade=" + idade + ", raça=" + raca + "]";
		}
		
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public int getIdade() {return idade;}
	public void setIdade(int idade) {this.idade = idade;}
	public String getRaca() {return raca;}
	public void setRaca(String raca) {this.raca = raca;}
}
