package com.ciclos;

public class Ciclos5_VEMC {

	public static void main(String[] args) throws InterruptedException {
// Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas.
for (int horas = 0; horas < 24; horas++) {//bucle para las horas de 0 a 23
for (int minutos = 0; horas < 60; minutos++) {//bucle para los minutos de 0 a 60.
for (int segundos = 0; segundos <60; segundos++) {//bucle para los segundos de 0 a 60.
	//Formatear la hora para que siempre tenda dos digitos.
	String horaFormateada = String.format("%02d:%02d:%02d", horas, minutos, segundos);
	System.out.println(horaFormateada);
	Thread.sleep(1000);
	 
}	
}
}
	}	
}

