package br.com.livraria.externos;

public class Autor {

	private String nome;

	private String email;

	private String cpf;

	private boolean dados;

	public Autor(String cpf) {

		this.cpf = cpf;

	}

	public String getNome() {

		return nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {

		this.email = email;

	}

	public String getCpf() {

		return cpf;

	}

	public boolean exibirDadosdoAutor(String dadosAutor) {

		System.out.println("Nome do Autor: " + nome + "\n Email do Autor: " + email);

		return dados = true;

	}

}
