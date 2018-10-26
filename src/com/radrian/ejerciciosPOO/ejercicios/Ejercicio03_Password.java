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
		this.contraseña = generarContraseña(this.longitud);
	}
	
	public Ejercicio03_Password(byte longitud) {
		this.longitud = longitud;
		this.contraseña = generarContraseña(longitud);
	}
	
	public Ejercicio03_Password(byte longitud, String contraseña) {
		//super();
		this.longitud = longitud;
		this.contraseña = contraseña;
	}

	public boolean esFuerte() {
		byte minus = 0;
		byte mayus = 0;
		byte numeros = 0;
		char[] arr = this.contraseña.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (Character.isUpperCase(arr[i])) {
				mayus++;
			} else if (Character.isLowerCase(arr[i])) {
				minus++;
			} else if(Character.isDigit(arr[i])) {
				numeros++;
			}
		}
		return comprobarContraseña(minus, mayus, numeros);

	}

	private boolean comprobarContraseña(byte minus, byte mayus, byte numeros) {
		if (minus >= 1 && mayus >= 2 && numeros >= 5) {
			return true;
		} else {
			return false;
		}
	}

	public String generarContraseña(byte longitud) {
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
	
	public void setContraseña(String str) {
		this.contraseña = str;
	}
	public byte getLongitud() {
		return this.longitud;
	}
	public void setLongitud(byte longt) {
		this.longitud = longt;
	}

}
