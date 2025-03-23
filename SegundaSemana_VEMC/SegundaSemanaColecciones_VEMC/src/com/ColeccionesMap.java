package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		//La interfaz Map almacena los datos en pares
		//Estos pares son asociados (clave-valor a almacenar)
		//Las claves son unicas y no pueden duplicarse.
		
		//Es decir, la clave actua como identificador unico para cada elemento a almacenar.
		//(ID)
		
		//Declaracion de un Map y la clase HashMap.
		//Para almacenar claves tipo Integer y elementos de tipo String.
		
		
		//Recordando que "Map" es una interfaz y "HashMap" es la clase que permite almacenar estos valores.
		Map<Integer, String> usuarios = new HashMap<Integer, String>();

		
		//Agregamos elementos a nuestro HashMap
		usuarios.put(1, "Angel");
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");
		
		//Imprimir mi HashMap en consola
		System.out.println(usuarios);
		
		//Imprimir en pantalla un solo valor almacenado en una determinada clave.
		System.out.println(usuarios.get(2));
		
		//Eliminar un elemento de nuestro HashMap
		usuarios.remove(3);
		System.out.println(usuarios);
		
		//Imprimir en consola las llaves de mi HashMap
		System.out.println(usuarios.keySet());
		
		//Imprimir en consola los valores contenidos en mi HashMap
		System.out.println(usuarios.values());
		
		//Imprimir cada una de las llaves con un ciclo 
		//for each
		for(Integer i: usuarios.keySet()) {//Para cada elemento de tipo Integer, contenido en usuarios, manda imprimir cada elemento en lineas separadas.
			System.out.println(i);
		}
		for(String i: usuarios.values()) {//Para cada elemento de tipo String, contenido en usuarios, lo manda a imprimir en una nueva linea.
			System.out.println(i);
		}
		
		// Imprimir llaves y valores.
		for(Integer i: usuarios.keySet()) {
			System.out.println("Llave: " + i + ", Valor: " + usuarios.get(i));
		} 	
		
	}

}
