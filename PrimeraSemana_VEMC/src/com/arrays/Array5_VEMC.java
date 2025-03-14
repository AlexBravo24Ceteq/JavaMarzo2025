package com.arrays;

public class Array5_VEMC {

	public static void main(String[] args) {
// Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios. 
//Muestra en consola la lista de productos y sus precios. Por lo menos 5 productos o artículos.

		
		//Creamos un array con los nombres de los productos.
		String[] productos = {"Mazapanes", "Paletas", "Chicles", "Gomitas", "Frituras"};
		
		//Creamos otro array para los precios de los productos.
		double [] precios = {5.0,2.50,1.50,4.0,6.50};
		
		
		//Mostramos la lista de productos y sus precios.
		
		System.out.println("Lista de productos y precios:");
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i] + ": " + precios[i] + " pesos");
			
		}
		
	}

}
