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
	private String contrase�a;

	public Ejercicio03_Password() {

	}

	public Ejercicio03_Password(byte longitud, String contrase�a) {
		super();
		this.longitud = longitud;
		this.contrase�a = contrase�a;
	}

	public boolean checarContrase�a(String contrase�a) {
		byte minus = 0;
		byte mayus = 0;
		byte numeros = 0;
		char[] arr = contrase�a.toCharArray();
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

	public void generarContrase�a(byte longitud) {
		StringBuilder str = new StringBuilder();
		for (byte i = 0; i<longitud ; i++) {
				str.append(randomChar());
		}
		this.contrase�a = str.toString();
	}
	
	private char randomChar() {
		String mayusAlpabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstucwxyz012345678901234567890123456789";
		Random rand = new Random();
		return mayusAlpabet.charAt(rand.nextInt(mayusAlpabet.length()));
	}
	
	public void setContrase�a(String str) {
		this.contrase�a = str;
	}
	public String getContrase�a() {
		return this.contrase�a;
	}
	public void setLongitud(byte longitud) {
		this.longitud = longitud;
	}

}
