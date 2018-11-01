package com.radrian.ejerciciosPOO.ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		float valueA, valueB, valueC;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nResolución de ecuación de segundo grado." + "\n" + "Ingresa un valor numérico para \'a\'");

		valueA = Float.parseFloat(scan.nextLine());

		System.out.println("\na = " + valueA);
		System.out.println("Ingresa un valor numérico para \'b\'");
		valueB = Float.parseFloat(scan.nextLine());

		System.out.println("\na = " + valueA);
		System.out.println("b = " + valueB);
		System.out.println("Ingresa un valor numérico para \'c\'");
		valueC = Float.parseFloat(scan.nextLine());
		
		Raices ecuation = new Raices(valueA, valueB, valueC);
		ecuation.printResults();
		System.out.println(ecuation.getDiscriminante());
		
		
		scan.close();
	}

}
