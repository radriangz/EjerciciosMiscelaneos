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
		Random rand = new Random();
		return stringDeChars.charAt(rand.nextInt(stringDeChars.length()));
	}

	/**
	 * {@link generateRamdomFloat(byte a, byte b)} Returns a float. Receives
	 * parameter (byte a), wich is the amount of digits before the decimal point,
	 * and parameter (byte b) wich are the amount of decimal digits.
	 */
	public static float generateRamdomFloat(byte a, byte b) {
		StringBuilder stringToFloat = new StringBuilder();
		Random randomInt = new Random();

		for (int i = 0; i < (a + b); i++) {
			if (i < a) {
				stringToFloat.append(randomInt.nextInt(10));
			} else if (i == a) {
				stringToFloat.append(".");
			} else {
				stringToFloat.append(randomInt.nextInt(10));
			}
		}
		return Float.parseFloat(stringToFloat.toString());
	}

	/**
	 * {@link getRandomString(String[] arrayOfStrings)} Receives a String[] and
	 * returns an item in the (i) position. (i) is pseudorandomly selected.
	 */
	public static String getRandomString(String[] arrayOfStrings) {
		Random randomInt = new Random();
		return (arrayOfStrings[randomInt.nextInt(arrayOfStrings.length)]);
	}

	/**
	 * {@link generateRandomBoolean()} Returns a random true or false, uses Random
	 * to determine it.
	 */
	public static boolean generateRandomBoolean() {
		boolean[] booleanArray = { true, false };
		Random randomInt = new Random();
		return booleanArray[randomInt.nextInt(booleanArray.length)];
	}

	/**
	 * {@link generateRandomFloatFromInterval(int maxValue, int minValue, byte
	 * decimalDigits)}
	 * 
	 * Returns a random number between (int maxValue) and (int minValue), with (byte
	 * decimalValue) indicating the amount of decimal digits.
	 */
	public static float generateRandomFloatFromInterval(int maxValue, int minValue, byte decimalDigits) {
		Random randomInt = new Random();
		StringBuilder stringToFloat = new StringBuilder().append((randomInt.nextInt(maxValue - minValue) + minValue))
				.append(".");

		for (byte i = 0; i < decimalDigits; i++) {
			stringToFloat.append(randomInt.nextInt(9));
		}

		return Float.parseFloat(stringToFloat.toString());
	}

	/**
	 * {@link generateRandomByte(byte a)}
	 * 
	 * Returns a byte from 0 to one number before (byte a)
	 */
	public static byte generateRandomByte(byte a) {
		// Random random = new Random();
		return (byte) random.nextInt(a);
	}

	/**
	 * {@link generateRandomInt(int number)}
	 * 
	 * Returns a int value from 0 to one number before (int number)
	 */
	public static int generateRandomInt(int number) {
		// Random random = new Random();
		return random.nextInt(number);
	}

	/**
	 * {@link generateRandomLoremIpsumString()}
	 * 
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
	 * {@link generateRandomLoremIpsumString()}
	 * 
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
}
