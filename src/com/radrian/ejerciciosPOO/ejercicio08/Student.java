package com.radrian.ejerciciosPOO.ejercicio08;

import com.radrian.ejercicios.Uitl.Utilidades;

public class Student extends Person implements Comparable<Student> {
	byte currentGrade;
	boolean isAttending;

	public Student() {
		super.sex = Utilidades.generateRandomSex();
		super.name = Utilidades.generateRandomName(super.sex);
		super.age = (byte) (Utilidades.generateRandomByte(2) + 15);
		setRandomCurrentGrade();
		setRandomAttendance();
	}

	public Student(String name, String sex, byte age, byte currentGrade, boolean isAssisting) {
		super(name, sex, age);
		this.currentGrade = currentGrade;
		this.isAttending = isAssisting;
	}

	/**
	 * Generates a random assistance of 50%.
	 */
	@Override
	public void setRandomAttendance() {
		isAttending = Utilidades.generateRandomBoolean();
	}

	/**
	 * Generates random grade from 0 to 10.
	 */
	public void setRandomCurrentGrade() {
		currentGrade = Utilidades.generateRandomByte(11);
	}

	public byte getCurrentGrade() {
		return currentGrade;
	}

	public void setCurrentGrade(byte currentGrade) {
		this.currentGrade = currentGrade;
	}

	public boolean isAttending() {
		return isAttending;
	}

	public void setAttending(boolean isAssisting) {
		this.isAttending = isAssisting;
	}

	@Override
	public int compareTo(Student studentToCompare) {
		if (this.currentGrade < studentToCompare.currentGrade) {
			return 1;
		} else if (this.currentGrade == studentToCompare.currentGrade) {
			return 0;
		} else {
			return -1;
		}
	}

}
