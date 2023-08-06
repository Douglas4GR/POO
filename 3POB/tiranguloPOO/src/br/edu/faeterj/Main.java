package br.edu.faeterj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Triangulo triX = new Triangulo();
		System.out.println("Digite os lasdos do triangulo");
		triX.A = sc.nextDouble();
		triX.B = sc.nextDouble();
		triX.C = sc.nextDouble();
		double areaX = triX.CalculaArea();
		System.out.println("area do triangulo X:" + areaX);
		
		Triangulo triY = new Triangulo();
		System.out.println("Digite os lasdos do triangulo");
		triY.A = sc.nextDouble();
		triY.B = sc.nextDouble();
		triY.C = sc.nextDouble();
		double areaY = triY.CalculaArea();
		System.out.println("area do triangulo Y:" + areaY);
 
	}

}
