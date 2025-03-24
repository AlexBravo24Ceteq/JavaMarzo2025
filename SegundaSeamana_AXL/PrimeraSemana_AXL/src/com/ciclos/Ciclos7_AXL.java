package com.ciclos;

import java.util.Scanner;

public class Ciclos7_AXL {

	public static void main(String[] args) {
		// 7- Una persona desea invertir $700.00 en un banco, el cual le 
		//otorga un 2% de interés mensual.
		//¿En cuántos meses tendrá más de $1500, si reinvierte cada mes 
		//todo su dinero?
		
		 double capitalInicial = 700.00;
	        double intereses = 0.02;
	        double objetivo = 1500.00;
	        double total = capitalInicial;

	       
	        int meses = 0;
	        while (total <= objetivo) {
	   
	            double interes = total * intereses;

	            total += interes;
	            meses++;
	            System.out.printf("Mes %d: $%.2f%n", meses, total);
	        }

	        System.out.printf("Se alcanzará la meta de $%.2f en %d meses.%n", objetivo, meses);
	        System.out.printf("Cantidad final: $%.2f%n", total);
		

	}

}
