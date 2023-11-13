package DogSerializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		Cachorro C = new Cachorro("Bob", 12, "Vira-Lata");
		try {
			File f = new File("c:/a/");
			if(!f.exists()) f.mkdir();
			FileOutputStream arqOSer = new FileOutputStream("c:/a/bob.ser");
			ObjectOutputStream oOSer = new ObjectOutputStream(arqOSer);
			oOSer.writeObject(C);
			oOSer.close();
			
			
			System.out.println("---------------Antes de alterar idade-------------");
			System.out.println(C);
			C.setIdade(13);
			System.out.println("---------------Depois de alterar idade-------------");
			System.out.println(C);
			
			FileInputStream arqISer = new FileInputStream("c:/a/bob.ser");
			ObjectInputStream iOSer = new ObjectInputStream(arqISer);
			C = (Cachorro) iOSer.readObject();
			iOSer.close();
			
			
			System.out.println("---------------Depois de recuperar os valores-------------");
			System.out.println(C);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
