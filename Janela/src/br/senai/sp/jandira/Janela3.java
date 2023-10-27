package br.senai.sp.jandira;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela3 extends JFrame {
	JButton botaoContinuar = new JButton("Continuar");
	JButton botaoSair = new JButton("Sair");

	public Janela3() {
		// criacao dos botoes
		setLayout(null);
		// x,y,largura,altura
		botaoContinuar.setBounds(50, 300, 100, 30);
		botaoSair.setBounds(340, 300, 100, 30);
		add(botaoContinuar);
		add(botaoSair);
		
		//criacao do frame
		setTitle("Janela3");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Janela3();
	}
}