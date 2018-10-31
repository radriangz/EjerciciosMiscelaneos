/**
 * 
 */
package com.radrian.ejerciciosPOO.ejercicio05;

import com.radrian.ejercicios.Uitl.Utilidades;

/**
 * @author RAdrian
 *
 */
public class Videojuego implements Entregable, Comparable<Videojuego> {
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

	public static String generateRandomVideogameGenero() {
		String[] videogameGenres = {"Action", "Platform", "Shooter", "Platform", "Shooter", "Fighting", "Beat \'em up", "Stealth", 
				"Survival", "Rhythm", "Action-adventure", "Survival horror", "Metroidvania", "Text adventures", "Graphic adventures", 
				"Visual novels", "Interactive movie", "Real-time 3D adventures", "Role-playing", "Action RPG"};
		return (Utilidades.getRandomString(videogameGenres) + " Game");
	}
	
	public static String generateRandomVideogameCompany() {
		String[] videogameCompany = {"Nintendo", "Valve Corporation", "Rockstar", "Electronic Arts", "Activision Blizzard", 
				"Sony Computer Entertainment", "Ubisoft", "Sega Games"};
		return Utilidades.getRandomString(videogameCompany);
	}
	
	public int compareTo(Videojuego videojuegoAComparar) {
		if (this.horasEstimadas < videojuegoAComparar.horasEstimadas) {
			return 1;
		} else if (this.horasEstimadas == videojuegoAComparar.horasEstimadas) {
			return 0;
		} else {
			return -1;
		}
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
				"\nHoras estimadas de juego: " + horasEstimadas + 
				"\nGénero: " + genero + 
				"\nCompañía: " + compañia);
	}
	
}
