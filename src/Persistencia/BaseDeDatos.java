package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

import clases.Bebida;
import clases.Cliente;
import clases.Comida;
import clases.Empleado;
import clases.Matriz2D;
import clases.Producto;
import clases.Usuario;

public class BaseDeDatos {
	
	private static Connection con;
	private static String server = "DESKTOP-353L48T";
	private static String database = "master";
	private static String senteceWindows = "integratedSecurity=" + true;
	private static String senteceEncrypt = "encrypt=" + false;
	private static String senteceTrustedConnection = "Trusted_Connection=" + true;
	private static String senteceTrustCertificate = "trustServerCertificate=" + true;
	
	public static Set<Usuario> usuarios = new HashSet<Usuario>();
	
	private static Usuario 
	cliente = new Cliente("Juan", "Gómez", "123456789", "juang", "pass123"),
    cliente1 = new Cliente("María", "López", "987654321", "mariel", "clave456"),
    cliente2 = new Cliente("Pedro", "Martínez", "456789012", "pedrito", "micontra"),
    cliente3 = new Cliente("Ana", "Sánchez", "789012345", "anas", "miclave"),
    cliente4 = new Cliente("Carlos", "Fernández", "345678901", "carlitos", "123abc"),
    empleado1 = new Empleado("Laura", "Pérez", "567890123", "laurap", "PWS001"),
    empleado2 = new Empleado("José", "Rodríguez", "210987654", "joser", "gerente02"),
	cliente5 = new Cliente("Laura", "González", "567890123", "laurag", "pass567"),
    cliente6 = new Cliente("Carlos", "Soto", "345678901", "carlitosoto", "abc456"),
    cliente7 = new Cliente("María", "Fuentes", "789012345", "mariaf", "pass1234"),
    cliente8 = new Cliente("Pedro", "Ramírez", "123456789", "pedror", "clave789"),
    cliente9 = new Cliente("Ana", "Hernández", "987654321", "anah", "miclave456"),
    empleado3 = new Empleado("Juan", "Martínez", "234567890", "juanm", "PWS002"),
    empleado4 = new Empleado("Sofía", "López", "456789012", "sofial", "PWS003"),
    empleado5 = new Empleado("David", "Gómez", "678901234", "davidg", "PWS004"),
    empleado6 = new Empleado("Lucía", "Fernández", "890123456", "luciaf", "PWS005"),
    empleado7 = new Empleado("Alejandro", "Sánchez", "012345678", "alejandros", "PWS006");
	
	public static void ingresarDatosInicio() {
		usuarios.add(cliente);
		usuarios.add(cliente1);
		usuarios.add(cliente2);
		usuarios.add(cliente3);
		usuarios.add(cliente4);
		usuarios.add(empleado1);
		usuarios.add(empleado2);
		usuarios.add(cliente5);
		usuarios.add(cliente6);
		usuarios.add(cliente7);
		usuarios.add(cliente8);
		usuarios.add(cliente9);
		usuarios.add(empleado3);
		usuarios.add(empleado4);
		usuarios.add(empleado5);
		usuarios.add(empleado6);
		usuarios.add(empleado7);
		
		productos = new Matriz2D<String>(7, 3);
		productos.setElemento(0, 0, "Nombre");
		productos.setElemento(0, 1, "Imagen");
		productos.setElemento(0, 2, "Precio");
		productos.setElemento(1, 0, bebida1.getNombre());
		productos.setElemento(1, 1, bebida1.getImagen());
		productos.setElemento(1, 2, String.valueOf(bebida1.getPrecio()));
		productos.setElemento(2, 0, bebida4.getNombre());
		productos.setElemento(2, 1, bebida4.getImagen());
		productos.setElemento(2, 2, String.valueOf(bebida4.getPrecio()));
		productos.setElemento(3, 0, comida1.getNombre());
		productos.setElemento(3, 1, comida1.getImagen());
		productos.setElemento(3, 2, String.valueOf(comida1.getPrecio()));
		productos.setElemento(4, 0, comida3.getNombre());
		productos.setElemento(4, 1, comida3.getImagen());
		productos.setElemento(4, 2, String.valueOf(comida3.getPrecio()));
		productos.setElemento(5, 0, comida5.getNombre());
		productos.setElemento(5, 1, comida5.getImagen());
		productos.setElemento(5, 2, String.valueOf(comida5.getPrecio()));
		productos.setElemento(6, 0, bebida5.getNombre());
		productos.setElemento(6, 1, bebida1.getImagen());
		productos.setElemento(6, 2, String.valueOf(bebida5.getPrecio()));
		
	}
	
	public static Matriz2D<String> productos;

	private static Producto
		bebida1 = new Bebida("001","Agua","/recursos/productos/Imagenes/bebidas/bebida_agua_296x244.jpg",2.5),
		bebida4 = new Bebida("002","Té","/recursos/productos/Imagenes/bebidas/bebida_te_296x244.jpg",3),
		bebida5 = new Bebida("005","Café","/recursos/productos/Imagenes/bebidas/bebida_cafe_296x244.jpg",2.5),
		comida1 = new Comida("003","Pizza","/recursos/productos/Imagenes/comidas/comida_pizza_296x244.jpg",7),
		comida3 = new Comida("004","Hamburguesa","/recursos/productos/Imagenes/comidas/comida_hamburguesa_296x244.jpg",8),
		comida5 = new Comida("006","Pasta","/recursos/productos/Imagenes/comidas/comida_pasta_296x244.jpg",10);
	
	public static void conectar() {
		try {
	        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        String connectionUrl = "jdbc:sqlserver://"+ server +";database="+database+";"+
	        						senteceWindows+";"+
	        						senteceTrustedConnection+";"+
	        						senteceEncrypt+";"+
	        						senteceTrustCertificate;
	        con = DriverManager.getConnection(connectionUrl);
	
	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void desconectar() {
		try {
            if (con != null && !con.isClosed()) {
                con.close();
                JOptionPane.showMessageDialog(null, "Disconnected");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public static String getServer() {
		return server;
	}

	public static void setServer(String server) {
		BaseDeDatos.server = server;
	}
	
	public static String getDatabase() {
		return database;
	}

	public static void setDatabase(String database) {
		BaseDeDatos.database = database;
	}

	public static String getSenteceWindows() {
		return senteceWindows;
	}

	public static void setSenteceWindows(boolean senteceWindows) {
		BaseDeDatos.senteceWindows = "integratedSecurity=" + senteceWindows;
	}

	public static String getSenteceEncrypt() {
		return senteceEncrypt;
	}

	public static void setSenteceEncrypt(boolean senteceEncrypt) {
		BaseDeDatos.senteceEncrypt = "encrypt=" + senteceEncrypt;
	}

	public static String getSenteceTrustedConnection() {
		return senteceTrustedConnection;
	}

	public static void setSenteceTrustedConnection(boolean senteceTrustedConnection) {
		BaseDeDatos.senteceTrustedConnection = "Trusted_Connection=" + senteceTrustedConnection;
	}

	public static String getSenteceTrustCertificate() {
		return senteceTrustCertificate;
	}

	public static void setSenteceTrustCertificate(boolean senteceTrustCertificate) {
		BaseDeDatos.senteceTrustCertificate = "trustServerCertificate=" + senteceTrustCertificate;
	}	
	
}
