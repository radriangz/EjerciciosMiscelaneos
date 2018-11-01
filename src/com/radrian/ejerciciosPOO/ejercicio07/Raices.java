package com.radrian.ejerciciosPOO.ejercicio07;

/**
 * 
 * @author RAdrian
 *
 */
public class Raices {
	private float a, b, c, x1, x2, discriminante;
		
	public Raices(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.b = c;
	}

//	(-b±√((b^2)-(4*a*c)))/(2*a)
	
	/**
	 * When called, this method prints in console wether the ecuation has one, two,
	 * or no solutions.
	 */
	public void printResults() {
		executeCalc();
		printRaices();
		printRaiz();
	}

	public void executeCalc() {
		float negB = calcNegativeB();
		calcDiscriminante();
		calcX1(negB);
		calcX2(negB);
	}

	/**
	 * Calculates the negative value of (b).
	 */
	private float calcNegativeB() {
		return (b * -1f);
	}

	/**
	 * Calculates the discriminante [√((b^2)-(4*a*c))].
	 */
	private float calcDiscriminante() {
		discriminante = (float) Math.pow(((b * b)- ((a * c) * 4)), 0.5); //(Math.pow(b, b)) 
		return discriminante;
		// check if it isn't better to (b * b) instead of Math.pow();
	}

	/**
	 * Calculates the value of x1. Uses the positive discriminante
	 */
	private float calcX1(float negB) {
		x1 = (negB + (float) (discriminante)) / (a * 2);
		return x1;
	}

	/**
	 * Calculates the value of x2. Uses the negative discriminante
	 */
	private float calcX2(float negB) {
		x2 = (negB - (float) (discriminante)) / (a * 2);
		return x2;
	}

	/**
	 * Prints in console if there are two solutions, but ONLY IF there are two
	 * solutions to the ecuation.
	 */
	public void printRaices() {
		if (hasRaices()) {
			System.out.println("Tiene dos soluciones.\n" + "x1: " + String.valueOf(x1) + "\nx2: " + String.valueOf(x2));
		}
	}

	/**
	 * Prints in console if there is one solution, but ONLY IF there is one solution
	 * to the ecuation.
	 */
	public void printRaiz() {
		if (hasRaiz()) {
			System.out.println("Solo tiene una solución.\n" + 
					"x1: " + String.valueOf(x1) + "x2: " + String.valueOf(x2));
		} else {
			System.out.println("La ecuación no tiene solución real.");
		}
	}

	/**
	 * Returns true if the ecuation has two solutions (if both solutions are the
	 * same, it doesn't count as two).
	 */
	private boolean hasRaices() {
		if (discriminante > 0) {
			return true;
		} else if (discriminante == 0){
			return false;
		} else {
			return false;
		}
	}

	/**
	 * Returns true if there's ONLY ONE solution to the ecuation, OR NONE. Both
	 * solutions are the same and it counts as only one. Returns false if the
	 * ecuation has NONE, when discriminante is imaginary.
	 */
	private boolean hasRaiz() {
		if (discriminante == 0f) {
			return true;
		} else if (discriminante > 0) {
			return false;
		} else {
			return false;
		}
	}

	public float getX1() {
		return x1;
	}

	public float getX2() {
		return x2;
	}

	public float getDiscriminante() {
		return discriminante;
	}

}
