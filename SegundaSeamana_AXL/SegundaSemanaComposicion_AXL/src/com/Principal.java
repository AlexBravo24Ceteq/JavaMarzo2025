package com;

public class Principal {

	public static void main(String[] args) {
		// 118/03/2025
		//COMPOSICION
		/*En el cual ahora hay objetos que pueden ser atributos o formar parte
		 * de un objeto mas grande
		 */
		
		//Primero debemos crear los objetos "pequeños" que formaran parte de la computadora
		Ram adata = new Ram("Adata", "DDR4", 16, 2666);
		Almacenamiento disco = new Almacenamiento("Kingston", "SSD", 480);
		Procesador intel = new Procesador("Intel", "i5", "10a", 1.6);
		
		//Ahora si ya podemos crear nuestra computadora
		Computadora huawei = new Computadora("Huawei", "440g7", "Gris", 22000, adata, intel, disco);
		
		//Vamos a ver como se refleja al mandarlo a imprimir en consola
		System.out.println(huawei);
		
		
		
		

	}

}
