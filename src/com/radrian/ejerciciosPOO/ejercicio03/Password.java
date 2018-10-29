/**
 * 
 */
package com.radrian.ejerciciosPOO.ejercicio03;

import java.util.Random;

/**
 * @author RAdrian
 *
 */
public class Password {
	private byte longitud = 8;
	private String contrase�a;

	public Password() {
		this.contrase�a = generarContrase�a(this.longitud);
	}
	
	public Password(byte longitud) {
		this.longitud = longitud;
		this.contrase�a = generarContrase�a(longitud);
	}
	
	public Password(byte longitud, String contrase�a) {
		//super();
		this.longitud = longitud;
		this.contrase�a = contrase�a;
	}

	public boolean esFuerte() {
		byte minus = 0;
		byte mayus = 0;
		byte numeros = 0;
		char[] arr = this.contrase�a.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (Character.isUpperCase(arr[i])) {
				mayus++;
			} else if (Character.isLowerCase(arr[i])) {
				minus++;
			} else if(Character.isDigit(arr[i])) {
				numeros++;
			}
		}
		return comprobarContrase�a(minus, mayus, numeros);

	}

	private boolean comprobarContrase�a(byte minus, byte mayus, byte numeros) {
		if (minus >= 1 && mayus >= 2 && numeros >= 5) {
			return true;
		} else {
			return false;
		}
	}

	public String generarContrase�a(byte longitud) {
		StringBuilder str = new StringBuilder();
		for (byte i = 0; i<longitud ; i++) {
				str.append(randomChar());
		}
		return str.toString();
	}
	
	private char randomChar() {
		String mayusAlpabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstucwxyz012345678901234567890123456789";
		Random rand = new Random();
		return mayusAlpabet.charAt(rand.nextInt(mayusAlpabet.length()));
	}
	
	public void setContrase�a(String str) {
		this.contrase�a = str;
	}
	public byte getLongitud() {
		return this.longitud;
	}
	public void setLongitud(byte longt) {
		this.longitud = longt;
	}

}