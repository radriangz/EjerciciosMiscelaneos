package com.radrian.ejerciciosPOO.ejercicio02;

/**
 * {@link Persona}
 * Contiene los métodos establecidos en las instrucciones del ejercicio 2.
 * 
 * @author RAdrian
 * */
public class Persona {
	private final char HOMBRE = 'H';
	private final char MUJER = 'M';

	private String nombre = "";
	private byte edad = 0;
	private String dni = ""; //cómo puedo dejar dni declarada sin inicializar?
	private char sexo = HOMBRE;
	private float peso = 0f;
	private int altura = 0;
	
	public Persona() {
		this.sexo = HOMBRE;
		this.dni = generaDNI();
	}

	public Persona(String nombre, byte edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generaDNI();
		this.sexo = comprobarSexo(sexo);
	}

	public Persona(String nombre, byte edad, char sexo, float peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generaDNI(); 
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}

	public byte calcularIMC() {
		final byte BAJO_PESO = -1;
		final byte PESO_NORMAL = 0;
		final byte SOBREPESO = 1;
		
		byte imc = (byte) (this.peso/(Math.pow(altura, 2)));

		if (imc < 20) {
			return BAJO_PESO;
		} else if (imc >= 20 || imc <= 25) {
			return PESO_NORMAL;
		} else {
			return SOBREPESO;
		}
	}

	public boolean esMayorDeEdad() {
		boolean esMayorDeEdad = false;

		if (edad >= 18) {
			esMayorDeEdad = true;
		}
		return esMayorDeEdad;
	}

	private char comprobarSexo(char sexo) {
		if (this.sexo == MUJER) {
			return this.sexo;
		} else {
			this.sexo = HOMBRE;
		}
		return this.sexo;
	}

	private String generaDNI() {
		StringBuilder numAleatorio = new StringBuilder();
		StringBuilder dni = numAleatorio.append(this.nombre.toUpperCase().charAt(0)).append(this.nombre.toUpperCase().charAt(1));  

		for (byte i = 0; i < 7; i++) {
			byte rn = (byte) ((int) (Math.random() * 9) + 1);
			dni = numAleatorio.append(rn);
		} 
		return this.dni = dni.toString();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = comprobarSexo(sexo);
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * {@link toString()}
	 * Es un overrride de la superclase, devuelve un string con 
	 * los datos del usuario: nombre, edad, dni, sexo, peso, altura.
	 * */
	@Override
	public String toString() {
		return ("Nombre: " + this.nombre + ".\n" +
				"Edad: " + this.edad + ".\n" +
				"DNI: " + this.dni + ".\n" +
				"Sexo:" + this.sexo + ".\n" +
				"Peso: " + this.peso + ".\n" +
				"Altura: " + this.altura + ".\n");
	}

}
