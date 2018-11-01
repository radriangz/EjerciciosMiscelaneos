/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 14) Realiza una aplicaci�n que nos calcule una ecuaci�n de segundo
 * grado. Debes pedir las variables a, b y c por teclado y comprobar antes que
 * el discriminante (operaci�n en la ra�z cuadrada). Para la ra�z cuadrada usa
 * el m�todo sqlrt de Math. Te recomiendo que uses mensajes de traza.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio14 {

	public void metodoEjercicioCatorce() {

		System.out.println("\nResoluci�n de ecuaci�n de segundo grado." + "\n" + "Ingresa un valor num�rico para \'a\'");
		Scanner sc = new Scanner(System.in);

		float valorA = Float.parseFloat(sc.nextLine());

		System.out.println("\na = " + valorA);
		System.out.println("Ingresa un valor num�rico para \'b\'");
		float valorB = Float.parseFloat(sc.nextLine());

		System.out.println("\na = " + valorA);
		System.out.println("b = " + valorB);
		System.out.println("Ingresa un valor num�rico para \'c\'");
		float valorC = Float.parseFloat(sc.nextLine());

		float negB = valorB * -1f;
		float squareRootB = (float) Math.pow(valorB, valorB);//valorB * valorB;
		float valor4ac = (valorA * valorC) * 4;
		float b24ac = (squareRootB - valor4ac);
		double raiz = Math.pow(b24ac, 0.5);

		float valorX1 = (negB + (float) (raiz)) / (valorA * 2);
		float valorX2 = (negB - (float) (raiz)) / (valorA * 2);

		if (Float.isNaN(valorX1)) {
			System.out.println("\nLa ecuaci�n no tiene soluci�n");

		} else {
			System.out.println();
			System.out.println("x1 = " + valorX1);
			System.out.println("x2 = " + valorX2);

		}
		sc.close();
	}

}
