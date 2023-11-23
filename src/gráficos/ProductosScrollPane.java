package gráficos;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.UIManager;

import Persistencia.BaseDeDatos;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import clases.Matriz2D;

public class ProductosScrollPane extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private GridBagLayout gridBagLayout;
	private JPanel panel;
	private GridBagConstraints gbc_panel;
	private GridBagLayout gbl_panel;
	
	//Panel 1
	private JPanel producto1Panel;
	private GridBagConstraints gbc_producto1Panel;
	private JPanel producto1Imagen;
	private JPanel producto1Nombre;
	private JLabel producto1lblImagen;
	private JLabel producto1lblNombre;
	
	//Panel 2
	private JPanel producto2Panel;
	private GridBagConstraints gbc_producto2Panel;
	private JPanel producto2Imagen;
	private JPanel producto2Nombre;
	private JLabel producto2lblImagen;
	private JLabel producto2lblNombre;
	
	//Panel 3
	private JPanel producto3Panel;
	private GridBagConstraints gbc_producto3Panel;
	private JPanel producto3Imagen;
	private JPanel producto3Nombre;
	private JLabel producto3lblImagen;
	private JLabel producto3lblNombre;
	
	//Panel 4
	private JPanel producto4Panel;
	private GridBagConstraints gbc_producto4Panel;
	private JPanel producto4Imagen;
	private JPanel producto4Nombre;
	private JLabel producto4lblImagen;
	private JLabel producto4lblNombre;
		
	//Panel 5
	private JPanel producto5Panel;
	private GridBagConstraints gbc_producto5Panel;
	private JPanel producto5Imagen;
	private JPanel producto5Nombre;
	private JLabel producto5lblImagen;
	private JLabel producto5lblNombre;
	
	//Panel 6
	private JPanel producto6Panel;
	private GridBagConstraints gbc_producto6Panel;
	private JPanel producto6Imagen;
	private JPanel producto6Nombre;
	private JLabel producto6lblImagen;
	private JLabel producto6lblNombre;
	
	private Matriz2D<String> productos = new Matriz2D<String>(7,3);
	private List<Object[]> productosEnviar = new ArrayList<Object[]>();
	
	public ProductosScrollPane() {
		
		setBounds(new Rectangle(0, 0, 950, 661));
		setBackground(new Color(128, 128, 255));
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {950};
		gridBagLayout.rowHeights = new int[] {661};
		gridBagLayout.columnWeights = new double[]{1.0};
		gridBagLayout.rowWeights = new double[]{1.0};
		setLayout(gridBagLayout);
		
		iniciarPanel();
		
		iniciarProducto1();
		
		iniciarProducto2();
		
		iniciarProducto3();
		
		iniciarProducto4();
		
		iniciarProducto5();
		
		iniciarProducto6();
		
		productos = BaseDeDatos.productos;
		setProductos(productos, true);
		
	}

	private void iniciarPanel() {
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(new Rectangle(0, 0, 0, 0));
		panel.setAlignmentY(1.0f);
		gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.NORTH;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{316, 316, 316, 0};
		gbl_panel.rowHeights = new int[]{330, 330, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
	}
	
	private void iniciarProducto1() {
		producto1Panel = new JPanel();
		producto1Panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Object[] objArray = {productos.getElemento(1, 0), productos.getElemento(1, 2)};
				productosEnviar.add(objArray);
			}
		});
		producto1Panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		producto1Panel.setBackground(new Color(255, 255, 255));
		gbc_producto1Panel = new GridBagConstraints();
		gbc_producto1Panel.fill = GridBagConstraints.BOTH;
		gbc_producto1Panel.insets = new Insets(0, 0, 5, 5);
		gbc_producto1Panel.gridx = 0;
		gbc_producto1Panel.gridy = 0;
		panel.add(producto1Panel, gbc_producto1Panel);
		producto1Panel.setLayout(null);
		
		producto1Imagen = new JPanel();
		producto1Imagen.setBackground(new Color(255, 255, 255));
		producto1Imagen.setBounds(10, 11, 296, 244);
		producto1Panel.add(producto1Imagen);
		producto1Imagen.setLayout(new GridLayout(1, 0, 0, 0));
		
		producto1lblImagen = new JLabel("Imagen1");
		producto1lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		producto1Imagen.add(producto1lblImagen);
		
		producto1Nombre = new JPanel();
		producto1Nombre.setBackground(new Color(255, 255, 255));
		producto1Nombre.setBounds(10, 266, 296, 53);
		producto1Panel.add(producto1Nombre);
		producto1Nombre.setLayout(new GridLayout(1, 0, 0, 0));
		
		producto1lblNombre = new JLabel("Nombre1");
		producto1lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		producto1Nombre.add(producto1lblNombre);
	}

	private void iniciarProducto2() {
		producto2Panel = new JPanel();
		producto2Panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] objArray = {productos.getElemento(2, 0), productos.getElemento(2, 2)};
				productosEnviar.add(objArray);
			}
		});
		producto2Panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		producto2Panel.setBackground(new Color(255, 255, 255));
		gbc_producto2Panel = new GridBagConstraints();
		gbc_producto2Panel.fill = GridBagConstraints.BOTH;
		gbc_producto2Panel.insets = new Insets(0, 0, 5, 5);
		gbc_producto2Panel.gridx = 1;
		gbc_producto2Panel.gridy = 0;
		panel.add(producto2Panel, gbc_producto2Panel);
		producto2Panel.setLayout(null);
		
		producto2Imagen = new JPanel();
		producto2Imagen.setBackground(new Color(255, 255, 255));
		producto2Imagen.setBounds(10, 11, 296, 244);
		producto2Panel.add(producto2Imagen);
		producto2Imagen.setLayout(new GridLayout(1, 0, 0, 0));
		
		producto2lblImagen = new JLabel("Imagen2");
		producto2lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		producto2Imagen.add(producto2lblImagen);
		
		producto2Nombre = new JPanel();
		producto2Nombre.setBackground(new Color(255, 255, 255));
		producto2Nombre.setBounds(10, 266, 296, 53);
		producto2Panel.add(producto2Nombre);
		producto2Nombre.setLayout(new GridLayout(1, 0, 0, 0));
		
		producto2lblNombre = new JLabel("Nombre2");
		producto2lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		producto2Nombre.add(producto2lblNombre);
	}
	
	private void iniciarProducto3() {
		producto3Panel = new JPanel();
		producto3Panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] objArray = {productos.getElemento(3, 0), productos.getElemento(3, 2)};
				productosEnviar.add(objArray);
			}
		});
		producto3Panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		producto3Panel.setBackground(new Color(255, 255, 255));
		producto3Panel.setAlignmentY(1.0f);
		gbc_producto3Panel = new GridBagConstraints();
		gbc_producto3Panel.fill = GridBagConstraints.BOTH;
		gbc_producto3Panel.insets = new Insets(0, 0, 5, 0);
		gbc_producto3Panel.gridx = 2;
		gbc_producto3Panel.gridy = 0;
		panel.add(producto3Panel, gbc_producto3Panel);
		producto3Panel.setLayout(null);
		
		producto3Imagen = new JPanel();
		producto3Imagen.setBackground(new Color(255, 255, 255));
		producto3Imagen.setBounds(10, 11, 296, 244);
		producto3Panel.add(producto3Imagen);
		producto3Imagen.setLayout(new GridLayout(1, 0, 0, 0));
		
		producto3lblImagen = new JLabel("Imagen3");
		producto3lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		producto3Imagen.add(producto3lblImagen);
		
		producto3Nombre = new JPanel();
		producto3Nombre.setBackground(new Color(255, 255, 255));
		producto3Nombre.setBounds(10, 266, 296, 53);
		producto3Panel.add(producto3Nombre);
		producto3Nombre.setLayout(new GridLayout(1, 0, 0, 0));
		
		producto3lblNombre = new JLabel("Nombre3");
		producto3lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		producto3Nombre.add(producto3lblNombre);
	}
	
	private void iniciarProducto4() {
		producto4Panel = new JPanel();
		producto4Panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] objArray = {productos.getElemento(4, 0), productos.getElemento(4, 2)};
				productosEnviar.add(objArray);
			}
		});
		producto4Panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		producto4Panel.setBackground(new Color(255, 255, 255));
		gbc_producto4Panel = new GridBagConstraints();
		gbc_producto4Panel.fill = GridBagConstraints.BOTH;
		gbc_producto4Panel.insets = new Insets(0, 0, 0, 5);
		gbc_producto4Panel.gridx = 0;
		gbc_producto4Panel.gridy = 1;
		panel.add(producto4Panel, gbc_producto4Panel);
		producto4Panel.setLayout(null);
		
		producto4Imagen = new JPanel();
		producto4Imagen.setBackground(new Color(255, 255, 255));
		producto4Imagen.setBounds(10, 11, 296, 244);
		producto4Panel.add(producto4Imagen);
		producto4Imagen.setLayout(new GridLayout(1, 0, 0, 0));
		
		producto4lblImagen = new JLabel("Imagen4");
		producto4lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		producto4Imagen.add(producto4lblImagen);
		
		producto4Nombre = new JPanel();
		producto4Nombre.setBackground(new Color(255, 255, 255));
		producto4Nombre.setBounds(10, 266, 296, 53);
		producto4Panel.add(producto4Nombre);
		producto4Nombre.setLayout(new GridLayout(1, 0, 0, 0));
		
		producto4lblNombre = new JLabel("Nombre4");
		producto4lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		producto4Nombre.add(producto4lblNombre);
	}
	
	private void iniciarProducto5() {
		producto5Panel = new JPanel();
		producto5Panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] objArray = {productos.getElemento(5, 0), productos.getElemento(5, 2)};
				productosEnviar.add(objArray);
			}
		});
		producto5Panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		producto5Panel.setBackground(new Color(255, 255, 255));
		gbc_producto5Panel = new GridBagConstraints();
		gbc_producto5Panel.fill = GridBagConstraints.BOTH;
		gbc_producto5Panel.insets = new Insets(0, 0, 0, 5);
		gbc_producto5Panel.gridx = 1;
		gbc_producto5Panel.gridy = 1;
		panel.add(producto5Panel, gbc_producto5Panel);
		producto5Panel.setLayout(null);
		
		producto5Imagen = new JPanel();
		producto5Imagen.setBackground(new Color(255, 255, 255));
		producto5Imagen.setBounds(15, 11, 296, 244);
		producto5Panel.add(producto5Imagen);
		producto5Imagen.setLayout(new GridLayout(1, 0, 0, 0));
		
		producto5lblImagen = new JLabel("Imagen5");
		producto5lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		producto5Imagen.add(producto5lblImagen);
		
		producto5Nombre = new JPanel();
		producto5Nombre.setBackground(new Color(255, 255, 255));
		producto5Nombre.setBounds(15, 266, 296, 53);
		producto5Panel.add(producto5Nombre);
		producto5Nombre.setLayout(new GridLayout(1, 0, 0, 0));
		
		producto5lblNombre = new JLabel("Nombre5");
		producto5lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		producto5Nombre.add(producto5lblNombre);
	}
	
	private void iniciarProducto6() {
		producto6Panel = new JPanel();
		producto6Panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] objArray = {productos.getElemento(6, 0), productos.getElemento(6, 2)};
				productosEnviar.add(objArray);
			}
		});
		producto6Panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		producto6Panel.setBackground(new Color(255, 255, 255));
		gbc_producto6Panel = new GridBagConstraints();
		gbc_producto6Panel.fill = GridBagConstraints.BOTH;
		gbc_producto6Panel.gridx = 2;
		gbc_producto6Panel.gridy = 1;
		panel.add(producto6Panel, gbc_producto6Panel);
		producto6Panel.setLayout(null);
		
		producto6Imagen = new JPanel();
		producto6Imagen.setBackground(new Color(255, 255, 255));
		producto6Imagen.setBounds(10, 11, 296, 244);
		producto6Panel.add(producto6Imagen);
		producto6Imagen.setLayout(new GridLayout(1, 0, 0, 0));
		
		producto6lblImagen = new JLabel("Imagen6");
		producto6lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		producto6Imagen.add(producto6lblImagen);
		
		producto6Nombre = new JPanel();
		producto6Nombre.setBackground(new Color(255, 255, 255));
		producto6Nombre.setBounds(10, 266, 296, 53);
		producto6Panel.add(producto6Nombre);
		producto6Nombre.setLayout(new GridLayout(1, 0, 0, 0));
		
		producto6lblNombre = new JLabel("Nombre6");
		producto6lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		producto6Nombre.add(producto6lblNombre);
	}
	
	public void setProductos(Matriz2D<String> productos) {
		this.productos = productos;
	}
	
	public void setProductos(Matriz2D<String> productos, boolean procesar) {
		this.productos = productos;
		if (productos.getColumnas() == 3) {
			if (procesar) {
				int k = 1;
				for (int j = 1; j < productos.getFilas(); j++) {
					int i = 0;
					setImagesNombres(k++,productos.getElemento(j, i++), productos.getElemento(j, i));
					
				 }
			}
		}
	}
	
	public void setImages(int panelNum, String direccion) {
		switch (panelNum) {
			case 1 -> {
				producto1lblImagen.setIcon(new ImageIcon(ProductosScrollPane.class.getResource(direccion)));
				producto1lblImagen.setText("");
			}
			case 2 -> {
				producto2lblImagen.setIcon(new ImageIcon(ProductosScrollPane.class.getResource(direccion)));
				producto2lblImagen.setText("");
			}
			case 3 -> {
				producto3lblImagen.setIcon(new ImageIcon(ProductosScrollPane.class.getResource(direccion)));
				producto3lblImagen.setText("");
			}
			case 4 -> {
				producto4lblImagen.setIcon(new ImageIcon(ProductosScrollPane.class.getResource(direccion)));
				producto4lblImagen.setText("");
			}
			case 5 -> {
				producto5lblImagen.setIcon(new ImageIcon(ProductosScrollPane.class.getResource(direccion)));
				producto5lblImagen.setText("");
			}
			case 6 -> {
				producto6lblImagen.setIcon(new ImageIcon(ProductosScrollPane.class.getResource(direccion)));
				producto6lblImagen.setText("");
			}
			default -> {
				System.out.println("Error: Panel no encontrado");
			}
		}
	}
	
	public void setNombres(int panelNum, String nombre) {
		switch (panelNum) {
			case 1 -> {
				producto1lblNombre.setText(nombre);
			}
			case 2 -> {
				producto2lblNombre.setText(nombre);
			}
			case 3 -> {
				producto3lblNombre.setText(nombre);
			}
			case 4 -> {
				producto4lblNombre.setText(nombre);
			}
			case 5 -> {
				producto5lblNombre.setText(nombre);
			}
			case 6 -> {
				producto6lblNombre.setText(nombre);
			}
			default -> {
				System.out.println("Error: Panel no encontrado");
			}
		}
	}
	
	public void setImagesNombres(int panelNum, String nombre, String direccion) {
		switch (panelNum) {
			case 1 -> {
				producto1lblImagen.setIcon(new ImageIcon(ProductosScrollPane.class.getResource(direccion)));
				producto1lblImagen.setText("");
				producto1lblNombre.setText(nombre);
			}
			case 2 -> {
				producto2lblImagen.setIcon(new ImageIcon(ProductosScrollPane.class.getResource(direccion)));
				producto2lblImagen.setText("");
				producto2lblNombre.setText(nombre);
			}
			case 3 -> {
				producto3lblImagen.setIcon(new ImageIcon(ProductosScrollPane.class.getResource(direccion)));
				producto3lblImagen.setText("");
				producto3lblNombre.setText(nombre);
			}
			case 4 -> {
				producto4lblImagen.setIcon(new ImageIcon(ProductosScrollPane.class.getResource(direccion)));
				producto4lblImagen.setText("");
				producto4lblNombre.setText(nombre);	
			}
			case 5 -> {
				producto5lblImagen.setIcon(new ImageIcon(ProductosScrollPane.class.getResource(direccion)));
				producto5lblImagen.setText("");
				producto5lblNombre.setText(nombre);
			}
			case 6 -> {
				producto6lblImagen.setIcon(new ImageIcon(ProductosScrollPane.class.getResource(direccion)));
				producto6lblImagen.setText("");
				producto6lblNombre.setText(nombre);
			}
			default -> {
				System.out.println("Error: Panel no encontrado");
			}
		}
	}

	public List<Object[]> getProductosEnviar() {
		
		
		Collections.sort(productosEnviar,new ComparadorObjetos());
		
		
		return productosEnviar;
	}
	
}
