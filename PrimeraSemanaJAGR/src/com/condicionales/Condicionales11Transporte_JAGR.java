package com.condicionales;

import java.util.Scanner;

public class Condicionales11Transporte_JAGR {
    private static final double MAX_PESO = 5.0;
    private static final double[] COSTOS = {24.0, 20.0, 21.0, 10.0, 18.0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();

        if (peso > MAX_PESO) {
            System.out.println("Lo sentimos, no podemos transportar paquetes de mas de " + MAX_PESO + " kg.");
        } else {
            System.out.println("Zonas disponibles:");
            System.out.println("1. America del Norte\n2. America Central\n3. America del Sur\n4. Europa\n5. Asia");

            System.out.print("Ingrese el numero de la zona de destino: ");
            int zona = scanner.nextInt();

            if (zona >= 1 && zona <= 5) {
                double costoEnvio = peso * COSTOS[zona - 1];
                System.out.println("El costo de envio es: " + costoEnvio + " euros.");
            } else {
                System.out.println("Zona no valida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}
