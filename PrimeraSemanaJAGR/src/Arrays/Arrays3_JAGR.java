package Arrays;

import java.util.Scanner;

public class Arrays3_JAGR {

	public static void main(String[] args) {
		
		
		//Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		//caracteres.
	

Scanner scanner = new Scanner(System.in);
        
        // Solicitar una frase al usuario
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        
        // Convertir la frase en un array de caracteres
        char[] caracteres = frase.toCharArray();
        
        // Mostrar los caracteres almacenados en el array
        System.out.println("Caracteres en la frase:");
        for (char c : caracteres) {
            System.out.print(c + " ");
        }
        
        scanner.close();
    }
}