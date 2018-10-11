/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import javax.swing.JOptionPane;

/**
 * Ejercicio 4) Modifica la aplicación anterior, para que nos pida el nombre 
 * que queremos introducir (recuerda usar JOptionPane).
 * 
 * @author RAdrian
 *
 */
public class EjercicioCuatro {
	
	public void metodoEjercicio() {
		
		String userName = JOptionPane.showInputDialog("Introduce tu nombre de Usuario");
		if (userName != null) {
			System.out.println("¡Bienvenido " + userName + "!");
		}
	}
}
