/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 17) Crea una aplicaci�n que nos pida un d�a de la semana y que nos
 * diga si es un dia laboral o no. Usa un switch para ello.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio17 {

	public void metodo() {
		System.out.println("Ingresa un d�a de la semana \n" +
							"(con min�sculas y sin acentos):");
		Scanner sc = new Scanner(System.in);
		String dia = sc.nextLine();
		
		diaSemana(dia);
		
		sc.close();
	}

	private void diaSemana(String dia) {
		
		switch (dia) {
		case "lunes":
			System.out.println(dia + " es d�a laboral");
			break;
		case "martes": 
			System.out.println(dia + " es d�a laboral");
			break;
		case "miercoles":
			System.out.println(dia + " es d�a laboral");
			break;
		case "jueves":
			System.out.println(dia + " es d�a laboral");
			break;
		case "viernes":
			System.out.println(dia + " es d�a laboral");
			break;
		case "sabado":
			System.out.println(dia + " no es d�a laboral");
			break;
		case "domingo":
			System.out.println(dia + " no es d�a laboral");
			break;
		default:
			System.out.println(dia + " no es un d�a v�lido");
		}
		
	}
}
