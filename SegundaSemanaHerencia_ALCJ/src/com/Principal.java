package com;

public class Principal {

	public static void main(String[] args) {
		// Creando una persona
		
		Persona juan = new Persona("Juan", "Masculino", 25);
		Empleado pedro = new Empleado("Pedro", "Masculino", 30, "Pedro8989813", 25000, "Matutino");

		juan.getNombre();

		pedro.getNombre(); // Vemos que el empleado pedro puede utilizar tambien los metodos de la clase
							// padre

		System.out.println(juan);
		System.out.println(pedro);

		// probar el metodo comer de la clase persona
		juan.comer();

		pedro.comer();
		
		//probar metodo saludar
		
		String saludoDeJuan = juan.saludar();
		//String saludoDeJuan = "Hola buen dia mi nombre es Juan";
		
		System.out.println(juan.saludar());
		//sout ("hola buen dia mi nimbre es juan");

	}

}
