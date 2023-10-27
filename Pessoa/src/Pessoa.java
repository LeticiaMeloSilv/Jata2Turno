
import java.util.Calendar;

public class Pessoa {

	private String nome;
	private String cpf;
	private double peso;
	private double altura;
	private int dataNascimento;
	private int idade;

	Calendar cal = Calendar.getInstance();

	public Pessoa(String cpf, int dataNascimento){
		
		this.cpf = cpf;

		this.dataNascimento = dataNascimento;

		idade();
		
	}

	public String getNome() {

		return nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public String getCpf() {

		return cpf;

	}

	public double getPeso() {

		return peso;

	}

	public void setPeso(double peso) {

		this.peso = peso;

	}

	public double getAltura() {

		return altura;

	}

	public void setAltura(double altura) {

		this.altura = altura;

	}

	public int getDataNascimento() {

		return dataNascimento;

	}

	public int getIdade() {

		return idade;

	}

	public int idade() {

		int anoAtual = cal.get(Calendar.YEAR);

		idade = anoAtual - dataNascimento;

		return idade;

	}

}