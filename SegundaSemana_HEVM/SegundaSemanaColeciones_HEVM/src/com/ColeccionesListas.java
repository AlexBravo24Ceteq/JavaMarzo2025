package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		//Listas - son una coleccion de datos o elementos definida
		//como una sucesión de los mismos
		//Esta coleccion se implementa a traves de la interface List
		//y por medio de un array redimensionable de la clase ArrayList
		//Las listas si admiten valores duplicados, es de las colecciones
		//mas utilizadas y con mayor rendimiento.
		//No podemos guardar tipos de dato primitivo, pero si datos de tipo
		//Objeto (String, Wraper, etc)
		
		//Declarar una lista de elementos de tipo String
		List<String> lista = new ArrayList<String>();
		
		//Agregar elementos a nuestra lista
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		
		//Imprimir una lista en consola
		System.out.println(lista);
		
		//Imprimir o recuperar un valor de la lista
		System.out.println(lista.get(2));
		
		//Devuelve un valor booleano si el elmento existe en nuestra lista
		System.out.println(lista.contains("Alex"));
		System.out.println(lista.contains("Gabriela"));
		
		//Devuelve la posicion donde se encuentra el elemento por primera vez
		System.out.println(lista.indexOf("Alberto"));
		
		//Devuelve la ultima posicion donde encuentra al elemento
		System.out.println(lista.lastIndexOf("Alberto"));
		
		//Eliminar un elemento de mi lista
		lista.remove("Alberto"); //Se puede eliminar por indice o al objeto directamente
		System.out.println(lista);
		
		//Añadir elementos a la lista, indicando una determinada posicion
		lista.add(2, "Celso"); //Se agrega el elemento y desplaza las posiciones, no remplaza el elemento que se encontraba ahi
		System.out.println(lista);
		
		//Reemplazar un valor de una determinada posicion
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de la liste e imprimirlos en una nueva linea
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));	
		}
		
		//Puedo almacenar varios elementos si parametrizo mi lista con
		//elementos object o si no la parametrizo
		List<Object> coleccion = new ArrayList<Object>();
		//List coleccion = new ArrayList(); //Tambien es posible guardar los elementos sin indicar que tipo son
		
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
		System.out.println(coleccion);
	}

}
