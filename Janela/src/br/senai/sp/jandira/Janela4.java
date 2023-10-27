package br.senai.sp.jandira;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//herança		interface
public class Janela4 extends JFrame implements ActionListener {
	JButton botao1 = new JButton("Mensagem");
	JButton botao2 = new JButton("Sim!");
	JButton botaoSair = new JButton("Não");

	public Janela4() {
		botao1.addActionListener(this);
		botao2.addActionListener(this);
		botaoSair.addActionListener(this);


		setLayout(null);
		botao1.setBounds(40, 300, 120, 30);
		botao2.setBounds(190, 300, 120, 30);
		botaoSair.setBounds(330, 300, 120, 30);
		add(botao1);
		add(botao2);
		add(botaoSair);

		setTitle("Janela4");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	// metodo obrigatorio da interface actionListener
	// ActionEvent é uma classe dessa interface, Evento é um nome escolhido por mim
	// mesma
	public void actionPerformed(ActionEvent Evento) {
		if (Evento.getSource() == botao1) {
			JOptionPane.showMessageDialog(null, "Do you mind if I steal a kiss, tho?");
			JOptionPane.showMessageDialog(null, "A little souvenir");
			JOptionPane.showMessageDialog(null, "Can I steal it from you?");
			JOptionPane.showMessageDialog(null, "To memorize the way you shock me");
			JOptionPane.showMessageDialog(null, "The way you move it here");
			JOptionPane.showMessageDialog(null, "Just wanna feel it from you");
		}
		if (Evento.getSource() == botao2) {
			JOptionPane.showMessageDialog(null, "Mwahh!!");
		}
		if (Evento.getSource() == botaoSair) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new Janela4();
	}
}
