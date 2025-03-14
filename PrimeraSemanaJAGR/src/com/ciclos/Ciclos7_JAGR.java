package com.ciclos;

public class Ciclos7_JAGR {

	    public static void main(String[] args) {
	        double capital = 700.00;
	        double tasaInteres = 0.02; // 2% mensual
	        double meta = 1500.00;
	        int meses = 0;
	    
	    //Aqui se usa el bucle while para calcular cuantos meses se necesitan para que la inversion 
	        //inicial de $700
	        //Trabajo 7
	        
	        while (capital <= meta) {
	            capital += capital * tasaInteres; // Reinvierte el interés ganado
	            meses++;
	        }

	        System.out.println("Se necesitarán " + meses + " meses para superar los $1500.");
	    }
	}

