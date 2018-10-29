package com.radrian.ejerciciosPOO.ejercicio05;

/**
 * @author RAdrian
 *
 */
public class Serie {
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

	@Override
	public String toString() {
		return ("\nTítulo: " + titulo +
				"\nCreador: " + creador +
				"\nNo. de Temporada" + 
				"\nGénero" + genero);
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
	
}
