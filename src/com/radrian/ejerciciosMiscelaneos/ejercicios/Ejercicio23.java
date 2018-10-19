package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 2323) Reemplaza todas las a del String anterior por una e.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio23 {

	public void metodo() {

		String line = "La lluvia en Sevilla es una maravilla.";
		char chr = 'e';

		// System.out.println("Ingrese cualquier dato con el teclado para comenzar.");
		Scanner sc = new Scanner(System.in);

		if (sc.hasNextLine()) {
			System.out.println(replaceChar(line, chr));
		} else {
			System.out.println("false");
		}
		sc.close();

	}

	private String replaceChar(String str, char chr) {
		char[] chArr = str.toCharArray();

		for (byte i = 0; i < chArr.length; ++i) {
			if (chArr[i] == 'a' || chArr[i] == 'e' || chArr[i] == 'i' || chArr[i] == 'o' || chArr[i] == 'u') {
				chArr[i] = 'e';
			}
		}
		str = String.copyValueOf(chArr);
		return str;
	}
}
