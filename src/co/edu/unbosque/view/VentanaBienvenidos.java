package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;

public class VentanaBienvenidos extends JFrame {
	
	
    private PanelInicio pi;
    private PanelImagen pim;
    private JLayeredPane lpane;
  
    
    public VentanaBienvenidos() {

		setTitle("PICAS Y FIJAS");
		setPreferredSize(new Dimension(600,400));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		pack();
		setVisible(true);
    }
    
    public void inicializarComponentes() {
    	
    lpane = new JLayeredPane();
    getContentPane().add(lpane,BorderLayout.CENTER);
    lpane.setBounds(0,0, 600, 400);
    
    pim = new PanelImagen();
    pim.setBounds(0, 0, 600, 400);
    pim.setOpaque(true);
    lpane.add(pim, new Integer(0), 0);
    
    
    pi = new PanelInicio();
    pi.setBounds(250, 250, 100,25);
    pi.setOpaque(true);
    lpane.add(pi, new Integer(1), 0);
    
   
    
    	
    }

	public PanelInicio getPi() {
		return pi;
	}

	public void setPi(PanelInicio pi) {
		this.pi = pi;
	}

	public PanelImagen getPim() {
		return pim;
	}

	public void setPim(PanelImagen pim) {
		this.pim = pim;
	}

	public JLayeredPane getLpane() {
		return lpane;
	}

	public void setLpane(JLayeredPane lpane) {
		this.lpane = lpane;
	}
}
