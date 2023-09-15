public class Calculadora {

	public double numero1;// atributo
	public char sinal;
	public double numero2;

	private double somar() {
		return numero1 + numero2;
	}

	private double subtrair() {
		return numero1 - numero2;
	}

	private double multiplicar() {
		return numero1 * numero2;

	}

	private double dividir() {
		return numero1 / numero2;
	}

	public double exibirResultado() {
		double resultado = 0;
		if (sinal == '+') {
			resultado = somar();
		} else if (sinal == '-') {
			resultado = subtrair();
		} else if (sinal == 'x' || sinal == '*') {
			resultado = multiplicar();
		} else if (sinal == '/') {
			resultado = dividir();
		}
		else {
			System.out.println("Verifique o sinal inserido[+ - * /]");
		}
		System.out.print(numero1 + " " + sinal + " " + numero2 + " = " + resultado);
		return resultado;
	}
}
