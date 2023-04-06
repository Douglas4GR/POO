package br.edu.faeterj;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        //agora os comentarios serao feitos em portugues, comecei a utilizar o intellij
        //declaração de variaveis
        int valor1 = 0;
        int valor2 = 0;
        int opcao = 0;

        //coletando primeiro numero (necessario)
        System.out.println("Valor 1: ");
        valor1 = sc.nextInt();

        //começando operações
        while(opcao < 4) {

            //escolher operação
            calc.mostrarOpc();
            opcao = sc.nextInt();

            if(opcao > 3) {
                System.out.println("Calculadora finalizada");
            }else {
                //coletando valores
                System.out.println("Valor 2: ");
                valor2 = sc.nextInt();
                //fazendo operação (valor1, agora o resultado sera usado enquanto o usuario quiser)
                valor1 = calc.Selec(opcao, valor1, valor2);
                System.out.println("Resultado: "+ valor1);
            }
        }
        sc.close();
    }
}