package br.senai.sp.jandira;

import javax.swing.JFrame;

public class Janela1 {
	
	public Janela1() {
		JFrame jf=new JFrame();
		jf.setTitle("Primeira janela");
		jf.setSize(500,400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setLocationRelativeTo(null);
		
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Janela1();
	}
}
