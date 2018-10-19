/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 16) Escribe una aplicaci�n con un String que contenga una
 * contrase�a cualquiera. Despu�s se te pedir� que introduzcas la contrase�a,
 * con 3 intentos. Cuando aciertes ya no pedir� mas la contrase�a y mostrara un
 * mensaje diciendo �Enhorabuena�. Piensa bien en la condici�n de salida (3
 * intentos y si acierta sale, aunque le queden intentos).
 * 
 * @author RAdrian
 *
 */
public class Ejercicio16 {

	private final String passCode = "Contrase�a123";

	public void metodo() {

		Scanner sc = new Scanner(System.in);
		String userInput = "";

		byte intento = 1;

		while (intento < 4) {
			System.out.println("Ingresa la contrase�a:");
			userInput = sc.nextLine();

			if (passCode.equals(userInput)) {
				System.out.println("Enhorabuena");
				break;
			} else {
				if((3 - intento) == 0) {
					System.out.println("Se ha quedado sin intentos.");
				} else {
					System.out.println("La contrase�a es incorrecta. Le quedan " + (3 - intento) + " intentos. \nIntente de nuevo.");
				}
				intento++;
			}
		}
		sc.close();
	}
}