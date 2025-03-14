package com.ciclos;

public class Ciclos6_JAFA {

	public static void main(String[] args) {
//		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
//		mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
//		todo el dinero lo reinvierte?
		
		double principal = 1000.0;
		
		double tasaP=2.0;
		
		int meses = 12;
		
		for (int mes = 1; mes <=meses; mes++) {
			principal = principal * (1+tasaP/100);
		}
		System.out.printf("La cantidad final después de un año es: $%.2f\n", principal);
	}

}
