package com.radrian.ejerciciosPOO.ejercicio08;

import com.radrian.ejercicios.Uitl.Utilidades;

public class Teacher extends Person {
	String teachingClass;
	boolean isAttending;

	public Teacher() {
		super.sex = Utilidades.generateRandomSex();
		super.name = Utilidades.generateRandomName(super.sex);
		super.age = (byte) (Utilidades.generateRandomByte(20) + 26);
		setRandomTeachingClass();
		setRandomAttendance();
	}
	
	public Teacher(String name, String sex, byte age, String teachingClass, boolean isAttending) {
		super(name, sex, age);
		this.teachingClass = teachingClass;
		this.isAttending = isAttending;
	}

	/**
	 * Assigns a random class among "Matemáticas", "Filosofía" and "Física".
	 * */
	private void setRandomTeachingClass() {
		byte randomByte = Utilidades.generateRandomByte(3);
		
		if ( randomByte == 0) {
			this.teachingClass = "Matemáticas";
		} else if (randomByte == 1) {
			this.teachingClass = "Filosofía";
		} else {
			this.teachingClass = "Física";
		}
	}
	
	/**
	 * Assigns a random assistance with 20% chance of non attendance.
	 * */
	@Override
	public void setRandomAttendance() {
		if(Utilidades.generateRandomByte(5) == 0) {
			isAttending = false;
		} else {
			isAttending = true;
		}
	}

	public String getTeachingClass() {
		return teachingClass;
	}

	public void setTeachingClass(String teachingClass) {
		this.teachingClass = teachingClass;
	}

	public boolean isAttending() {
		return isAttending;
	}

	public void setAttending(boolean isAssisting) {
		this.isAttending = isAssisting;
	}
	
	@Override
	public String toString() {
		return ("\nNombre: " + this.getName() + 
				"\nSexo: " + this.getSex() + 
				"\nEdad: " + Byte.toString(this.getAge()) + 
				"\nMateria: " + this.getTeachingClass() + 
				"\nAsistencia: " + this.isAttending());
	}
	
}