/**
 * 
 */
package com.radrian.ejerciciosPOO.ejercicios;

import java.util.Scanner;

/**
 * @author RAdrian
 *
 */
public class Ejercicio02 {
	
	public void metodo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nIngresar nuevo usuario" + 
							"\n1. Datos completos." + 
							"\n2. Sin peso ni altura." + 
							"\n3. Nombre solamente.");
		int userInput = Integer.parseInt(sc.nextLine());

		if (userInput == 1) {
			Ejercicio02_Persona usuario01 = usuarioCompleto();
			System.out.println("Peso del usuario: " + usuario01.calcularIMC());
			System.out.println("Mayoría de edad: " + usuario01.esMayorDeEdad());
			System.out.println("Datos del usuario: \n" + usuario01.toString());
			
			
			
		}
		sc.close();
	}

	private Ejercicio02_Persona usuarioCompleto() {
		String nombre;
		byte edad;
		char sexo;
		float peso;
		int altura;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa el nombre completo.");
		nombre = sc.nextLine();
		System.out.println("Edad del usuario:");
		edad = Byte.parseByte(sc.nextLine());
		System.out.println("Sexo del usuario: Hombre o Mujer");
		sexo = Character.toUpperCase(sc.nextLine().charAt(0));
		System.out.println("Peso del usuario en kg.");
		peso = Float.parseFloat(sc.nextLine());
		System.out.println("Altura del usuario en cm.");
		altura = Integer.parseInt(sc.nextLine());

		Ejercicio02_Persona uCompleto = new Ejercicio02_Persona(nombre, edad, sexo, peso, altura);
		sc.close();
		return uCompleto;
	}
}
