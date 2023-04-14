package br.edu.faeterj;

import java.util.Scanner;

public class CalculadoraController {
    private Scanner sc; //scanner para ler os valores (private)
    private Calculadora calc; //instancia da classe Calculadora para usar os metodos (private)

    public CalculadoraController() { //construtor
        sc = new Scanner(System.in);
        calc = new Calculadora();
    }

    public void calcular() { //metodo para calcular
        double valor1;
        double valor2;
        double resultado = 0;
        int opcao = 1;

        while(opcao > 0) {
            mostrarOpc();
            opcao = sc.nextInt();

            if(opcao < 1) {
                System.out.println("Calculadora finalizada");
            } else {
                System.out.println("Valor 1(ou digite 0 para usar o resultado da operação anterior): ");
                valor1 = sc.nextDouble();

                if(valor1 == 0) {
                    valor1 = resultado;
                }

                if (opcao >= 6) {
                    valor2 = 0;
                } else {
                    System.out.println("Valor 2: ");
                    valor2 = sc.nextDouble();
                }
                resultado = Selec(opcao, valor1, valor2);

                System.out.println("Resultado: "+ resultado);
            }
        }
        sc.close();
    }

    public void mostrarOpc() { //metodo para mostrar as opcoes
        System.out.println("Selecione uma opcao: "); //menu
        System.out.println("0 - Sair do programa"); //sair
        System.out.println("1 - Soma"); //a+b
        System.out.println("2 - Subtracao"); //a-b
        System.out.println("3 - Multiplicacao"); //a*b
        System.out.println("4 - Divisao"); //a/b
        System.out.println("5 - Potencia"); //a^b
        System.out.println("6 - Raiz"); //sqrt(a)
        System.out.println("7 - Fatorial"); //a!
        System.out.println("8 - Logaritmo"); //log(a)
        System.out.println("9 - Seno"); //sen(a)
        System.out.println("10 - Cosseno"); //cos(a)
        System.out.println("11 - Tangente"); //tan(a)
    }

    public double Selec(int opcao, double valor1, double valor2) {
        //metodo para selecionar a opcao
        double resultadoInt = 0;

        switch(opcao) {
            case 1: resultadoInt = calc.Soma(valor1, valor2); break;
            case 2: resultadoInt = calc.Subt(valor1, valor2); break;
            case 3: resultadoInt = calc.Mult(valor1, valor2); break;
            case 4: resultadoInt = calc.Divi(valor1, valor2); break;
            case 5: resultadoInt = calc.Pot(valor1, valor2); break;
            case 6: resultadoInt = calc.Raiz(valor1); break;
            case 7: resultadoInt = calc.Fatorial(valor1); break;
            case 8: resultadoInt = calc.Log(valor1); break;
            case 9: resultadoInt = calc.Seno(valor1); break;
            case 10: resultadoInt = calc.Cosseno(valor1); break;
            case 11: resultadoInt = calc.Tangente(valor1); break;
            default: System.out.println("Opcao invalida"); break;
        }
        return resultadoInt;
    }
}