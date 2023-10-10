package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import co.edu.unbosque.model.Logica;
import co.edu.unbosque.view.VentanaBienvenidos;
import co.edu.unbosque.view.VentanaInstrucciones;
import co.edu.unbosque.view.VentanaJuego;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaBienvenidos ventana_inicial;
	private VentanaPrincipal ventana_principal;
	private VentanaJuego ventana_juego;
	private VentanaInstrucciones ventana_ins;
	private Logica logica;

	public Controller() {
		ventana_inicial = new VentanaBienvenidos();
		ventana_principal = new VentanaPrincipal();
		ventana_juego = new VentanaJuego();
		ventana_ins = new VentanaInstrucciones();

		asignaroyentes();

	}

	public void asignaroyentes() {
		ventana_inicial.getPi().getBtingresar().addActionListener(this);
		ventana_principal.getModos().getBjugar().addActionListener(this);
		ventana_ins.getPI().getBtcon().addActionListener(this);
		ventana_principal.getModos().getSi().addActionListener(this);
		ventana_principal.getModos().getNo().addActionListener(this);
		ventana_principal.getModos().getDigitos().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("INICIAR")) {
			ventana_inicial.setVisible(false);
			ventana_ins.setVisible(true);

		} else if (e.getActionCommand().equals("CONTINUAR")) {
			ventana_ins.setVisible(false);
			ventana_principal.setVisible(true);
			String opcion = ventana_principal.getModos().getJugador().getSelectedItem().toString();
			Boolean duplicados = true;

			switch (opcion) {
			case "jugador vs maquina":
				String si = ventana_principal.getModos().getSi().getActionCommand().toString();
				String no = ventana_principal.getModos().getNo().getActionCommand().toString();
				if (si.equals("SI")) {
						System.out.println("A ver si funciona, por favor, cruz");
						if (duplicados) {
							duplicados=true;
						logica.setDuplicados(duplicados);
						String cant_digitos = ventana_principal.getModos().getDigitos().getSelectedItem().toString();
						int cant_digitos1 = Integer.parseInt(cant_digitos);
						logica.Num_random(cant_digitos1);
						
					}

				}else if (no.equals("NO")) {
					duplicados=false;
					logica.setDuplicados(duplicados);
					String cant_digitos = ventana_principal.getModos().getDigitos().getSelectedItem().toString();
					int cant_digitos2 = Integer.parseInt(cant_digitos);
					logica.Num_random(cant_digitos2);
					
				}
				
				break;

			default:
				break;
			}

			
		} else if (e.getActionCommand().equals("JUGAR")) {
			if (ventana_principal.getModos().getJugador().toString().equals("jugador vs maquina")) {
				ventana_principal.setVisible(false);
				ventana_juego.setVisible(true);
			}
			
		}

	}

}
