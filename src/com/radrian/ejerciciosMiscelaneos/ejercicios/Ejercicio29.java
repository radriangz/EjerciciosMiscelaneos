/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 29) Pedir al usuario que nos escriba frases de forma infinita hasta
 * que insertemos una cadena vacia. Mostrar la cadena resultante.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio29 {
	public void metodo() {
		boolean isDone = false;
		int count = 1;
		StringBuilder output = new StringBuilder();

		
		System.out.println("Instrucciones;\n" + "Introduce una frase.\n" + "Deja la línea vacía para terminar");
		Scanner sc = new Scanner(System.in);

		while (!isDone) {
			String input = sc.nextLine();
			if (input == null || input.equals("")) {
				System.out.println("Resultado:\n" + output.toString());
				isDone = true;
			} else {
				output.append(count +". " +input + "\n");
				System.out.println("\nIntroduce otra frase.");
				count++;
			}
		}
		sc.close();
	}
}
