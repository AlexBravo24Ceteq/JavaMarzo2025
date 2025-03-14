package Arrays;

public class Arrays4_JAGR {

	public static void main(String[] args) {
		
		
		// Dado un array de números de 5 posiciones con los siguientes valores:

		
		// Definir el array original
        int[] arrayOriginal = {1, 2, 3, 4, 5};
        int[] arrayInvertido = new int[arrayOriginal.length]; // Nuevo array para los valores invertidos

        // Llenar el arrayInvertido con los valores del arrayOriginal en orden inverso
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }

        // Mostrar el array original
        System.out.print("Array original: ");
        for (int num : arrayOriginal) {
            System.out.print(num + " ");
        }

        // Mostrar el array invertido
        System.out.print("\nArray invertido: ");
        for (int num : arrayInvertido) {
            System.out.print(num + " ");
        }
    }

}
