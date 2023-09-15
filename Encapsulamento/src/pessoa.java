
public class pessoa {
	private String nome;
	private double altura;
	private double peso;
	private String corDosOlhos;
	// getters-->quem chamar o metodo get vai receber, pegar, entao eles vao enviar
	// algo
	// setters-->set configura um atributo, preencher os atributos da classe

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCorDosOlhos() {
		return corDosOlhos;
	}
	public void setCorDosOlhos(String corDosOlhos) {
		this.corDosOlhos = corDosOlhos;
	}
	// criar atalho clica com o botão direito uma linha em baixo da criação dos
	// atributos, clica em source e depois generate getters e setters e depois
	// seleciona os atributos e o eclipse ja faz isso td
}
