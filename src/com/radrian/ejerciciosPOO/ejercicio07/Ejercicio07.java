package com.radrian.ejerciciosPOO.ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		float a;
		float b;
		float c;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nResoluci�n de ecuaci�n de segundo grado." + "\n" + "Ingresa un valor num�rico para \'a\'");

		a = Float.parseFloat(scan.nextLine());

		System.out.println("\na = " + a);
		System.out.println("Ingresa un valor num�rico para \'b\'");
		b = Float.parseFloat(scan.nextLine());

		System.out.println("\na = " + a);
		System.out.println("b = " + b);
		System.out.println("Ingresa un valor num�rico para \'c\'");
		c = Float.parseFloat(scan.nextLine());

		System.out.println("\na = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c + "\n");
		
		Raices ecuation = new Raices(a, b, c);
		ecuation.printResults();
		//System.out.println(ecuation.getDiscriminante());
		
		
		scan.close();
	}

}
