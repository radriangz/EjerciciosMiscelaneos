package com.radrian.ejercicios.Uitl;

import java.util.Random;

/**
 * @author RAdrian
 *
 */
public class Utilidades {
	static Random random = new Random();

	/**
	 * {@link generateRandomChar(String stringDeChars)} Receives a string wich
	 * contains all the characters needed, it returns one character psudorandomly
	 * selected.
	 */
	public static char generateRandomChar(String stringDeChars) {
		return stringDeChars.charAt(random.nextInt(stringDeChars.length()));
	}

	/**
	 * {@link generateRamdomFloat(int a, int b)} Returns a float. Receives
	 * parameter (byte a), wich is the amount of digits before the decimal point,
	 * and parameter (byte b) wich are the amount of decimal digits.
	 */
	public static float generateRamdomFloat(int a, int b) {
		StringBuilder stringToFloat = new StringBuilder();

		for (int i = 0; i < (a + b); i++) {
			if (i < a) {
				stringToFloat.append(random.nextInt(10));
			} else if (i == a) {
				stringToFloat.append(".");
			} else {
				stringToFloat.append(random.nextInt(10));
			}
		}
		return Float.parseFloat(stringToFloat.toString());
	}

	/**
	 * {@link getRandomString(String[] arrayOfStrings)} Receives a String[] and
	 * returns an item in the (i) position. (i) is pseudorandomly selected.
	 */
	public static String getRandomString(String[] arrayOfStrings) {
		return (arrayOfStrings[random.nextInt(arrayOfStrings.length)]);
	}

	/**
	 * {@link generateRandomBoolean()} Returns a random true or false, uses Random
	 * to determine it.
	 */
	public static boolean generateRandomBoolean() {
		return random.nextBoolean();
	}

	/**
	 * {@link generateRandomFloatFromInterval(int maxValue, int minValue, byte
	 * decimalDigits)}
	 * Returns a random number between (int maxValue) and (int minValue), with (byte
	 * decimalValue) indicating the amount of decimal digits.
	 */
	public static float generateRandomFloatFromInterval(int maxValue, int minValue, byte decimalDigits) {
		StringBuilder stringToFloat = new StringBuilder().append((random.nextInt(maxValue - minValue) + minValue))
				.append(".");
		for (byte i = 0; i < decimalDigits; i++) {
			stringToFloat.append(random.nextInt(9));
		}
		return Float.parseFloat(stringToFloat.toString());
	}

	/**
	 * {@link generateRandomByte(byte a)}
	 * Returns a byte from 0 to one number before (byte a)
	 */
	public static byte generateRandomByte(int a) {
		return (byte) random.nextInt(a);
	}

	/**
	 * {@link generateRandomInt(int number)}
	 * Returns a int value from 0 to one number before (int number)
	 */
	public static int generateRandomInt(int number) {
		return random.nextInt(number);
	}
	
	/**
	 * {@link generateRandomInt(int maxNumber, int minNumber)}
	 * Returns a random int value from the minNumber to maxNumber.
	 */
	public static int generateRandomInt(int maxNumber, int minNumber) {
		return (random.nextInt(maxNumber - minNumber) + minNumber);
	}

