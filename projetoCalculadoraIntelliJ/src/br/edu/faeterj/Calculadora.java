package br.edu.faeterj;

public class Calculadora {
    //desenvolvimento da calculadora
    //operacoes
    public static double Soma(double a,double b)
    {
        return a+b;
    }

    public static double Subt(double a,double b)
    {
        return a-b;
    }

    public static double Mult(double a,double b)
    {
        return a*b;
    }

    public static double Divi(double a,double b)
    {
        return a/b;
    }

    public static double Pot(double a,double b)
    {
        return Math.pow(a, b);
    }

    public static double Raiz(double a)
    {
        return Math.sqrt(a);
    }

    // as funções abaixo foram sugeridas pelo próprio intellij

    public static double Fatorial(double a)
    {
        double fat = 1;
        for(int i = 1; i <= a; i++)
        {
            fat = fat * i;
        }
        return fat;
    }

    public static double Log(double a)
    {
        return Math.log(a);
    }

    public static double Seno(double a)
    {
        return Math.sin(a);
    }

    public static double Cosseno(double a)
    {
        return Math.cos(a);
    }

    public static double Tangente(double a)
    {
        return Math.tan(a);
    }

    //fim operacoes
}