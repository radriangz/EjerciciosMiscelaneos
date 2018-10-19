/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import javax.swing.JOptionPane;

import interfaces.IEjercicio;

/**
 * Ejercicio 2) Declara 2 variables num�ricas (con el valor que desees), e
 * indica cual es mayor de las dos. Si son iguales ind�calo tambi�n. Ve
 * cambiando los valores para comprobar que funciona.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio02 implements IEjercicio {

	private float valueA;
	private float valueB;

	/**
	 * El m�todo {@link input()} se hereda de la interfaz IEjercicio. Input es obligatorio de implementar,
	 * cada clase debe tener un m�todo de entrada, el comportamiento de input var�a 
	 * seg�n los requerimientos del ejercicio.
	 * 
	 * */
	@Override
	public void input() {
		
		boolean isValueAssigned = false;

		try {

			while (!isValueAssigned) {

				try {
					String stringValues = JOptionPane.showInputDialog(null,
							"Introduce dos n�meros separados por una \",\". ", "Ingresa los datos",
							JOptionPane.PLAIN_MESSAGE);
					String[] arr = stringValues.split(",", 5);
					
					valueA = Float.parseFloat(arr[0]);
					valueB = Float.parseFloat(arr[1]);
					
					isValueAssigned = true;

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,
							"No ingres� un n�mero v�lido.\n Introduce dos n�meros separados por una \",\".",
							"Error. Reingrese datos", JOptionPane.ERROR_MESSAGE);
					isValueAssigned = false;
					
				} catch (ArrayIndexOutOfBoundsException e) {
					JOptionPane.showMessageDialog(null,
							"No ingres� un n�mero v�lido.\n Introduce dos n�meros separados por una \",\".",
							"Error. Reingrese datos", JOptionPane.ERROR_MESSAGE);
					isValueAssigned = false;
				} catch (NullPointerException e) {
					JOptionPane.showMessageDialog(null,
							"No ingres� un n�mero v�lido.\n Introduce dos n�meros separados por una \",\".",
							"Error. Reingrese datos", JOptionPane.ERROR_MESSAGE);
					isValueAssigned = false;
				}
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"No ingres� un n�mero v�lido.\n Introduce dos n�meros separados por una \",\".",
					"Error. Reingrese datos", JOptionPane.ERROR_MESSAGE);
			isValueAssigned = false;
		}

	}

	/**
	 * El m�todo {@link output()} se hereda de la interfaz IEjercicio. Output es obligatorio de implementar,
	 * cada clase debe tener un m�todo de salida, el comportamiento de output var�a seg�n los requerimientos 
	 * del ejercicio.
	 * 
	 * Para {@link Ejercicio02} output usa un try, para realizar la comparaci�n entre valorA y valorB,
	 * mostrando en pantalla una ventana de confirmaci�n de JOptionPane con el resultado de la comparaci�n,
	 * tiene adem�s un catch que captura errores.
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
