/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 27) Crear una aplicaci�n que nos permite insertar n�meros hasta que
 * insertemos un -1. Calcular el numero de n�meros introducidos.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio27 {

	public void metodo() {
		boolean isDone = false;
		int count = 0;
		int input;
		
		System.out.println("\nIntroduce un n�mero entero." + 
							"\nIntroduce \"-1\" para iniciar el programa");
		Scanner sc = new Scanner(System.in);

		while (!isDone) {
			input = sc.nextInt();
			try {
				if (input != -1) {
					count++;
				} else {
					System.out.println("Introdujiste " + count + " n�meros");
				}

			} catch (Exception e) {
				System.out.println("\nNo ingresaste un n�mero v�lido.\n" + 
									"Ingresa un n�mero v�lido.");
				continue;
			}
		}
		isDone = false;
		sc.close();
	}
}
