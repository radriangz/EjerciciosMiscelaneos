/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 27) Crear una aplicación que nos permite insertar números hasta que
 * insertemos un -1. Calcular el numero de números introducidos.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio27 {

	public void metodo() {
		boolean isDone = false;
		int count = 0;
		int input;
		
		System.out.println("\nIntroduce un número entero." + 
							"\nIntroduce \"-1\" para iniciar el programa");
		Scanner sc = new Scanner(System.in);

		while (!isDone) {
			input = sc.nextInt();
			try {
				if (input != -1) {
					count++;
				} else {
					System.out.println("Introdujiste " + count + " números");
				}

			} catch (Exception e) {
				System.out.println("\nNo ingresaste un número válido.\n" + 
									"Ingresa un número válido.");
				continue;
			}
		}
		isDone = false;
		sc.close();
	}
}
