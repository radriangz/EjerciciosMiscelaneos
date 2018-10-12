package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.lang.Math;

import javax.swing.JOptionPane;

/**
 * Ejercicio 5) Haz una aplicaci�n que calcule el �rea de un c�rculo(pi*R2). El
 * radio se pedir� por teclado (recuerda pasar de String a double con
 * Double.parseDouble). Usa la constante PI y el m�todo pow de Math.
 * 
 * @author RAdrian
 *
 */
public class EjercicioCinco {

	public void calcularAreaCirculo() {
		String userInputRadius = JOptionPane.showInputDialog("Para calcular el �rea de un c�rculo, introduce el radio");

		float areaCirculo = (float) (Math.PI * (Math.pow(Float.parseFloat(userInputRadius), 2)));
		System.out.println("El area del c�rculo es " + areaCirculo);
	}

}
