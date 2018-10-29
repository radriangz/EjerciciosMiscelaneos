package com.radrian.ejerciciosPOO.ejercicio04;

import java.util.Random;

/**
 * @author RAdrian
 *
 */
public class Television extends Electrodomestico{
	private float RESOLUCION_DEFAULT = 20f;
	private boolean SINTONIZADOR_TDT_DEFAULT = false;
	private float resolucion;
	private boolean sintonizadorTDT;
	
	public Television() {
		super();
		this.resolucion = RESOLUCION_DEFAULT;
		this.sintonizadorTDT = SINTONIZADOR_TDT_DEFAULT;
	}
	
	public Television(float precio, float peso) {
		super(precio, peso);
		this.resolucion = RESOLUCION_DEFAULT;
		this.sintonizadorTDT = SINTONIZADOR_TDT_DEFAULT;
	}
	
	public Television(float resolucion, boolean sintonizadorTDT, float precio, float peso, String color, char consumoEnergetico) {
		super(precio, peso, color, consumoEnergetico);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	/**
	 * {@link generateRandomResolucion()}
	 * Returns a random number between 15 and 55, with one ramdon digit, 
	 * from 0 to 9, after the dot (.)
	 * */
	protected static float generateRandomResolucion() {
		Random randomInt = new Random();
		StringBuilder stringToResolucion = new StringBuilder();
		return Float.parseFloat(stringToResolucion.append((randomInt.nextInt(40) + 15)).append(".").append(9).toString());
	}
	
	/**
	 * {@link generateRandomSintonizadorTDT}
	 * Returns a random true or false, uses Random to determine it.
	 * 
	 * */
	protected static boolean generateRandomSintonizadorTDT() {
		boolean[] booleanArray = { true, false};
		Random randomInt = new Random();
		return booleanArray[randomInt.nextInt(booleanArray.length)];
	}
	
	@Override
	public float precioFinal() {
		return (calcularPrecioPorResolucion() + calcularPrecioPorSintonizadorTDT() + super.precioFinal());
	}
	
	private float calcularPrecioPorResolucion() {
		return (this.resolucion > 40? (super.precioBase * 0.3f): 0);
	}
	
	private byte calcularPrecioPorSintonizadorTDT() {
		return (byte) (this.sintonizadorTDT? 50: 0);
	}
	
	public float getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
}
