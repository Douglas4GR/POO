package br.com.lojao;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<Produto> lProd = new ArrayList<>();

		Produto prod = new Produto("Trakinas", 1.00, 1, "biscoito das crianças", 123456);
		lProd.add(prod);
		System.out.println(prod.detalhesProduto());

		prod = new Produto("Doritos", 5.00, 1, "salgadinho", 123456);
		lProd.add(prod);
		System.out.println(prod.detalhesProduto());

		int fila = 0;
		do{
			System.out.println("Digite o nome do produto que deseja comprar:");
			String nome = sc.next();
			System.out.println("Digite o valor do produto que deseja comprar:");
			double valor = sc.nextDouble();
			System.out.println("Digite o código de barras do produto que deseja comprar:");
			int codBarra = sc.nextInt();
			System.out.println("Digite o ID da categoria do produto que deseja comprar:");
			int idCategoria = sc.nextInt();
			System.out.println("Digite a descrição do produto que deseja comprar:");
			String descricao = sc.next();
			System.out.println("Digite a quantidade do produto que deseja comprar:");
			int quantidade = sc.nextInt();

			prod = new Produto(nome, valor, quantidade, descricao, codBarra);
			lProd.add(prod);

			System.out.println("Deseja comprar mais algum produto? 1 - Sim / 0 - Não");
			fila = sc.nextInt();
		}while (fila == 0);
		
//		Produto exibir = new Produto();
//		exibir.mostrarLProduto(lProd);
//	}
}
