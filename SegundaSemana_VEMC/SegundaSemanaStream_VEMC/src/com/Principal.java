package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// API Stream - Funcionalidad a partir de Java 8
		//Permite gestionar de una forma mas rapida e imperativa la informacion
		//Que se tengan en nuestras colecciones de datos.
		//Las colecciones se vuelven un flujo de datos a partir del cual podemos solicitar la informacion que necesitemos. (Filtra info.)
		
		//Ejemplo de uso de Stream
		Stream<String> nombres = Stream.of("Carlos","Frida","Alex","Alberto")
				.filter(item -> item.contains("i"));
		
		//Una vex filtrada la info. la llevo hacia una lista.
		List<String> names = nombres.collect(Collectors.toList());
		
		
		//Mostrar los resultados en consola
		//System.out.println(names);
		
		//Declaramos una Lista para guardar objetos Persona
		List<Persona> original = new ArrayList<Persona>();
		
		//Creamos una lista para recolectar la informacion filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//Agregar elementos a mi lista original
		original.add(new Persona("Jorge", "MASCULINO", 37));
		original.add(new Persona("Alicia", "FEMENINO", 25));
		original.add(new Persona("Arturo", "MASCULINO", 45));
		original.add(new Persona("Diana", "FEMENINO", 32));
		original.add(new Persona("Eduardo", "MASCULINO", 18));
		original.add(new Persona("Maria", "FEMENINO", 29));
		original.add(new Persona("Carlos", "MASCULINO", 50));
		original.add(new Persona("Sergio", "MASCULINO", 41));
		original.add(new Persona("Gabriela", "FEMENINO", 22));
		original.add(new Persona("Rafael", "MASCULINO", 23));
		
		//Imprimir mi lista orginal en consola
		//System.out.println(original);
		
		//Recorrer nuestra lista para ver cada elemento con un ciclo "for"
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
//		}

		//Recuperar todos los elementos con el ciclo "for each"
//		for(Persona i:original) {//Para cada elemento persona que esta contenido en la lista orginal
//			System.out.println(i);//se manda imprimir en una nueva liena cada elemento.
//		}
		
		//forEach pero ahora a travez de nuestra lista
		//original.forEach(a -> System.out.println(a));//utilizamos una expresion Lambda
		
		
		//Si filtraramos a los elementos del genero masculino con un ciclo convencional
//		for(Persona i: original) {
//			if(i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//				System.out.println(i);
//
//			}
//		}
		
		//Filtrar con el API Stream a los elementos del genero femenino.
//		filtrada = original.stream()//los elementos que estan en la lista original se convierten a stream.
//				.filter(item -> item.getGenero().equals ("FEMENINO"))//filtrar cada elemento que tenga un genero femenino
//				.collect(Collectors.toList());//se colecccionan en nuestra lista filtrada.
//		
		//filtrada.forEach(a -> System.out.println(a));//solicitando los datos con expresion lambda
		//filtrada.forEach(System.out::println);//solicitamos los datos con ese operador
		
		
		//Ordenar a las personas por edad ascendente
		//Comparator es una interface que compara uno a uno el valor
//		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		filtrada.forEach(System.out::println);
		
		//Contar el numero de elementos en mi lista
		//System.out.println(original.stream().count());//De nuestra lista original la convierte a un flujo y hara un conteo de cuantos elementos existen.
		
		//Solicitar una variable booleana si algun o todos los elementos cumplen alguna condicion
		
//		boolean alguno = original.stream().allMatch(a -> a.getEdad()<30);
//		System.out.println(alguno);
		
		//Retornar un valor a una clase Optional.
		//Optional - Clase que nos permite manejar valores nulos, en caso de que no se encuentren.
		
		Optional<Persona> menorEdad = original.stream() //Opcional de objetos persona
				.min(Comparator.comparing(Persona::getEdad));//Buscar el valor minimo de la persona a traves de la edad.
		System.out.println(menorEdad);
			
	}

}
