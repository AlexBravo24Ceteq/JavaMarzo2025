package com;

public class Principal {

	public static void main(String[] args) {
		
		
		// Ahora estamos viendo el tema de la composicion
		//En el cual ahora hay objetos que pueden ser atributos o formar parte
		//de un objeto mas grande
		
		//control + espacio atajo
		
		Ram adata = new Ram("Adata", "DDR4", 16, 2666);
		Almacenamiento disco = new Almacenamiento("Kingston", "SSD","480");
		Procesador intel = new Procesador("Intel", "i5", "10a", 1.6);
		
		Computadora hp = new Computadora("HP","440g7","Plata", 11000, adata, intel, disco);
		
		System.out.println(hp);

		
		//Van a crear un objeto o clase que se componga de otros 3 objetos
		
		
}

}
