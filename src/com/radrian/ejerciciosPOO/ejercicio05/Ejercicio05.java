package com.radrian.ejerciciosPOO.ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.radrian.ejercicios.Uitl.Utilidades;

/**
 * @author RAdrian
 *
 */
public class Ejercicio05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte juegosSinEntregar = 0;
		byte juegosEntregados = 0;
		byte seriesSinEntregar = 0;
		byte seriesEntregadas = 0;
		List<Serie> listDeSeries = new ArrayList<>();
		List<Videojuego> listDeVideojuegos = new ArrayList<>();

		for (byte i = 0; i < 5; i++) {
			listDeVideojuegos.add(new Videojuego((Utilidades.generateRandomTitle(2)),
					Utilidades.generateRandomInt(20), Videojuego.generateRandomVideogameGenero(),
					Videojuego.generateRandomVideogameCompany()));
			if(Utilidades.generateRandomBoolean()) {
				listDeVideojuegos.get(i).entregar();
				juegosEntregados++;
			}
			if (!listDeVideojuegos.get(i).isEntregado) {
				juegosSinEntregar++;
			}
			
			listDeSeries.add(new Serie(Utilidades.generateRandomTitle(2), Serie.getRandomSerieCreator(),
					(byte) (Utilidades.generateRandomInt(9) + 1), Serie.getRandomGenero()));
			if(Utilidades.generateRandomBoolean()) {
				listDeSeries.get(i).entregar();
				seriesEntregadas++;
			}
			if (!listDeSeries.get(i).isEntregado) {
				seriesSinEntregar++;
			}
		}
		Collections.sort(listDeSeries);
		Collections.sort(listDeVideojuegos);;
		
		System.out.println("Videojuego con más horas estimadas:" + listDeVideojuegos.get(0).toString() + "\n");
		System.out.println("Serie con más temporadas:" + listDeSeries.get(0).toString());
		
		System.out.println("\nJuegos entregados: " + juegosEntregados + 
				"\nJuegos por entregar: " + juegosSinEntregar + "\n" +
				"\nSeries entregadas: " + seriesEntregadas + 
				"\nSeries por entregar: " + seriesSinEntregar + "\n");
		
//		for (Serie serie : listDeSeries) {
//			System.out.println("temporadas: " + serie.getNumeroDeTemporada());
//		}
//		System.out.println();
//		for (Videojuego videojuego : listDeVideojuegos) {
//			System.out.println("número de horas: " + videojuego.horasEstimadas);
//		}
	}

}
