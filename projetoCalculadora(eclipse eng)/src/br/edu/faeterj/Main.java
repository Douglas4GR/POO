package br.edu.faeterj;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		//the comments are made in english because for eclipse IDE, portuguese words appears underlined (as an error)    
		//declaration of variables
		int valor1 = 0;
		int valor2 = 0;
		int opcao = 0;
		
		//collecting first number(necessary) 
		System.out.println("Valor 1: ");
		valor1 = sc.nextInt();
		
		//starting operations
		while(opcao < 4) {
			
			//choose operation
			calc.mostrarOpc();
			opcao = sc.nextInt();
			
			if(opcao > 3) {
				System.out.println("Calculadora finalizada");
			}else {
				//collecting values
				System.out.println("Valor 2: ");
				valor2 = sc.nextInt();
				//doing operation (valor1, now result will be used as long as the user wants to)
				valor1 = calc.Selec(opcao, valor1, valor2);
				System.out.println("Resultado: "+ valor1);
			}
		}
		sc.close();
	}
}