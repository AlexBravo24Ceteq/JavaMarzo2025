package com.ciclos;

public class Ciclos5_ALCJ {

	public static void main(String[] args) throws InterruptedException {
		// 5.-  Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
		//de un día desde las 00:00:00 horas hasta las 23:59:59 horas 
		
		for (int horas = 0; horas < 24; horas++) {
            
            for (int minutos = 0; minutos < 60; minutos++) {
                
                for (int segundos = 0; segundos < 60; segundos++) {                    
                    String horaNueva = String.format("%02d:%02d:%02d", horas, minutos, segundos);
                    System.out.println(horaNueva);
                    Thread.sleep(1000); 
                   
                }
            }
        }
		 
	}

}
