package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 21) Muestra los números primos entre 1 y 100.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio21 {
	
	public void metodo() {
		Ejercicio20 ej20 = new Ejercicio20();
		
		System.out.println("Para obtener los números primos entre 1 y 10," + 
							"\nIngrese cualquier dato con el teclado para comenzar.");
		Scanner sc = new Scanner(System.in);
		
		if (sc.hasNext()) {
			for (byte i = 1; i <= 100; i++) {
				boolean isPrimo = ej20.numeroPrimo(i);
				if (isPrimo) {
					System.out.println(i);
				}
			}
		}
		sc.close();
		
	}
	
}
