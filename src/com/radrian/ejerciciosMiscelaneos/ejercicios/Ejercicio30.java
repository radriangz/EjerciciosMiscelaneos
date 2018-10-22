/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 30) Convertir una frase a mayúsculas o minúsculas, que daremos
 * opción a que el usuario lo pida y mostraremos el resultado por pantalla.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio30 {

	public void metodo() {
		System.out.println("Introduce una frase.");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();

		System.out.println("Selecciona una opción.\n" + "1. Mayúsculas.\n" + "2. Minúsculas.");
		byte userChoice = Byte.parseByte(sc.nextLine());
		
		String result = upperOrLowerCase(userInput, userChoice);
		if (result != null) { 
			System.out.println("Resultado: " + result);
		}
		sc.close();
	}

	private String upperOrLowerCase(String userInput, byte userChoice) {
		String result = "";
			if (userChoice == 1) {
				result = userInput.toUpperCase();
			} else if (userChoice == 2) {
				result = userInput.toLowerCase();
			}
		return result;
	}
}
