package br.senai.sp.jandira;

public class CalculadoraIMC {
	
	public String nome;
	public double peso;
	public double altura;

	public double calcularImc() {
		double imc=0;
		imc=peso/altura*altura;
		return imc;
	}
	public boolean estadoPessoa() {
		boolean estado= false;
		if(calcularImc()<25) {
			estado= true;
		}
		else {
			estado=false;
		}
		return estado;
	}

}
