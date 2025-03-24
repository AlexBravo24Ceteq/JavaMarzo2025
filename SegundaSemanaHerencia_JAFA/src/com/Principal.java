package com;

public class Principal {

	public static void main(String[] args) {
		// Creando una persona
		
		Persona juan = new Empleado("Juan", "Masculino", 25,"rfc",2900230,"V");
		
		// Crear un empleado
		Empleado pedro = new Empleado("Pedro", "Masculino", 30, "PEDR8902423", 250000, "Matutino");

		juan.getNombre();
		
		pedro.getNombre();// vemos que el empleado pedro puede utilizar tambien los metodos
		//de la clase padre
		
		System.out.println(juan);
		System.out.println(pedro);
		
		//crear un nuevo poryecto "ejercico herencia"
		//ej. padre Vehiuculo o trasnporte
		//clase hija para crear un auto o moto
		
		
		//probar el metodo comer de la clase persona
		
		juan.comer();
		pedro.comer(); //no es necesario imprimir despues
		
		//provar el metodo salidar 
		String saludoDeJuan = juan.saludar();
		//String saludoDeJuan = "hola buen dia mi nombre es juan"
		
		System.out.println(juan.saludar());
		//O syso("hola buen dia mi nombre es juan");
		
		pedro.saludar();	
		
		//Ejemplo de polimorfismo con argumento
		//probar el metodo comer() pero en su segunda forma
		juan.comer("pizza");
		
		pedro.comer("Pizza", 5);
	
		juan.sumar(10, 7);
		
	}

}
