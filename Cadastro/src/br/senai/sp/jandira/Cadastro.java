package br.senai.sp.jandira;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Cadastro extends JFrame implements ActionListener {
	Calendar caldendario=Calendar.getInstance();
	JButton btnMensagem = new JButton("Mensagem");
	JButton btnLimparNome = new JButton("Limpar nome");
	JButton btnSair = new JButton("Sair");

	JLabel lblNome = new JLabel("Nome");
	JLabel lblAnoDeNascimento = new JLabel("Ano nascimento");

	JTextField txtNome = new JTextField();
	JTextField txtAnoNascimento = new JTextField();

	public Cadastro() {

		// Botões
		setLayout(null);
		btnMensagem.setBounds(50, 300, 120, 30);
		btnLimparNome.setBounds(200, 300, 120, 30);
		btnSair.setBounds(340, 300, 100, 30);
		add(btnMensagem);
		add(btnLimparNome);
		add(btnSair);
		
		btnMensagem.addActionListener(this);
		btnLimparNome.addActionListener(this);
		btnSair.addActionListener(this);

		// Label
		lblNome.setBounds(100, 50, 100, 20);
		lblAnoDeNascimento.setBounds(100, 100, 110, 20);
		add(lblNome);
		add(lblAnoDeNascimento);

		// Campo de texto
		txtNome.setBounds(220, 50, 200, 30);
		txtAnoNascimento.setBounds(220, 100, 100, 30);
		add(txtNome);
		add(txtAnoNascimento);

		// JFrame
		setTitle("Cadastro de Produto");
		setSize(500, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent Evento) {
		if (Evento.getSource() == btnMensagem) {
			if(!txtNome.getText().equals("")&&!txtAnoNascimento.getText().equals("")) {
				String nome=txtNome.getText();
				String strData=txtAnoNascimento.getText();
				int dataNascimento=Integer.parseInt(strData);
				int anoAtual=caldendario.get(Calendar.YEAR);
				int idade=anoAtual-dataNascimento;
				
				JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade);
			}

		}
		else if(Evento.getSource()==btnLimparNome) {
			txtNome.setText("");
			txtAnoNascimento.setText("");
		}
		else if(Evento.getSource()==btnSair) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new Cadastro();
	}

}
