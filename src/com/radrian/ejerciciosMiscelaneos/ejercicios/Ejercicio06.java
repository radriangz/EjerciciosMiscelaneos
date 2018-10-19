package com.radrian.ejerciciosMiscelaneos.ejercicios;

import javax.swing.JOptionPane;

/**
 * Ejercicio 6) Lee un número por teclado e indica si es divisible entre 2
 * (resto = 0). Si no lo es, también debemos indicarlo.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio06 {

	public void metodoEjercicioSeis() {
		String userInputNumber = JOptionPane.showInputDialog("Ingresa un número");
		if (userInputNumber != null) {
			float divisibleByTwo = Float.parseFloat(userInputNumber) % 2;
			if (divisibleByTwo == 0) {
				JOptionPane.showMessageDialog(null, userInputNumber + " es divisible entre dos.");

			} else if (divisibleByTwo != 0){
				JOptionPane.showMessageDialog(null, userInputNumber + " no es divisible entre dos.");
			}
		}
	}

}
