package com.condicionales;

import java.util.Scanner;

public class Condicionales11_ALCJ {

	public static void main(String[] args) {
		// 11.- Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América
		//Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y
		//la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		
		Scanner teclado = new Scanner(System.in);

        System.out.println("<<<<<Bienvenido>>>>");
        System.out.println("Ingresa el peso del paquete en kilogramos:");
        double peso = teclado.nextDouble();

        if (peso > 5) {
            System.out.println("El paquete no puede ser transportado debido a que supera el límite de 5 kg.");
        } else {
            System.out.println("Ingresa la zona de destino (1: América del Norte, 2: América Central, 3: América del Sur, 4: Europa, 5: Asia):");
            int zona = teclado.nextInt();
            double costoPorKilo;
            switch (zona) {
                case 1:
                    costoPorKilo = 24.00;
                    break;
                case 2:
                    costoPorKilo = 20.00;
                    break;
                case 3:
                    costoPorKilo = 21.00;
                    break;
                case 4:
                    costoPorKilo = 10.00;
                    break;
                case 5:
                    costoPorKilo = 18.00;
                    break;
                default:
                    System.out.println("ERROR: Zona no disponible.");
                    return;
            }
            
            double costoTotal = peso * costoPorKilo;
            System.out.println("El costo total del transporte es: " + costoTotal + " euros.");
        }




	}

}
