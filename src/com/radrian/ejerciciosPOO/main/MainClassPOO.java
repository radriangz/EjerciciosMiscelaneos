/**
 * 
 */
package com.radrian.ejerciciosPOO.main;

import java.util.Scanner;

import com.radrian.ejerciciosMiscelaneos.ejercicios.Ejercicio03;
import com.radrian.ejerciciosPOO.ejercicios.Ejercicio01_Cuenta;
import com.radrian.ejerciciosPOO.ejercicios.Ejercicio02;
import com.radrian.ejerciciosPOO.ejercicios.Ejercicio03POO;

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
		// TODO Auto-generated method stub
		 /* Ejercicio 1
		
		Ejercicio01_Cuenta cuenta = new Ejercicio01_Cuenta("Radrian");
		cuenta.setCantidad(100f);
		
		cuenta.ingresar(-50.50d);
		System.out.println("El saldo de la cuenta es de: " +
							cuenta.getCantidad());
		
		cuenta.retirar(75.30d);
		System.out.println("Su saldo actual es de: " + 
							cuenta.getCantidad());
		*/
		System.out.println(": : : Ejercicios de POO Java : : :");
		System.out.println("Ingresa un número del 1 al 17"); //actualizar conforme salgan los ejercicios
		byte inputUsuario = scan.nextByte();
		
		if(inputUsuario == 1) {
			//Ejercicio 01
		} else if(inputUsuario == 2) {
			Ejercicio02 ejercicioPOO02 = new Ejercicio02();
			ejercicioPOO02.metodo();
			
		} else if(inputUsuario == 3) {
			Ejercicio03POO ejercicioPOO03 = new Ejercicio03POO();
			ejercicioPOO03.metodo();
			
		} else if(inputUsuario == 4) {
			Ejercicio04POO ejercicioPOO04 = new Ejercicio04POO();
			ejercicioPOO04.metodo();
			
		}

		
	}

}
