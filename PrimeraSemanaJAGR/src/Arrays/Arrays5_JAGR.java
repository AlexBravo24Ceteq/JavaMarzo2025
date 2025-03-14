package Arrays;

public class Arrays5_JAGR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Definir los arrays de productos y precios
        String[] productos = {"Manzana", "Leche", "Pan", "Arroz", "Huevos"};
        double[] precios = {1.20, 0.99, 1.50, 2.30, 3.40};

        // Mostrar los productos y sus precios
        System.out.println("Lista de productos y precios:");
        for (int i = 0; i < productos.length; i++) {
            System.out.printf("%s: $%.2f\n", productos[i], precios[i]);
        }
    }
}