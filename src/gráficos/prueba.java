package gráficos;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class prueba extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JPasswordField contrasenaLoginValor;
	
	private Color grisColorBoton = new Color(128, 128, 128);
	private Color grisOscuroBoton = new Color(95, 95, 95);

	public prueba() {
		JPanel loginPanel = new JPanel();
		loginPanel.setBounds(50, 65, 562, 455);
		this.add(loginPanel);
		loginPanel.setLayout(null);
		
		JPanel usuarioLoginPane = new JPanel();
		usuarioLoginPane.setVisible(true);
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
		
		JTextField usuarioLoginValor = new JTextField();
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
					//this.dispose();
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
	}

}
