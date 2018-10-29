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
	String compa�ia;
	
	public Videojuego() {
		
	}
	
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}
	
	public Videojuego(String titulo, int horasEstimadas, String genero, String compa�ia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compa�ia = compa�ia;
	}

	@Override
	public String toString() {
		return ("\nT�tulo: " + titulo + 
				"\nHoras estimadas de juego: " + horasEstimadas + 
				"\nG�nero: " + genero + 
				"\nCompa��a: " + compa�ia);
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

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}
	
}
