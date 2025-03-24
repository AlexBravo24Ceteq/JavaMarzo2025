package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// 20/03/2025
		//LISTAS
		/*Coleccion de datos o elementos definida como una sucesion de los mismos
		 * esta coleccion se implementa a travez de de la interface List
		 * y por medio  de un array redimensionable de la clase ArrayList
		 * 
		 * Las listas si admiten valores duplicados, es de las colecciones mas utilizadas 
		 * y con mejores rendimientos
		 * 
		 * En este caso los datos se guaradn de tipo objeto(String, Wrapper, etc.)
		 */
		
		//Como podemos declarar una lsita de elementos de tipo String
		List<String> lista=new ArrayList<String>();
		
		//Agregar elementos a nuestra lsita
		lista.add("Alexandra");
		lista.add("Valentin");
		lista.add("Kerry");
		lista.add("Pandora");
		lista.add("Findchi");
		lista.add("Pandora");
		
		//Imprimir una lista en consola
		System.out.println(lista);
		
		//Imprimir o recuperar el valor de unn solo elemnto de la lista
		System.out.println(lista.get(2));
		
		//Devuelva un valor booleano si el elemento existe en la lista
		System.out.println(lista.contains("Valentin"));
		
		//Devuelve la posicion donde se encuentra al elemento
		//por primera vez
		System.out.println(lista.indexOf("Pandora"));
		
		//devuelve la ultima posicion donde encuentra al elemento
		System.out.println(lista.lastIndexOf("Pandora"));
		
		//Eliminar un elemento de mi lista
		lista.remove(5);
		System.out.println(lista);
		
		//Añadir elementos a la lista, indicando una determinada posicion
		lista.add(2, "Ricardo");//Se agrega el elemnto y desplaza
		//las posiciones. No reemplaza el elemento del indice indicado
		System.out.println(lista);
		
		//Remplazar el valor de una dterminada posicion
		lista.set(3, "Arturo");
		System.out.println(lista);
		
		//Si yo quiero recorer o recuperar todos los valores de mi lista
		//e imprimir en una nueva linea
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		//Puedo almacenar varios elementos si parametrizo mi lista con elementos Object
		//o sino la parametrizo
		List coleccion= new ArrayList();
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
		System.out.println(coleccion.get(2));
		
		
		
	}

}
