package com.radrian.ejerciciosMiscelaneos.ejercicios;

import javax.swing.JOptionPane;

/**
 * Ejercicio 7) Lee un número por teclado y muestra por consola, el carácter al
 * que pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre
 * una a.
 * 
 * @author RAdrian
 *
 */
public class EjercicioSiete {

	public void metodoEjercicioSiete() {
		try {

			boolean isValidNumber = false;

			byte number = Byte.parseByte(JOptionPane.showInputDialog(null, "Introduce un número del 0 al 127.",
					"Captura", JOptionPane.PLAIN_MESSAGE));

			final byte MIN_NUM_ASCII = 32;
			final byte MAX_NUM_ASCII = 126;

			while (isValidNumber == false) {
				if (number >= MIN_NUM_ASCII && number <= MAX_NUM_ASCII) {
					JOptionPane.showMessageDialog(null,
							"El caracter ASCII del valor que ingresaste es: " + "\"" + (char) number + "\"", "Mensaje",
							JOptionPane.INFORMATION_MESSAGE);
					isValidNumber = true;
				} else {
					number = Byte.parseByte(JOptionPane.showInputDialog(null,
							"El caracter ASCII del valor que ingresaste \nno se puede imprimir.\nIgresa otro número.",
							"Warning", JOptionPane.WARNING_MESSAGE));
				}
			}
		} catch (Exception e) {
			//Se controla el error.
		}
	}

	// public void metodoEjercicioSieteSeth() {
	// final byte MINIMO_ASCCI_IMPRIMIBLE = 32;
	// final byte MAXIMO_ASCII_IMPRIMIBLE = 126;
	//
	// int userInputNumber = -1;
	// boolean isInvalidNum = true;
	//
	// while (isInvalidNum) {
	// userInputNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un
	// número del 0 al 127"));
	//
	// if (userInputNumber >= MINIMO_ASCCI_IMPRIMIBLE && userInputNumber <=
	// MAXIMO_ASCII_IMPRIMIBLE) {
	// isInvalidNum = false;
	// JOptionPane.showMessageDialog(null, new Character((char) userInputNumber),
	// "Resultado",
	// JOptionPane.INFORMATION_MESSAGE);
	// } else {
	// JOptionPane.showInternalMessageDialog(null, "Caracter no imprimible",
	// "Error",
	// JOptionPane.ERROR_MESSAGE);
	// }
	// }
	// }

}
