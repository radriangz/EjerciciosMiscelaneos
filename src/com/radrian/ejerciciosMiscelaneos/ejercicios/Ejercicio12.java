/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

/**
 * Ejercicio 12) Muestra los números del 1 al 100 (ambos incluidos) divisibles
 * entre 2 y 3. Utiliza el bucle que desees.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio12 {

	public void metodoEjercicioDoce() {

		System.out.println("Presione cualquier tecla para iniciar cuenta del 1 al 100...");

		for (int i = 1; i <= 100; ++i) {

			if (i % 2 == 0 & i % 3 == 0) {

				System.out.println(i);

			}
		}

	}

}
