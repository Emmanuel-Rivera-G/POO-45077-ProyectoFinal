package gráficos;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.util.List;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import clases.Matriz2D;
import clases.Producto;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTable;
import java.awt.Cursor;

public class PedidosScrollPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private GridBagLayout gridBagLayout;
	
	//Panel principal
	private JPanel panel;
	
	private GridBagConstraints gbc_panel;
	private GridBagLayout gbl_panel;
	
	//Titulo de Pedidos
	private JLabel pedidosLabel;
	private GridBagConstraints gbc_pedidosLabel;
	
	//Panel central
	private JPanel panel_contenido;
	private GridBagConstraints gbc_panel_contenido;
	
	private Matriz2D<String> productos = new Matriz2D<String>(8, 2);
	private JTable tablaProductos;
	
	private List<Object[]> productosRecibir;

	public PedidosScrollPanel() {
		
		setBounds(new Rectangle(0, 0, 950, 661));
		setBackground(new Color(128, 128, 255));
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {950};
		gridBagLayout.rowHeights = new int[] {661};
		gridBagLayout.columnWeights = new double[]{1.0};
		gridBagLayout.rowWeights = new double[]{1.0};
		setLayout(gridBagLayout);
		
		iniciarPanel();
		
		iniciarPedidosLabel();
		
		iniciarPanel_1();

	}
	
	public void setProductosRecibidos(List<Object[]> productosRecibir) {
		this.productosRecibir = productosRecibir;
	}
	
	private void agregarProductosRecibidos(List<Object[]> productosRecibir) {
		productos.setElemento(0, 0, "Nombre");
		productos.setElemento(0, 1, "Precio");
		
		for (int i = 1; i < productosRecibir.size(); i++) {
			for (int j = 0; j < 2; j++) {
				productos.setElemento(i, j, (String) productosRecibir.get(i)[j]);
			}
		}
	}

	private void iniciarPanel() {
		panel = new JPanel();
		gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {0};
		gbl_panel.rowHeights = new int[] {80, 581};
		gbl_panel.columnWeights = new double[]{1.0};
		gbl_panel.rowWeights = new double[]{1.0, 1.0};
		panel.setLayout(gbl_panel);
	}
	
	private void iniciarPedidosLabel() {
		pedidosLabel = new JLabel("Pedidos");
		gbc_pedidosLabel = new GridBagConstraints();
		gbc_pedidosLabel.insets = new Insets(0, 0, 5, 0);
		gbc_pedidosLabel.gridx = 0;
		gbc_pedidosLabel.gridy = 0;
		panel.add(pedidosLabel, gbc_pedidosLabel);
	}
	
	private void iniciarPanel_1() {
		panel_contenido = new JPanel();
		panel_contenido.setLayout(null);
		gbc_panel_contenido = new GridBagConstraints();
		gbc_panel_contenido.fill = GridBagConstraints.BOTH;
		gbc_panel_contenido.gridx = 0;
		gbc_panel_contenido.gridy = 1;
		panel.add(panel_contenido, gbc_panel_contenido);
	}

	public void iniciarTabla() {
		agregarProductosRecibidos(productosRecibir);
		String[] columnNames = {"Nombre","Precio"};
		tablaProductos = new JTable(new DefaultTableModel(productos.getMatriz(),columnNames));
		tablaProductos.setBounds(98, 37, 631, 371);
		panel_contenido.add(tablaProductos);
	}
}
