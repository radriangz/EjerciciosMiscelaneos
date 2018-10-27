package com.radrian.ejerciciosPOO.ejercicio02;

import java.util.Scanner;

/**
 * * Ejercicio 2) Haz una clase llamada Persona que siga las siguientes
 * condiciones: Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer),
 * peso y altura. No queremos que se accedan directamente a ellos. Piensa que
 * modificador de acceso es el m�s adecuado, tambi�n su tipo. Si quieres a�adir
 * alg�n atributo puedes hacerlo.
 * 
 * * Por defecto, todos los atributos menos el DNI ser�n valores por defecto
 * seg�n su tipo (0 n�meros, cadena vac�a para String, etc.). Sexo sera hombre
 * por defecto, usa una constante para ello.
 * 
 * * Se implantaran varios constructores: Un constructor por defecto. Un
 * constructor con el nombre, edad y sexo, el resto por defecto. Un constructor
 * con todos los atributos como par�metro.
 * 
 * * Los m�todos que se implementaran son:
 * 
 * * calcularIMC(): calculara si la persona esta en su peso ideal (peso en
 * kg/(altura^2 en m)), si esta f�rmula devuelve un valor menor que 20, la
 * funci�n devuelve un -1, si devuelve un n�mero entre 20 y 25 (incluidos),
 * significa que esta por debajo de su peso ideal la funci�n devuelve un 0 y si
 * devuelve un valor mayor que 25 significa que tiene sobrepeso, la funci�n
 * devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
 * 
 * * esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
 * 
 * * comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si
 * no es correcto, sera H. No sera visible al exterior.
 * 
 * * toString(): devuelve toda la informaci�n del objeto.
 * 
 * * generaDNI(): genera un n�mero aleatorio de 8 cifras, genera a partir de
 * este su n�mero su letra correspondiente. Este m�todo sera invocado cuando se
 * construya el objeto. Puedes dividir el m�todo para que te sea m�s f�cil. No
 * ser� visible al exterior.
 * 
 * M�todos set de cada par�metro, excepto de DNI.
 * 
 * * Ahora, crea una clase ejecutable que haga lo siguiente:
 * 
 * 		Pide por teclado el nombre, la edad, sexo, peso y altura. 
 * 		Crea 3 objetos de la clase anterior, el primer objeto obtendr� las 
 * anteriores variables pedidas por teclado, el segundo objeto obtendr� todos 
 * los anteriores menos el peso y la altura y el �ltimo por defecto, para este �ltimo utiliza los
 * m�todos set para darle a los atributos un valor.
 * 		Para cada objeto, deber� comprobar si esta en su peso ideal, tiene sobrepeso 
 * o por debajo de su peso ideal con un mensaje. 
 *  	Indicar para cada objeto si es mayor de edad. 
 *		Por �ltimo, mostrar la informaci�n de cada objeto.
 * 
 * Puedes usar m�todos en la clase ejecutable, para que os sea mas f�cil.
 * 
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
			Persona usuario01 = usuarioCompleto();
			System.out.println("Peso del usuario: " + usuario01.calcularIMC());
			System.out.println("Mayor�a de edad: " + usuario01.esMayorDeEdad());
			System.out.println("Datos del usuario: \n" + usuario01.toString());
			
			
			
		}
		sc.close();
	}

	private Persona usuarioCompleto() {
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

		Persona uCompleto = new Persona(nombre, edad, sexo, peso, altura);
		sc.close();
		return uCompleto;
	}
}
