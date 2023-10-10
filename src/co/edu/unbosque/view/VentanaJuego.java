package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VentanaJuego extends JFrame {
	
	private PanelDigitos digitos;
	private PanelDeResultados presultados;
	
	
	public VentanaJuego() {

		setTitle("JUEGO");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
    }

	private void inicializarComponentes() {
		digitos= new PanelDigitos();
		digitos.setBounds(0,10, 600, 200);
        add(digitos);
        presultados= new PanelDeResultados();
		presultados.setBounds(0, 500, 300, 200);
		getContentPane().add(presultados);
	}

	

}
