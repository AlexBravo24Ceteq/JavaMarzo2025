package com;

public class Principal {

	public static void main(String[] args) {
		// 18/03/2025
		/*TAREA
		 * Crear un objeto o clase que se componga de otros 3 objetos
		 */
		
		Motor dohc =  new Motor("DOHC", 4, 4, 292, 87.1);
		Tanque grande = new Tanque("Normal", 17, "15-20/L");
		Llantas funsion = new  Llantas("Rodadura profunda(tracción óptima en nieve y hielo)", "Goma especial(flexible en temperaturas frias)", "Seguridad y control en condiciones invernales", 100/80, 140/60);
		
		Moto yamaha = new Moto("Yamaha", "R6", "Negro", 70.450, 1.150, dohc, funsion, grande);
		
		System.out.println(yamaha);
	}

}
