package br.edu.faeterj;

public class Calculadora {
    //desenvolvimento da calculadora

    public void mostrarOpc()
    {
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

        double resultadoInt = 0;

        switch(opcao) {
            case 1:
                resultadoInt = Soma(valor1, valor2);
                break;
            case 2:
                resultadoInt = Subt(valor1, valor2);
                break;
            case 3:
                resultadoInt = Mult(valor1, valor2);
                break;
            case 4:
                resultadoInt = Divi(valor1, valor2);
                break;
            case 5:
                resultadoInt = Pot(valor1, valor2);
                break;
            case 6:
                resultadoInt = Raiz(valor1);
                break;
            case 7:
                resultadoInt = Fatorial(valor1);
                break;
            case 8:
                resultadoInt = Log(valor1);
                break;
            case 9:
                resultadoInt = Seno(valor1);
                break;
            case 10:
                resultadoInt = Cosseno(valor1);
                break;
            case 11:
                resultadoInt = Tangente(valor1);
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
        return resultadoInt;
    }

    //operacoes
    public double Soma(double a,double b)
    {
        return a+b;
    }

    public double Subt(double a,double b)
    {
        return a-b;
    }

    public double Mult(double a,double b)
    {
        return a*b;
    }

    public double Divi(double a,double b)
    {
        return a/b;
    }

    public double Pot(double a,double b)
    {
        double pot = Math.pow(a, b);
        return pot;
    }

    public double Raiz(double a)
    {
        double sqrt = Math.sqrt(a);
        return sqrt;
    }

    public double Fatorial(double a)
    {
        double fat = 1;
        for(int i = 1; i <= a; i++)
        {
            fat = fat * i;
        }
        return fat;
    }

    public double Log(double a)
    {
        double log = Math.log(a);
        return log;
    }

    public double Seno(double a)
    {
        double seno = Math.sin(a);
        return seno;
    }

    public double Cosseno(double a)
    {
        double cosseno = Math.cos(a);
        return cosseno;
    }

    public double Tangente(double a)
    {
        double tangente = Math.tan(a);
        return tangente;
    }

    //fim operacoes

}