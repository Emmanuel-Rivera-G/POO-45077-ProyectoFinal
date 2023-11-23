package gráficos;

import clases.*;
import Persistencia.*;
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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StartWindow {
	
	//Variables universales para posición del mouse
	private int xMouse;
	private int yMouse;
	
	//Variables de color
	private Color grisColorBarra = new Color(192,192,192);
	private Color grisClaroBarra = new Color(221,221,221);
	
	//Ventana principal
	public JFrame frame;
	
	//Panel principal
	private JPanel startPanel;
	
	//Panel que contiene a login y register
	private JPanel login_register;
	
	//Labels para nombre e icono mediano
	private JLabel nombrePagina;
	private JLabel imagenIcon;
	
	//Variables de barra superior
	private JPanel barraSuperior;
	private JLabel logo;
	private JPanel botonCerrarPane;
	private JLabel botonCerrarIcon;
	
	//Banner grande derecho
	private JLabel imagenBanner;
	
	//Boton para cambiar entre login y register
	private JLabel loginPanelBoton;
	private JLabel loginRegisterBoton;
	
	//Variables para los paneles
	private LoginPanel loginPanel;
	private RegisterPanel registerPanel;
	
	public static void main(String[] args) {
		BaseDeDatos.conectar();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartWindow window = new StartWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public StartWindow() {
		initialize();
	}
	
	private void initialize() {
				
		iniciarFrame();
		
		iniciarStartPanel();
		
		iniciarLogin_Register();
		
		iniciarFondoStartWindow();
		
		iniciarLoginPanel();
			
		iniciarRegisterPanel();
		
		//Iniciamos el LoginPanel una vez
		do iniciarLoginPanelCadaVez(); while (false);
		
		BaseDeDatos.ingresarDatosInicio();
		loginPanel.setUsuarios(BaseDeDatos.usuarios);
		registerPanel.setUsuarios(BaseDeDatos.usuarios);
	}
	
	private void iniciarFrame() {
		
		//Se inicia la ventana
		frame = new JFrame();
		frame.setLocationByPlatform(true); //El sistema elige en que posición se inicia la ventana
		frame.setUndecorated(true); //Se borra la barra superior
		frame.setResizable(false); //Se bloquea el redimensionamiento de la ventana
		frame.setSize(1080, 550); //Se establecen las medidas
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null); //Se estable el Absolute Layout
		
	}
	
	private void iniciarStartPanel() {
		
		//Panel interno del frame donde se trabajarán todos los elementos
		startPanel = new JPanel();
		startPanel.setBackground(new Color(255, 255, 255)); //Color del fondo
		startPanel.setBounds(0, 0, 1080, 550); //Posición relativa y medidas
		frame.getContentPane().add(startPanel); //Se añade al panel principal
		startPanel.setLayout(null); //Se estable el Absolute Layout
		
	}
		
	private void iniciarLogin_Register() {
		
		//Panel donde se añadirán los paneles de Login o Register
		login_register = new JPanel();
		login_register.setBackground(new Color(255, 255, 255)); //Color del fondo
		login_register.setBounds(50, 65, 562, 455); //Posición relativa y medidas
		startPanel.add(login_register); //Se añade al panel starPanel
		login_register.setLayout(null); //Se estable el Absolute Layout
		
	}
	
	private void iniciarBarraSuperior() {
		
		//Se inicia la barra superior
		barraSuperior = new JPanel();
		barraSuperior.addMouseListener(new MouseAdapter() { //Primero se registra 'x' e 'y' cuando se presiona la barra superior
			@Override
			public void mousePressed(MouseEvent e) {
				xMouse = e.getX();
				yMouse = e.getY();
			}
		});
		barraSuperior.addMouseMotionListener(new MouseMotionAdapter() { //Se añade un Listener para el movimiento de arrastre del ratón
			@Override
			public void mouseDragged(MouseEvent e) {		//Se moverá la ventana en conjunto de arrastrar el ratón
				int x = e.getXOnScreen();					//Posición x
				int y = e.getYOnScreen();					//Posición y	
				
				frame.setLocation(x - xMouse,y - yMouse);	//Se relocaliza la ventana y se usa la posición relativa
			}
		});
		barraSuperior.setBorder(null); //Se borra los bordes
		barraSuperior.setBackground(grisColorBarra); //Color fondo
		barraSuperior.setBounds(0, 0, 1080, 25); //Se establecen medidas
		startPanel.add(barraSuperior); //Se añade al startPanel
		barraSuperior.setLayout(null); //Se estable el Absolute Layout
		
		//Se inicia el Label para el logo pequeño superior izquierdo
		logo = new JLabel("  LOGO");
		logo.setForeground(new Color(255, 255, 255));
		logo.setBounds(10, -3, 102, 32); //Se establecen medidas
		barraSuperior.add(logo); //Se añade a la barra superior
		logo.setFont(new Font("Unispace", Font.BOLD, 15));
		logo.setToolTipText("");
		logo.setIcon(new ImageIcon(StartWindow.class.getResource(
				"/recursos/loginSources/Imagenes/logo_icon_32x32.png" //Dirección del logo pequeño superior izquierdo
				)));
		
		//Se inicia el panel del boton de cerrar
		botonCerrarPane = new JPanel();
		botonCerrarPane.setBorder(null);
		botonCerrarPane.setBackground(grisColorBarra);
		botonCerrarPane.setBounds(1041, 0, 39, 39);
		barraSuperior.add(botonCerrarPane); //Se añade al panel barra superior
		botonCerrarPane.setLayout(null);
		
		//Se inicia el boton de cerrar
		botonCerrarIcon = new JLabel("X");
		botonCerrarIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0); 								//Cierra el programa cuando hay un click
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				botonCerrarPane.setBackground(grisClaroBarra);	//Se cambia de color con poner el ratón encima
			}
			@Override
			public void mouseExited(MouseEvent e) {
				botonCerrarPane.setBackground(grisColorBarra);	//Vuelve a su color original
			}
		});
		botonCerrarIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); //El cursor se cambiará a la mano
		botonCerrarIcon.setForeground(new Color(255, 255, 255));
		botonCerrarIcon.setHorizontalAlignment(SwingConstants.CENTER);
		botonCerrarIcon.setFont(new Font("Tahoma", Font.PLAIN, 30));
		botonCerrarIcon.setBounds(-3, 0, 42, 25);
		botonCerrarPane.add(botonCerrarIcon); //Se añade al panel de boton de cerrar
	}
	
	private void iniciarFondoStartWindow() {
		
		//Se inicia el Label para el Nombre de la página
		nombrePagina = new JLabel("NOMBRE DE LA PÁGINA");
		nombrePagina.setFont(new Font("Corbel", Font.BOLD, 32));
		nombrePagina.setForeground(new Color(255, 255, 255)); //Color fuente
		nombrePagina.setBounds(709, 421, 351, 39); //Se establecen medidas
		startPanel.add(nombrePagina); //Se añade al startPanel
		
		//Se inicia el Label para el ícono mediano
		imagenIcon = new JLabel("");
		imagenIcon.setIcon(new ImageIcon(StartWindow.class.getResource(
				"/recursos/loginSources/Imagenes/logo_icon_187x187.png" //Dirección de la imagen del icono mediano
				)));
		imagenIcon.setBounds(782, 203, 187, 187); //Se establecen medidas
		startPanel.add(imagenIcon); //Se añade al startPanel
		
		//Se llama a la barra superior
		iniciarBarraSuperior();
		
		//Se inicia el banner grande derecho
		imagenBanner = new JLabel("");
		imagenBanner.setIconTextGap(10);
		imagenBanner.setIcon(new ImageIcon(StartWindow.class.getResource(
				"/recursos/loginSources/Imagenes/banner_derecho_428x548.jpg" //Dirección de la imagen del banner grande derecho
				)));
		imagenBanner.setBounds(652, 0, 428, 552);
		startPanel.add(imagenBanner); //Se añade a start panel
		
	}
	
	private void iniciarLoginPanel() {
		
		//Inicializamos el botón que registrará el login
		loginPanelBoton = new JLabel("Login");
		
		//Inicializamos el panel de la clase LoginPanel
		loginPanel = new LoginPanel(frame);
		
		//Se añade un listener
		loginPanelBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { //Se registra si hay un click
				iniciarLoginPanelCadaVez();
			}
		});
		loginPanelBoton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginPanelBoton.setHorizontalAlignment(SwingConstants.CENTER);
		loginPanelBoton.setForeground(new Color(0, 0, 255));
		loginPanelBoton.setBounds(250, 45, 46, 14);
		startPanel.add(loginPanelBoton);
	}
	
	protected void iniciarLoginPanelCadaVez() {
		login_register.removeAll(); //Se limpia el paner de login_register
		
		loginPanel.setSize(562,455);    //Se ponen las medidas del panel
		login_register.add(loginPanel); //Se añade a login_register
		
		login_register.revalidate(); //Se revalida
		login_register.repaint(); //Se repinta el panel
	}

	private void iniciarRegisterPanel() {
		
		loginRegisterBoton = new JLabel("Register");
		
		registerPanel = new RegisterPanel(frame);
		
		loginRegisterBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				login_register.removeAll();
				
				registerPanel.setSize(562,455);
				login_register.add(registerPanel);
				
				login_register.revalidate();
				login_register.repaint();
				
			}
		});
		loginRegisterBoton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginRegisterBoton.setHorizontalAlignment(SwingConstants.CENTER);
		loginRegisterBoton.setForeground(new Color(0, 0, 255));
		loginRegisterBoton.setBounds(314, 45, 63, 14);
		startPanel.add(loginRegisterBoton);
	}
}
