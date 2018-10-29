/**
 * 
 */
package com.radrian.ejerciciosPOO.ejercicio05;

/**
 * @author RAdrian
 *
 */
public class Videojuego {
	String titulo;
	int horasEstimadas = 10;
	boolean isEntregado = false;
	String genero;
	String compañia;
	
	public Videojuego() {
		
	}
	
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}
	
	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return ("\nTítulo: " + titulo + 
				"\nHoras estimadas de juego: " + horasEstimadas + 
				"\nGénero: " + genero + 
				"\nCompañía: " + compañia);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
}
