package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Listas- Son una coleccion de datos o elementos 
		//definida como una sucesion de los mismos
		//Esta coleccion se implementa a traves de la interface list
		//y por medio de un array redimensionable de la clase
		//Arraylist
		//Las listas si admiten valores duplicados, es de las colecciones
		//mas utilizadas y con mejor rendimiento
		//No podemos guardar tipos de dato primitivo
		//pero si datos de tipo objeto (String,Wrapper, ect)
		
		//declarar una lista de elementos de tipo String
		List<String>lista = new ArrayList<String>();
		
		// Agregar elementos a nuestra lista
		lista.add("Toño");
		lista.add("Mariana");
		lista.add("Sherlin");
		lista.add("Pedro");
		lista.add("Jose");
		lista.add("Alberto");
		
		//Imprimir una lista en consola 
		System.out.println(lista);
		
		//imprimir o recuperar el valor de un solo elemento de la lista
		System.out.println(lista.get(2));//Recupera por indice el .get
		
		//Devuelva un valor booleano si el elemnto existe en la lista
		System.out.println(lista.contains("Jose"));
		
		//Devuelve la posicion donde se encuatra el elemento por 
		//primera ves
		System.out.println(lista.indexOf("Pedro"));
		
		//Devuelve la ultima posicion donde encuentra al elemento
		System.out.println(lista.lastIndexOf("Pedro"));
		
		//Eliminar un elemento de mi lista
		lista.remove(5);
		
		System.out.println(lista);
	
		//Podemos añadir elementos a la lista, indicando una determinada posicion
		lista.add(2, "Juan"); // se agraga el elemento y desplaza
		//Las posciones. No remplaza el elemento del indice indicado
		System.out.println(lista);
		
		//Remplazar el valor de una determinada posicion
		lista.set(2, "Amado");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de mi lista
		//e imprimirlos en una nueva linea
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Puedo almacenar varios elementos si parametrizo mi lista
		//con elementos objetc  o si no la parametrizo
		
		List<Object> coleccion = new ArrayList<Object>();
		
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('B');
		
		System.out.println(coleccion.get(2));
		
		
		
		
	}

}
