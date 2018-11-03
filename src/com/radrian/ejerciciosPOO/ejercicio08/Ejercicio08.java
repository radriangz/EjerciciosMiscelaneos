package com.radrian.ejerciciosPOO.ejercicio08;

import java.util.ArrayList;
import java.util.Collections;

import com.radrian.ejercicios.Uitl.Utilidades;

public class Ejercicio08 {

	public static void main(String[] args) {
		byte assistingStudents = 0;

		Aula classroom = new Aula();
		//classroom.setTeachingClass("Matemáticas");
		
		Teacher currentTeacher = new Teacher();
//		currentTeacher.setTeachingClass("Matemáticas");
//		currentTeacher.setAttending(true);
		
		byte totalStudents = (byte) (Utilidades.generateRandomByte(11) + 25);
		ArrayList<Student> students = new ArrayList<Student>();
		
		if (currentTeacher.isAttending) {
			if (currentTeacher.getTeachingClass() == classroom.getTeachingClass()) {
				for (byte i = 0; i < totalStudents; i++) {
					students.add(new Student());
					if (students.get(i).isAttending) {
						assistingStudents++;
					}
					Collections.sort(students);
				}
				if (classroom.getMinAttendanceReached(assistingStudents)) {
					System.out.println("Asistieron " + assistingStudents + " de " + students.size() + " alumnos.");
					System.out.println("\nAula" + classroom.toString());
					System.out.println("\nMaestro" + currentTeacher.toString());
					
					ArrayList<Student> maleStudents = new ArrayList<>();
					ArrayList<Student> femaleStudents = new ArrayList<>();
					
					System.out.println("\nCalificaciones Mujeres:");
					for (Student student : students) {
						if (student.isAttending() && student.getSex().equals("hombre")) {
							maleStudents.add(student);
						} else if (student.isAttending() && student.getSex().equals("mujer")) {
							femaleStudents.add(student);
							System.out.println(student.getName() + ": Calificación: " +  student.getCurrentGrade());
						}
					} 
					System.out.println("\nCalificaciones Hombres:");
					for (Student student : maleStudents) {
						System.out.println(student.getName() + ": Calificación: " +  student.getCurrentGrade());
					}
				} else {
					System.out.println("No llegaron suficientes alumnos.");
					System.out.println("Asistieron " + assistingStudents + " de " + students.size() + ".");
					System.out.println(classroom.toString());
					System.out.println(currentTeacher.toString());
				}
			} else {
				System.out.println("No hay aula disponible.");
				System.out.println(classroom.toString());
				System.out.println(currentTeacher.toString());
			}
		} else {
			System.out.println("El maestro no asistió a clases.");
			System.out.println(currentTeacher.toString());
		}

	}

}
