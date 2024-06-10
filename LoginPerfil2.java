package LoginPerfil1;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPerfil2 extends JFrame {

	private static final long serialVersionUID = 9083531704607642077L;
	// Declaração dos componentes
    JLabel lblUsuario, lblSenha, lblMensagem;
    JTextField txtUsuario;
    JPasswordField txtSenha;
    JButton btnEntrar, btnSair;

    // Construtor
    public LoginPerfil2() {
        // Configuração da janela
        super("Tela de LoginPerfil");
        getContentPane().setBackground(new Color(128, 255, 255));
        this.setSize(400, 300);
        getContentPane().setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Instanciação dos componentes
        lblUsuario = new JLabel("Usuário:");
        lblUsuario.setBounds(50, 50, 100, 25);
        txtUsuario = new JTextField();
        txtUsuario.setBounds(110, 50, 200, 25);
        lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(50, 80, 100, 25);
        txtSenha = new JPasswordField();
        txtSenha.setBounds(110, 80, 200, 25);
        btnEntrar = new JButton("Entrar");
        btnEntrar.setBounds(50, 120, 100, 25);
        btnSair = new JButton("Sair");
        btnSair.setBounds(200, 120, 100, 25);
        lblMensagem = new JLabel("");
        lblMensagem.setBounds(50, 160, 200, 25);

        // Adicionando os componentes na janela
        getContentPane().add(lblUsuario);
        getContentPane().add(txtUsuario);
        getContentPane().add(lblSenha);
        getContentPane().add(txtSenha);
        getContentPane().add(btnEntrar);
        getContentPane().add(btnSair);
        getContentPane().add(lblMensagem);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            LoginPerfil2 window = new LoginPerfil2();
            window.setVisible(true);
        });
    }
}

