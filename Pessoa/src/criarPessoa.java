public class criarPessoa {



	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("111.222.333.444", 2000);

		p1.setAltura(1.70);

		p1.setNome("Vinicius");

		p1.setPeso(53);

		System.out.println("Nome " + p1.getNome());

		System.out.println("Ano de Nascimento " + p1.getDataNascimento());

		System.out.println("Idade " + p1.getIdade());

	}

}

//system.exit(0)-->encerra o programa
// getters-->quem chamar o metodo get vai receber, pegar, entao eles vao enviar
// algo
// setters-->set configura um atributo, preencher os atributos da classe
