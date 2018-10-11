/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

/**
 * Ejercicio 2) 
 * Declara 2 variables numéricas (con el valor que desees), 
 * e indica cual es mayor de las dos. Si son iguales indícalo también. 
 * Ve cambiando los valores para comprobar que funciona.
 * 
 * @author RAdrian
 *
 */
public class EjercicioDos {
	
	public void metodoEjercicioDos(float valorA, float valorB) {
		if(valorA < valorB) {
			System.out.println(valorA + " es menor que " + valorB);
		} else if (valorA > valorB) {
			System.out.println(valorA + " es mayor que " + valorB);
		} else if (valorA == valorB) {
			System.out.println(valorA + " es igual que " + valorB);
		}
		
	}
	
}
