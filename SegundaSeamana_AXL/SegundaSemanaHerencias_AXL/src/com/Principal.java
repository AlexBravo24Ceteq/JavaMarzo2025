package com;

public class Principal {

	public static void main(String[] args) {
		// 19/03/2025
		
		//Crear una persona
//		Persona juan=new Persona("Juan", "Masculino", 25);
//		
//		//Crear un empleado
//		Empleado pedro = new Empleado("pedro", "masculino", 30, "PEDR898913", 25000, "Matutino");
//		
//		juan.getNombre();
//		pedro.getNombre(); //Vemos que el empleado pedro tambien puede utilizar los metodos de la clase padre
//		
//		System.out.println(juan);
//		System.out.println(pedro);
		
		
		//Ejercicio
		Animal pandora = new Animal("Pandora", "Maine Coon", 10);
		Gato findchi = new Gato("Findchi", "Korat", 6, "Hembra", "Mediana", 20);
		
		pandora.getNombre();
		findchi.getNombre();
		
		System.out.println(pandora);
		System.out.println(findchi);
	}
	
	
	
	

}
