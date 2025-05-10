package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Listas - Son una coleccion de datos o elementos 
		//definida como una sucesion de los mismos
		//Esta coleccion se implementa a traves de la interface List
		//Y por medio de un array redimensionable de la clase
		//ArrayList
		//Las listas si admiten valores duplicados, es de las colecciones
		//mas utilizadas y con mejor rendimiento
		//No podemos guardar tipos de dato primitivo
		//Pero si datos de tipo Objeto (String, Wrapper, etc.)
		
		//Declarar una lista de elementos de tipo String
		List<String> lista = new ArrayList<String>();
		//List-interface
		//ArrayList-una clase
		
		//Agregar elementos a nuestra lista
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		//Imprimir una lista en consola
		System.out.println(lista);
		//Si yo quiero imprimir o recuperar el valor de un solo elemento de la lista
		System.out.println(lista.get(2));
		
		//Devuelva un valor booleano si el elemento existe en la lista
		System.out.println(lista.contains("Gabriela"));
		
		//Devuelve la posicion donde se encuentra al elemento por
		//primera vez
		System.out.println(lista.indexOf("Alberto"));
		//Devuelve la ultima posicion donde encuentra al elemento
		System.out.println(lista.lastIndexOf("Alberto"));
		
		//Eliminar un elemento de mi lista
		lista.remove(5);
		System.out.println(lista);
		
		//A�adir elementos a la lista, indicando una determinada posicion
		lista.add(2, "Celso");//Se agrega el elemento y desplaza las posiciones
		System.out.println(lista);
		
		//Reemplazar el valor de una determinada posicion
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de mi lista
		//e imprimirlos en una nueva lista
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Puedo almacenar varios elementos si parametrizo mi lista
		//con elementos Object o si no la parametrizo
		List<Object> coleccion = new ArrayList<Object>();
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
	
		System.out.println(coleccion.get(2));
		
		


	}

}
