/**
 * 
 */
package com.radrian.ejerciciosPOO.ejercicios;

import java.util.Random;

/**
 * @author RAdrian
 *
 */
public class Ejercicio03_Password {
	private byte longitud = 8;
	private String contraseña;

	public Ejercicio03_Password() {

	}

	public Ejercicio03_Password(byte longitud, String contraseña) {
		super();
		this.longitud = longitud;
		this.contraseña = contraseña;
	}

	public boolean checarContraseña(String contraseña) {
		byte minus = 0;
		byte mayus = 0;
		byte numeros = 0;
		char[] arr = contraseña.toCharArray();
		for (int i = 0; i <= arr.length; i++) {
			if (Character.isUpperCase(arr[i])) {
				mayus++;
			} else if (Character.isLowerCase(arr[i])) {
				minus++;
			} else {
				numeros++;
			}
		}
		return esFuerte(minus, mayus, numeros);

	}

	private boolean esFuerte(byte minus, byte mayus, byte numeros) {
		if (minus >= 1 && mayus >= 2 && numeros >= 5) {
			return true;
		} else {
			return false;
		}
	}

	public void generarContraseña(byte longitud) {
		byte minus = 1;
		byte mayus = 2;
		byte numeros = 5;
		StringBuilder str = new StringBuilder();

		for (byte i = 0; i<longitud ; i++) {
			for (byte j = 0; j < minus; j++) {
				str.append(randomMinus());
			}
			for (byte k = 0; k < mayus; k++) {
				str.append(randomMayus());
			}
			for (byte l = 0; l < numeros; l++) {
				str.append(randomNumber());
			}
		}
		this.contraseña = str.toString();
	}
	
	private byte randomNumber() {
		Random rand = new Random();
		return (byte) rand.nextInt(9);// 
	}

	private char randomMayus() {
		String mayusAlpabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rand = new Random();
		return mayusAlpabet.charAt(rand.nextInt(mayusAlpabet.length()));
	}
	
	private char randomMinus() {
		String minusAlpabet = "abcdefghijklmnopqrstucwxyz";
		Random rand = new Random();
		return minusAlpabet.charAt(rand.nextInt(minusAlpabet.length()));
	}
}
