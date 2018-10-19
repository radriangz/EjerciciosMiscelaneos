/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 13) Realiza una aplicaci�n que nos pida un n�mero de ventas a
 * introducir, despu�s nos pedir� tantas ventas por teclado como n�mero de
 * ventas se hayan indicado. Al final mostrara la suma de todas las ventas.
 * Piensa que es lo que se repite y lo que no.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio13 {

	public void metodoEjercicioTrece() {

		float totalVentas = 0.0f;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa un n�mero de ventas");
		byte inputVenta = Byte.parseByte(sc.nextLine());
		
		float[] arr = new float[inputVenta];

		for (byte i = 0; i < inputVenta; i++) {
			System.out.println("Ingresa venta " + (i+1));
			totalVentas += Float.parseFloat(sc.nextLine());
		}

		for (byte i = 0; i < arr.length; ++i) {
			totalVentas += arr[i];
		}

		System.out.println("\nLa suma total de las ventas es de: " + totalVentas);

		sc.close();
	}
}
