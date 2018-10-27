package com.radrian.ejerciciosPOO.ejercicio04;

/**
 * @author RAdrian
 *
 */
public class Electodomestico {
	protected final float PRECIO_DEFAULT = 100;
	protected final float PESO_DEFAULT = 5;
	protected final String COLOR_DEFAULT = "blanco";
	protected final char CONSUMO_ENERGETICO_DEFAULT = 'F';

	protected float precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected float peso;

	// Constructores
	public Electodomestico() {
		this.precioBase = PRECIO_DEFAULT;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
		this.peso = PESO_DEFAULT;
	}

	public Electodomestico(float precioBase, float peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
	}

	public Electodomestico(float precioBase, float peso, String color, char consumoEnergetico) {
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
		return ((color.toLowerCase() == "negro" || color.toLowerCase() == "rojo" || color.toLowerCase() == "azul"
				|| color.toLowerCase() == "gris" || color.toLowerCase() == COLOR_DEFAULT) ? color : COLOR_DEFAULT);
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
