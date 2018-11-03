package com.radrian.ejerciciosPOO.ejercicio08;

import com.radrian.ejercicios.Uitl.Utilidades;

public class Aula {
	String id;
	byte maxStudentCapacity;
	String teachingClass;
	boolean hasAC;
	boolean hasFans;

	public Aula() {
		setRandomId();
		setRandomTeachingClass();
		setRandomMaxStudentCapacity();
		setRandomAC();
		setRandomFans();
	}

	public Aula(String id, byte maxStudentCapacity, String teachingClass, boolean hasAC, boolean hasFans) {
		this.id = id;
		this.maxStudentCapacity = maxStudentCapacity;
		this.teachingClass = teachingClass;
		this.hasAC = hasAC;
		this.hasFans = hasFans;
	}

	/**
	 * Assigns a random Id to the classroom.
	 */
	private void setRandomId() {
		byte randomByte = Utilidades.generateRandomByte(3);

		if (randomByte == 0) {
			this.id = "Aula 001";
		} else if (randomByte == 1) {
			this.id = "Aula 002";
		} else {
			this.id = "Aula 003";
		}
	}

	/**
	 * Assigns a class to the classroom, according to its Id.
	 */
	private void setRandomTeachingClass() {
		if (this.id == "Aula 001") {
			this.teachingClass = "Matemáticas";
		} else if (this.id == "Aula 002") {
			this.teachingClass = "Filosofía";
		} else {
			this.teachingClass = "Física";
		}
	}

	/**
	 * Assigns a random max Capacity (25 to 35 students).
	 */
	public void setRandomMaxStudentCapacity() {
		this.maxStudentCapacity = (byte) (Utilidades.generateRandomByte(11) + 25);
	}

	/**
	 * Assigns a random boolean to hasAC.
	 */
	private void setRandomAC() {
		this.hasAC = Utilidades.generateRandomBoolean();
	}

	/**
	 * If there is no AC, assigns fans to the classroom.
	 */
	private void setRandomFans() {
		if (!this.hasAC) {
			this.hasFans = true;
		}
	}

	/**
	 * Returns true if the attendance is superior to 50% of maxStudentCapacity.
	 * */
	public boolean getMinAttendanceReached(byte attendance) {
		if((attendance * 100)/ maxStudentCapacity > 50) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte getMaxStudentCapacity() {
		return maxStudentCapacity;
	}

	public void setMaxStudentCapacity(byte maxStudentCapacity) {
		this.maxStudentCapacity = maxStudentCapacity;
	}

	public String getTeachingClass() {
		return teachingClass;
	}

	public void setTeachingClass(String teachingClass) {
		this.teachingClass = teachingClass;
	}

	public boolean isHasAC() {
		return hasAC;
	}

	public void setHasAC(boolean hasAC) {
		this.hasAC = hasAC;
	}

	public boolean isHasFans() {
		return hasFans;
	}

	public void setHasFans(boolean hasFans) {
		this.hasFans = hasFans;
	}

	@Override
	public String toString() {
		return ("\nId: " + this.getId() + 
				"\nCapacidad de estudiantes: " + this.getMaxStudentCapacity() + 
				"\nMateria: " + this.getTeachingClass() + 
				"\nTiene clima: " + this.isHasAC() + 
				"\nTiene ventiladores: " + this.isHasFans());
	}
	
}
