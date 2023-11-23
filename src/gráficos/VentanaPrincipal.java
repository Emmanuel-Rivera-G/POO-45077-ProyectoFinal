package gráficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Rectangle;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Component;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JPopupMenu;
import java.awt.Choice;
import java.awt.List;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	//Ventana principal
	private VentanaPrincipal frame;
	
	//Panel principal
	private JPanel panelVentana;
	private JPanel menuPanel;
	private JLabel inicioTitulolbl;
	private JPanel btnProductosPanel;
	private JPanel panelSegundoVentana;
	private ProductosScrollPane productosPanel;
	private JButton btnProductos;
	private JPanel btnPedidosPanel;
	private PedidosScrollPanel pedidosPanel;
	private JButton btnPedidos;
	private JPanel btnCerrarSecionPanel;
	private JButton btnCerrarSesion;
	
	
	public VentanaPrincipal() {
		
		//Se inicia esta ventana
		frame = this; //Se establece esta ventana como la principal
		setResizable(false); //Se bloquea la redimensión
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1200, 700);
		
		iniciarContentPane();
		
		iniciarPanelVentana();
		
		iniciarMenuPane();
		
		iniciarInicioTitulolbl();
		
		iniciarBtnProductosPanel();
		
		iniciarPanelSegundaVentana();
		
		iniciarProductosPanel();
		
		iniciarBtnPedidosPanel();
		
		iniciarPedidosPanel();
		
		iniciarBtnCerrarSesion();
		
		do iniciarProductosScrollPanel(); while(false);
	}

	private void iniciarContentPane() {
		//Panel donde se contiene todo
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	private void iniciarPanelVentana() {
		panelVentana = new JPanel();
		panelVentana.setBackground(new Color(255, 255, 255));
		panelVentana.setBounds(0, 0, 1184, 661);
		contentPane.add(panelVentana);
		panelVentana.setLayout(null);
	}
	
	private void iniciarMenuPane() {
		//Se inicia el menu derecho
		menuPanel = new JPanel();
		menuPanel.setBounds(0, 0, 234, 661);
		menuPanel.setBackground(new Color(192, 192, 192));
		panelVentana.add(menuPanel);
		menuPanel.setLayout(null);
	}
	
	private void iniciarInicioTitulolbl() {
		//Se inicia el titulo del menu
		inicioTitulolbl = new JLabel("INICIO");
		inicioTitulolbl.setHorizontalAlignment(SwingConstants.CENTER);
		inicioTitulolbl.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 34));
		inicioTitulolbl.setBounds(0, 24, 234, 37);
		menuPanel.add(inicioTitulolbl);
	}

	private void iniciarBtnProductosPanel() {
		btnProductosPanel = new JPanel();
		btnProductosPanel.setBounds(0, 89, 234, 46);
		menuPanel.add(btnProductosPanel);
		btnProductosPanel.setLayout(null);
	}
	
	private void iniciarPanelSegundaVentana() {
		panelSegundoVentana = new JPanel();
		panelSegundoVentana.setBounds(234,0,950,661);
		panelVentana.add(panelSegundoVentana);
	}

	private void iniciarProductosPanel() {
		productosPanel = new ProductosScrollPane();
		
		btnProductos = new JButton("Productos");
		btnProductos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panelSegundoVentana.removeAll();
				
				iniciarProductosScrollPanel();
				
				panelSegundoVentana.revalidate();
				panelSegundoVentana.repaint();
			}
		});
		btnProductos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProductos.setBorderPainted(false);
		btnProductos.setBackground(new Color(255, 255, 255));
		btnProductos.setBounds(0, 0, 234, 46);
		btnProductosPanel.add(btnProductos);
	}
	
	protected void iniciarProductosScrollPanel() {
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setSize(950,661);
		panelSegundoVentana.add(scrollPane);	
		
		JPanel panelScrollContener = new JPanel();
		panelScrollContener.setBounds(0, 0, 950, 661);
		scrollPane.setViewportView(panelScrollContener);
		panelScrollContener.setLayout(new GridLayout(0, 1, 0, 0));
		
		productosPanel.setSize(950,661);
		panelScrollContener.add(productosPanel);
		//productosPanel.setLayout(new GridLayout(1, 0, 0, 0));
	}

	private void iniciarBtnPedidosPanel() {
		//Inicializamos el boton de pedidos
		btnPedidosPanel = new JPanel();
		btnPedidosPanel.setBounds(0, 158, 234, 46);
		menuPanel.add(btnPedidosPanel);
		btnPedidosPanel.setLayout(null);
	}
	
	private void iniciarPedidosPanel() {
		//Iniciamos el panel ya creado de pedidos
		pedidosPanel = new PedidosScrollPanel();
		
		btnPedidos = new JButton("Pedidos");
		btnPedidos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPedidos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelSegundoVentana.removeAll();
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setSize(950,661);
				panelSegundoVentana.add(scrollPane);	
				
				JPanel panelScrollContener = new JPanel();
				panelScrollContener.setBounds(0, 0, 950, 661);
				scrollPane.setViewportView(panelScrollContener);
				panelScrollContener.setLayout(new GridLayout(0, 1, 0, 0));
				
				pedidosPanel.setSize(950,661);
				panelScrollContener.add(pedidosPanel);
				
				pedidosPanel.setProductosRecibidos(productosPanel.getProductosEnviar());
				pedidosPanel.iniciarTabla();
				
				panelSegundoVentana.revalidate();
				panelSegundoVentana.repaint();
			}
		});
		btnPedidos.setBorderPainted(false);
		btnPedidos.setBackground(new Color(255, 255, 255));
		btnPedidos.setBounds(0, 0, 234, 46);
		btnPedidosPanel.add(btnPedidos);
	}

	private void iniciarBtnCerrarSesion() {
		btnCerrarSecionPanel = new JPanel();
		btnCerrarSecionPanel.setBounds(0, 227, 234, 46);
		menuPanel.add(btnCerrarSecionPanel);
		btnCerrarSecionPanel.setLayout(null);
		
		btnCerrarSesion = new JButton("Cerrar Sesión");
		btnCerrarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCerrarSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelSegundoVentana.removeAll();
				
				//Cierra la venta y vuelve a la ventana de start window
				try {
					StartWindow window = new StartWindow();
					window.frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				frame.dispose();
				
				panelSegundoVentana.revalidate();
				panelSegundoVentana.repaint();
			}
		});
		btnCerrarSesion.setBackground(new Color(255, 255, 255));
		btnCerrarSesion.setBorderPainted(false);
		btnCerrarSesion.setBounds(0, 0, 234, 46);
		btnCerrarSecionPanel.add(btnCerrarSesion);
	}
}
