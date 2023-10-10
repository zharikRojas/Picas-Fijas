package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelInstrucciones extends JPanel{
	
	private JLabel titulo1;
	private JTextArea texto;
	private JButton btcon;
	
	public PanelInstrucciones() {
		setLayout(null);
	    inicializarComponentes();
		setVisible(true);
	}

	private void inicializarComponentes() {
 
		titulo1= new JLabel();
		titulo1.setText("INSTRUCCIONES");
		titulo1.setBounds(250, 50, 140, 20);
		add(titulo1);
		
		
		texto= new JTextArea();
		texto.setText("1.Se genera un numero aleatorio  y el jugador debe intentar adivinarlo\n en un numero limitado de intentos."+"\n2.Se obtiene una pica cuando ha adivinado un número pero no \n"
				+ "la posición en la que se encuentra, Se obtiene una fija cuando ha adivinado\n un número y su posición correcta. ");
				
		texto.setBounds(30,100, 500,100);
		add(texto);
		
		
		btcon= new JButton("continuar");
		btcon.setBounds(250,250,90 ,30);
		btcon.setActionCommand("CONTINUAR");
		add(btcon);
		
		
	}

	public JLabel getTitulo1() {
		return titulo1;
	}

	public void setTitulo1(JLabel titulo1) {
		this.titulo1 = titulo1;
	}

	public JTextArea getTexto() {
		return texto;
	}

	public void setTexto(JTextArea texto) {
		this.texto = texto;
	}

	public JButton getBtcon() {
		return btcon;
	}

	public void setBtcon(JButton btcon) {
		this.btcon = btcon;
	}

}
