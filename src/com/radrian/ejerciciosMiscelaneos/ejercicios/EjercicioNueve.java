/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 9) Lee un n�mero por teclado que pida el precio de un producto
 * (puede tener decimales) y calcule el precio final con IVA. El IVA sera una
 * constante del 21%.
 * 
 * @author RAdrian
 *
 */
public class EjercicioNueve {

	Scanner scan = new Scanner(System.in);

	/**
	 * El m�todo {@link metodoEjercicioNueve()} maneja una constante interna
	 * para el IVA, tiene un ciclo que al entrar, pide al usuario que ingrese
	 *  un valor num�rico que puede tener decimales, realiza una operaci�n
	 *  para calcular el precio final y devuelve en pantalla el precio ingresado,
	 *  el IVA y el precio final con IVA.
	 *  En caso de haber ingresado un caracter inv�lido, se regresa al inicio
	 *  del ciclo.
	 * 
	 * */
	public void metodoEjercicioNueve() {
		
		boolean isValid = false;
		final byte IVA = 21;
		
		System.out.println("En este ejercicio ingresa el precio de un producto, \nse devolver� el precio final con IVA (21%) inclu�do.\n");
		
	while (!isValid) {
		try {
			
			float price = scan.nextFloat();
			
			float ivaOfPrice = (IVA * price) / 100;
			
			System.out.println("\nPrecio: " + price + "\n" +
								"IVA: " + ivaOfPrice + "\n" + 
								"Precio final: " + (price + ivaOfPrice));
			isValid = true;
			
		} catch (Exception e) {
			System.out.println("Ingresa un valor v�lido");
			isValid = false;
			scan.nextLine();
		}
	}
		
		

		
		
	}
}
