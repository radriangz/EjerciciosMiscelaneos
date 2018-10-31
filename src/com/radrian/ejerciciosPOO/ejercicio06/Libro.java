package com.radrian.ejerciciosPOO.ejercicio06;

/**
 * @author RAdrian
 *
 */
public class Libro implements Comparable<Libro>{
	String isbn;
	String titulo;
	String autor;
	int numeroDePaginas;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
	@Override
		public String toString() {
			return ("El libro \"" + titulo + 
					"\", con ISBN " + isbn + 
					" y escrito por el autor " + autor +
					", tiene " + numeroDePaginas + " páginas.");
		}
	@Override
	public int compareTo(Libro libroAComparar) {
		if (this.numeroDePaginas < libroAComparar.numeroDePaginas) {
			return 1;
		} else if (this.numeroDePaginas == libroAComparar.numeroDePaginas) {
			return 0;
		} else {
			return -1;
		}
	}	
}
