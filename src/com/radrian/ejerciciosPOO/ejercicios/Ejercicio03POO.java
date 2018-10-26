/**
 * 
 */
package com.radrian.ejerciciosPOO.ejercicios;

import java.util.Scanner;

/**
 * @author RAdrian
 *
 */
public class Ejercicio03POO {
	
	public void metodo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ejercicio 03. Cuentas y Contrase�as.\n" + 
							"Para crear las cuentas, ingresa un n�mero entre 5 y 10.");
		Ejercicio03_Password[] arrayDePasswords = new Ejercicio03_Password[sc.nextInt()];

		System.out.println("Ingresa un n�mero entre 8 y 15, para la longitud de la contrase�a");
		byte longitud = sc.nextByte();
		
		for (int i = 0; i < arrayDePasswords.length; i++) {
			Ejercicio03_Password pass = new Ejercicio03_Password(longitud);
			arrayDePasswords[i] =  pass;
		}
		
		boolean[] passwordFuerza = new boolean[arrayDePasswords.length];
		for (int i = 0; i < passwordFuerza.length; i++) {
			passwordFuerza[i] = arrayDePasswords[i].checarContrase�a(arrayDePasswords[i].getContrase�a());
		}
		System.out.println("Presiona Enter para arrojar los resultados de la evaluaci�n de la contrase�a");
		boolean scan = sc.hasNextLine();
		
		if (scan) {
			for (int i = 0; i < passwordFuerza.length; i++) {
				if (passwordFuerza[i] == true) {
					System.out.println("Contrase�a" + (i+1) + ": " + arrayDePasswords[i].getContrase�a() + ". SI es fuerte.");
				} else {
					System.out.println("Contrase�a" + (i+1) + ": " + arrayDePasswords[i].getContrase�a() + ". NO es fuerte.");
				}
			}
		}
		
		sc.close();
	}
	
	
}
