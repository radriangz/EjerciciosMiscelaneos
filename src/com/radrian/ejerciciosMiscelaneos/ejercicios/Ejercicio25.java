/**
 * 
 */
package com.radrian.ejerciciosMiscelaneos.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 25) Crea una aplicaci�n llamada CalculadoraPolacaInversaApp, nos 
 * pedir� 2 operandos (int) y un signo aritm�tico (String), seg�n este �ltimo 
 * se realizara la operaci�n correspondiente. Al final mostrara el resultado 
 * en un cuadro de dialogo.
 * 
 * Los signos aritm�ticos disponibles son:
 * +: suma los dos operandos.
 * -: resta los operandos.
 * *: multiplica los operandos.
 * /: divide los operandos, este debe dar un resultado con decimales (double)
 * ^:  1� operando como base y 2� como exponente.
 * %:  m�dulo, resto de la divisi�n entre operando1 y operando2.
 * 
 * @author RAdrian
 *
 */
public class Ejercicio25 {
	
	public void metodo() {
		Scanner sc = new Scanner(System.in);
		System.out.println(": Calculadora Polaa Inversa App :\n" + 
							"Ingresa el primer operando.");
		float valorA = Float.parseFloat(sc.nextLine());
		
		System.out.println("\nIngresa el segundo Operando.");
		float valorB = Float.parseFloat(sc.nextLine());
		
		System.out.println("Ingresa el n�mero de la operaci�n que deseas realizar\n" + 
							"1. (+)\n" +
							"2. (-)\n" + 
							"3. (*)\n" + 
							"4. (/)\n" + 
							"5. (^)\n" +
							"6. (%)");
		int operando = Integer.parseInt(sc.nextLine());
		
		if (operando == 1) {
			System.out.println(valorA + " + " + valorB + " = " + (valorA + valorB));
		} else if (operando == 2) {
			System.out.println(valorA + " - " + valorB + " = " + (valorA - valorB));
		} else if (operando == 3) {
			System.out.println(valorA + " - " + valorB + " = " + (valorA * valorB));
		} else if (operando == 4) {
			System.out.println(valorA + " / " + valorB + " = " + (valorA / valorB));
		} else if (operando == 5) {
			System.out.println(valorA + " - " + valorB + " = " + Math.pow(valorA, valorB));
		} else if (operando == 6) {
			System.out.println(valorA + " - " + valorB + " = " + (valorA % valorB));
		}
		sc.close();
	}
}
