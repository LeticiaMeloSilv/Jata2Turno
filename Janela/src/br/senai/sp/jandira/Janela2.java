package br.senai.sp.jandira;

import javax.swing.JFrame;

public class Janela2 extends JFrame {
	public Janela2() {
		setTitle("Janela2");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Janela2();
	}
}
//ctrl + espaço --> mostra as opcoes de escrita
//ctrl +shift+f --> identa
//ctrl+f11 -->executa o arquivo
//ctrl+shift+o -->importa as classes
