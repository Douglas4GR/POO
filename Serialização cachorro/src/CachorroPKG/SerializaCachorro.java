package CachorroPKG;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializaCachorro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro dog = new Cachorro("Bob", 2021, "(21)98765-4321");
		
		
		try (FileOutputStream fileOut = new FileOutputStream("dog.ser");
	             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
			
	            out.writeObject(dog);
	            System.out.println("Cachorro serializado com sucesso!");
	            
        } catch (IOException e) {
            e.printStackTrace();
        }

		
	        try (FileInputStream fileIn = new FileInputStream("dog.ser");
	             ObjectInput in = new ObjectInputStream(fileIn)) {
	        	
	            Cachorro cachorroDesserializado = (Cachorro) in.readObject();
	            System.out.println("Cachorro desserializado:");
	            System.out.println("Nome: " + cachorroDesserializado.getNome());
	            System.out.println("Ano de nascimento: " + cachorroDesserializado.getDataNasc());
	            System.out.println("Telefone do dono: " + cachorroDesserializado.getTelefoneDono());
	            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
	}

}
