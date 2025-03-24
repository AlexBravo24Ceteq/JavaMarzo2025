package com.condicionales;

import java.util.Scanner;

public class condicionales11_JAFA {
	
	public static void main(String[] args) {
//		Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
//		Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
//		la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		
		
		Scanner input = new Scanner(System.in);
		double peso;
		int zona;
		
		System.out.println("Ingresa el peso en kg (maximo 5Kg):");
		peso = input.nextDouble();
		
		if (peso >5) {
			System.out.println("El peso no es permitido. Lo sentimos");
		}
		else {
			System.out.println("Introduce la zona (1.America del norte 2.America Central 3.America del sur 4.Europa 5.Asia)");
			zona= input.nextInt();
		
		
		double CostoKilo, CostoTotal;
		
		switch (zona) {
		case 1:
			CostoKilo=24;
			break;
		case 2:
			CostoKilo=20;
			break;
		case 3:
			CostoKilo=21;
			break;
		case 4:
			CostoKilo=10;
			break;
		case 5:
			CostoKilo=18;
			break;

		default:
			System.out.println("ERROR: Zona de destino incorrecta");
			return;
		}
		CostoTotal = peso * CostoKilo;
		
		System.out.println("El costo del Transporte es " + CostoTotal + " euros");
		}
		
	}

}
