package com.ciclos;

public class Ciclos6_JAGR {

	public static void main(String[] args) {
		
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés
		//mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si
		//todo el dinero lo reinvierte?
		//Trabajo 6
		
			double capitalInicial = 1000.0; // Monto inicial
				double tasaInteres = 0.02; // 2% mensual
					int meses = 12; // Periodo de inversión (1 año)

						double capitalFinal = capitalInicial * Math.pow(1 + tasaInteres, meses);

							System.out.printf("Despues de un año, el monto final sera: %.2f dolares\n", capitalFinal);
    }

	}


