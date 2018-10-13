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

		int userInputNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número del 0 al 127"));
		boolean invalidNum = true;
		
		if (userInputNumber > 32 && userInputNumber < 127) {
			JOptionPane.showM //(null, System.out.println((char) userInputNumber), messageType);;
		} 
		
		while (invalidNum == true) {
			JOptionPane.showInternalMessageDialog(null, "Caracter no imprimible", "Error", JOptionPane.ERROR_MESSAGE);
			
		}

	}

}
