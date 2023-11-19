package gráficos;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;

public class PedidosScrollPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private GridBagLayout gridBagLayout;

	public PedidosScrollPanel() {
		setBounds(new Rectangle(0, 0, 950, 661));
		setBackground(new Color(128, 128, 255));
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {950};
		gridBagLayout.rowHeights = new int[] {661};
		gridBagLayout.columnWeights = new double[]{1.0};
		gridBagLayout.rowWeights = new double[]{1.0};
		setLayout(gridBagLayout);
		
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {0};
		gbl_panel.rowHeights = new int[] {80, 0, 581};
		gbl_panel.columnWeights = new double[]{1.0};
		gbl_panel.rowWeights = new double[]{1.0, 1.0};
		panel.setLayout(gbl_panel);
		
		JLabel pedidosLabel = new JLabel("Pedidos");
		GridBagConstraints gbc_pedidosLabel = new GridBagConstraints();
		gbc_pedidosLabel.insets = new Insets(0, 0, 5, 0);
		gbc_pedidosLabel.gridx = 0;
		gbc_pedidosLabel.gridy = 0;
		panel.add(pedidosLabel, gbc_pedidosLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		panel.add(panel_1, gbc_panel_1);

	}
}
