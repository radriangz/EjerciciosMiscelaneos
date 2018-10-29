package com.radrian.ejerciciosPOO.ejercicio04;

import java.util.Random;

/**
 * @author RAdrian
 *
 */
public class Electrodomestico {
	protected final float PRECIO_DEFAULT = 100;
	protected final float PESO_DEFAULT = 5;
	protected final String COLOR_DEFAULT = "blanco";
	protected final char CONSUMO_ENERGETICO_DEFAULT = 'F';

	protected float precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected float peso;

	// Constructores
	public Electrodomestico() {
		this.precioBase = PRECIO_DEFAULT;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
		this.peso = PESO_DEFAULT;
	}

	public Electrodomestico(float precioBase, float peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
	}

	public Electrodomestico(float precioBase, float peso, String color, char consumoEnergetico) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	// Métodos
	private char comprobarConsumoEnergetico(char letra) {
		letra = Character.toUpperCase(letra);
		return ((letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E'
				|| letra == CONSUMO_ENERGETICO_DEFAULT) ? letra : CONSUMO_ENERGETICO_DEFAULT);
	}

	private String comprobarColor(String color) {
		color = color.toLowerCase();
		return ((color == "negro" || color == "rojo" || color == "azul"
				|| color == "gris" || color == COLOR_DEFAULT) ? color : COLOR_DEFAULT);
	}

	protected float precioFinal() {
		return (this.precioBase + calcularAumentoPorConsumoEnergetico() + calcularAumentoPorPeso());
	}

	private byte calcularAumentoPorConsumoEnergetico() {
		byte aumento = 0;
		if (this.consumoEnergetico == 'A') {
			aumento = 100;
		} else if (this.consumoEnergetico == 'B') {
			aumento = 80;
		} else if (this.consumoEnergetico == 'C') {
			aumento = 60;
		} else if (this.consumoEnergetico == 'D') {
			aumento = 50;
		} else if (this.consumoEnergetico == 'E') {
			aumento = 30;
		} else if (this.consumoEnergetico == CONSUMO_ENERGETICO_DEFAULT) {
			aumento = 10;
		}
		return aumento;
	}

	private byte calcularAumentoPorPeso() {
		byte aumento = 0;
		if (this.peso >= 0 && this.peso <= 19) {
			aumento = 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			aumento = 50;
		} else if (this.peso >= 50 && this.peso <= 79) {
			aumento = 80;
		} else if (this.peso > 80) {
			aumento = 100;
		}
		return aumento;
	}
	
	/**
	 * {@link generateRandomFloat} Runs a for cicle, adding in total, 3 random int
	 * numbers, then a dot (.) and finally two more int numbers, to a StringBuilder
	 * which is then parsed to float and returned.
	 * 
	 */
	protected static float generateRamdomPrice() {
		byte stringLength = 6;
		StringBuilder stringToFloat = new StringBuilder();
		Random randomInt = new Random();

		for (int i = 0; i < stringLength; i++) {
			if (i < 3) {
				stringToFloat.append(randomInt.nextInt(9));
			} else if (i == 3) {
				stringToFloat.append(".");
			} else {
				stringToFloat.append(randomInt.nextInt(9));
			}
		}
		return Float.parseFloat(stringToFloat.toString());
	}
	
	/**
	 * {@link generateRandomWeight()}
	 * Follows the same mecanism of generateRandomPrice, byt assigns everything
	 * inside the return statement because it doesn't use a for cicle.
	 * */
	protected static float generateRandomWeight() {
		Random randomInt = new Random();
		StringBuilder stringToFloat = new StringBuilder();
		return Float.parseFloat(stringToFloat.append((randomInt.nextInt(80) + 10)).append(".").append(randomInt.nextInt(9)).toString());
	}
	
	/**
	 * {@link generateRandomColor()}
	 * returns the string on given index number, which is obtained by random.nextInt()
	 * */
	protected static String generateRandomColour() {
		Random randomInt = new Random();
		String[] colours = {"blanco", "negro", "rojo", "azul", "gris"};
		return colours[randomInt.nextInt(colours.length)];
	}
	
	protected static char generateRandomConsumoEnergetico() {
		Random randomInt = new Random();
		char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};
		return chars[randomInt.nextInt(chars.length)];
	}
	
	public float getPrecioBase() {
		return this.precioBase;
	}

	public String getColor() {
		return this.color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public float getPeso() {
		return peso;
	}

}
