package br.com.livraria.produtos;

import br.com.livraria.externos.*;

public class Livro {

	private String nome;

	private String descricao;

	private double valor;

	private double valorComDesconto;

	private String isbn;

	private Autor autor;

	private Editora editora;

	private boolean aplicavel;

	private boolean dadosLivro;

	private double resultado;

	public Livro(String isbn) {

		this.isbn = isbn;

	}

	public boolean aplicaDescontoDe(double porcentagem) {

		if (porcentagem > 20) {

			return aplicavel = false;

		} else {

			valorComDesconto = valor - (valor * porcentagem) / 100;

			return aplicavel = true;

		}

	}

	public boolean dadosLivro() {

		System.out.println("Nome do livro: " + nome +

				"\nDescrição do livro: " + descricao +

				"\nvalor do livro: " + valor +

				"\nDesconto aplicavel: " + aplicavel +

				"\nDesconto: " + valorComDesconto +

				"\nISBN do livro: " + isbn);

		dadosLivro = true;

		return dadosLivro;

	}

	public String getNome() {

		return nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public String getDescrição() {

		return descricao;

	}

	public void setDescrição(String descrição) {

		this.descricao = descrição;

	}

	public double getValor() {

		return valor;

	}

	public void setValor(double valor) {

		this.valor = valor;

	}

	public double getValorComDesconto() {

		return valorComDesconto;

	}

	public void setValorComDesconto(double valorComDesconto) {

		this.valorComDesconto = valorComDesconto;

	}

	public Autor getAutor() {

		return autor;

	}

	public void setAutor(Autor autor) {

		this.autor = autor;

	}

	public Editora getEditora() {

		return editora;

	}

	public void setEditora(Editora editora) {

		this.editora = editora;

	}

	public String getIsbn() {

		return isbn;

	}

}
