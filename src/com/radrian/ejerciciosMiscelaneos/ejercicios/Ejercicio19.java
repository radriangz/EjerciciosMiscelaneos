/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * 19) Pide por teclado un número entero positivo (debemos controlarlo) y 
 * muestra  el número de cifras que tiene. 
 * Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos 
 * que controlar si tiene una o mas cifras, al mostrar el mensaje.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio19 {
	
	public void metodo() {
		System.out.println("Introduce un número entero positivo.");
		Scanner sc = new Scanner(System.in);
		int inputLenght = sc.next().length();
		
		System.out.println("El número ingresado tiene " + inputLenght + " cifras");
		
		sc.close();
	}

}
