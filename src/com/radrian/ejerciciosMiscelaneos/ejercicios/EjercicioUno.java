package com.radrian.ejerciciosMiscelaneos.ejercicios;

import javax.swing.JOptionPane;

/**
 * Ejercicio 1) Declara dos variables num�ricas (con el valor que desees),
 * muestra por consola la suma, resta, multiplicaci�n, divisi�n y m�dulo (resto
 * de la divisi�n).
 * 
 * @author RAdrian
 *
 */
public class EjercicioUno {

	private float valorA;
	private float valorB;

	public void input() {
		boolean isValorACapturado = false;
		boolean isValorBCapturado = false;

		while (!isValorACapturado && !isValorBCapturado) {
			isValorACapturado = capturaValorA();
		}
	}

	private boolean capturaValorA() {
		Float input = capturaValor();

		if (input != null) {
			valorA = input;
			return true;
		}
		return false;
	}

	private float capturaValor() {
		Float input = null;
		try {
			input = Float.parseFloat(
					JOptionPane.showInputDialog(null, "Operando uno:", "Operando uno", JOptionPane.PLAIN_MESSAGE));
		} catch (NumberFormatException e) {

		}

		return input;
	}

	public void metodoEjercicio(float valorA, float valorB) {
		System.out.println("Suma: " + (valorA + valorB));
		System.out.println("Resta: " + (valorA - valorB));
		System.out.println("divisi�n: " + (valorA / valorB));
		System.out.println("M�dulo: " + (valorA % valorB));
	}
}
