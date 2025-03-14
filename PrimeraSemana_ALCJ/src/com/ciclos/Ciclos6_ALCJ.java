package com.ciclos;

public class Ciclos6_ALCJ {

	public static void main(String[] args) {
		// 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s
		//mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si
		//todo el dinero lo reinvierte?
		
		double inversionInicial = 1000.00;
		double tasaInteres = 0.02;
		
		double total = inversionInicial;
		
		for (int mes = 1; mes <= 12; mes++) {
				double interes = total * tasaInteres;
				
				total += interes;
				
				System.out.printf("Mes %d: $%.2f%n", mes, total);
	}
		System.out.printf("Total despues de 1 a�o: $%.2f%n", total);

}
	
}
