package com.ciclos;

		import java.util.Scanner;

public class Ciclos4_JAGR {

	public static void main(String[] args) {
		
		//Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
	//cuantas existe esa letra dentro de la frase.
		//Trabajo 4
		
		Scanner scanner = new Scanner(System.in);

        // Solicitar frase
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        // Solicitar letra
        System.out.print("Ingrese una letra para buscar: ");
        char letra = scanner.next().charAt(0);

        int contador = 0;

        // la frase y contar cuantas veces aparece la letra
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }

        // resultado
        if (contador > 0) {
            System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
        } else {
            System.out.println("Carácter no encontrado.");
        }

        scanner.close();
    }


	}


