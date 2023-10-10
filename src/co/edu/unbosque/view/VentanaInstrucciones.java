package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class VentanaInstrucciones extends JFrame {
	
	private PanelInstrucciones PI;
	
	
	public VentanaInstrucciones() {
		setTitle("INSTRUCCIONES");
		setSize(600,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
        inicializarComponentes();
		
        setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}

	private void inicializarComponentes() {
		
		PI = new PanelInstrucciones();
		PI.setBounds(0, 0, 600, 400);
		add(PI);
		
	}

	public PanelInstrucciones getPI() {
		return PI;
	}

	public void setPI(PanelInstrucciones pI) {
		PI = pI;
	}
	

}
