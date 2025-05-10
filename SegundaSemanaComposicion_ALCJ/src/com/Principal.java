package com;

public class Principal {

	public static void main(String[] args) {
		// AHORA ESTAMOS VIENDO EL TEMA DE CCOMPOSICION
		//en el cual hay objetos que pueden ser atributos o formar parte de un objeto mas grande
		//primero debemos crear los objetos pequeños que formaran parte de la computadora
		
		Ram adata = new Ram("Adata", "DDR4", 16, 2666);
		Almacenamiento disco = new Almacenamiento("Kingston", "SSD", 480);
		Procesador intel = new Procesador("Intel", "i5", "10a", 1.6);
		
		//Ahora si ya podemos crear nuestra computadora
		
		Computadora hp = new Computadora("HP", "440g7", "Plata", 11000, adata, intel, disco);
		
		System.out.println(hp);
		

		//crear un objeto o clase que se componga de otros 3 objetos 
		
	}

}
