package com;

public class Principal {

	public static void main(String[] args) {
		//Creando una persona
		
		Persona juan = new Empleado("Juan", "Masculino", 25, "JAN234", 2900, "V");
		//Persona juan = new Persona("Juan", "Masculino", 25);
		//Si cambio el segundo persona por empleado si puedo ahcerlo porque persona esta abstrarcta y empleado no
		// se le conoce como polimorfismo de asignacion
		
		//Crear un empleado
		Empleado pedro = new Empleado("Pedro", "Masculino", 30, "PEDR8923471", 25000, "matutino");
		
		System.out.println(juan);
		System.out.println(pedro);
		
		//Probar el método comer de la clase persona
		juan.comer();
		
		pedro.comer();
		
		//Probar el metodo saludar
		juan.saludar();
		String saludoDeJuan = juan.saludar();
		// String saludoDeJuan = "hola buen día mi nombre es Juan
		System.out.println(juan.saludar());
		
		pedro.saludar();
		
		pedro.comer("Chiken");
		
		juan.comer("Pizza", 10);

		//Probando el método sumar
		juan.sumar(10, 7);
	}

}
