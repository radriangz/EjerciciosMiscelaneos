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
		
		System.out.println("Ejercicio 03. Cuentas y Contraseñas.\n" + 
							"Para crear las cuentas, ingresa un número entre 5 y 10.");
		Ejercicio03_Password[] arrayDePasswords = new Ejercicio03_Password[sc.nextInt()];

		System.out.println("Ingresa un número entre 8 y 15, para la longitud de la contraseña");
		byte longitud = sc.nextByte();
		
		for (int i = 0; i < arrayDePasswords.length; i++) {
			Ejercicio03_Password pass = new Ejercicio03_Password(longitud);
			arrayDePasswords[i] =  pass;
		}
		
		boolean[] passwordFuerza = new boolean[arrayDePasswords.length];
		for (int i = 0; i < passwordFuerza.length; i++) {
			passwordFuerza[i] = arrayDePasswords[i].checarContraseña(arrayDePasswords[i].getContraseña());
		}
		System.out.println("Presiona Enter para arrojar los resultados de la evaluación de la contraseña");
		boolean scan = sc.hasNextLine();
		
		if (scan) {
			for (int i = 0; i < passwordFuerza.length; i++) {
				if (passwordFuerza[i] == true) {
					System.out.println("Contraseña" + (i+1) + ": " + arrayDePasswords[i].getContraseña() + ". SI es fuerte.");
				} else {
					System.out.println("Contraseña" + (i+1) + ": " + arrayDePasswords[i].getContraseña() + ". NO es fuerte.");
				}
			}
		}
		
		sc.close();
	}
	
	
}
