/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import javax.swing.JOptionPane;

import interfaces.IEjercicio;

/**
 * Ejercicio 2) Declara 2 variables numéricas (con el valor que desees), e
 * indica cual es mayor de las dos. Si son iguales indícalo también. Ve
 * cambiando los valores para comprobar que funciona.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio02 implements IEjercicio {

	private float valueA;
	private float valueB;

	/**
	 * El método {@link input()} se hereda de la interfaz IEjercicio. Input es obligatorio de implementar,
	 * cada clase debe tener un método de entrada, el comportamiento de input varía 
	 * según los requerimientos del ejercicio.
	 * 
	 * */
	@Override
	public void input() {
		
		boolean isValueAssigned = false;

		try {

			while (!isValueAssigned) {

				try {
					String stringValues = JOptionPane.showInputDialog(null,
							"Introduce dos números separados por una \",\". ", "Ingresa los datos",
							JOptionPane.PLAIN_MESSAGE);
					String[] arr = stringValues.split(",", 5);
					
					valueA = Float.parseFloat(arr[0]);
					valueB = Float.parseFloat(arr[1]);
					
					isValueAssigned = true;

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
				} catch (NullPointerException e) {
					JOptionPane.showMessageDialog(null,
							"No ingresó un número válido.\n Introduce dos números separados por una \",\".",
							"Error. Reingrese datos", JOptionPane.ERROR_MESSAGE);
					isValueAssigned = false;
				}
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"No ingresó un número válido.\n Introduce dos números separados por una \",\".",
					"Error. Reingrese datos", JOptionPane.ERROR_MESSAGE);
			isValueAssigned = false;
		}

	}

	/**
	 * El método {@link output()} se hereda de la interfaz IEjercicio. Output es obligatorio de implementar,
	 * cada clase debe tener un método de salida, el comportamiento de output varía según los requerimientos 
	 * del ejercicio.
	 * 
	 * Para {@link Ejercicio02} output usa un try, para realizar la comparación entre valorA y valorB,
	 * mostrando en pantalla una ventana de confirmación de JOptionPane con el resultado de la comparación,
	 * tiene además un catch que captura errores.
	 *  
	 * 
	 * */
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
				JOptionPane.showConfirmDialog(null, valueA + " es igual a " + valueB, "Resultado",
						JOptionPane.PLAIN_MESSAGE);
			}
		} catch (Exception e) { 
			e.printStackTrace();
		}

	}

}
