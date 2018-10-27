package com.radrian.ejerciciosPOO.ejercicio03;

import java.util.Scanner;

/**
 * Ejercicio 3) Haz una clase llamada Password que siga las siguientes
 * condiciones:
 * 
 * Que tenga los atributos longitud y contrase�a . Por defecto, la longitud sera
 * de 8.
 * 
 * Los constructores ser�n los siguiente: Un constructor por defecto. Un
 * constructor con la longitud que nosotros le pasemos. Generara una contrase�a
 * aleatoria con esa longitud.
 * 
 * Los m�todos que implementa ser�n: esFuerte(): devuelve un booleano si es
 * fuerte o no, para que sea fuerte debe tener mas de 2 may�sculas, mas de 1
 * min�scula y mas de 5 n�meros. generarPassword(): genera la contrase�a del
 * objeto con la longitud que tenga. M�todo get para contrase�a y longitud.
 * M�todo set para longitud.
 * 
 * Ahora, crea una clase clase ejecutable:
 * 
 * Crea un array de Passwords con el tama�o que tu le indiques por teclado. Crea
 * un bucle que cree un objeto para cada posici�n del array. Indica tambi�n por
 * teclado la longitud de los Passwords (antes de bucle). Crea otro array de
 * booleanos donde se almacene si el password del array de Password es o no
 * fuerte (usa el bucle anterior).
 * 
 * Al final, muestra la contrase�a y si es o no fuerte (usa el bucle anterior).
 * 
 * Usa este simple formato:
 * 
 * contrase�a1 valor_booleano1 contrase�a2 valor_bololeano2
 * 
 * @author RAdrian
 *
 */
public class Ejercicio03 {

	public void metodo() {
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Ejercicio 03. Cuentas y Contrase�as.\n" + "Para crear las cuentas, ingresa un n�mero entre 5 y 10.");
		Password[] arrayDePasswords = new Password[sc.nextInt()];

		System.out.println("Ingresa un n�mero entre 8 y 15, para la longitud de la contrase�a");
		byte longitud = sc.nextByte();

		System.out.println("Presiona Enter para arrojar los resultados de la evaluaci�n de la contrase�a");
		boolean scan = sc.hasNextLine();
		boolean[] passwordFuerza = new boolean[arrayDePasswords.length];

		if (scan) {
			for (int i = 0; i < arrayDePasswords.length; i++) {
				Password pass = new Password(longitud);
				
				arrayDePasswords[i] = pass;
				passwordFuerza[i] = arrayDePasswords[i].esFuerte();
				
				if (passwordFuerza[i] == true) {
					System.out.println("Contrase�a" + (i + 1) + ": " + ". SI es fuerte.");
				} else {
					System.out.println("Contrase�a" + (i + 1) + ": " + ". NO es fuerte.");
				}

			}

		}

		sc.close();
	}

}
