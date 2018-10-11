package com.radrian.ejerciciosMiscelaneos.main;

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

		byte inputUsuario = 0;
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
		}
	}

}
