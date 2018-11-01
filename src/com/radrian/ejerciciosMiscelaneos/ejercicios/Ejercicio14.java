/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 14) Realiza una aplicación que nos calcule una ecuación de segundo
 * grado. Debes pedir las variables a, b y c por teclado y comprobar antes que
 * el discriminante (operación en la raíz cuadrada). Para la raíz cuadrada usa
 * el método sqlrt de Math. Te recomiendo que uses mensajes de traza.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio14 {

	public void metodoEjercicioCatorce() {

		System.out.println("\nResolución de ecuación de segundo grado." + "\n" + "Ingresa un valor numérico para \'a\'");
		Scanner sc = new Scanner(System.in);

		float valorA = Float.parseFloat(sc.nextLine());

		System.out.println("\na = " + valorA);
		System.out.println("Ingresa un valor numérico para \'b\'");
		float valorB = Float.parseFloat(sc.nextLine());

		System.out.println("\na = " + valorA);
		System.out.println("b = " + valorB);
		System.out.println("Ingresa un valor numérico para \'c\'");
		float valorC = Float.parseFloat(sc.nextLine());

		float negB = valorB * -1f;
		float squareRootB = (float) Math.pow(valorB, valorB);//valorB * valorB;
		float valor4ac = (valorA * valorC) * 4;
		float b24ac = (squareRootB - valor4ac);
		double raiz = Math.pow(b24ac, 0.5);

		float valorX1 = (negB + (float) (raiz)) / (valorA * 2);
		float valorX2 = (negB - (float) (raiz)) / (valorA * 2);

		if (Float.isNaN(valorX1)) {
			System.out.println("\nLa ecuación no tiene solución");

		} else {
			System.out.println();
			System.out.println("x1 = " + valorX1);
			System.out.println("x2 = " + valorX2);

		}
		sc.close();
	}

}
