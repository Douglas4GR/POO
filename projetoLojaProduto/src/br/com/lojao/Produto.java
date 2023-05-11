package br.com.lojao;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
//	Scanner sc = new Scanner(System.in);
	String nome;
	double valor;
	int codBarra;
	int idCategoria;
	String descricao;
	int quantidade;


	public Produto (String nome, double valor, int codBarra, int idCategoria, String descricao, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.codBarra = codBarra;
		this.idCategoria = idCategoria;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}

	/*public void criarProduto() {
		System.out.println("Digite as info do produto:");

		System.out.println("nome:");
		nome = sc.next();

		System.out.println("valor:");
		valor = sc.nextDouble();

		System.out.println("quantidade:");
		quantidade = sc.nextInt();

		System.out.println("descricao:");
		descricao = sc.next();

		System.out.println("cod barra:");
		codBarra = sc.nextInt();

	}*/

	public void mostrarLProduto(ArrayList<Produto> listaProduto) {
		for (Produto produto : listaProduto) {
			System.out.println("");
			System.out.println("nome: " + produto.nome);
			System.out.println("valor: " + produto.valor);
			System.out.println("cod barra: " + produto.codBarra);
			System.out.println("id categoria: " + produto.idCategoria);
			System.out.println("descricao: " + produto.descricao);
			System.out.println("quantidade: " + produto.quantidade);
		}
	}

	public void mostrarProduto(Produto produto) {
		System.out.println("");
		System.out.println("nome: " + produto.nome);
		System.out.println("valor: " + produto.valor);
		System.out.println("cod barra: " + produto.codBarra);
		System.out.println("id categoria: " + produto.idCategoria);
		System.out.println("descricao: " + produto.descricao);
		System.out.println("quantidade: " + produto.quantidade);
	}

	public String detalhesProduto() {
		return "nome: " + nome + "\nvalor: " + valor + "\ncod barra: " + codBarra + "\nid categoria: " + idCategoria + "\ndescricao: " + descricao + "\nquantidade: " + quantidade;
	}
}
