package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDigitos extends JPanel {
	
	private JLabel etiqueta_numero;
	private JTextField campo_numero;
	private JButton boton_adivinar;
	
	public PanelDigitos() {

		setLayout(null);
	    inicializarComponentes();
		setVisible(true);
	}

	private void inicializarComponentes() {
		etiqueta_numero= new JLabel();
		etiqueta_numero.setBounds(260,50 ,140 ,20);
		etiqueta_numero.setText("Ingrese Digitos: ");
		add(etiqueta_numero);
		
		campo_numero=new JTextField();
		campo_numero.setBounds(200, 100, 200, 20);
		add(campo_numero);
		
		boton_adivinar=new JButton("Adivinar");
		boton_adivinar.setBounds(255, 150, 90,30);
		boton_adivinar.setActionCommand("ADIVINAR");
		add(boton_adivinar);
		
	}

	public JLabel getEtiqueta_numero() {
		return etiqueta_numero;
	}

	public void setEtiqueta_numero(JLabel etiqueta_numero) {
		this.etiqueta_numero = etiqueta_numero;
	}

	public JTextField getCampo_numero() {
		return campo_numero;
	}

	public void setCampo_numero(JTextField campo_numero) {
		this.campo_numero = campo_numero;
	}

	public JButton getBoton_adivinar() {
		return boton_adivinar;
	}

	public void setBoton_adivinar(JButton boton_adivinar) {
		this.boton_adivinar = boton_adivinar;
	}

}
