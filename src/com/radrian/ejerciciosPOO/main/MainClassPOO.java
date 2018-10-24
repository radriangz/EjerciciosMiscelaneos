/**
 * 
 */
package com.radrian.ejerciciosPOO.main;

import com.radrian.ejerciciosPOO.ejercicios.Ejercicio01_Cuenta;

/**
 * @author RAdrian
 *
 */
public class MainClassPOO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //* Ejercicio 1
		
		Ejercicio01_Cuenta cuenta = new Ejercicio01_Cuenta("Radrian");
		cuenta.setCantidad(100f);
		
		cuenta.ingresar(-50.50d);
		System.out.println("El saldo de la cuenta es de: " +
							cuenta.getCantidad());
		
		cuenta.retirar(75.30d);
		System.out.println("Su saldo actual es de: " + 
							cuenta.getCantidad());
		/**/
	}

}
