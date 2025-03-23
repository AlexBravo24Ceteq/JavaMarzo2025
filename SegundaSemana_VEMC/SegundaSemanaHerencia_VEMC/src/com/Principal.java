package com;

public class Principal {

	public static void main(String[] args) {
		//Creando una Persona	
		Empleado juan = new Empleado("Juan","Masculino",25,"rfc",29000,"V");
		
		//Creando un Empleado
		Empleado pedro = new Empleado("Pedro", "Masculino", 30, "PEDR678666", 25000, "Matutino");
		
		juan.getNombre();
		
		pedro.getNombre();// Vemos que el empleado puede utilizar tambien los metodos de la clase padre.
		
		System.out.println(juan);
		System.out.println(pedro);
		
		//Probando el metodo comer de la clase persona
		juan.comer();
		
		pedro.comer();
		
		//Probando el metodo saludar
		String saludoDeJuan = juan.saludar();
		//String saludoDeJuan = "Hola buen dia mi nombre es Juan";
		
		//System.out.println(juan.saludar());
		//Syso ("Hola buen dia mi nombre es Juan");
		pedro.saludar();
		
		//Probando el metodo comer() en su segunda forma
		pedro.comer("Tacos");
		
		pedro.comer("Pizza", 4);
		
		//Probando el metodo abstracto sumar
		int resultado = juan.sumar(18, 5);

	}

}
