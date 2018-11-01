package com.radrian.ejerciciosPOO.ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		float a, b, c;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nResolución de ecuación de segundo grado." + "\n" + "Ingresa un valor numérico para \'a\'");

		a = Float.parseFloat(scan.nextLine());

		System.out.println("\na = " + a);
		System.out.println("Ingresa un valor numérico para \'b\'");
		b = Float.parseFloat(scan.nextLine());

		System.out.println("\na = " + a);
		System.out.println("b = " + b);
		System.out.println("Ingresa un valor numérico para \'c\'");
		c = Float.parseFloat(scan.nextLine());
		
		Raices ecuation = new Raices(a, b, c);
		ecuation.printResults();
		System.out.println(ecuation.getDiscriminante());
		
		
		scan.close();
	}

}
