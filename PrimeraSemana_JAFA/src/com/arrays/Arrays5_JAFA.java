package com.arrays;

public class Arrays5_JAFA {

	public static void main(String[] args) {
//		// Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
//		respectivos precios. Muestra en consola la lista de productos y sus precios. 
//		Por lo menos 5 productos o artículos
		
		
		String [] producto = {"Pantalon","Laptop","Recamara","Mesa","Sillon"};
		
		int [] precio = {800,25000,35000,6000,3500};
		
		for (int i = 0; i < producto.length; i++) {
			System.out.println(producto[i]+ " : "+ precio[i] );
		}
		

	}

}
