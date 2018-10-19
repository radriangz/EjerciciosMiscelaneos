/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 15) Lee un n�mero por teclado y comprueba que este numero es mayor
 * o igual que cero, si no lo es lo volver� a pedir (do while), despu�s muestra
 * ese n�mero por consola.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio15 {

	public void metodoQuince() {
		Scanner sc = new Scanner(System.in);
		boolean isCorrect = false;

		do {
			System.out.println("Ingresa un n�mero:\n");
			
			try {
				float userInput = Float.parseFloat(sc.nextLine());
				
				if (userInput == 0f) {
					System.out.println(userInput + " es igual que cero.");
					isCorrect = true;
				} else if (userInput > 0f) {
					System.out.println(userInput + " es mayor que cero.\n");
					isCorrect = true;
				} else if (userInput < 0f) {
					System.out.println("El valor ingresado no es v�lido");
				} else if (Float.isNaN(userInput)) {
					System.out.println("El valor ingresado no es v�lido");
				}
			} catch (Exception e) {
				System.out.println("El valor ingresado no es v�lido");
			}

		} while (!isCorrect);

		sc.close();
	}

}
