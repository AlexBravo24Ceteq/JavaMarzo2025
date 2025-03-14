package com.ciclos;

public class Ciclos7_JAFA {

	public static void main(String[] args) {
//		// Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
//		mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
//		dinero?
		
		double principal = 700.0;
		double tasa=2.0;
		int meses = 0;
		
		while (principal <= 1500.0) {
			principal = principal * (1 + tasa / 100);
			
			meses++;
		}
		System.out.printf("Se necesitan %d meses para que la inversión supere los $1500.00\n", meses);
        System.out.printf("Monto final: $%.2f\n", principal);

	}

}
