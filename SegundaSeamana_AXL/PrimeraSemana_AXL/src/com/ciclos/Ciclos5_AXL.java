package com.ciclos;



public class Ciclos5_AXL {

	public static void main(String[] args) {
		//5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
		//de un d�a desde las 00:00:00 horas hasta las 23:59:59 horas
		
		
		System.out.println("Simulaci�n de reloj digital");
		
		for (int h = 00; h <= 23; h++) {
			for (int m = 00; m <= 59; m++) {
				for (int s =00; s <= 59; s++) {
					System.out.println(h + ":" + m + ":" + s);
				}
			}
		}

	}

}