	/**
	 * {@link generateRandomLoremIpsumString()}
	 * Randomly selects one word from the first paragraph of Lorem Ipsum
	 */
	public static String generateRandomLoremIpsumString() {
		String[] loremString = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit", "sed",
				"do", "eiusmod", "tempor", "incididunt", "ut", "labore", "et", "dolore", "magna", "aliqua", "Ut",
				"enim", "ad", "minim", "veniam", "quis", "nostrud", "exercitation", "ullamco", "laboris", "nisi", "ut",
				"aliquip", "ex", "ea", "commodo", "consequat", "Duis", "aute", "irure", "dolor", "in", "reprehenderit",
				"in", "voluptate", "velit", "esse", "cillum", "dolore", "eu", "fugiat", "nulla", "pariatur",
				"Excepteur", "sint", "occaecat", "cupidatat", "non", "proident", "sunt", "in", "culpa", "qui",
				"officia", "deserunt", "mollit", "anim", "id", "est", "laborum" };
		return loremString[random.nextInt(loremString.length)];
	}

	/**
	 * {@link generateRandomTitle()}
	 * Creates a title using random words from the first paragraph of Lorem Ipsum.
	 * Fist letter is mayus. The amount of words is defined by (byte wordsInTitle).
	 */
	public static String generateRandomTitle(int wordsInTitle) {
		StringBuilder stringTitle = new StringBuilder();

		for (byte i = 0; i < wordsInTitle; i++) {
			if (i == 0) {
				stringTitle.append(firstCharToMayus(generateRandomLoremIpsumString())).append(" ");
			} else {
				stringTitle.append(generateRandomLoremIpsumString()).append(" ");
			}
		}
		return stringTitle.toString();
	}

	/**
	 * {@link firstCharToMayus(String word)}
	 * 
	 * Replaces first letter for the same letter but uppercase.
	 */
	public static String firstCharToMayus(String word) {
		StringBuilder newWord = new StringBuilder(word);
		newWord.setCharAt(0, Character.toUpperCase(newWord.charAt(0)));
		return newWord.toString();
	}
	
	/**
	 * {@link generateRandomName()}
	 * Receives as parameter "h" for male names and "m" for female.
	 * if there's no recognizable string, it returns a random male name.
	 * Generates a string with a complete name (randomName + randomLastName).
	 * */
	public static String generateRandomName(String sex) {
		if(sex.toLowerCase() == "hombre" || sex.toLowerCase() == "h") {
			return (getRandomMaleName() + " " + getRandomLastName());
		} else if (sex.toLowerCase() == "mujer" || sex.toLowerCase() == "m") {
			return (getRandomFemaleName() + " " + getRandomLastName());
		} else {
			return (getRandomMaleName() + " " + getRandomLastName());
		}
	}
	
	/**
	 * Returns a randomly selected last name from an internal collection.
	 * */
	private static String getRandomLastName() {
		String[] randomLastName = {"Colina", "Meza", "L�pez", "Tirado", "Gonz�lez", "Pi�a", "Colomo",
				"Rayos", "Robles", "C�lebre", "Corona", "Tarro", "Galleta", "Estrella", "Sugar", 
				"Universe", "Murphy", "Smith", "Hansen", "Anderson", "Korhonen", "Ivanov", "Tamm",
				"Smirnov", "Melnyk", "Rusu", "Popa", "Yilmaz", "Papadopoulos", "Hoxha", "Stojanovski",
				"Popovic", "Hodzic", "Horvat", "Novak", "Gruber", "Horvath", "M�ller", "de Jong",
				"Martin", "Garc�a", "da Silva", "Silva", "Rossi", "Ram�rez", "Fernandez", "J�nssonn",
				"Einarsson", "de Tours", "Thomas", "Roberts", "Bernard", "Peeters", "Dubois", 
				"Nielsen", "Stojanovski", "Johansen", "Murchadh", "Popovic", "Kazlauskas", "Borg",
				"Chan", "Pech", "Canul", "May", "Canche", "Mart�nez", "Rodr�guez", "Valenzuela", 
				"Flores", "Castro", "P�rez", "S�nchez", "Hidalgo", "Amador", "Ozuna", "De la Cruz"};
		return (Utilidades.getRandomString(randomLastName) + " " + Utilidades.getRandomString(randomLastName)); 
	}
	
	/**
	 * Returns a randomly selected male name from an internal collection.
	 * */
	private static String getRandomMaleName() {
		String[] randomMaleName = {"Aceituno", "Aguinaldo", "All Power", "Batman", "Burger King",
				"Cacerolo",	"Caralampio", "Cheyenne", "Diodoro", "Email", "Juan", "Jos� Luis", 
				"Jos�", "Francisco", "Antonio", "Miguel �ngel", "Pedro", "Alejandro", "Manuel", 
				"Juan Carlos", "Roberto", "Fernando", "Daniel", "Carlos", "Jorge", "Ricardo", 
				"Miguel", "Eduardo", "Javier", "Rafael", "Mart�n", "Ra�l", "David", "Jos� Antonio",
				"Arturo", "Marco Antonio", "Jos� Manuel", "Francisco Javier", "Enrique", "Gerardo",
				"Mario", "Alfredo", "Sergio", "Alberto", "Luis", "Armando", "Santiago", "Juan Manuel",
				"�ngel", "Salvador", "V�ctor Manuel", "Gabriel", "Andr�s", "�scar", "Guillermo",
				"Ram�n", "Pablo", "Rub�n", "Luis �ngel", "Felipe", "Jorge de Jes�s", "Jaime", 
				"Jos� Guadalupe", "Julio C�sar", "Jos� de Jes�s", "Diego", "Agust�n", "Gustavo"};
		return Utilidades.getRandomString(randomMaleName);
	}
	
	/**
	 * Returns a randomly selected female name from an internal collection.
	 * */
	private static String getRandomFemaleName() {
		String[] randomFemaleName = {"Anivdelarev",  "Benefecia", "Christmas Day", "Delgadina", 
				"Caraciola", "Lady Di", "Mar�a Guadalupe", "Mar�a", "Guadalupe", "Francisca",
				"Juana", "Margarita", "Mar�a del Carmen", "Josefina", "Ver�nica", "Mar�a Elena",
				"Leticia", "Rosa", "Teresa", "Alicia", "Mar�a Fernanda", "Martha", "Yolanda", 
				"Patricia", "Mar�a de los �ngeles", "Rosa Mar�a", "Elizabeth", "Gloria", "Gabriela",
				"Silvia", "Mar�a de Guadalupe", "Mar�a de Jes�s", "Ana Mar�a", "Mar�a Isabel", 
				"Antonia", "Mar�a Luisa", "Mar�a del Rosario", "Araceli", "Andrea", "Isabel", 
				"Mar�a Teresa", "Irma", "Carmen", "Luc�a", "Adriana", "Mar�a de la Luz", "Europa",
				"Am�rica"};
		return Utilidades.getRandomString(randomFemaleName);
	}
	
	/**
	 * Returns a random sex as a string.
	 * */
	public static String generateRandomSex() {
		if(generateRandomBoolean()) {
			return "hombre";
		} else {
			return "mujer";
		}
	}
	
}
