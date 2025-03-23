package com;

public class Principal {

	public static void main(String[] args) {
	// Estamos viendo el tema de Composiciones
	//En el cual ahora hay objetos que pueden ser atributos o formar parte de un objeto mas grande.
		
	//Primero debemos crear los objetos pequeños que formaran parte de una computadora.
		
		Ram adata = new Ram ("Adata","DDR4",16,2666);
		Almacenamiento disco = new Almacenamiento("Kingston","SSD",512);
		Procesador intel = new Procesador ("Intel","i5","11a",2.40);
		
		
		//Ahora podemos crear nuestra computadora
		
		Computadora hp = new Computadora("HP","1135G7","Plata", 12000, adata, intel, disco);
		
		System.out.println(hp);
		
		//Vamos a crear un objeto o clase que se componga de otros 3 objetos.
		

	}

}
