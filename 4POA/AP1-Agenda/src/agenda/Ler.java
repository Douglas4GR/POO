package agenda;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ler {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader leitor = new FileReader ("C:/home/2210478300006/eclipse-workspace/Agenda_dupla/agenda.txt");
			BufferedReader brLeitor = new BufferedReader(leitor);
			while(brLeitor.ready()) {
				String str = brLeitor.readLine();
				System.out.println(str);
			}
			brLeitor.close();
			leitor.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
