package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Random;

public class Logica {

	private int cant_numeros;
	private int picas;
	private int fijas;
	private int intentos;
	private int random;
	private Boolean duplicados;
	private ArrayList<Integer> num_random;
	private ArrayList<Integer> posiciones_fijas;
	private ArrayList<Integer> posiciones_picas;
	private String numero_usuario;
	private long timeStart, timeFinal, time;

	Random rnd;

	public Logica() {

		cant_numeros = 0;
		numero_usuario = "";
		picas = 0;
		fijas = 0;
		intentos = 0;
		random = 0;
		num_random = new ArrayList<>();
		posiciones_fijas = new ArrayList<>();
		posiciones_picas = new ArrayList<>();
		rnd = new Random(System.currentTimeMillis());
		time =0;
		timeStart=0;
		timeFinal=0;

	}

	
	public void validarPicas_fijas() {
	
		posiciones_fijas.clear();
		posiciones_picas.clear();
		fijas = 0;
		picas = 0;

		ArrayList<Integer> randomNumber = getNum_random();
		String userNumber[] = getNumero_usuario().split("");
		

		for (int i = 0; i < randomNumber.size(); i++) {
			for (int j = 0; j < userNumber.length; j++) {
				if (randomNumber.get(i) == Integer.parseInt(userNumber[j])) {
					if (i == j) {
						if (posiciones_picas.contains(Integer.parseInt(userNumber[j]))) {
							posiciones_picas.remove(j);
							fijas++;
							posiciones_fijas.add(Integer.parseInt(userNumber[j]));
						}else {
							fijas++;
							posiciones_fijas.add(Integer.parseInt(userNumber[j]));
						}
						
						//guardar la posicion de la fija 
					} else if(!posiciones_fijas.contains(Integer.parseInt(userNumber[j]))) {
						if (!posiciones_picas.contains(Integer.parseInt(userNumber[j]))) {
							picas++;
							posiciones_picas.add(Integer.parseInt(userNumber[j]));
						}	
						
					}
				}
			}
		}
		
		
	}

	public void Num_random(int cant_digitos) {

		while (num_random.size() < cant_digitos) {
			random = rnd.nextInt(10);
			if (!this.getDuplicados()) {
				while (num_random.contains(random)) {
					random = rnd.nextInt(10);
				}
			}

			num_random.add(random);
			
		}

	}

	public void cont_intentos(int cant_digitos1) {
		intentos = cant_digitos1 * 5;

	}

	public int getCant_numeros() {
		return cant_numeros;
	}

	public void setCant_numeros(int cant_numeros) {
		this.cant_numeros = cant_numeros;
	}

	public int getPicas() {
		return picas;
	}

	public void setPicas(int picas) {
		this.picas = picas;
	}

	public int getFijas() {
		return fijas;
	}

	public void setFijas(int fijas) {
		this.fijas = fijas;
	}

	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}

	public String getNumero_usuario() {
		return numero_usuario;
	}

	public void setNumero_usuario(String numero_usuario) {
		this.numero_usuario = numero_usuario;
	}

	public Random getRnd() {
		return rnd;
	}

	public void setRnd(Random rnd) {
		this.rnd = rnd;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	public ArrayList<Integer> getNum_random() {
		return num_random;
	}

	public void setNum_random(ArrayList<Integer> num_random) {
		this.num_random = num_random;
	}

	public void setDuplicados(Boolean duplicados) {
		this.duplicados = duplicados;
	}

	public Boolean getDuplicados() {
		return duplicados;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
	

}
