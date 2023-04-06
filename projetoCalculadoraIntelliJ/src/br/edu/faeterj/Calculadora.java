package br.edu.faeterj;

public class Calculadora {
    //desenvolvimento da calculadora

    public void mostrarOpc()
    {
        System.out.println("Selecione uma opcao: ");
        System.out.println("0 - Soma");
        System.out.println("1 - Subtracao");
        System.out.println("2 - Multiplicacao");
        System.out.println("3 - Divisao");
        System.out.println("4 - Sair do programa");
    }

    public int Selec(int opcao, int valor1, int valor2) {

        int resultadoInt = 0;

        switch(opcao) {
            case 0:
                resultadoInt = Soma(valor1, valor2);
                break;
            case 1:
                resultadoInt = Subt(valor1, valor2);
                break;
            case 2:
                resultadoInt = Mult(valor1, valor2);
                break;
            case 3:
                resultadoInt = Divi(valor1, valor2);
                break;
        }
        return resultadoInt;
    }

    //operacoes
    public int Soma(int a,int b)
    {
        return a+b;
    }

    public int Subt(int a,int b)
    {
        return a-b;
    }

    public int Mult(int a,int b)
    {
        return a*b;
    }

    public int Divi(int a,int b)
    {
        return a/b;
    }

}