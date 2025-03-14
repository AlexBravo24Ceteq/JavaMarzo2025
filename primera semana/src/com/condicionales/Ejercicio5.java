package com.condicionales;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese la nota: ");
        double nota = scanner.nextDouble();

        System.out.print("Ingrese el sexo (M para masculino, F para femenino): ");
        char sexo = scanner.next().charAt(0);

        // Calcular la aceptación
        String resultado = calcularAceptacion(edad, nota, sexo);

        // Mostrar el resultado
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    public static String calcularAceptacion(int edad, double nota, char sexo) {
        if (nota >= 5 && edad >= 18) {
            if (sexo == 'F') {
                return "ACEPTADA";
            } else if (sexo == 'M') {
                return "POSIBLE";
            }
        }
        return "NO ACEPTADA";
	}

}
