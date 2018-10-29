package com.radrian.ejerciciosPOO.ejercicio04;

/**
 * @author RAdrian
 *
 */
public class Ejercicio04 {

	public void metodo() {
		float precioTVs = 0;
		float precioLavadoras = 0;
		float precioTotal = 0;
		Electrodomestico[] arrayDeElectrodomesticos = new Electrodomestico[10];

		for (int i = 0; i < arrayDeElectrodomesticos.length; i++) {
			if (i < 5) {
				Television tv;
				if ((i % 2) == 0) {
					tv = new Television(Electrodomestico.generateRamdomPrice(),
							Electrodomestico.generateRandomWeight());
					// resolucion y sintonizador default
					arrayDeElectrodomesticos[i] = tv;
				} else {
					tv = new Television(Television.generateRandomResolucion(),
							Television.generateRandomSintonizadorTDT(), Electrodomestico.generateRamdomPrice(),
							Electrodomestico.generateRandomWeight(), Electrodomestico.generateRandomColour(),
							Electrodomestico.generateRandomConsumoEnergetico());
					// each attrin is randomly generated and used as parameter for Television
					// constructor.
					arrayDeElectrodomesticos[i] = tv;
				}
			} else {
				if (i >= 5 && i < arrayDeElectrodomesticos.length) {
					Lavadora lavadora;
					if ((i % 2) == 0) {
						lavadora = new Lavadora(Electrodomestico.generateRamdomPrice(),
								Electrodomestico.generateRandomWeight());
						// carga default
						arrayDeElectrodomesticos[i] = lavadora;
					} else {
						lavadora = new Lavadora(Lavadora.generateRandomCarga(), Electrodomestico.generateRamdomPrice(),
								Electrodomestico.generateRandomWeight(), Electrodomestico.generateRandomColour(),
								Electrodomestico.generateRandomConsumoEnergetico());
						// each attribute is randomly generated and used as parameter for Lavadora
						// constructor.
						arrayDeElectrodomesticos[i] = lavadora;
					}
				}
			}
		}

		for (int i = 0; i < arrayDeElectrodomesticos.length; i++) {
			if (arrayDeElectrodomesticos[i].getClass() == Television.class) {
				System.out.println((i + 1) + ". Artículo: Televisión " + (i + 1) + ". Precio: "
						+ arrayDeElectrodomesticos[i].precioFinal());
				precioTVs += arrayDeElectrodomesticos[i].precioFinal();
				precioTotal += arrayDeElectrodomesticos[i].precioFinal();
			} else {
				System.out.println((i + 1) + ". Artículo: Lavadora" + (i + 1) + ". Precio: "
						+ String.valueOf(arrayDeElectrodomesticos[i].precioFinal()));
				precioLavadoras += arrayDeElectrodomesticos[i].precioFinal();
				precioTotal += arrayDeElectrodomesticos[i].precioFinal();
			}
		}
		System.out.println("\nPrecio total Tv's: $ " + String.valueOf(precioTVs) + "\nPrecio total Lavadoras: $ "
				+ String.valueOf(precioLavadoras) + "\nPrecio Total: $ " + String.valueOf(precioTotal));

	}

}
