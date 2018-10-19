/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 26) Realizar la suma del 1 al numero que indiquemos, este debe 
 * ser mayor que 1.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio26 {
	
	public void metodo() {
		int output = 0;
		
		System.out.println("\nIngresa un número mayor que uno.");
		Scanner sc = new Scanner(System.in);
		int userInput = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < userInput; i++) {
			output += i;		
		}
		
		System.out.println("\nLa suma de 1 al número que indicaste (" + userInput + ") es: " + output + ".");
		
		sc.close();
	}
}
