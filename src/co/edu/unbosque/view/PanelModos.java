package co.edu.unbosque.view;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelModos extends JPanel{
	 
	private JComboBox<String> jugador;
	private JComboBox<String> digitos;
	private JComboBox<String> intentos;
	private JLabel Mdigitos;
	private JLabel numr;
	private JLabel Mintentos;
	private JRadioButton si,no;
    private JButton bjugar;
    private ButtonGroup grupoderadios;
	
	
	public PanelModos() {
		setLayout(null);
		
		inicializarComponentes();
		setVisible(true);

		
	}

	private void inicializarComponentes() {
		//jcombobox
		jugador= new JComboBox<String>();
		jugador.setBounds(40, 25, 148, 20);
		jugador.setModel(new DefaultComboBoxModel<>(new String[] {"jugador vs maquina","jugador vs jugador"}));
		add(jugador);
		
		digitos= new JComboBox<String>();
		digitos.setBounds(350, 100, 148, 20);
		digitos.setModel(new DefaultComboBoxModel<>(new String[] {"Seleccione","1 digito","2 digitos","3 digitos","4 digitos","5 digitos","6 digitos","7 digitos","8 digitos","9 digitos","10 digitos"}));
		add(digitos);
		
		intentos= new JComboBox<String>();
		intentos.setBounds(350, 250, 148, 20);
		intentos.setModel(new DefaultComboBoxModel<>(new String[] {"Seleccione","1 intento","5 intentos","10 intentos","15 intentos","20 intentos","25 intentos","30 intentos","35 intentos","40 intentos","45 intentos","50 intentos"}));
		add(intentos);
	// mensajes
		Mdigitos=new JLabel();
		Mdigitos.setBounds(40, 100, 120, 20);
		Mdigitos.setText("Cantidad de Digitos");
		add(Mdigitos);
		
		numr=new JLabel();
		numr.setBounds(40, 175, 120, 20);
		numr.setText("Digitos Repetidos");
		add(numr);
		
		Mintentos=new JLabel();
		Mintentos.setBounds(40, 250, 120, 20);
		Mintentos.setText("Cantidad de Intentos");
		add(Mintentos);
		//radiob
		grupoderadios= new ButtonGroup();
		si= new JRadioButton();
		si.setText("SI");
		si.setActionCommand("SI");
		si.setBounds(350, 175,40 ,20);
		add(si);
		
		no= new JRadioButton();
		no.setText("NO");
		no.setActionCommand("NO");
		no.setBounds(425, 175,50 ,20);
		add(no);
		grupoderadios.add(si);
		grupoderadios.add(no);
		
		//boton
		bjugar= new JButton("jugar");
		bjugar.setBounds(225, 320,90 ,30);
		bjugar.setActionCommand("JUGAR");
		add(bjugar);
		
	}

	public JComboBox<String> getJugador() {
		return jugador;
	}

	public void setJugador(JComboBox<String> jugador) {
		this.jugador = jugador;
	}

	public JComboBox<String> getDigitos() {
		return digitos;
	}

	public void setDigitos(JComboBox<String> digitos) {
		this.digitos = digitos;
	}

	public JComboBox<String> getIntentos() {
		return intentos;
	}

	public void setIntentos(JComboBox<String> intentos) {
		this.intentos = intentos;
	}

	public JLabel getMdigitos() {
		return Mdigitos;
	}

	public void setMdigitos(JLabel mdigitos) {
		Mdigitos = mdigitos;
	}

	public JLabel getNumr() {
		return numr;
	}

	public void setNumr(JLabel numr) {
		this.numr = numr;
	}

	public JLabel getMintentos() {
		return Mintentos;
	}

	public void setMintentos(JLabel mintentos) {
		Mintentos = mintentos;
	}

	public JRadioButton getSi() {
		return si;
	}

	public void setSi(JRadioButton si) {
		this.si = si;
	}

	public JRadioButton getNo() {
		return no;
	}

	public void setNo(JRadioButton no) {
		this.no = no;
	}

	public JButton getBjugar() {
		return bjugar;
	}

	public void setBjugar(JButton bjugar) {
		this.bjugar = bjugar;
	}
	

}
