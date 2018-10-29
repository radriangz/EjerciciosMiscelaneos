/**
 * 
 */
package com.radrian.ejerciciosPOO.ejercicio04;

import java.util.Random;

/**
 * @author RAdrian
 *
 */
public class Lavadora extends Electrodomestico{
	private final float CARGA_POR_DEFECTO = 5;
	private float carga;
	
	public Lavadora() {
		this.carga = CARGA_POR_DEFECTO;
	}
	
	public Lavadora(float precio, float peso) {
		super(precio, peso);
		this.carga = CARGA_POR_DEFECTO;
	}
	
	public Lavadora(float carga, float precio, float peso, String color, char consumoEnergetico) {
		super(precio, peso, color, consumoEnergetico);
		this.carga = carga;
	}
	
	/**
	 * 
	 * */
	protected static float generateRandomCarga() {
		Random randomInt = new Random();
		StringBuilder stringToFloat = new StringBuilder();
		return Float.parseFloat(stringToFloat.append(randomInt.nextInt(50) + 15).toString());
	}
	
	@Override
	public float precioFinal() {
		return (calcularPrecioPorCarga() + super.precioFinal());
	}
	
	private byte calcularPrecioPorCarga() {
		return (byte) (carga > 30? 50: 0);
	}
	
	public float getCarga() {
		return carga;
	}
}
