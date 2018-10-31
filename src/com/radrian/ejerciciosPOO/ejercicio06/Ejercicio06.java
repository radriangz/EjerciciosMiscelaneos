package com.radrian.ejerciciosPOO.ejercicio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.radrian.ejercicios.Uitl.Utilidades;

public class Ejercicio06 {

	public static void main(String[] args) {
		List<Libro> listDeLibros = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			listDeLibros.add(new Libro());
			listDeLibros.get(i).setTitulo(Utilidades.generateRandomTitle(2));
			listDeLibros.get(i).setAutor(Utilidades.generateRandomName());
			listDeLibros.get(i).setIsbn(listDeLibros.get(i).getAutor() +"-" + String.valueOf(Utilidades.generateRamdomFloat(6, 6)));
			listDeLibros.get(i).setNumeroDePaginas(Utilidades.generateRandomInt(150, 50));
		}
		Collections.sort(listDeLibros);
		System.out.println("Hay " + listDeLibros.size() + " libros en el librero.\n" + 
							"El libro que más paginas tiene es \"" + listDeLibros.get(0).getTitulo() +
							"\", del autor " + listDeLibros.get(0).getAutor() + 
							", con " + listDeLibros.get(0).getNumeroDePaginas() + " páginas.");
//		System.out.println();
//		for (Libro libro : listDeLibros) {
//			System.out.println(libro.toString());
//		}
	}

}
