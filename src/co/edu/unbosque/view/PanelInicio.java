package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInicio extends JPanel{

   private JButton btingresar;
   
   
   public PanelInicio() {
	   setLayout(new GridLayout(1,1,5,5));
	   inicializaromponentes();
	   
   }
   
   public void inicializaromponentes() {
	   btingresar = new JButton("iniciar");
	   btingresar.setActionCommand("INICIAR");
	   add(btingresar);
   }

public JButton getBtingresar() {
	return btingresar;
}

public void setBtingresar(JButton btingresar) {
	this.btingresar = btingresar;
}
}
