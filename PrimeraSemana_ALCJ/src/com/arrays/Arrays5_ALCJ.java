package com.arrays;

public class Arrays5_ALCJ {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		//respectivos precios. Muestra en consola la lista de productos y sus precios.
		//Por lo menos 5 productos o artículos.
		
		System.out.println("<<<<<<<<<<Welcome to Steren>>>>>>>>>>");
		
        String[] productos = {"Laptop", "Telefono", "Tablet", "Monitor", "Teclado"};
        double[] precios = {1200.50, 800.00, 350.75, 250.00, 50.25};
        
        System.out.println("Productos y sus costos costos:");
        for (int x = 0; x < productos.length; x++) {
            System.out.println("Producto: " + productos[x] + " - Precio: $" + precios[x]);

	}

}

}