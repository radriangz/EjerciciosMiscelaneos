package com.radrian.ejerciciosMiscelaneos.ejercicios;

import javax.swing.JOptionPane;

/**
 * Ejercicio 1) Declara dos variables numéricas (con el valor que desees),
 * muestra por consola la suma, resta, multiplicación, división y módulo (resto
 * de la división).
 * 
 * @author RAdrian
 *
 */
public class EjercicioUno implements IEjercicio {

	private float valorA;
	private float valorB;


	@Override
	public void input() {
		valorA = capturaValor("Operando uno: ", "Operando uno");
		valorB = capturaValor("Operando dos: ", "Operando dos");
	}
	
	/***
	 * El método {@link capturaValor} se encarga de capturar un valor válido
	 * para realizar las operaciones necesarias.
	 */
	private float capturaValor(String mensaje, String titulo) {
		boolean isValueCaptured = false;
		float input = 0.0f;

		while (!isValueCaptured) { //o sea "mientras isValueCaptured no sea veardadero, entra al ciclo,"
			try {
				input = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce un número para el operando", "Captura de operando", JOptionPane.PLAIN_MESSAGE));
				isValueCaptured = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Su respuesta es inválida", "Error", JOptionPane.ERROR_MESSAGE);
				isValueCaptured = false;
			}
		}

		return input;
	}

	private float calcularSuma() {
		return valorA + valorB;
	}

	private float calcularResta() {
		return valorA - valorB;
	}

	private Float calcularDivision() {
		Float resultado = null;

		try {
			resultado = valorA / valorB;
		} catch (ArithmeticException e) {
			System.out.println("Error al dividir");
		}

		return Float.isInfinite(resultado) ? null : resultado;
	}

	private Float calcularModulo() {
		Float resultado = null;

		try {
			resultado = valorA % valorB;
		} catch (ArithmeticException e) {
			System.out.println("Error al obtener el módulo");
		}

		return Float.isNaN(resultado) ? null : resultado;
	}

	@Override
	public void output() {
		StringBuilder mensaje = new StringBuilder();

		mensaje.append("Suma: ").append(calcularSuma()).append("\n");
		mensaje.append("Resta: ").append(calcularResta()).append("\n");

		Float division = calcularDivision();
		mensaje.append("División: ").append(division != null ? division : "Hubo un error al dividir").append("\n");

		Float modulo = calcularModulo();
		mensaje.append("Módulo: ").append(modulo != null ? modulo : "Hubo un error obener el módulo").append("\n");

		JOptionPane.showMessageDialog(null, mensaje.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}
