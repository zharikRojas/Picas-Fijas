package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelDeResultados extends JPanel {
	private JLabel etiqueta_resultados;

	public PanelDeResultados() {
		
		setLayout(null);
	
		inicializarComponentes();
		
		setVisible(true);
	}
	public void inicializarComponentes() {
		setBackground(Color.LIGHT_GRAY);
		setBorder(new TitledBorder("panel de resultados"));
		
		etiqueta_resultados= new JLabel();
		etiqueta_resultados.setBounds(10, 310, 200, 200);
		etiqueta_resultados.setText("resultados: ");
		add(etiqueta_resultados);
		
	}
	public JLabel getEtiqueta_resultados() {
		return etiqueta_resultados;
	}
	public void setEtiqueta_resultados(JLabel etiqueta_resultados) {
		this.etiqueta_resultados = etiqueta_resultados;
	}
	
}
