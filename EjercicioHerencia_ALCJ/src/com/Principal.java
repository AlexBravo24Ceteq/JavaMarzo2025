package com;

public class Principal {

	public static void main(String[] args) {
		
		
		Vehiculo nissan = new Vehiculo("nissan", "Sentra");
		Coche mazda = new Coche("Mazda", "CX30", 5, "Negro", "Automatica");
		
		nissan.getMarca();
		mazda.getMarca();
		
		System.out.println(nissan);
		System.out.println(mazda);

	}

}
