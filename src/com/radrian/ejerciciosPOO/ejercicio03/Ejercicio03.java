package com.radrian.ejerciciosPOO.ejercicio03;

import java.util.Scanner;

/**
 * Ejercicio 3) Haz una clase llamada Password que siga las siguientes
 * condiciones:
 * 
 * Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera
 * de 8.
 * 
 * Los constructores serán los siguiente: Un constructor por defecto. Un
 * constructor con la longitud que nosotros le pasemos. Generara una contraseña
 * aleatoria con esa longitud.
 * 
 * Los métodos que implementa serán: esFuerte(): devuelve un booleano si es
 * fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 1
 * minúscula y mas de 5 números. generarPassword(): genera la contraseña del
 * objeto con la longitud que tenga. Método get para contraseña y longitud.
 * Método set para longitud.
 * 
 * Ahora, crea una clase clase ejecutable:
 * 
 * Crea un array de Passwords con el tamaño que tu le indiques por teclado. Crea
 * un bucle que cree un objeto para cada posición del array. Indica también por
 * teclado la longitud de los Passwords (antes de bucle). Crea otro array de
 * booleanos donde se almacene si el password del array de Password es o no
 * fuerte (usa el bucle anterior).
 * 
 * Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior).
 * 
 * Usa este simple formato:
 * 
 * contraseña1 valor_booleano1 contraseña2 valor_bololeano2
 * 
 * @author RAdrian
 *
 */
public class Ejercicio03 {

	public void metodo() {
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Ejercicio 03. Cuentas y Contraseñas.\n" + "Para crear las cuentas, ingresa un número entre 5 y 10.");
		Password[] arrayDePasswords = new Password[sc.nextInt()];

		System.out.println("Ingresa un número entre 8 y 15, para la longitud de la contraseña");
		byte longitud = sc.nextByte();

		System.out.println("Presiona Enter para arrojar los resultados de la evaluación de la contraseña");
		boolean scan = sc.hasNextLine();
		boolean[] passwordFuerza = new boolean[arrayDePasswords.length];

		if (scan) {
			for (int i = 0; i < arrayDePasswords.length; i++) {
				Password pass = new Password(longitud);
				
				arrayDePasswords[i] = pass;
				passwordFuerza[i] = arrayDePasswords[i].esFuerte();
				
				if (passwordFuerza[i] == true) {
					System.out.println("Contraseña" + (i + 1) + ": " + ". SI es fuerte.");
				} else {
					System.out.println("Contraseña" + (i + 1) + ": " + ". NO es fuerte.");
				}

			}

		}

		sc.close();
	}

}
