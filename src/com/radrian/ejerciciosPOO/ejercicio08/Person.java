package com.radrian.ejerciciosPOO.ejercicio08;

public abstract class Person {
	public String name;
	public String sex;
	byte age;
	
	public Person() {
		
	}
	
	public Person(String name, String sex, byte age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public abstract void setRandomAttendance();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}	

	
}
