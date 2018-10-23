package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 35) Crea un enum con los días de la semana, pide un día de la 
 * semana e indica si es laboral o no (en el main).
 * 
 * @author RAdrian
 *
 */
public class Ejercicio35 {
	
	private static enum Day {
		DOMINGO("Día no laboral"), 
		LUNES("Día laboral"), 
		MARTES("Día laboral"), 
		MIÉRCOLES("Día laboral"),
		JUEVES("Día laboral"),
		VIERNES("Día laboral"),
		SÁBADO("Día no laboral");
		
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
		} else if(input == "MIÉRCOLES") {
			output = ("\n" +input + ": " + Day.MIÉRCOLES.getLaboral() + "." + ": " + Day.MIÉRCOLES.getLaboral());
		} else if(input == "JUEVES") {
			output = ("\n" +input + ": " + Day.JUEVES.getLaboral() + "." + ": " + Day.JUEVES.getLaboral());
		} else if(input == "VIERNES") {
			output = ("\n" +input + ": " + Day.VIERNES.getLaboral() + "." + ": " + Day.VIERNES.getLaboral());
		} else if(input == "SÁBADO") {
			output = ("\n" +input + ": " + Day.SÁBADO.getLaboral() + "." + ": " + Day.SÁBADO.getLaboral());
		}
		return output;
	}
	
	public void metodo() {
		System.out.println("\nEscribe un día de la semana");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toUpperCase();
		
		String output = createResponse(input);
		System.out.println(output);
		sc.close();
	}
	
}
