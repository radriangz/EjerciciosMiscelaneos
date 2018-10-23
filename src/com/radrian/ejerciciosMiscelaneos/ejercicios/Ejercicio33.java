/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 33) Dada una cadena, extraer la cuarta y quinta letra usando el 
 * método substring.
 * 
 * @author RAdrian
 */
public class Ejercicio33 {
	
	public void metodo() {
		System.out.println("\nIngresa una frase corta.");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String append01 = input.substring(0, 3);
		String append02 = input.substring(5);
		StringBuilder result = new StringBuilder();
		System.out.println(result.append(append01).append(append02));
		
		sc.close();
	}
}
