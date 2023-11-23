package gráficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Persistencia.BaseDeDatos;
import clases.Cliente;
import clases.ComparadorUsuario;
import clases.Empleado;
import clases.Usuario;
import java.awt.GridLayout;

public class RegisterPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	//Ventana principal que se solicitará
	private JFrame frame;
	
	//Panel principal
	private JPanel registerPanel;
		

	//Colores generales
	private Color grisColorBoton = new Color(128, 128, 128);
	private Color grisOscuroBoton = new Color(95, 95, 95);
	
	//Variables para el nombre
	private JTextField nombreRegisterValor;
	private JPanel nombreRegisterPanel;
	private JSeparator nombreRegisterLn;
	private JLabel nombreRegisterNom;
	
	//Variables para el apellido
	private JTextField apellidoRegisterValor;
	private JPanel apellidoRegisterPanel;
	private JSeparator apellidoRegisterLn;
	private JLabel apellidoRegisterNom;
	
	//Variables para el usuario
	private JTextField usuarioRegisterValor;
	private JLabel usuarioRegisterNom;
	private JPanel usuarioRegisterPanel;
	private JSeparator usuarioRegisterLn;
	
	//Variables para la contraseña
	private JPasswordField contrasenaRegisterValor;
	private JPanel contrasenaRegisterPane;
	private JSeparator contrasenaRegisterLn;
	private JLabel constrasenaRegisterNom;
	
	//Varibles para el botón
	private JPanel botonRegisterPane;
	private JLabel botonRegisterNom;
	
	//Varible para el título
	private JLabel tituloRegisterlbl;
	
	private List<Usuario> usuarios;

	public RegisterPanel(JFrame frame) {
		this.frame = frame;
		
		setLayout(null);
		setBounds(0,0,562,455);
		
		iniciarRegisterPanel();
		
		iniciarNombreRegister();
		
		iniciarApellidoRegister();
		
		iniciarUsuarioRegister();
		
		iniciarContrasenaRegister();
		
		iniciarBotonRegister();
		
		iniciarTituloRegisterlbl();
	}
	
	private void iniciarRegisterPanel() {
		registerPanel = new JPanel();
		registerPanel.setBackground(new Color(255,255,255));
		registerPanel.setBounds(0, 0, 562, 455);
		add(registerPanel);
		registerPanel.setLayout(null);
	}
	
	private void iniciarNombreRegister() {
		nombreRegisterPanel = new JPanel();
		nombreRegisterPanel.setBounds(0, 64, 268, 92);
		nombreRegisterPanel.setLayout(null);
		nombreRegisterPanel.setBackground(Color.WHITE);
		registerPanel.add(nombreRegisterPanel);
		
		nombreRegisterLn = new JSeparator();
		nombreRegisterLn.setBounds(0, 86, 268, 2);
		nombreRegisterPanel.add(nombreRegisterLn);
		
		nombreRegisterNom = new JLabel("NOMBRE:");
		nombreRegisterNom.setFont(new Font("Tahoma", Font.BOLD, 20));
		nombreRegisterNom.setBounds(0, 0, 138, 25);
		nombreRegisterPanel.add(nombreRegisterNom);
		
		nombreRegisterValor = new JTextField();
		nombreRegisterValor.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (nombreRegisterValor.getText().equals("Ingrese su nombre")) {
					nombreRegisterValor.setText("");
					nombreRegisterValor.setForeground(Color.black);
				}
				if (String.valueOf(contrasenaRegisterValor.getPassword()).isEmpty()) {
					contrasenaRegisterValor.setText("*******");
					contrasenaRegisterValor.setForeground(Color.gray);
				}
				if (usuarioRegisterValor.getText().isEmpty()) {
					usuarioRegisterValor.setText("Ingrese su usuario");
					usuarioRegisterValor.setForeground(Color.gray);
				}
				if (apellidoRegisterValor.getText().isEmpty()) {
					apellidoRegisterValor.setText("Ingrese su apellido");
					apellidoRegisterValor.setForeground(Color.gray);
				}
			}
		});
		nombreRegisterValor.setText("Ingrese su nombre");
		nombreRegisterValor.setForeground(Color.GRAY);
		nombreRegisterValor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nombreRegisterValor.setColumns(10);
		nombreRegisterValor.setBorder(null);
		nombreRegisterValor.setBounds(0, 49, 181, 32);
		nombreRegisterPanel.add(nombreRegisterValor);
	}

	private void iniciarApellidoRegister() {
		apellidoRegisterPanel = new JPanel();
		apellidoRegisterPanel.setLayout(null);
		apellidoRegisterPanel.setBackground(Color.WHITE);
		apellidoRegisterPanel.setBounds(294, 64, 268, 92);
		registerPanel.add(apellidoRegisterPanel);
		
		apellidoRegisterLn = new JSeparator();
		apellidoRegisterLn.setBounds(0, 86, 268, 2);
		apellidoRegisterPanel.add(apellidoRegisterLn);
		
		apellidoRegisterNom = new JLabel("APELLIDO:");
		apellidoRegisterNom.setFont(new Font("Tahoma", Font.BOLD, 20));
		apellidoRegisterNom.setBounds(0, 0, 138, 25);
		apellidoRegisterPanel.add(apellidoRegisterNom);
		
		apellidoRegisterValor = new JTextField();
		apellidoRegisterValor.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (apellidoRegisterValor.getText().equals("Ingrese su apellido")) {
					apellidoRegisterValor.setText("");
					apellidoRegisterValor.setForeground(Color.black);
				}
				if (nombreRegisterValor.getText().isEmpty() || nombreRegisterValor.getText().equals("Ingrese su nombre")) {
					nombreRegisterValor.setText("Ingrese su nombre");
					nombreRegisterValor.setForeground(Color.gray);
				}
				if (String.valueOf(contrasenaRegisterValor.getPassword()).isEmpty()) {
					contrasenaRegisterValor.setText("*******");
					contrasenaRegisterValor.setForeground(Color.gray);
				}
				if (usuarioRegisterValor.getText().isEmpty()) {
					usuarioRegisterValor.setText("Ingrese su usuario");
					usuarioRegisterValor.setForeground(Color.gray);
				}
			}
		});
		apellidoRegisterValor.setText("Ingrese su apellido");
		apellidoRegisterValor.setForeground(Color.GRAY);
		apellidoRegisterValor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		apellidoRegisterValor.setColumns(10);
		apellidoRegisterValor.setBorder(null);
		apellidoRegisterValor.setBounds(0, 49, 181, 32);
		apellidoRegisterPanel.add(apellidoRegisterValor);
	}
	
	private void iniciarUsuarioRegister() {
		usuarioRegisterPanel = new JPanel();
		usuarioRegisterPanel.setLayout(null);
		usuarioRegisterPanel.setBackground(Color.WHITE);
		usuarioRegisterPanel.setBounds(0, 182, 562, 92);
		registerPanel.add(usuarioRegisterPanel);
		
		usuarioRegisterLn = new JSeparator();
		usuarioRegisterLn.setBounds(0, 86, 562, 2);
		usuarioRegisterPanel.add(usuarioRegisterLn);
		
		usuarioRegisterNom = new JLabel("USUARIO:");
		usuarioRegisterNom.setFont(new Font("Tahoma", Font.BOLD, 20));
		usuarioRegisterNom.setBounds(0, 0, 138, 25);
		usuarioRegisterPanel.add(usuarioRegisterNom);
		
		usuarioRegisterValor = new JTextField();
		usuarioRegisterValor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (usuarioRegisterValor.getText().equals("Ingrese su usuario")) {
					usuarioRegisterValor.setText("");
					usuarioRegisterValor.setForeground(Color.black);
				}
				if (nombreRegisterValor.getText().isEmpty() || nombreRegisterValor.getText().equals("Ingrese su nombre")) {
					nombreRegisterValor.setText("Ingrese su nombre");
					nombreRegisterValor.setForeground(Color.gray);
				}
				if (String.valueOf(contrasenaRegisterValor.getPassword()).isEmpty()) {
					contrasenaRegisterValor.setText("*******");
					contrasenaRegisterValor.setForeground(Color.gray);
				}
				if (apellidoRegisterValor.getText().isEmpty()) {
					apellidoRegisterValor.setText("Ingrese su apellido");
					apellidoRegisterValor.setForeground(Color.gray);
				}
			}
		});
		usuarioRegisterValor.setText("Ingrese su usuario");
		usuarioRegisterValor.setForeground(Color.GRAY);
		usuarioRegisterValor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		usuarioRegisterValor.setColumns(10);
		usuarioRegisterValor.setBorder(null);
		usuarioRegisterValor.setBounds(0, 49, 380, 32);
		usuarioRegisterPanel.add(usuarioRegisterValor);
	}
	
	private void iniciarContrasenaRegister() {
		contrasenaRegisterPane = new JPanel();
		contrasenaRegisterPane.setBounds(0, 300, 562, 92);
		contrasenaRegisterPane.setLayout(null);
		contrasenaRegisterPane.setBorder(null);
		contrasenaRegisterPane.setBackground(Color.WHITE);
		registerPanel.add(contrasenaRegisterPane);
		
		contrasenaRegisterLn = new JSeparator();
		contrasenaRegisterLn.setBounds(0, 86, 552, 2);
		contrasenaRegisterPane.add(contrasenaRegisterLn);
		
		constrasenaRegisterNom = new JLabel("CONSTRASEÑA:");
		constrasenaRegisterNom.setFont(new Font("Tahoma", Font.BOLD, 20));
		constrasenaRegisterNom.setBounds(0, 0, 192, 25);
		contrasenaRegisterPane.add(constrasenaRegisterNom);
		
		contrasenaRegisterValor = new JPasswordField();
		contrasenaRegisterValor.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (String.valueOf(contrasenaRegisterValor.getPassword()).equals("*******")) {
					contrasenaRegisterValor.setText("");
					contrasenaRegisterValor.setForeground(Color.black);
				}
				if (nombreRegisterValor.getText().isEmpty() || nombreRegisterValor.getText().equals("Ingrese su nombre")) {
					nombreRegisterValor.setText("Ingrese su nombre");
					nombreRegisterValor.setForeground(Color.gray);
				}
				if (usuarioRegisterValor.getText().isEmpty()) {
					usuarioRegisterValor.setText("Ingrese su usuario");
					usuarioRegisterValor.setForeground(Color.gray);
				}
				if (apellidoRegisterValor.getText().isEmpty()) {
					apellidoRegisterValor.setText("Ingrese su apellido");
					apellidoRegisterValor.setForeground(Color.gray);
					
				}
			}
		});
		contrasenaRegisterValor.setText("*******");
		contrasenaRegisterValor.setForeground(Color.GRAY);
		contrasenaRegisterValor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contrasenaRegisterValor.setBorder(null);
		contrasenaRegisterValor.setBounds(0, 49, 380, 32);
		contrasenaRegisterPane.add(contrasenaRegisterValor);
	}
	
	private void iniciarBotonRegister() {
		botonRegisterPane = new JPanel();
		botonRegisterPane.setBounds(0, 408, 120, 47);
		botonRegisterPane.setLayout(null);
		botonRegisterPane.setBackground(Color.GRAY);
		registerPanel.add(botonRegisterPane);
		
		botonRegisterNom = new JLabel("Botón");
		botonRegisterNom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botonRegisterPane.setBackground(grisOscuroBoton);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				botonRegisterPane.setBackground(grisColorBoton);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String nombre = nombreRegisterValor.getText();
				String apellido = apellidoRegisterValor.getText();
				String usuario = usuarioRegisterValor.getText();
				String contrasena = String.valueOf(contrasenaRegisterValor.getPassword());
				
				boolean c1 = nombre.isEmpty(),
						c2 = apellido.isEmpty(),
				 		c3 = usuario.isEmpty(),
				 		c4 = contrasena.isEmpty(),
				 		c5 = nombre.equals("Ingrese su nombre"),
				 		c6 = apellido.equals("Ingrese su apellido"),
				 		c7 = usuario.equals("Ingrese su usuario"),
				 		c8 = contrasena.equals("*******");
				
				if (!c1 && !c2 && !c3 && !c4 && !c5 && !c6 && !c7 && !c8) {
					Usuario cliente = new Cliente(nombre, apellido,String.valueOf((new Random()).nextInt(90000000) + 10000000), usuario, contrasena);
					VentanaPrincipal vent = new VentanaPrincipal();
					vent.setVisible(true);
					usuarios.add(cliente);
					
					Collections.sort(usuarios, new ComparadorUsuario());
					
					BaseDeDatos.usuarios = new HashSet<Usuario>(usuarios);
					frame.dispose();
				}
			}
		});
		botonRegisterNom.setHorizontalAlignment(SwingConstants.CENTER);
		botonRegisterNom.setForeground(Color.WHITE);
		botonRegisterNom.setFont(new Font("Unispace", Font.BOLD, 16));
		botonRegisterNom.setBackground(Color.GRAY);
		botonRegisterNom.setBounds(0, 0, 120, 47);
		botonRegisterPane.add(botonRegisterNom);
	}
	
	private void iniciarTituloRegisterlbl() {
		tituloRegisterlbl = new JLabel("Register");
		tituloRegisterlbl.setBounds(0, 0, 166, 39);
		tituloRegisterlbl.setFont(new Font("Tahoma", Font.BOLD, 24));
		registerPanel.add(tituloRegisterlbl);
	}
	
	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = new ArrayList<Usuario>(usuarios);
	}
}
