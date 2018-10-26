package com.radrian.ejerciciosPOO.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 3) Haz una clase llamada Password que siga las siguientes 
 * condiciones:
 * 
 * Que tenga los atributos longitud y contraseña . Por defecto, la longitud 
 * sera de 8.
 * 
 * Los constructores serán los siguiente:
 * Un constructor por defecto.
 * Un constructor con la longitud que nosotros le pasemos. Generara una 
 * 		contraseña aleatoria con esa longitud.
 * 
 * Los métodos que implementa serán:
 * esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte 
 * 				debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 
 * 				5 números.
 * generarPassword():  genera la contraseña del objeto con la longitud que 
 * 				tenga.
 * Método get para contraseña y longitud.
 * Método set para longitud.
 * 
 * Ahora, crea una clase clase ejecutable:
 * 
 * Crea un array de Passwords con el tamaño que tu le indiques por teclado.
 * Crea un bucle que cree un objeto para cada posición del array.
 * Indica también por teclado la longitud de los Passwords (antes de bucle).
 * Crea otro array de booleanos donde se almacene si el password del array de 
 * Password es o no fuerte (usa el bucle anterior).
 * 
 * Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). 
 * 
 * Usa este simple formato:
 * 
 * contraseña1 valor_booleano1
 * contraseña2 valor_bololeano2
 * 
 * @author RAdrian
 *
 */
public class Ejercicio03POO {
	
	public void metodo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ejercicio 03. Cuentas y Contraseñas.\n" + 
							"Para crear las cuentas, ingresa un número entre 5 y 10.");
		Ejercicio03_Password[] arrayDePasswords = new Ejercicio03_Password[sc.nextInt()];

		System.out.println("Ingresa un número entre 8 y 15, para la longitud de la contraseña");
		byte longitud = sc.nextByte();
		
		for (int i = 0; i < arrayDePasswords.length; i++) {
			Ejercicio03_Password pass = new Ejercicio03_Password(longitud);
			arrayDePasswords[i] =  pass;
		}
		
		boolean[] passwordFuerza = new boolean[arrayDePasswords.length];
		for (int i = 0; i < passwordFuerza.length; i++) {
			passwordFuerza[i] = arrayDePasswords[i].checarContraseña(arrayDePasswords[i].getContraseña());
		}
		System.out.println("Presiona Enter para arrojar los resultados de la evaluación de la contraseña");
		boolean scan = sc.hasNextLine();
		
		if (scan) {
			for (int i = 0; i < passwordFuerza.length; i++) {
				if (passwordFuerza[i] == true) {
					System.out.println("Contraseña" + (i+1) + ": " + arrayDePasswords[i].getContraseña() + ". SI es fuerte.");
				} else {
					System.out.println("Contraseña" + (i+1) + ": " + arrayDePasswords[i].getContraseña() + ". NO es fuerte.");
				}
			}
		}
		
		sc.close();
	}
	
	
}
