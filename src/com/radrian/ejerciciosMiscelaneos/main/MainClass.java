package com.radrian.ejerciciosMiscelaneos.main;

import com.radrian.ejerciciosMiscelaneos.ejercicios.EjercicioCinco;
import com.radrian.ejerciciosMiscelaneos.ejercicios.EjercicioCuatro;
import com.radrian.ejerciciosMiscelaneos.ejercicios.EjercicioDos;
import com.radrian.ejerciciosMiscelaneos.ejercicios.EjercicioSeis;
import com.radrian.ejerciciosMiscelaneos.ejercicios.EjercicioSiete;
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
		 */
		byte inputUsuario = 1;
		float valorA = 1.5f;
		float valorB = 2.5f;
		String nombreUsuario = "Adrian";

		if (inputUsuario == 1) {
			EjercicioUno ejercicio01 = new EjercicioUno();
			ejercicio01.input();

		} else if (inputUsuario == 2) {
			EjercicioDos ejercicio02 = new EjercicioDos();
			ejercicio02.metodoEjercicioDos(valorA, valorB);

		} else if (inputUsuario == 3) {
			EjercicioTres ejercicio03 = new EjercicioTres();
			ejercicio03.metodoEjercicioTres(nombreUsuario);

		} else if (inputUsuario == 4) {
			EjercicioCuatro ejercicio04 = new EjercicioCuatro();	
			ejercicio04.metodoEjercicioCuatro();

		} else if (inputUsuario == 5) {
			EjercicioCinco ejercicio05 = new EjercicioCinco();
			ejercicio05.calcularAreaCirculo();

		} else if (inputUsuario == 6) {
			EjercicioSeis ejercicio06 = new EjercicioSeis();
			ejercicio06.metodoEjercicioSeis();
			
		} else if (inputUsuario == 7) {
			EjercicioSiete ejercicio07 = new EjercicioSiete();
			ejercicio07.metodoEjercicioSiete();
			
		}
		
	}

}
