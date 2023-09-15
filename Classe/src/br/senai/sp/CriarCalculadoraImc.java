package br.senai.sp;

import java.util.Scanner;

import br.senai.sp.jandira.CalculadoraIMC;

public class CriarCalculadoraImc {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		CalculadoraIMC c1 = new CalculadoraIMC();
		
		try {
			System.out.println("digite seu nome");
			c1.nome=teclado.next();
			System.out.println("digite seu peso");
			c1.peso=teclado.nextDouble();
			System.out.println("digite sua altura");
			c1.altura=teclado.nextDouble();
			
			System.out.println("Nome:  " + c1.nome);
			System.out.println("Peso:  " + c1.peso);
			System.out.println("Altura:  " + c1.altura);
			System.out.println("Seu estado: " + c1.estadoPessoa());

			if(c1.estadoPessoa()) {
				System.out.println("peso ok");
			}
			else {
				System.out.println("peso nao ok");
			}
			teclado.close();
			
		}
		catch(Exception erro  ){
			System.out.println("!ERRO! Isso não me parece um número");
		}
		
	}

}
