package com.condicionales;

	import java.util.Scanner;

public class condicionales6_JAGR {

	public static void main(String[] args) {
		
		//La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva...
		//Trabajo 6
		
		 Scanner scanner = new Scanner(System.in);

	        // Solicitar datos al usuario
	        System.out.print("Ingrese el precio inicial por kilo de uva: ");
	        double precioInicial = scanner.nextDouble();

	        System.out.print("Ingrese el tipo de uva (A/B): ");
	        char tipoUva = scanner.next().toUpperCase().charAt(0);

	        System.out.print("Ingrese el tama�o de la uva (1/2): ");
	        int tama�oUva = scanner.nextInt();

	        System.out.print("Ingrese la cantidad de kilos a vender: ");
	        double kilos = scanner.nextDouble();

	        // Calcular el precio ajustado segun el tipo y tama�o
	        double precioFinal = precioInicial;

	        if (tipoUva == 'A') {
	            if (tama�oUva == 1) {
	                precioFinal += 0.20;  // Se le cargan 20 centimos
	            } else if (tama�oUva == 2) {
	                precioFinal += 0.30;  // Se le cargan 30 centimos
	            }
	        } else if (tipoUva == 'B') {
	            if (tama�oUva == 1) {
	                precioFinal -= 0.30;  // Se rebajan 30 centimos
	            } else if (tama�oUva == 2) {
	                precioFinal -= 0.50;  // Se rebajan 50 centimos
	            }
	        } else {
	            System.out.println("Tipo de uva no valido. Debe ser 'A' o 'B'.");
	            scanner.close();
	            return;
	        }

	        // Calcular el total a recibir
	        double totalRecibido = precioFinal * kilos;

	        // Mostrar resultado
	        System.out.println("\nResumen de la venta:");
	        System.out.println("Precio final por kilo: $" + precioFinal);
	        System.out.println("Cantidad de kilos vendidos: " + kilos);
	        System.out.println("Total a recibir: $" + totalRecibido);

	        scanner.close();
	    }
	}