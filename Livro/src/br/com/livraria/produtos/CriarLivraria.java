package br.com.livraria.produtos;

import br.com.livraria.externos.Autor;
import br.com.livraria.externos.Editora;

public class CriarLivraria {

	public static void main(String[] args) {
		Autor autor = new Autor("111.111.111-11");
		autor.setNome("Jaff kinney");
		autor.setEmail("jeff.kinney@gmail.com");

		Editora editora = new Editora("VR Editora", "111.111.111-12");
		editora.setNomeFantasia("VR");

		Livro livro = new Livro("082345722");
		livro.setNome("Diario de um banana");
		livro.setDescrição(
				"A série Diário de um Banana, lançada em 2007, já foi traduzida para 62 línguas e está em 74 territórios. Desde o primeiro volume, suas obras constam na lista de best-sellers do jornal norte-americano The New York Times. Até hoje, são mais de 275 milhões de exemplares vendidos ao redor do mundo. Jeff já figurou na lista de personalidades mais importantes da revista Times. Kinney é proprietário da livraria independente An unlikely story. Vive em Massachusetts com a companheira e dois filhos.");
		livro.setValor(200);
		livro.aplicaDescontoDe(10);

		System.out.println(livro.dadosLivro());
		System.out.println(autor.exibirDadosdoAutor(null));
		System.out.println(editora.exibirDadosdaEditora(null));

	}

}