/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 28) Eliminar los espacios de una frase pasada por consola por el 
 * usuario.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio28 {
	
	public void metodo () {
		System.out.println("\nIntroduce una frase.");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		StringBuilder output = new StringBuilder();
		
		for(int i = 0; i < userInput.length(); i++ ) {
			if (userInput.charAt(i) != ' ') {
				output.append(userInput.charAt(i));
			} else {
				continue;
			}
		}
		System.out.println("\nLa misma frase, pero sin espacios:\n" + output);
		sc.close();
	}

}
