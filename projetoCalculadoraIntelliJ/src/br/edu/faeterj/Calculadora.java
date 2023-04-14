package br.edu.faeterj;

public class Calculadora {
    //desenvolvimento da calculadora
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
        return Math.pow(a, b);
    }

    public double Raiz(double a)
    {
        return Math.sqrt(a);
    }

    // as funções abaixo foram sugeridas pelo próprio intellij

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
        return Math.log(a);
    }

    public double Seno(double a)
    {
        return Math.sin(a);
    }

    public double Cosseno(double a)
    {
        return Math.cos(a);
    }

    public double Tangente(double a)
    {
        return Math.tan(a);
    }

    //fim operacoes
}