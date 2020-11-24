package co.edu.unbosque.controller;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

import co.edu.unbosque.model.Logica;
import co.edu.unbosque.view.ViewConsola;

public class Controller {

	private Logica logica;
	private ViewConsola vista;
	private boolean formato_digit;

	public Controller() {
		logica = new Logica();
		vista = new ViewConsola();
		formato_digit=false;
		funcionar();
	}

	public void funcionar() {

		String cant_digitos="";
	
		
		String digitos_Formato = vista.leerCant_digitos("Desea digitos repetidos?" + "\n si o no");
	    Boolean duplicados = digitos_Formato.equals("si") ? true : false;
	    logica.setDuplicados(duplicados);
		
		if (duplicados) {
			formato_digit=true;
			cant_digitos = vista.leerCant_digitos("Cuantos digitos quiere:");
			logica.Num_random(Integer.parseInt(cant_digitos));
			vista.mostrarInfo("el numero" + logica.getNum_random());
			while (logica.getFijas() < Integer.parseInt(cant_digitos)) {

				String numero = vista.leerCant_digitos("Por favor digite su numero de acuerdo a los digitos que eligio: ");
				logica.setNumero_usuario(numero);
				logica.validarPicas_fijas();
				vista.mostrarInfo("Sus fijas: " + "      Sus picas: " + "\n" + logica.getFijas()
						+ "                       " + logica.getPicas());
			}
		} else {
			cant_digitos = vista.leerCant_digitos("Cuantos digitos quiere:");
			logica.Num_random(Integer.parseInt(cant_digitos));
			vista.mostrarInfo("el numero" + logica.getNum_random());
			while (logica.getFijas() < Integer.parseInt(cant_digitos )) {

				String numero = vista
						.leerCant_digitos("Por favor digite su numero de acuerdo a los digitos que eligio: ");
				logica.setNumero_usuario(numero);
				logica.validarPicas_fijas();
				vista.mostrarInfo("Sus fijas: " + "      Sus picas: " + "\n" + logica.getFijas()
						+ "                       " + logica.getPicas());
			}
		}
		
		if (logica.getFijas()==Integer.parseInt(cant_digitos)) {
			vista.mostrarInfo("Felicitaciones ha adivinado el número");

		}
		/*
		 * Numero entre[0,1] double num_real = Math.random();
		 * System.out.println(num_real);
		 * 
		 * // Numero double entre [0,20] num_real = Math.random() * 20;
		 * System.out.println(num_real);
		 * 
		 * // Numero double entre [95,99] // = (min)+Math.random()*(Max-min) num_real =
		 * 95 + Math.random() * 4; System.out.println(num_real);
		 * 
		 * // Numero entero entre [0,1] int num_entero = (int) Math.random();
		 * System.out.println(num_entero);
		 * 
		 * // Numero entero entre [0,20] num_entero = (int) (Math.random() * 200);
		 * System.out.println(num_entero);
		 * 
		 * // Numero entero entre [95,99] num_entero = 95 +(int)(Math.random() * 4);
		 * System.out.println(num_entero);
		 */

		/*
		 * Random rnd; rnd = new Random(System.currentTimeMillis()); int num_entero
		 * =rnd.nextInt((9999 - 100) + 1) + 10; System.out.println(num_entero);
		 * 
		 * String num = rnd.toString();
		 */
		/*
		 * / número real[0,1] double num_real = rnd.nextDouble();
		 * System.out.println(num_real);
		 * 
		 * // número real[0,20] num_real = rnd.nextDouble() * 20;
		 * System.out.println(num_real);
		 * 
		 * // número real[45,55] num_real = 45 + rnd.nextDouble() * 10;
		 * System.out.println(num_real);
		 * 
		 * // numero entero [-2147000000,2147000000] int num_entero = rnd.nextInt();
		 * System.out.println(num_entero); System.out.println("[" + Integer.MIN_VALUE +
		 * "," + Integer.MAX_VALUE + "]");
		 * 
		 * // número entero [0,20] for (int i = 1; i <=5; i++) { num_entero
		 * =rnd.nextInt(7); }
		 * 
		 * System.out.println(num_entero); número entero [5,15] num_entero = 5
		 * +rnd.nextInt(11); System.out.println(num_entero);
		 * 
		 * /número real[35,55] double num_real = 35 + rnd.nextDouble()*20;
		 * System.out.println(num_real); String aux = String.format("%.01f", num_real);
		 * System.out.println(aux);
		 * 
		 * StringBuilder sb = new StringBuilder(); Formatter formatter = new
		 * Formatter(sb); formatter.format("%.2f", num_real);
		 * System.out.println(formatter.toString());
		 * 
		 * System.out.printf(" %.3f", num_real);
		 * 
		 * DecimalFormat df = new DecimalFormat("#.##"); String aux2 =
		 * df.format(num_real); System.out.println(aux2);
		 */
	}

	public boolean isFormato_digit() {
		return formato_digit;
	}

	public void setFormato_digit(boolean formato_digit) {
		this.formato_digit = formato_digit;
	}
	
}
