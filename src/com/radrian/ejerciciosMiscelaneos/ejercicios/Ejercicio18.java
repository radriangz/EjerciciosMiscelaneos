/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 18) Pide por teclado dos n�mero y genera 10 n�meros aleatorios
 * entre esos n�meros. Usa el m�todo Math.random para generar un n�mero entero
 * aleatorio (recuerda el casting de double a int).
 * 
 * @author RAdrian
 *
 */
public class Ejercicio18 {

	public void metodo() {

		System.out.println("Generador de n�meros aleatorios.\n"
				+ "Para generar los n�meros aleatorios debes ingresar dos n�meros enteros.\n"
				+ "Ingresa el primer n�mero entero.a");
		Scanner sc = new Scanner(System.in);
		int numA = Integer.parseInt(sc.nextLine());

		System.out.println("Ingresa el segundo n�mero entero.");
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
