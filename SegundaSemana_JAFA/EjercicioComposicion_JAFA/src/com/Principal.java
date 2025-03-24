package com;

public class Principal {

	public static void main(String[] args) {
		// Formar los objetos pequeños que formaran parte del Automovil
		Motor motorDeportivo = new Motor("Disel", 400);
		Motor motorFamiliar = new Motor("Gasolina", 300);
		Motor motorElectrico = new Motor("Electrico", 100);
		Motor motorClasico= new Motor("Gasolina", 200);
		
		Ruedas ruedasDeportivo = new Ruedas("Michelin", 20);
		Ruedas ruedasFamiliar =new Ruedas("Continental", 16);
		Ruedas ruedasElectrico = new Ruedas("Pirelli", 15);
		Ruedas ruedaClasico = new Ruedas("GoodYear", 16);
		
		Chasis chasisDeportivo = new Chasis("Aluminio", 150.5);
		Chasis chasisFamiliar = new Chasis("Acero", 200);
		Chasis chasisElectrico= new Chasis("Aluminio",180);
		Chasis chasisClasico = new Chasis("Acero", 300);
		
		
		//Armar el Automovil
		
		
		Automovil ferrari = new Automovil("Ferrari", "F430", "Rojo", 10000000, motorDeportivo, ruedasDeportivo, chasisDeportivo);
		Automovil jetta = new Automovil("Jetta", "A4", "Blanca", 125000, motorFamiliar, ruedasFamiliar, chasisFamiliar);
		Automovil tesla=new Automovil("TESLA", "Model 3", "Gris", 500000, motorElectrico, ruedasElectrico, chasisElectrico);
		Automovil ford = new Automovil("FORD", "Coupe 1929", "Verde", 100500000, motorClasico, ruedaClasico, chasisClasico);
		
		
		//Imprimir en consola
		System.out.println(ferrari);
		System.out.println();
		System.out.println(jetta);
		System.out.println();
		System.out.println(tesla);
		System.out.println();
		System.out.println(ford);
		
	}

}
