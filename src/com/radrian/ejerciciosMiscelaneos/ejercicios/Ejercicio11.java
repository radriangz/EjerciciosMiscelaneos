package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * @author RAdrian
 *
 */
public class Ejercicio11 {

	public void metodoEjercicioOnce() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Presione cualquier tecla para iniciar cuenta del 1 al 100...");

		String input = sc.nextLine();

		if (input != null) {
			for (int i = 1; i <= 100; ++i) {
				System.out.println(i);
			}
		} 
		
		sc.close();
	}

}
