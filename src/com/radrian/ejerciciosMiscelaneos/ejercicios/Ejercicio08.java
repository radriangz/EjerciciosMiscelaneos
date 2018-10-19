package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 8) Modifica el ejercicio anterior, para que en lugar de pedir un 
 * n�mero, pida un car�cter (char) y muestre su c�digo en la tabla ASCII.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio08 {
	
	Scanner scan = new Scanner(System.in);
	
	/**
	 * El m�todo {@link metodoEjercicioOcho()} pide al usuario ingresar un 
	 * caracter del teclado, devolviendo en consola el valor ASCII del 
	 * caracter ingresado, en caso de ingresarse varios caracteres, s�lo
	 * se devuelve el c�digo ASCII del primer caracter.
	 * */
	public void metodoEjercicioOcho() {
		
		System.out.println("Ingresa un caracter del teclado. \nSe devolver� el valor en ASCII del primer caracter ingresado");
		System.out.println("");

		String sc = scan.nextLine();

		byte userInput = (byte) sc.charAt(0);
		System.out.println("El valor ASCII de " + sc.charAt(0) + " es: " + userInput + ".");
		
		//System.out.println((char) sc.charAt(0));
		
	}
	
}
