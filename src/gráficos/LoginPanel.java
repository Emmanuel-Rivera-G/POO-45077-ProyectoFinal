package gráficos;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import clases.Cliente;
import clases.Empleado;
import clases.Usuario;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class LoginPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPasswordField contrasenaLoginValor;
	
	//Ventana principal que se solicitará
	private JFrame frame;

	//Colores para todo el código
	private Color grisColorBoton = new Color(128, 128, 128);
	private Color grisOscuroBoton = new Color(95, 95, 95);
	
	//Variables del panel
	private JPanel loginPanel;
	
	//Variables para el usuario
	private JPanel usuarioLoginPane;
	private JSeparator usuarioLoginLn;
	private JLabel usuarioLoginNom;
	private JTextField usuarioLoginValor;
	
	//Variables para la contraseña
	private JPanel contrasenaLoginPane;
	private JSeparator contrasenaLoginLn;
	private JLabel constrasenaLoginNom;
	
	//Variables para el boton
	private JPanel botonLoginPane;
	private JLabel botonLoginNom;
	
	//Variable para el titulo
	private JLabel tituloLoginlbl;
	
	private Set<Usuario> usuarios;
	
	public LoginPanel(JFrame frame) {
		
		this.frame = frame;
		
		setLayout(null);
		
		iniciarLoginPanel();
		
		iniciarUsuarioLoginPane();
		
		iniciarUsuarioLoginLn();
		
		iniciarUsuarioLoginNom();
		
		iniciarUsuarioLoginValor();
		
		iniciarContrasenaLogin();
		
		iniciarBotonLogin();
		
		iniciarTituloLoginlbl();
	}

	private void iniciarLoginPanel() {
		loginPanel = new JPanel();
		loginPanel.setBackground(new Color(255, 255, 255));
		loginPanel.setBounds(0, 0, 562, 455);
		add(loginPanel);
		loginPanel.setLayout(null);
	}

	private void iniciarUsuarioLoginPane() {
		usuarioLoginPane = new JPanel();
		usuarioLoginPane.setBounds(0, 64, 562, 92);
		loginPanel.add(usuarioLoginPane);
		usuarioLoginPane.setBackground(new Color(255, 255, 255));
		usuarioLoginPane.setLayout(null);
	}
	
	private void iniciarUsuarioLoginLn() {
		usuarioLoginLn = new JSeparator();
		usuarioLoginLn.setBounds(0, 86, 552, 2);
		usuarioLoginPane.add(usuarioLoginLn);
	}
	
	private void iniciarUsuarioLoginNom() {
		usuarioLoginNom = new JLabel("USUARIO:");
		usuarioLoginNom.setBounds(0, 0, 138, 25);
		usuarioLoginPane.add(usuarioLoginNom);
		usuarioLoginNom.setFont(new Font("Tahoma", Font.BOLD, 20));
	}
	
	private void iniciarUsuarioLoginValor() {
		usuarioLoginValor = new JTextField();
		usuarioLoginValor.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (usuarioLoginValor.getText().equals("Ingrese su usuario")) {
					usuarioLoginValor.setText("");
					usuarioLoginValor.setForeground(Color.black);
				}
				if (String.valueOf(contrasenaLoginValor.getPassword()).isEmpty()) {
					contrasenaLoginValor.setText("*******");
					contrasenaLoginValor.setForeground(Color.gray);
				}
			}
		});
		usuarioLoginValor.setBounds(0, 49, 380, 32);
		usuarioLoginPane.add(usuarioLoginValor);
		usuarioLoginValor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		usuarioLoginValor.setForeground(new Color(128, 128, 128));
		usuarioLoginValor.setText("Ingrese su usuario");
		usuarioLoginValor.setBorder(null);
		usuarioLoginValor.setColumns(10);
	}
	
	private void iniciarContrasenaLoginPane() {
		contrasenaLoginPane = new JPanel();
		contrasenaLoginPane.setBounds(0, 250, 562, 92);
		loginPanel.add(contrasenaLoginPane);
		contrasenaLoginPane.setBorder(null);
		contrasenaLoginPane.setBackground(new Color(255, 255, 255));
		contrasenaLoginPane.setLayout(null);
	}
	
	private void iniciarContrasenaLogin() {
		iniciarContrasenaLoginPane();
		
		contrasenaLoginLn = new JSeparator();
		contrasenaLoginLn.setBounds(0, 86, 552, 2);
		contrasenaLoginPane.add(contrasenaLoginLn);
		
		constrasenaLoginNom = new JLabel("CONSTRASEÑA:");
		constrasenaLoginNom.setBounds(0, 0, 192, 25);
		contrasenaLoginPane.add(constrasenaLoginNom);
		constrasenaLoginNom.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		contrasenaLoginValor = new JPasswordField();
		contrasenaLoginValor.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (usuarioLoginValor.getText().isEmpty() || usuarioLoginValor.getText().equals("Ingrese su usuario")) {
					usuarioLoginValor.setText("Ingrese su usuario");
					usuarioLoginValor.setForeground(Color.gray);
				}
				if (String.valueOf(contrasenaLoginValor.getPassword()).equals("*******")) {
					contrasenaLoginValor.setText("");
					contrasenaLoginValor.setForeground(Color.black);
				}
			}
		});
		contrasenaLoginValor.setBounds(0, 49, 380, 32);
		contrasenaLoginPane.add(contrasenaLoginValor);
		contrasenaLoginValor.setBorder(null);
		contrasenaLoginValor.setForeground(new Color(128, 128, 128));
		contrasenaLoginValor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contrasenaLoginValor.setText("*******");
	}
	
	private void iniciarBotonLogin() {
		botonLoginPane = new JPanel();
		botonLoginPane.setBounds(0, 408, 120, 47);
		loginPanel.add(botonLoginPane);
		botonLoginPane.setBackground(grisColorBoton);
		botonLoginPane.setLayout(null);

		botonLoginNom = new JLabel("Botón");
		botonLoginNom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botonLoginPane.setBackground(grisOscuroBoton);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				botonLoginPane.setBackground(grisColorBoton);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean usuarioCom = false, contrasenaCom = false; int i = 0;
				String usuario = usuarioLoginValor.getText(), contrasena = String.valueOf(contrasenaLoginValor.getPassword());
				for (Usuario usuarioLocal : usuarios) {
					if (usuarios.size() <= i || (usuarioCom && contrasenaCom)) break;
					usuarioCom = usuario.equals(usuarioLocal.getUsuario()); 
					contrasenaCom = contrasena.equals(usuarioLocal.getContrasena());
				}
				
				if (usuarioCom && contrasenaCom) {
					
					VentanaPrincipal vent = new VentanaPrincipal();
					vent.setVisible(true);
					frame.dispose();
				}
			}
		});
		botonLoginNom.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonLoginNom.setForeground(new Color(255, 255, 255));
		botonLoginNom.setHorizontalAlignment(SwingConstants.CENTER);
		botonLoginNom.setBackground(new Color(128, 128, 128));
		botonLoginNom.setFont(new Font("Unispace", Font.BOLD, 16));
		botonLoginNom.setBounds(0, 0, 120, 47);
		botonLoginPane.add(botonLoginNom);
	}
	
	private void iniciarTituloLoginlbl() {
		tituloLoginlbl = new JLabel("Login");
		tituloLoginlbl.setBounds(0, 0, 166, 39);
		loginPanel.add(tituloLoginlbl);
		tituloLoginlbl.setFont(new Font("Tahoma", Font.BOLD, 24));
	}
	
	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}
