package com.radrian.ejerciciosPOO.main;

import java.util.Scanner;

import com.radrian.ejerciciosPOO.ejercicio01.Cuenta;
import com.radrian.ejerciciosPOO.ejercicio02.Ejercicio02;
import com.radrian.ejerciciosPOO.ejercicio03.Ejercicio03;
import com.radrian.ejerciciosPOO.ejercicio04.Ejercicio04;

/**
 * @author RAdrian
 *
 */
public class MainClassPOO {
	private static Scanner scan = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(": : : Ejercicios de POO Java : : :");
		System.out.println("Ingresa un número del 1 al 17"); // actualizar conforme salgan los ejercicios
		byte inputUsuario = scan.nextByte();

		if (inputUsuario == 1) {
			Cuenta cuenta = new Cuenta("Radrian");
			cuenta.setCantidad(100f);

			cuenta.ingresar(-50.50d);
			System.out.println("El saldo de la cuenta es de: " + cuenta.getCantidad());

			cuenta.retirar(75.30d);
			System.out.println("Su saldo actual es de: " + cuenta.getCantidad());
		} else if (inputUsuario == 2) {
			Ejercicio02 ejercicioPOO02 = new Ejercicio02();
			ejercicioPOO02.metodo();

		} else if (inputUsuario == 3) {
			Ejercicio03 ejercicioPOO03 = new Ejercicio03();
			ejercicioPOO03.metodo();

		} else if(inputUsuario == 4) {
			Ejercicio04 ejercicio04 = new Ejercicio04();
			ejercicio04.metodo();
			
		}

	}

}
