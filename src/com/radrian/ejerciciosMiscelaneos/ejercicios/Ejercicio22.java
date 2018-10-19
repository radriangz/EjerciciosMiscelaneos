package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 22) Del siguiente String “La lluvia en Sevilla es una maravilla”
 * cuenta cuantas vocales hay en total (recorre el String con charAt).
 * 
 * @author RAdrian
 *
 */

public class Ejercicio22 {

	public void metodo() {
		String line = "La lluvia en Sevilla es una maravilla";
		byte vowels = 0;

		System.out.println("Ingrese cualquier dato con el teclado para comenzar.");
		Scanner sc = new Scanner(System.in);

		if (sc.hasNext()) {
				vowels = countVowels(line);
			}

		System.out.println("En \"La lluvia en Sevilla es una maravilla\", hay " + vowels + " vocales");
		sc.close();

		}

	private byte countVowels(String str) {
		byte count = 0;

		char[] chArr = str.toCharArray();
		
		for (byte i = 0; i < chArr.length; ++i) {
			if (chArr[i] == 'a' || chArr[i] == 'e' || chArr[i] == 'i' || chArr[i] == 'o' || chArr[i] == 'u') {
				count++;
			}
		}
		return count;
	}
}