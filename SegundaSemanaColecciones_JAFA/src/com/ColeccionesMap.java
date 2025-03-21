package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// La inteface map asocia o almacena los datos
		//en pares (Clave- valor a almacenar)
		//Las claves no pueden duplicarse
		
		//Es decir, la clave actua como un identificador unico
		//para cada elemento o almacenar (ID)
		
		//Ejemplo Declacaracion de un Map y la clase HasMap
		//para almacenar claves de tipo Integer y elementos de tipo
		//String
		
		Map<Integer,String> usuarios = new HashMap<Integer,String>();
		
		
		//Agregamos elementos a nuetro HasMap
		usuarios.put(1, "Angel");
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");
		
		//Imprimir mi HasMap en consola
		System.out.println(usuarios);
		
		//imprimir en pantalla un solo valor almacenado en una 
		//determinada clave
		System.out.println(usuarios.get(2));
		
		//Eliminar un elemento de nuetro HasMap
		usuarios.remove(3);
		System.out.println(usuarios);
		
		
		//Imprimir en consola las llaves de mi HasMap
		System.out.println(usuarios.keySet());//devuelve una lista en llaves
		
		//Imprimir en consola los valores contenidos en mi HasMap
		System.out.println(usuarios.values());//valores
		
		//Imprimir cada una de las llaves con un cliclo 
		//for each
		
		for (Integer i: usuarios.keySet()) {
			System.out.println(i);
		}
		
		for (String i: usuarios.values()) {
			System.out.println(i);
		}
		
		//imprimir llaves y valores
		for(Integer i: usuarios.keySet()) {
			System.out.println("Llave: "+i+" Valor: "+usuarios.get(i));
		}

	}

}
