package gráficos;

import clases.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Login {
	
	private int xMouse;
	private int yMouse;

	private Color grisColorBarra = new Color(192,192,192);
	private Color grisClaroBarra = new Color(221,221,221);
	
	private Color grisColorBoton = new Color(128, 128, 128);
	private Color grisOscuroBoton = new Color(95, 95, 95);
	
	private JFrame frame;
	private JTextField usuarioLoginValor;
	private JPasswordField contrasenaLoginValor;
	private JPasswordField contrasenaRegisterValor;
	private JTextField nombreRegisterValor;
	private JTextField usuarioRegisterValor;
	private JTextField apellidoRegisterValor;
	
	
	private JPanel login_register;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Login() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setLocationByPlatform(true);
		frame.setUndecorated(true);
		frame.setResizable(false);
		frame.setBounds(0, 0, 1080, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel startPanel = new JPanel();
		startPanel.setBackground(new Color(255, 255, 255));
		startPanel.setBounds(0, 0, 1080, 550);
		frame.getContentPane().add(startPanel);
		startPanel.setLayout(null);
		
		JLabel nombrePagina = new JLabel("NOMBRE DE LA PÁGINA");
		nombrePagina.setFont(new Font("Corbel", Font.BOLD, 32));
		nombrePagina.setForeground(new Color(255, 255, 255));
		nombrePagina.setBounds(709, 421, 351, 39);
		startPanel.add(nombrePagina);
		
		JLabel imagenIcon = new JLabel("");
		imagenIcon.setIcon(new ImageIcon(Login.class.getResource("/recursos/loginSources/Imagenes/logo_icon_187x187.png")));
		imagenIcon.setBounds(782, 203, 187, 187);
		startPanel.add(imagenIcon);
		
		
		
		JPanel barraSuperior = new JPanel();
		barraSuperior.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				
				frame.setLocation(x - xMouse,y - yMouse);
			}
		});
		barraSuperior.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xMouse = e.getX();
				yMouse = e.getY();
			}
		});
		barraSuperior.setBorder(null);
		barraSuperior.setBackground(grisColorBarra);
		barraSuperior.setBounds(0, 0, 1080, 39);
		startPanel.add(barraSuperior);
		barraSuperior.setLayout(null);
		
		JLabel logo = new JLabel("  LOGO");
		logo.setForeground(new Color(255, 255, 255));
		logo.setBounds(10, 3, 102, 32);
		barraSuperior.add(logo);
		logo.setFont(new Font("Unispace", Font.BOLD, 15));
		logo.setToolTipText("");
		logo.setIcon(new ImageIcon(Login.class.getResource("/recursos/loginSources/Imagenes/logo_icon_32x32.png")));
		
		JPanel botonCerrarPane = new JPanel();
		botonCerrarPane.setBorder(null);
		botonCerrarPane.setBackground(grisColorBarra);
		botonCerrarPane.setBounds(1041, 0, 39, 39);
		barraSuperior.add(botonCerrarPane);
		botonCerrarPane.setLayout(null);
		
		JLabel botonCerrarIcon = new JLabel("X");
		botonCerrarIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				botonCerrarPane.setBackground(grisClaroBarra);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				botonCerrarPane.setBackground(grisColorBarra);
			}
		});
		botonCerrarIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonCerrarIcon.setForeground(new Color(255, 255, 255));
		botonCerrarIcon.setHorizontalAlignment(SwingConstants.CENTER);
		botonCerrarIcon.setFont(new Font("Tahoma", Font.BOLD, 35));
		botonCerrarIcon.setBounds(-3, 0, 42, 39);
		botonCerrarPane.add(botonCerrarIcon);
		
		JLabel imagenBanner = new JLabel("");
		imagenBanner.setIconTextGap(10);
		imagenBanner.setIcon(new ImageIcon(Login.class.getResource("/recursos/loginSources/Imagenes/banner_derecho_428x548.jpg")));
		imagenBanner.setBounds(652, 0, 428, 548);
		startPanel.add(imagenBanner);
		
		
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(new Color(255, 255, 255));
		loginPanel.setBounds(50, 65, 562, 455);
		startPanel.add(loginPanel);
		loginPanel.setLayout(null);
		
		JPanel usuarioLoginPane = new JPanel();
		usuarioLoginPane.setBounds(0, 64, 562, 92);
		loginPanel.add(usuarioLoginPane);
		usuarioLoginPane.setBackground(new Color(255, 255, 255));
		usuarioLoginPane.setLayout(null);
		
		JSeparator usuarioLoginLn = new JSeparator();
		usuarioLoginLn.setBounds(0, 86, 552, 2);
		usuarioLoginPane.add(usuarioLoginLn);
		
		JLabel usuarioLoginNom = new JLabel("USUARIO:");
		usuarioLoginNom.setBounds(0, 0, 138, 25);
		usuarioLoginPane.add(usuarioLoginNom);
		usuarioLoginNom.setFont(new Font("Tahoma", Font.BOLD, 20));
		
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
		
		JPanel contrasenaLoginPane = new JPanel();
		contrasenaLoginPane.setBounds(0, 250, 562, 92);
		loginPanel.add(contrasenaLoginPane);
		contrasenaLoginPane.setBorder(null);
		contrasenaLoginPane.setBackground(new Color(255, 255, 255));
		contrasenaLoginPane.setLayout(null);
		
		JSeparator contrasenaLoginLn = new JSeparator();
		contrasenaLoginLn.setBounds(0, 86, 552, 2);
		contrasenaLoginPane.add(contrasenaLoginLn);
		
		JLabel constrasenaLoginNom = new JLabel("CONSTRASEÑA:");
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
		
		JPanel botonLoginPane = new JPanel();
		botonLoginPane.setBounds(0, 408, 120, 47);
		loginPanel.add(botonLoginPane);
		botonLoginPane.setBackground(grisColorBoton);
		botonLoginPane.setLayout(null);
		
		JLabel botonLoginNom = new JLabel("Botón");
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
				
				String usua = "admin", contra = "1234";
				
				boolean usuarioCom = usuarioLoginValor.getText().equals(usua);
				boolean contrasenaCom = String.valueOf(contrasenaLoginValor.getPassword()).equals(contra);
				
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
		
		JLabel tituloLoginlbl = new JLabel("Login");
		tituloLoginlbl.setBounds(0, 0, 166, 39);
		loginPanel.add(tituloLoginlbl);
		tituloLoginlbl.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				loginPanel.setVisible(true);
			}
		});
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBounds(250, 45, 46, 14);
		startPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Register");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				login_register.removeAll();
				loginPanel.setVisible(false);
				JPanel registerPanel = new JPanel();
				registerPanel.setBackground(new Color(255,255,255));
				registerPanel.setBounds(0, 0, 562, 455);
				login_register.add(registerPanel);
				registerPanel.setLayout(null);
				
				JPanel nombreRegisterPanel = new JPanel();
				nombreRegisterPanel.setBounds(0, 64, 268, 92);
				nombreRegisterPanel.setLayout(null);
				nombreRegisterPanel.setBackground(Color.WHITE);
				registerPanel.add(nombreRegisterPanel);
				
				JSeparator nombreRegisterLn = new JSeparator();
				nombreRegisterLn.setBounds(0, 86, 268, 2);
				nombreRegisterPanel.add(nombreRegisterLn);
				
				JLabel nombreRegisterNom = new JLabel("NOMBRE:");
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
				
				JPanel apellidoRegisterPanel = new JPanel();
				apellidoRegisterPanel.setLayout(null);
				apellidoRegisterPanel.setBackground(Color.WHITE);
				apellidoRegisterPanel.setBounds(294, 64, 268, 92);
				registerPanel.add(apellidoRegisterPanel);
				
				JSeparator apellidoRegisterLn = new JSeparator();
				apellidoRegisterLn.setBounds(0, 86, 268, 2);
				apellidoRegisterPanel.add(apellidoRegisterLn);
				
				JLabel apellidoRegisterNom = new JLabel("APELLIDO:");
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
				
				JPanel usuarioRegisterPanel = new JPanel();
				usuarioRegisterPanel.setLayout(null);
				usuarioRegisterPanel.setBackground(Color.WHITE);
				usuarioRegisterPanel.setBounds(0, 182, 562, 92);
				registerPanel.add(usuarioRegisterPanel);
				
				JSeparator usuarioRegisterLn = new JSeparator();
				usuarioRegisterLn.setBounds(0, 86, 562, 2);
				usuarioRegisterPanel.add(usuarioRegisterLn);
				
				JLabel usuarioRegisterNom = new JLabel("USUARIO:");
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
				
				JPanel contrasenaRegisterPane = new JPanel();
				contrasenaRegisterPane.setBounds(0, 300, 562, 92);
				contrasenaRegisterPane.setLayout(null);
				contrasenaRegisterPane.setBorder(null);
				contrasenaRegisterPane.setBackground(Color.WHITE);
				registerPanel.add(contrasenaRegisterPane);
				
				JSeparator contrasenaRegisterLn = new JSeparator();
				contrasenaRegisterLn.setBounds(0, 86, 552, 2);
				contrasenaRegisterPane.add(contrasenaRegisterLn);
				
				JLabel constrasenaRegisterNom = new JLabel("CONSTRASEÑA:");
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
				
				JPanel botonRegisterPane = new JPanel();
				botonRegisterPane.setBounds(0, 408, 120, 47);
				botonRegisterPane.setLayout(null);
				botonRegisterPane.setBackground(Color.GRAY);
				registerPanel.add(botonRegisterPane);
				
				JLabel botonRegisterNom = new JLabel("Botón");
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
						
						boolean c1 = nombreRegisterValor.getText().isEmpty();
						boolean c2 = apellidoRegisterValor.getText().isEmpty();
						boolean c3 = usuarioRegisterValor.getText().isEmpty();
						boolean c4 = String.valueOf(contrasenaRegisterValor.getPassword()).isEmpty();
						boolean c5 = nombreRegisterValor.getText().equals("Ingrese su nombre");
						boolean c6 = apellidoRegisterValor.getText().equals("Ingrese su apellido");
						boolean c7 = usuarioRegisterValor.getText().equals("Ingrese su usuario");
						boolean c8 = String.valueOf(contrasenaRegisterValor.getPassword()).equals("*******");
						
						if (!c1 && !c2 && !c3 && !c4 && !c5 && !c6 && !c7 && !c8) {
							VentanaPrincipal vent = new VentanaPrincipal();
							vent.setVisible(true);
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
				
				JLabel tituloRegisterlbl = new JLabel("Register");
				tituloRegisterlbl.setBounds(0, 0, 166, 39);
				tituloRegisterlbl.setFont(new Font("Tahoma", Font.BOLD, 24));
				registerPanel.add(tituloRegisterlbl);
				
				login_register.revalidate();
				login_register.repaint();
				
			}
		});
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBounds(314, 45, 63, 14);
		startPanel.add(lblNewLabel_1);
		
		login_register = new JPanel();
		login_register.setBackground(new Color(255, 255, 255));
		login_register.setBounds(50, 65, 562, 455);
		startPanel.add(login_register);
		login_register.setLayout(null);
	}
}
