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

//	public void metodoEjercicioSiete() {
//		final byte MINIMO_ASCCI_IMPRIMIBLE = 32;
//		final byte MAXIMO_ASCII_IMPRIMIBLE = 126;
//
//		boolean invalidNum = true;
//
//		while (invalidNum) {
//			int userInputNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número del 0 al 127"));
//
//			if (userInputNumber >= MINIMO_ASCCI_IMPRIMIBLE && userInputNumber <= MAXIMO_ASCII_IMPRIMIBLE) {
//				invalidNum = false;
//				JOptionPane.showMessageDialog(null, new Character((char) userInputNumber), "Resultado",
//						JOptionPane.INFORMATION_MESSAGE);
//			} else {
//				JOptionPane.showInternalMessageDialog(null, "Caracter no imprimible", "Error",
//						JOptionPane.ERROR_MESSAGE);
//			}
//		}
//	}
	
	public void metodoEjercicioSieteDos() {
		final byte MINIMO_ASCCI_IMPRIMIBLE = 32;
		final byte MAXIMO_ASCII_IMPRIMIBLE = 126;

		boolean invalidNum = true;

		while (invalidNum) {
			int userInputNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número del 0 al 127"));

			if (userInputNumber >= MINIMO_ASCCI_IMPRIMIBLE && userInputNumber <= MAXIMO_ASCII_IMPRIMIBLE) {
				invalidNum = false;
				JOptionPane.showMessageDialog(null, new Character((char) userInputNumber), "Resultado",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showInternalMessageDialog(null, "Caracter no imprimible", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

}
