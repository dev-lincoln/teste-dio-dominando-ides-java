package com.dio;

import br.com.dio.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato(null, null, null);
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
		/*
		int a = 3;
		int b = 2;
		System.out.println("Hello world! " + (a+b));
		*/
	}
}

class Livros {
	private String nome;
	private Integer npag;
}

