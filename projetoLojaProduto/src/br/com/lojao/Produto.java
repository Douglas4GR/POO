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

	public String detalhesProduto() {
		return "nome: " + nome + "\nvalor: " + valor + "\ncod barra: " + codBarra + "\nid categoria: " + idCategoria + "\ndescricao: " + descricao + "\nquantidade: " + quantidade;
	}

	public String linhaOutProduto() {
		return nome + ";" + valor + ";" + codBarra + ";" + idCategoria + ";" + descricao + ";" + quantidade + "\n";
	}
}
