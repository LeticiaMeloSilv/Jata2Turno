import java.util.Scanner;

public class TestarCalculadora {// classe
	// ctrl+shift+o-->importa
	// ctrl+shift+f-->identar
	//ctrl+f11-->run

	public static void main(String[] args) {// metodo
		Scanner teclado = new Scanner(System.in);
		Calculadora c1 = new Calculadora();// objeto-instancia
		Calculadora c2 = new Calculadora();// objeto-instancia
		try {
			System.out.print("Digite o primeiro valor: ");
			c1.numero1 = teclado.nextDouble();
			System.out.print("Operação: ");
			c1.sinal = teclado.next().charAt(0);
			System.out.print("Digite o segundo valor: ");
			c1.numero2 = teclado.nextDouble();
			c1.exibirResultado();
			
			System.out.print("Digite o primeiro valor: ");
			c2.numero1 = teclado.nextDouble();
			System.out.print("Operação: ");
			c2.sinal = teclado.next().charAt(0);
			System.out.print("Digite o segundo valor: ");
			c2.numero2 = teclado.nextDouble();
			c2.exibirResultado();
			
			teclado.close();
			
		} catch (Exception erro) {
			System.out.println("!ERRO! Verifique os valores inseridos");
		/*erro de sintaxe=erro do programador, escrita errada no codigo
		 * erro de semantica= quando coloca algo errado do tipo: quero fazer uma soma, mas na hr de inserir os valores eu coloco 2 / 8, bglh errado
		 * erro de exception=erro do usuario */
		}

	}
}
