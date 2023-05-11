package br.com.lojao;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> lproduto = new ArrayList<>();
		int tamanhoLista = 0;

		System.out.println("Digite o tamanho da lista:");
		tamanhoLista = sc.nextInt();
		for (int i = 0; i < tamanhoLista; i++) {
			Produto prod = new Produto();
			prod.criarProduto();
			lproduto.add(prod);
		}
		Produto exibir = new Produto();
		exibir.mostrarLProduto(lproduto);
	}
}
