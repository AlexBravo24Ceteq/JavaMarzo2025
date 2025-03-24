package com.ciclos;

public class Ciclos6_AXL {

	public static void main(String[] args) {
		//6.- Una persona desea invertir $1000.00 en un banco, 
		//el cual le otorga un 2% de interés mensual. 
		//¿Cuál será la cantidad de dinero que esta persona tendrá al cabo 
		//de un año si todo el dinero lo reinvierte? 
		
		double dinero = 1000;
		int mes = 1;
		
		System.out.println("La cantidad invertida son $1000 ");
		
		System.out.println("Resultado de lo reinvertido");

		while (mes<=12) {
			
			dinero = dinero * 2;
		mes++;
		
		}
		System.out.println(dinero);

	}

}
