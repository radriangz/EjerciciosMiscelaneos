package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.lang.Math;

import javax.swing.JOptionPane;

/**
 * Ejercicio 5) Haz una aplicación que calcule el área de un círculo(pi*R2). El
 * radio se pedirá por teclado (recuerda pasar de String a double con
 * Double.parseDouble). Usa la constante PI y el método pow de Math.
 * 
 * @author RAdrian
 *
 */
public class EjercicioCinco {

	public void calcularAreaCirculo() {
		String userInputRadius = JOptionPane.showInputDialog("Para calcular el área de un círculo, introduce el radio");

		float areaCirculo = (float) (Math.PI * (Math.pow(Float.parseFloat(userInputRadius), 2)));
		System.out.println("El area del círculo es " + areaCirculo);
	}

}
