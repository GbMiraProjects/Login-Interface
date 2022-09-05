package fiap;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class GUILogin extends JFrame {
	private JTextField tfLogin;
	private JLabel lbLogin;
	private JLabel lbSenha;
	private JButton btCancelar;
	private JPasswordField pfSenha;
	private JButton btLogar;

	public GUILogin() {
		inicializarComponentes();
		definirEventos();
	}

	private void inicializarComponentes() {
		// definindo o formulário
		setTitle("Login do sistema");
		setBounds(0, 0, 300, 200); // lgr x alt
		setLayout(null);

		// criando objetos para o formulário
		tfLogin = new JTextField();
		pfSenha = new JPasswordField();
		lbSenha = new JLabel("Senha: ");
		lbLogin = new JLabel("Login: ");
		btLogar = new JButton("Logar");
		btCancelar = new JButton("Cancelar");
		
		//definindo tamanho e posição dos objetos
		lbLogin.setBounds(50, 30, 80, 25); // x, y, larg, alt.
		tfLogin.setBounds(120, 30, 120, 25);
		lbSenha.setBounds(50, 75, 80, 25);
		pfSenha.setBounds(120, 75, 120, 25);
		btLogar.setBounds(40, 120, 100, 25);
		btCancelar.setBounds(145, 120, 100, 25);
		
		//adicionando os objetos ao formulário
		add(lbLogin);
		add(tfLogin);
		add(lbLogin);
		add(pfSenha);
		add(btLogar);
		add(btCancelar);
	}

	private void definirEventos() {
		btCancelar.addActionListener(new ActionListener() {			
			@Override //quando o metodo tem duas funções
			public void actionPerformed(ActionEvent e) {
				System.exit(0); //encerra o programa				
			}
		});
		
		btLogar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String senha = String.valueOf(pfSenha.getPassword());
				if (tfLogin.getText().equals("fiap") && senha.equals("123abc")) {
					setVisible(false);
					JOptionPane.showMessageDialog(null, "Login com sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, "Login ou senha incorretos!");
				}
				
			}
		});
	}

}
