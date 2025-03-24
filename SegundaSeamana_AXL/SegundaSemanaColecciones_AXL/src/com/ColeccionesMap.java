package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// 20/03/2025
		// La interfaz Map asocia o alamcena los dstos en pares
		// mediante una (Clave-valor a almacenar)
		// las claves no pueden duplicarse

		/*
		 * Es decir, la clave actua como un identificador unico para cada elemento a
		 * alamcenar (ID)
		 */
		// Ejemplo de una declaracion de un Map y la clase HashMap
		// para almacenar claves de tipo Integer y elementos
		// de tipo String
		Map<Integer, String> usuarios = new HashMap<Integer, String>();

		// Agregamos elementos a nuestro HashMap
		usuarios.put(1, "Alexandra");
		usuarios.put(3, "Mady");
		usuarios.put(2, "Lean");

		// Imprimir mi HashMap en consola
		System.out.println(usuarios);

		// Imprimir en pantalla un solo valor alamcenado en
		// una determinada clave
		System.out.println(usuarios.get(2));

		// Eliminar un elemento de nuestro HashMap
		usuarios.remove(3);
		System.out.println(usuarios);

		// Imprimir en consola las llaves de mi HashMap
		System.out.println(usuarios.keySet());

		// Imprimir los valores contenidos en HashMap
		System.out.println(usuarios.values());

		// Imprimir cada una de las llaves con un ciclo for each
		for (Integer i : usuarios.keySet()) {
			System.out.println(i);
		}

		// Imprimir cada una de los valores con un ciclo for each
		for (String i : usuarios.values()) {
			System.out.println(i);
		}
		
		//Imprimir llaves y valores
		for(Integer i: usuarios.keySet()) {
			System.out.println("Llaves: "+ i + " "+ "Valor: "+ usuarios.get(i));
		}

	}

}
