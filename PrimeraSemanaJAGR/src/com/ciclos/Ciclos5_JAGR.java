package com.ciclos;

public class Ciclos5_JAGR {


    public static void main(String[] args) {
    	
    	//Simular un reloj
    	//Trabajo 5
    	
    	
        for (int hora = 0; hora < 24; hora++) {
        	
            for (int minuto = 0; minuto < 60; minuto++) {
            	
                for (int segundo = 0; segundo < 60; segundo++) {
                	
                    System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
                    try {
                        Thread.sleep(1000); //esta es la velocidad para simular la velocidad 
                        //de un reloj
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
