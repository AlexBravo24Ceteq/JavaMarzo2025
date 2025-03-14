package Arrays;

public class Arrays2_JAGR {

	public static void main(String[] args) {
		
		//Crea un array de números de 100 posiciones, que contendrá los números del
		//1 al 100. Obtén la suma de todos ellos y la media.

		 int[] numeros = new int[100]; // Array de 100 posiciones
	        int suma = 0;
	        double media;

	        // Llenar el array con los numeros del 1 al 100
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = i + 1; // Asigna valores del 1 al 100
	            suma += numeros[i]; // Suma cada numero
	        }

	        // Calcular la media
	        media = (double) suma / numeros.length;

	        // Mostrar resultados
	        System.out.println("Suma de los numeros: " + suma);
	        System.out.println("Media de los numeros: " + media);
	    }
		
	}

