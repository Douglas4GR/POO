package agenda;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Escrever {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			File arq = new File("/home/2210478300006/eclipse-workspace/Agenda_dupla/");
			if (!arq.exists()) arq.mkdir();  		
			//agenda (arquivo)
			FileWriter agendinha = new FileWriter("./agenda.txt", true); //por parao é false, o true faz append
			
			//buffer
			BufferedWriter bwEscrever = new BufferedWriter(agendinha);
			//objeto
			Agenda pessoa1 = new Agenda("Miguel","(21)91234-5678");
			String strPessoa1 = pessoa1.getNome() + " " + pessoa1.getNumero();
			
			bwEscrever.write(strPessoa1);
			bwEscrever.newLine();
			bwEscrever.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}