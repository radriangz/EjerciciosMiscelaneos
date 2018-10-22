package com.radrian.ejerciciosMiscelaneos.main;

import java.util.Scanner;

import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio14;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio05;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio04;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio18;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio19;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio20;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio21;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio22;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio23;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio24;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio25;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio26;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio27;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio28;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio29;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio30;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio16;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio17;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio10;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio12;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio02;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio09;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio08;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio11;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio15;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio06;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio07;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio13;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio03;
import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio01;

/**
 * Esta clase contiene los llamados a las clases de los ejercicios.
 * 
 * @author RAdrian
 *
 */
public class MainClass {

	private static Scanner scan = new Scanner(System.in);

	
	/**
	 * Método Principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/* TODO
		 * Usar JOptionPane para que el usuario escoja el no. del ejercicio
		 * correspondiente e ingrese los valores.
		 */
		System.out.println(": : : Ejercicios Varios de Java : : :");
		System.out.println("Ingresa un número del 1 al XX"); //actualizar conforme salgan los ejercicios
		byte inputUsuario = scan.nextByte();
		//byte inputUsuario = 2;
		//Se cambió inputUsuario por el nextByte() de scan
		
		String nombreUsuario = "Adrian";

		if (inputUsuario == 1) {
			Ejercicio01 ejercicio01 = new Ejercicio01();
			ejercicio01.input();
			ejercicio01.output();
			
		} else if (inputUsuario == 2) {
			Ejercicio02 ejercicio02 = new Ejercicio02();
			ejercicio02.input();
			ejercicio02.output();

		} else if (inputUsuario == 3) {
			Ejercicio03 ejercicio03 = new Ejercicio03();
			ejercicio03.metodoEjercicioTres(nombreUsuario);

		} else if (inputUsuario == 4) {
			Ejercicio04 ejercicio04 = new Ejercicio04();	
			ejercicio04.metodoEjercicioCuatro();

		} else if (inputUsuario == 5) {
			Ejercicio05 ejercicio05 = new Ejercicio05();
			ejercicio05.calcularAreaCirculo();

		} else if (inputUsuario == 6) {
			Ejercicio06 ejercicio06 = new Ejercicio06();
			ejercicio06.metodoEjercicioSeis();
			
		} else if (inputUsuario == 7) {
			Ejercicio07 ejercicio07 = new Ejercicio07();
			ejercicio07.metodoEjercicioSiete();
			
		} else if (inputUsuario == 8) {
			Ejercicio08 ejercicio08 = new Ejercicio08();
			ejercicio08.metodoEjercicioOcho();
			
		} else if (inputUsuario == 9) {
			Ejercicio09 ejercicio09 = new Ejercicio09();
			ejercicio09.metodoEjercicioNueve();
			
		} else if (inputUsuario == 10) {
			Ejercicio10 ejercicio10 = new Ejercicio10();
			ejercicio10.metodoEjercicioDiez();
			
		} else if (inputUsuario == 11) {
			Ejercicio11 ejercicio11 = new Ejercicio11();
			ejercicio11.metodoEjercicioOnce();
			
		} else if (inputUsuario == 12) {
			Ejercicio12 ejercicio12 = new Ejercicio12();
			ejercicio12.metodoEjercicioDoce();
			
		} else if (inputUsuario == 13) {
			Ejercicio13 ejercicio13 = new Ejercicio13();
			ejercicio13.metodoEjercicioTrece();
			
		} else if (inputUsuario == 14) {
			Ejercicio14 ejercicio14 = new Ejercicio14();
			ejercicio14.metodoEjercicioCatorce();
			
		} else if (inputUsuario == 15) {
			Ejercicio15 ejercicio15 = new Ejercicio15();
			ejercicio15.metodoQuince();
			
		} else if (inputUsuario == 16) {
			Ejercicio16 ejercicio16 = new Ejercicio16();
			ejercicio16.metodo();
			
		} else if (inputUsuario == 17) {
			Ejercicio17 ejercicio17 = new Ejercicio17();
			ejercicio17.metodo();
			
		} else if (inputUsuario == 18) {
			Ejercicio18 ejercicio18 = new Ejercicio18();
			ejercicio18.metodo();
			
		} else if (inputUsuario == 19) {
			Ejercicio19 ejercicio19 = new Ejercicio19();
			ejercicio19.metodo();
			
		} else if (inputUsuario == 20) {
			Ejercicio20 ejercicio20 = new Ejercicio20();
			ejercicio20.metodo();
			
		} else if (inputUsuario == 21) {
			Ejercicio21 ejercicio21 = new Ejercicio21();
			ejercicio21.metodo();
			
		} else if (inputUsuario == 22) {
			Ejercicio22 ejercicio22 = new Ejercicio22();
			ejercicio22.metodo();
			
		} else if (inputUsuario == 23) {
			Ejercicio23 ejercicio23 = new Ejercicio23();
			ejercicio23.metodo();
			
		} else if (inputUsuario == 24) {
			Ejercicio24 ejercicio24 = new Ejercicio24();
			ejercicio24.metodo();
			
		} else if (inputUsuario == 25) {
			Ejercicio25 ejercicio25 = new Ejercicio25();
			ejercicio25.metodo();
			
		} else if (inputUsuario == 26) {
			Ejercicio26 ejercicio26 = new Ejercicio26();
			ejercicio26.metodo();
			
		} else if (inputUsuario == 27) {
			Ejercicio27 ejercicio27 = new Ejercicio27();
			ejercicio27.metodo();
			
		}  else if (inputUsuario == 28) {
			Ejercicio28 ejercicio28 = new Ejercicio28();
			ejercicio28.metodo();
			
		} else if (inputUsuario == 29) {
			Ejercicio29 ejercicio29 = new Ejercicio29();
			ejercicio29.metodo();
			
		} else if (inputUsuario == 30) {
			Ejercicio30 ejercicio30 = new Ejercicio30();
			ejercicio30.metodo();
			/*
		} else if (inputUsuario == 31) {
			Ejercicio31 ejercicio31 = new Ejercicio31();
			ejercicio31.metodo();
			*/
		}
		
		scan.close();
	}
	
}

