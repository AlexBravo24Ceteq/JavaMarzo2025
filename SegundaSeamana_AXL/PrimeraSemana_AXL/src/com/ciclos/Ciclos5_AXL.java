package com.ciclos;



public class Ciclos5_AXL {

	public static void main(String[] args) {
		//5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
		//de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		
		
		System.out.println("Simulación de reloj digital");
		
		for (int h = 00; h <= 23; h++) {
			for (int m = 00; m <= 59; m++) {
				for (int s =00; s <= 59; s++) {
					System.out.println(h + ":" + m + ":" + s);
				}
			}
		}

	}

}
