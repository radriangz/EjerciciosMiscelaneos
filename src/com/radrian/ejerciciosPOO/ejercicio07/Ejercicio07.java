package com.radrian.ejerciciosPOO.ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		float valueA, valueB, valueC;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nResoluci�n de ecuaci�n de segundo grado." + "\n" + "Ingresa un valor num�rico para \'a\'");

		valueA = Float.parseFloat(scan.nextLine());

		System.out.println("\na = " + valueA);
		System.out.println("Ingresa un valor num�rico para \'b\'");
		valueB = Float.parseFloat(scan.nextLine());

		System.out.println("\na = " + valueA);
		System.out.println("b = " + valueB);
		System.out.println("Ingresa un valor num�rico para \'c\'");
		valueC = Float.parseFloat(scan.nextLine());
		
		Raices ecuation = new Raices(valueA, valueB, valueC);
		ecuation.printResults();
		System.out.println(ecuation.getDiscriminante());
		
		
		scan.close();
	}

}
