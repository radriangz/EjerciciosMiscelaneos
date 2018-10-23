/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 31) Mostrar la longitud de una cadena.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio31 {
	
	public void metodo() {
		System.out.println("Ingresa una frase, presiona enter para continuar.");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.println("Tu frase tiene " + (int)input.length() + " caracteres.");
		
		sc.close();
	}
	
}
