/**
 * 
 */
package com.radrian.ejerciciosPOO.ejercicios;

/**
 * Ejercicio 1) Crea una clase llamada Cuenta que tendrá los siguientes 
 * atributos: titular y cantidad (puede tener decimales). 
 * 
 * El titular será obligatorio y la cantidad es opcional. Crea dos 
 * constructores que cumpla lo anterior.
 * Crea sus métodos get, set y toString.
 * 
 * Tendrá dos métodos especiales:
 * 
 * ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la 
 * 			cantidad introducida es negativa, no se hará nada. 
 * retirar(double cantidad): se retira una cantidad a la cuenta, si restando 
 * 			la cantidad actual a la que nos pasan es negativa, la cantidad de 
 * 			la cuenta pasa a ser 0.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio01_Cuenta {
	private String titular;
	private float cantidad;
	
	public void sumaIngreso(float cantidad) {
		float comprobacion = this.cantidad;
		if ((comprobacion + cantidad) < this.cantidad) {
			System.out.println("El saldo no ha cambiado");
		} else {
			this.cantidad += cantidad;
		}
	}
	
	public void restaRetiro (float cantidad) {
		float comprobacion = this.cantidad;
		if ((comprobacion - cantidad) <0) {
			this.cantidad = 0f;
		} else if ((comprobacion - cantidad) > this.cantidad){
			System.out.println("El saldo no ha cambiado");
		} else {
			this.cantidad -= cantidad;
		}
	}
	
	public Ejercicio01_Cuenta() {
		this.titular = "";
		this.cantidad = 0.0f;
	}
	
	public Ejercicio01_Cuenta(String titular) {
		this.titular = titular;
		this.cantidad = 0.0f;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
}
