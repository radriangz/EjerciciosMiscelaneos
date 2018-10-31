package com.radrian.ejerciciosPOO.ejercicio05;

import com.radrian.ejercicios.Uitl.Utilidades;

/**
 * @author RAdrian
 *
 */
public class Serie implements Entregable, Comparable<Serie> {
	String titulo;
	byte numeroDeTemporada = 3;
	boolean isEntregado = false;
	String genero;
	String creador;

	public Serie() {

	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, String creador, byte numeroDeTemporada, String genero) {
		this.titulo = titulo;
		this.creador = creador;
		this.numeroDeTemporada = numeroDeTemporada;
		this.genero = genero;
	}
	
	public static String getRandomSerieCreator() {
		String[] randomName = {"Aceituno", "Aguinaldo", "All Power", "Anivdelarev", "Batman", "Benefecia", "Burger King",
				"Cacerolo",	"Calzón", "Caraciola", "Caralampio", "Cesárea", "Cheyenne", "Christmas Day", "Circunsición", 
				"Culebro", "Delgadina", "Diodoro", "Email"};
		String[] randomApellido = {"Colina", "Meza", "López", "Tirado", "González", "Piña", "Colomo", "Rayos", "Robles", "Celebre",
				"Corona", "Tarro", "Galleta", "Estrella", "Sugar", "Universe"};
		return (Utilidades.getRandomString(randomName) + " " + Utilidades.getRandomString(randomApellido)); 
	}
	
	public static String getRandomGenero() {
		String[] randomGenero = {"Acción", "Sci-fi", "Psicológico", "Drama", "Recuentos de la vida", "Comedia", "Terror", "Thriller", 
								"Musical", "Documental"};
		return Utilidades.getRandomString(randomGenero);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public byte getNumeroDeTemporada() {
		return numeroDeTemporada;
	}

	public void setNumeroDeTemporada(byte numeroDeTemporada) {
		this.numeroDeTemporada = numeroDeTemporada;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public void entregar() {
		isEntregado = true;
	}

	@Override
	public void devolver() {
		isEntregado = false;
	}

	@Override
	public boolean isEntregado() {
		return isEntregado;
	}

	@Override
	public void compareTo(Object a) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public String toString() {
		return ("\nTítulo: " + titulo + 
				"\nCreador: " + creador + 
				"\nNo. de Temporadas: " + numeroDeTemporada +
				"\nGénero: " + genero);
	}
	
	@Override
	public int compareTo(Serie serieAComparar) {
		if (this.numeroDeTemporada < serieAComparar.numeroDeTemporada) {
			return 1;
		} else if (this.numeroDeTemporada == serieAComparar.numeroDeTemporada) {
			return 0;
		} else {
			return -1;
		}
	}

}
