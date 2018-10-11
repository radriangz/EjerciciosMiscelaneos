package com.radrian.ejerciciosMiscelaneos.main;

import javax.swing.JOptionPane;

import com.radrian.ejerciciosMiscelaneos.ejercicios.EjercicioCuatro;
import com.radrian.ejerciciosMiscelaneos.ejercicios.EjercicioDos;
import com.radrian.ejerciciosMiscelaneos.ejercicios.EjercicioTres;
import com.radrian.ejerciciosMiscelaneos.ejercicios.EjercicioUno;

/**
 * Esta clase contiene los llamados a las clases de los ejercicios.
 * 
 * @author RAdrian
 *
 */
public class MainClass {

	/**
	 * Método Principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Usar JOptionPane para que el usuario escoja el no. del ejercicio
		 * correspondiente e ingrese los valores.
		 * */
		byte inputUsuario = 4;
		float valorA = 1.5f;
		float valorB = 2.5f;
		String nombreUsuario = "Adrian";

		if (inputUsuario == 1) {
			EjercicioUno ejercicio1 = new EjercicioUno();
			ejercicio1.metodoEjercicio(valorA, valorB);

		} else if (inputUsuario == 2) {
			EjercicioDos ejercicio2 = new EjercicioDos();
			ejercicio2.metodoEjercicioDos(valorA, valorB);

		} else if (inputUsuario == 3) {
			EjercicioTres ejercicio3 = new EjercicioTres();
			ejercicio3.metodoEjercicioTres(nombreUsuario);
			
		} else if (inputUsuario == 4) {
			EjercicioCuatro ejercicio4 = new EjercicioCuatro();
			ejercicio4.metodoEjercicio();
			
		} else if (inputUsuario == 5) {
			
		}
	}

}
