package Arrays;

import java.util.Scanner;

public class Arrays1_JAGR {

	public static void main(String[] args) {
		
		//Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
		//List<Integer> numeros = new ArrayList<>;
		//Integer
		
		
		  Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[10]; // Array de 10 posiciones

	        // Pedir los números por teclado
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Introduce un numero para la posicion " + i + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        // Mostrar los valores con sus índices
	        
	        System.out.println("\nindice - Valor");
	        	for (int i = 0; i < numeros.length; i++) {
	        		System.out.println(i + " - " + numeros[i]);
	        }

	        scanner.close(); // Aqui se cierra el scanner.
	    }
		
		
	}
