/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 24) Recorre el String del ejercicio 22 y transforma cada carácter a
 * su código ASCII. Muestralos en linea recta, separados por un espacio entre
 * cada carácter.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio24 {

	public void metodo() {
		String line = "La lluvia en Sevilla es una maravilla";
		
		System.out.println("Presiona la tecla Enter para continuar.");
		Scanner sc = new Scanner(System.in);

		if (sc.hasNextLine()) {
			StringBuilder newLine = new StringBuilder();
			
			for (int i = 0; i < line.length(); i++) {
				newLine.append((int)line.charAt(i)).append(' ');
			}
			System.out.println(newLine.toString());
		}
		sc.close();
	}
}
