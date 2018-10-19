/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 15) Lee un número por teclado y comprueba que este numero es mayor
 * o igual que cero, si no lo es lo volverá a pedir (do while), después muestra
 * ese número por consola.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio15 {

	public void metodoQuince() {
		Scanner sc = new Scanner(System.in);
		boolean isCorrect = false;

		do {
			System.out.println("Ingresa un número:\n");
			
			try {
				float userInput = Float.parseFloat(sc.nextLine());
				
				if (userInput == 0f) {
					System.out.println(userInput + " es igual que cero.");
					isCorrect = true;
				} else if (userInput > 0f) {
					System.out.println(userInput + " es mayor que cero.\n");
					isCorrect = true;
				} else if (userInput < 0f) {
					System.out.println("El valor ingresado no es válido");
				} else if (Float.isNaN(userInput)) {
					System.out.println("El valor ingresado no es válido");
				}
			} catch (Exception e) {
				System.out.println("El valor ingresado no es válido");
			}

		} while (!isCorrect);

		sc.close();
	}

}
