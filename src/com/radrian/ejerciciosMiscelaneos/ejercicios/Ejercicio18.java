/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 18) Pide por teclado dos número y genera 10 números aleatorios
 * entre esos números. Usa el método Math.random para generar un número entero
 * aleatorio (recuerda el casting de double a int).
 * 
 * @author RAdrian
 *
 */
public class Ejercicio18 {

	public void metodo() {

		System.out.println("Generador de números aleatorios.\n"
				+ "Para generar los números aleatorios debes ingresar dos números enteros.\n"
				+ "Ingresa el primer número entero.a");
		Scanner sc = new Scanner(System.in);
		int numA = Integer.parseInt(sc.nextLine());

		System.out.println("Ingresa el segundo número entero.");
		int numB = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= 10; i++) {
			int randomNum = 0;

			if (numA < numB) {
				randomNum = randomGenerator(numA, numB);
			} else {
				randomNum = randomGenerator(numB, numA);
			}
			System.out.println("No. Aleatorio " + i + ": " + randomNum);
		}

		sc.close();
	}

	private int randomGenerator(int min, int max) {

		int randomNum = (int) (Math.random() * (max - min + 1) + min);
		return randomNum;

	}

}
