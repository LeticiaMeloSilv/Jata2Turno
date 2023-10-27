package br.com.livraria.externos;

public class Editora {

	private String nomeFantasia;

	private String razaoSocial;

	private String cnpj;

	private boolean dados;

	public Editora(String razaoSocial, String cnpj) {

		this.razaoSocial = razaoSocial;

		this.cnpj = cnpj;

	}

	public String getNomeFantasia() {

		return nomeFantasia;

	}

	public void setNomeFantasia(String nomeFantasia) {

		this.nomeFantasia = nomeFantasia;

	}

	public String getRazaoSocial() {

		return razaoSocial;

	}

	public String getCnpj() {

		return cnpj;

	}

	public boolean exibirDadosdaEditora(String dadosEditora) {

		System.out.println("Nome Fantasia: " + nomeFantasia + "\nRazão Social: " + razaoSocial);

		return dados = true;

	}

}