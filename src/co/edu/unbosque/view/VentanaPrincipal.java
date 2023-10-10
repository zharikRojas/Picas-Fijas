package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class VentanaPrincipal extends JFrame{
	
	private PanelModos modos;
	  

	public VentanaPrincipal() {

		setTitle("MODO DE JUEGO");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
    }
    
    public void inicializarComponentes() {
    	
    	modos=new PanelModos();
    	modos.setBounds(0, 0, 800, 400);
    	add(modos);
    	
    	
    	
    }

	public PanelModos getModos() {
		return modos;
	}

	public void setModos(PanelModos modos) {
		this.modos = modos;
	}
}
