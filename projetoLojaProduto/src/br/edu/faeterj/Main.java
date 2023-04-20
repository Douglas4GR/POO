package br.edu.faeterj;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Produto> lproduto = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		// criar mais produtos
		// passar as funções para classe produto (metodos)
		
		Produto prod = new Produto();
		System.out.println("Digite as info do produto:");
		
		System.out.println("nome:");
		prod.nome = sc.next();
		
		System.out.println("valor:");
		prod.valor = sc.nextDouble();
		
		System.out.println("quantidade:");
		prod.quantidade = sc.nextInt();
		
		System.out.println("descricao:");
		prod.descricao = sc.next();
		
		System.out.println("cod barra:");
		prod.codBarra = sc.nextInt();
		
		System.out.println("nome: " + prod.nome +" valor:" + prod.valor + " quantidade:" + prod.quantidade + " descricao:" + prod.descricao + " cod barra:" + prod.codBarra);
	}
}
