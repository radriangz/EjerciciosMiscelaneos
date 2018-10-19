/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 16) Escribe una aplicación con un String que contenga una
 * contraseña cualquiera. Después se te pedirá que introduzcas la contraseña,
 * con 3 intentos. Cuando aciertes ya no pedirá mas la contraseña y mostrara un
 * mensaje diciendo “Enhorabuena”. Piensa bien en la condición de salida (3
 * intentos y si acierta sale, aunque le queden intentos).
 * 
 * @author RAdrian
 *
 */
public class Ejercicio16 {

	private final String passCode = "Contraseña123";

	public void metodo() {

		Scanner sc = new Scanner(System.in);
		String userInput = "";

		byte intento = 1;

		while (intento < 4) {
			System.out.println("Ingresa la contraseña:");
			userInput = sc.nextLine();

			if (passCode.equals(userInput)) {
				System.out.println("Enhorabuena");
				break;
			} else {
				if((3 - intento) == 0) {
					System.out.println("Se ha quedado sin intentos.");
				} else {
					System.out.println("La contraseña es incorrecta. Le quedan " + (3 - intento) + " intentos. \nIntente de nuevo.");
				}
				intento++;
			}
		}
		sc.close();
	}
}