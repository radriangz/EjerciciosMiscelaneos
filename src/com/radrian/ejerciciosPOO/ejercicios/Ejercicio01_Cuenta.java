/**
 * 
 */
package com.radrian.ejerciciosPOO.ejercicios;

/**
 * Ejercicio 1) Crea una clase llamada Cuenta que tendr� los siguientes
 * atributos: titular y cantidad (puede tener decimales).
 * 
 * El titular ser� obligatorio y la cantidad es opcional. Crea dos constructores
 * que cumpla lo anterior. Crea sus m�todos get, set y toString.
 * 
 * Tendr� dos m�todos especiales:
 * 
 * ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la
 * cantidad introducida es negativa, no se har� nada. 
 * 
 * retirar(double cantidad):
 * se retira una cantidad a la cuenta, si restando la cantidad actual a la que
 * nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio01_Cuenta {
	private String titular;
	private double cantidad;

	/**
	 * {@link Ejercicio01_Cuenta(String titular)} 
	 * Constructor con solamente el titular.
	 * */
	public Ejercicio01_Cuenta(String titular) {
		this.titular = titular;
		this.cantidad = 0.0f;
	}
	
	//Se elimin� el constructor por default.
	
	/**
	 * {@link Ejercicio01_Cuenta(String titular, double cantidad)} 
	 * Constructor con ambos par�metros, titular y cantidad.
	 * */
	public Ejercicio01_Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;//Ya se usa cantidad en el constructor
	}
	
	/**
	 * {@link ingresar(double cantidad)}
	 * Suma ingreso a cantidad, si cantidad es negativo, no hace nada.
	 * */
	public void ingresar(double ingreso) {
		if (ingreso <= 0) {
			System.out.println("El saldo no ha cambiado");
		} else {
			this.cantidad += ingreso;
		}
	}

	/**
	 * {@link egreso()} 
	 * Eval�a que egreso sea una cantidad v�lida: Si tiene signo negativo,
	 * no hace nada, si cantidad resulta en un n�mero negativo, asigna 0 a 
	 * cantidad, si no se da algun caso anterior, entonces resta egreso a
	 * cantidad y asigna el resultado de la operaci�n a cantidad.
	 * */
	public void retirar(double egreso) {
		if (egreso <= 0) {
			System.out.println("El saldo no ha cambiado");
		} else if ((this.cantidad - egreso) <0) { 
			this.cantidad = 0f;
		}else {
			this.cantidad -= egreso;
		}
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	//toString creado.
	/**
	 * {@link toString()}
	 * Es un overrride de la superclase, devuelve un string con 
	 * usuario y cantidad.
	 * */
	@Override
	public String toString() {
		return "Usuario: " + titular + ".\n" +
				"Saldo en cuenta: " + cantidad;
	}
}
