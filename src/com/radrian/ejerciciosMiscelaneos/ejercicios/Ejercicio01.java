package com.radrian.ejerciciosMiscelaneos.ejercicios;

import javax.swing.JOptionPane;

import interfaces.IEjercicio;

/**
 * Ejercicio 1) Declara dos variables numéricas (con el valor que desees),
 * muestra por consola la suma, resta, multiplicación, división y módulo (resto
 * de la división).
 * 
 * @author RAdrian
 *
 */
public class Ejercicio01 implements IEjercicio {

	private float valorA;
	private float valorB;

	/**
	 * El método {@link input()} se hereda de la interfaz IEjercicio. Input es obligatorio de implementar,
	 * cada clase debe tener un método de entrada, el comportamiento de input varía 
	 * según los requerimientos del ejercicio.
	 * 
	 * Para {@link Ejercicio01} input utiliza el método {@link capturaValor} para asignar el resultado a
	 * las variables valorA y valorB.
	 * 
	 * */
	@Override
	public void input() {
		valorA = capturaValor("primer operando: ", "Primer Operando");
		valorB = capturaValor("segundo operando: ", "Segundo Operando");
	}
	
	/***
	 * El método {@link capturaValor} se encarga de capturar un valor, mediante una ventana de 
	 * JOptionPane, en caso de ser válido devuelve el valor obtenido, si no es un valor válido
	 * arroja un mensaje de error y vuelve a pedir el valor.
	 * 
	 */
	private float capturaValor(String mensaje, String titulo) {
		boolean isValueCaptured = false;
		float input = 0.0f;

		while (!isValueCaptured) { //o sea "mientras isValueCaptured no sea veardadero, entra al ciclo,"
			
			/* 
			 * En esta ventana de mensaje, al implementarse el catch(Exception e) si se cierra o cancela, 
			 * no termina el programa, el usuario está obligado a terminar el programa para poder salir.
			 * */
			try {
				input = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce un número para el " + mensaje, "Captura de " + titulo, JOptionPane.PLAIN_MESSAGE));
				isValueCaptured = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Su respuesta es inválida", "Error", JOptionPane.ERROR_MESSAGE);
				isValueCaptured = false;
			} catch (Exception e) {
				// este catch está acá para cerrar la aplicación sin arrojar error en la consola.
			}
		}

		return input;
	}

	/**
	 * El método {@link calcularSuma()} regresa el resultado de sumar valorA y valorB.
	 * 
	 * */
	private float calcularSuma() {
		return valorA + valorB;
	}

	/**
	 * El método {@link calcularResta()} regresa el resultado de restar valorA y valorB.
	 * 
	 * */
	private float calcularResta() {
		return valorA - valorB;
	}

	/**
	 * El método {@link calcularDivision()} regresa el resultado de dividir valorA entre valorB.
	 * 
	 * */
	private Float calcularDivision() {
		Float resultado = null;

		try {
			resultado = valorA / valorB;
		} catch (ArithmeticException e) {
			System.out.println("Error al dividir");
		}

		return Float.isInfinite(resultado) ? null : resultado;
	}

	/**
	 * El método {@link calcularModulo()} regresa el sobrante de dividir valorA entre valorB.
	 * 
	 * */
	private Float calcularModulo() {
		Float resultado = null;

		try {
			resultado = valorA % valorB;
		} catch (ArithmeticException e) {
			System.out.println("Error al obtener el módulo");
		}

		return Float.isNaN(resultado) ? null : resultado;
	}

	/**
	 * El método {@link output()} se hereda de la interfaz IEjercicio. Output es obligatorio de implementar,
	 * cada clase debe tener un método de salida, el comportamiento de output varía según los requerimientos 
	 * del ejercicio.
	 * 
	 * Para {@link Ejercicio01} output crea un string usando StringBuilder, realiza el cálculo, y devuelve
	 * al usuario el resultado mediante una ventana de JOptionPane, ya sea que el resultado se haya obtenido
	 * sin problemas o haya ocurrido un error. 
	 * 
	 * */
	@Override
	public void output() {
		StringBuilder mensaje = new StringBuilder();

		mensaje.append("Suma: ").append(calcularSuma()).append("\n");
		mensaje.append("Resta: ").append(calcularResta()).append("\n");

		Float division = calcularDivision();
		mensaje.append("División: ").append(division != null ? division : "Hubo un error al dividir").append("\n");

		Float modulo = calcularModulo();
		mensaje.append("Módulo: ").append(modulo != null ? modulo : "Hubo un error al obtener el módulo").append("\n");

		JOptionPane.showMessageDialog(null, mensaje.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}
