package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 35) Crea un enum con los d�as de la semana, pide un d�a de la 
 * semana e indica si es laboral o no (en el main).
 * 
 * @author RAdrian
 *
 */
public class Ejercicio35 {
	
	private static enum Day {
		DOMINGO("D�a no laboral"), 
		LUNES("D�a laboral"), 
		MARTES("D�a laboral"), 
		MI�RCOLES("D�a laboral"),
		JUEVES("D�a laboral"),
		VIERNES("D�a laboral"),
		S�BADO("D�a no laboral");
		
		private String laboral;
		private Day(String str) {
			laboral = str;
		}
		public String getLaboral() {
			return laboral;
		}
	}
	
	public static String createResponse(String input) {
		String output = "";
		
		if(input == "DOMINGO") {
			output = ("\n" +input + ": " + Day.DOMINGO.getLaboral() + ".");
		} else if(input.equals("LUNES")) {
			output = ("\n" +input + ": " + Day.LUNES.getLaboral() + ".");
		} else if(input == "MARTES") {
			output = ("\n" +input + ": " + Day.MARTES.getLaboral() + "." + ": " + Day.MARTES.getLaboral());
		} else if(input == "MI�RCOLES") {
			output = ("\n" +input + ": " + Day.MI�RCOLES.getLaboral() + "." + ": " + Day.MI�RCOLES.getLaboral());
		} else if(input == "JUEVES") {
			output = ("\n" +input + ": " + Day.JUEVES.getLaboral() + "." + ": " + Day.JUEVES.getLaboral());
		} else if(input == "VIERNES") {
			output = ("\n" +input + ": " + Day.VIERNES.getLaboral() + "." + ": " + Day.VIERNES.getLaboral());
		} else if(input == "S�BADO") {
			output = ("\n" +input + ": " + Day.S�BADO.getLaboral() + "." + ": " + Day.S�BADO.getLaboral());
		}
		return output;
	}
	
	public void metodo() {
		System.out.println("\nEscribe un d�a de la semana");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toUpperCase();
		
		String output = createResponse(input);
		System.out.println(output);
		sc.close();
	}
	
}
