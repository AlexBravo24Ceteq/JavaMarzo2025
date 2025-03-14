package com.ciclos;

public class Ciclos7_ALCJ {

	public static void main(String[] args) {
		// 7.- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
		//mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
		//dinero?
		
		double inversionInicial = 700.00;
        double tasaInteres = 0.02;
        double meta = 1500.00;
        double total = inversionInicial;

       
        int meses = 0;
        while (total <= meta) {
   
            double interes = total * tasaInteres;

            total += interes;
            meses++;
            System.out.printf("Mes %d: $%.2f%n", meses, total);
        }

        System.out.printf("Se alcanzará la meta de $%.2f en %d meses.%n", meta, meses);
        System.out.printf("Cantidad final: $%.2f%n", total);

	}

}
