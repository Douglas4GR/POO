package br.edu.faeterj;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        //agora os comentarios serao feitos em portugues, comecei a utilizar o intellij
        //declaração de variaveis
        double valor1;
        double valor2;
        double resultado = 0;
        int opcao = 1;

        //começando operações
        while(opcao > 0) {

            //escolher operação
            calc.mostrarOpc();
            opcao = sc.nextInt();

            if(opcao < 1) {
                System.out.println("Calculadora finalizada");
            } else {
                //coletando primeiro numero (necessario)
                System.out.println("Valor 1(ou digite 0 para usar o resultado da operação anterior): ");
                valor1 = sc.nextDouble();

                if(valor1 == 0) {
                    //usando resultado anterior
                    valor1 = resultado;
                }
                if (opcao >= 6) {
                    valor2 = 0;
                } else {
                    //coletando segundo numero
                    System.out.println("Valor 2: ");
                    valor2 = sc.nextDouble();
                }

                //fazendo operação
                resultado = calc.Selec(opcao, valor1, valor2);
                System.out.println("Resultado: "+ resultado);
            }
        }
        sc.close();
    }
}