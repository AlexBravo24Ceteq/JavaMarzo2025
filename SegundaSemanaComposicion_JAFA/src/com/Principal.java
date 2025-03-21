package com;

public class Principal {

	public static void main(String[] args) {
		// Ahora Estamos viendo el tema de composicion
		//En el tema ahora hay objetos que pueden ser atributos o formar parte
		//de un objeto mas grande
		
		
		//primero debemos crear los objetos "pequeños" que formaran parte
		//de la Computadora
		
		Ram adata = new Ram("Adata", "DDR4", 16,2666);
		Almacenamiento disco = new Almacenamiento("Kington", "SSD", 480);
		Procesador intel = new Procesador("intel", "i5", 1.6,"10a");
		
		//ahora si ya podemos crear nuetras computaeora
		
		Computadora hp = new Computadora("HP", "44og7", "plata", 10001, adata, intel, disco);
		
		//vamos a ver como se refleja al andarla a imprimir con consola
		
		System.out.println(hp);
		
		//Van a crear un objeto o clase que se componga de otros 3 objetos
		//Ej. Auto-motor llantas auidio
		//ejm libro- autor
		//EjercicioComposicion_JAFA
		
	}

}
