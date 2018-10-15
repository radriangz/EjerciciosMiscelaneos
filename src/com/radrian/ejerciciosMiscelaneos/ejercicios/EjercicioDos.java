/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import javax.swing.JOptionPane;

/**
 * Ejercicio 2) Declara 2 variables numéricas (con el valor que desees), e
 * indica cual es mayor de las dos. Si son iguales indícalo también. Ve
 * cambiando los valores para comprobar que funciona.
 * 
 * @author RAdrian
 *
 */
public class EjercicioDos implements IEjercicio {

	float valueA;
	float valueB;

	@Override
	public void input() {

		try {
			boolean isValueAssigned = false;

			while (!isValueAssigned) {

				try {
					String stringValues = JOptionPane.showInputDialog(null,
							"Introduce dos números separados por una \",\". ", "Ingresa los datos",
							JOptionPane.PLAIN_MESSAGE);
					String[] arr = stringValues.split(",", 5);

					valueA = Float.parseFloat(arr[1]);
					valueB = Float.parseFloat(arr[2]);

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,
							"No ingresó un número válido.\n Introduce dos números separados por una \",\".",
							"Error. Reingrese datos", JOptionPane.ERROR_MESSAGE);
					isValueAssigned = false;
				} catch (ArrayIndexOutOfBoundsException e) {
					JOptionPane.showMessageDialog(null,
							"No ingresó un número válido.\n Introduce dos números separados por una \",\".",
							"Error. Reingrese datos", JOptionPane.ERROR_MESSAGE);
					isValueAssigned = false;
				}
			}

		} catch (Exception e) {

		}

	}

	@Override
	public void output() {
		try {
			if (valueA < valueB) {
				JOptionPane.showConfirmDialog(null, valueA + " es menor que " + valueB, "Resultado",
						JOptionPane.PLAIN_MESSAGE);

			} else if (valueA > valueB) {
				JOptionPane.showConfirmDialog(null, valueA + " es mayor que " + valueB, "Resultado",
						JOptionPane.PLAIN_MESSAGE);

			} else if (valueA == valueB) {
				JOptionPane.showConfirmDialog(null, valueA + " es igual que " + valueB, "Resultado",
						JOptionPane.PLAIN_MESSAGE);
			}
		} catch (Exception e) {

		}

	}

}
