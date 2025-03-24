package com.ciclos;

public class Ciclos6_JAGR {

	public static void main(String[] args) {
		
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s
		//mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si
		//todo el dinero lo reinvierte?
		//Trabajo 6
		
			double capitalInicial = 1000.0; // Monto inicial
				double tasaInteres = 0.02; // 2% mensual
					int meses = 12; // Periodo de inversi�n (1 a�o)

						double capitalFinal = capitalInicial * Math.pow(1 + tasaInteres, meses);

							System.out.printf("Despues de un a�o, el monto final sera: %.2f dolares\n", capitalFinal);
    }

	}


