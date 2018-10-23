/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * 32) Pedir dos palabras por teclado, indicar si son iguales.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio32 {
	
	public void metodo() {
		System.out.println("Se van a comparar dos parablas.\n" +
							"Ingresa la primer palabra.");
		Scanner sc = new Scanner(System.in);
		String palabra01 = sc.nextLine();
		
		System.out.println("\nIngresa la segunda palabra.");
		String palabra02 = sc.nextLine();
		
		if (palabra01.equals(palabra02)) {
			System.out.println("¡\nLas palabras ingresadas son iguales!");
		} else {
			System.out.println("\nLas palabras ingresadas no son iguales.");
		}
		
		sc.close();
	}
}
