/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 10) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.

 * @author RAdrian
 *
 */
public class Ejercicio10 {
	
	public void metodoEjercicioDiez() {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("\nDel 1 al 100, presiona cualquier tecla para comenzar.");
		
		String input = scan.nextLine();
		
		if (input != null) {
			byte i = 0;
			
			while (i <= 100) {
				System.out.println(i);
				++i;
			}
		}
		scan.close();
	}

}
