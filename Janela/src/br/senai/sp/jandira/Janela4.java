
package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//.					herança		interface
public class Janela4 extends JFrame implements ActionListener {
	JButton botao1 = new JButton("♫ The Promissed ♫ ");
	JButton botao2 = new JButton("Sim");
	JButton botaoSair = new JButton("Não!");

	public Janela4() {
		botao1.addActionListener(this);
		botao2.addActionListener(this);
		botaoSair.addActionListener(this);

		setLayout(null);
		// X, Y, Comprimento, Altura
		botao1.setBounds(60, 30, 160, 40);
		botao2.setBounds(18, 90, 120, 30);
		botaoSair.setBounds(150, 90, 120, 30);
		add(botao1);
		add(botao2);
		add(botaoSair);

		setTitle("Feels");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setBackground(Color.pink);
		// botao2.setBackground(Color.pink);
		// botaoSair.setBackground(Color.pink);
		// botao1.setBackground(Color.pink);
	}

	// metodo obrigatorio da interface actionListener
	// ActionEvent é uma classe dessa interface, Evento é um nome escolhido por mim
	// mesma
	public void actionPerformed(ActionEvent Evento) {
		if (Evento.getSource() == botao1) {
			JOptionPane.showMessageDialog(null, "Do you mind...");
			JOptionPane.showMessageDialog(null, "If i...");
			JOptionPane.showMessageDialog(null, "Steal a kiss, tho?");
			JOptionPane.showMessageDialog(null, "A little souvenir\n^v^");
			JOptionPane.showMessageDialog(null, "Can I steal it from you?");
			JOptionPane.showMessageDialog(null, "♫ ♫ ♫");
			JOptionPane.showMessageDialog(null, "To memorize...");
			JOptionPane.showMessageDialog(null, "The way..");
			JOptionPane.showMessageDialog(null, "You shock me!");
			JOptionPane.showMessageDialog(null, "The way you move it here...");
			JOptionPane.showMessageDialog(null, "Just wanna feel it from you\n:)");
		}
		if (Evento.getSource() == botao2) {
			System.exit(0);
		}
		if (Evento.getSource() == botaoSair) {
			JOptionPane.showMessageDialog(null, "Mwahh!!<3");
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new Janela4();
	}
}
