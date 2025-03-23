package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Listas - Son una colecciones de datos o elementos definida como una sucecion de los mismos.
		//Esta coleccion se implementa a traves de la interface List
		//Y por medio de un Array redimensionable de la clase ArrayList.
		
		//Las listas si admiten valores duplicados, es de las colecciones mas utilizadas y con mejor rendimiento.
		//No podemos guardar tipos de dato primitivo, pero si datos de tipo objeto(String,Wrapper, etc).
		
		//Declarar una lista de elementos de tipo String
		List <String> lista = new ArrayList<String>();//donde List es la interface y ArrayList es una clase.
		
		//Agregar elementos a nuestra lista
		lista.add("Adriana");//Se encuentra en la posicion 0
		lista.add("Juan");
		lista.add("Pedro");
		lista.add("Diana");
		lista.add("Francisco");
		lista.add("Pedro");
		
		//Imprimir una lista en consola.
		System.out.println(lista);
		
		
		//Si quiero imprimir o recuperar el valor de un solo elemento de la lista
		System.out.println(lista.get(2));
		
		//Devuelva un valor booleano si el elemento existe en la lista.
		System.out.println(lista.contains("Diana"));
		
		//Devuelve la posicion donde se encuentra el elemento por primera vez.
		System.out.println(lista.indexOf("Pedro"));
		
		//Devuelve la ultima posicion donde encuentra al elemento.
		System.out.println(lista.lastIndexOf("Pedro"));
		
		//Eiminar un elemento de mi lista puede ser por indice o por objeto.
		lista.remove(5);
		System.out.println(lista);
		
		//Agregar elementos a la lista indicando una determinada posicion
		lista.add(1, "Alberto");//Se agrega el elemento en el indice indicado y desplaza las posiciones
		//No reemplaza el elemento del indice indicado.
		System.out.println(lista);
		
		//Reemplazar el valor de una determinada posicion
		lista.set(2, "Juana");
		System.out.println(lista);
		
		//Si yo quiero recorrer o recuperar todos los valores de mi lista e imprimirlos en una nueva linea
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Puedo almacenar varios elementos si parametrizo mi lista
		//Con elementos Object o si no la parametrizo.
		//List <Object> coleccion = new ArrayList <Object>(); 
		//Se declara la coleccion de elemnetos Object, con la parametrizacion Object se pueden agregar diferentes tipos de elementos.
		
		//Se puede declarar una lista sin declarar que almacenamos en ArrayList.
		//Lo recomendable es parametrizar lo que se agrega.
		List coleccion = new ArrayList();
		coleccion.add("Nombre");
		coleccion.add(2545);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
		System.out.println(coleccion.get(2));
	}

}
