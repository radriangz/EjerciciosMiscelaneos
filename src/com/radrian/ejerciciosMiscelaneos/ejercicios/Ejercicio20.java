/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 20) Pide un número por teclado e indica si es un número primo o no.
 * Un número primo es aquel solo puede dividirse entre 1 y si mismo. 
 * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 
 * 17 si es primo. 
 * 
 * Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que
 * si es divisible desde ese numero hasta 1.
 * 
 * NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio20 {
	
	public void metodo() {
		System.out.println("Introduce un número entero positivo.");
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		
		boolean isPrimo = numeroPrimo(input);
		
		if (isPrimo) {
			System.out.println("El número " + input + " es primo.");
		} else {
			System.out.println("El número " + input + " no es primo.");
		}
				
		sc.close();
	}
	
	public boolean numeroPrimo(int num) {
		if (num <= 1) {
			return false;
		} else if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0 && num % 11 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
