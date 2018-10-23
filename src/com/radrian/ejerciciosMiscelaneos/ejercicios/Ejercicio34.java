package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 34) Dada una frase, separarlo en palabras.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio34 {
	
	public void metodo() {
		System.out.println("\nIngresa una frase. Presiona enter al terminar");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] result = input.split(" ");
		
		for (int i = 0; i < result.length; i++) {
			System.out.println((i+1) + ". " + result[i] + ".");
		}
		
		sc.close();
	}

}
