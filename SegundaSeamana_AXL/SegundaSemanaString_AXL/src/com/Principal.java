package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// 21/03/25
		//API Stream
		/*Funcionalidad a partir de Java 8 que nos va a permitir gestionar de una forma
		 * mas rapida e imperativa la informacion que tengamos en nuestra 
		 * colleciones de datos
		 * Las colleciones se vuelven un flujo de datos a partir
		 * del cual podemos solicitar la informacion que necesitemos
		 */
		
		//Ejemplo de el uso de Stream
		Stream<String> nombres = Stream.of("Alexandra", "Valentin", "Kerry", "Pandora")
		.filter(item->item.contains("i"));
		
		System.out.println(nombres);
		
		//Una vez filtramos la informacion la llevo hacia una lista
		List<String>names = nombres.collect(Collectors.toList());
		
		//Mostrar resultafdos en consola
		System.out.println(names); 
		
		//Declaramos una lista para guardar a nuestros objetos Personas
		List<Persona>original  = new ArrayList<Persona>();
		
		//Crear una lista para recolectar la informacion filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//Añadir elementos a mi lista original
		original.add(new Persona("Ricardo", "MASCULINO", 25));
		original.add(new Persona("Maddy", "FEMENINO", 30 ));
		original.add(new Persona("Cesar", "MASCULINO", 27));
		original.add(new Persona("Mauricio", "MASCULINO", 25));
		original.add(new Persona("Lean", "MASCULINO", 22));
		original.add(new Persona("Vanesa", "FEMENINO", 32));
		original.add(new Persona("Rosa", "FEMENINO", 20));
		original.add(new Persona("Arturo", "MASCULINO", 27));
		original.add(new Persona("Alexia", "FEMENINO", 21));
		original.add(new Persona("Sebastian", "MASCULINO", 38));
		
		
		//Imprimir la lsita original en consola
//		System.out.println(original);
		
		//Recorer nuestra lista para ver cada elemento con un ciclo for
//		for(int i=0; i<original.size(); i++)
//		{
//			System.out.println(original.get(i));
//		}
//		
		//Recuperar todos los elementos con el ciclo forEach
//		for(Persona i:original)
//		{
//			System.out.println(i);
//		}
		
		//forEach pero ahora a atravez de nuewstra lsita
		//original.forEach(a -> System.out.println(a));
		
		//Si filtraramos a los elementos del genero masculino
		//con un ciclo convencional
//		for(Persona i:original)
//		{
//			if(i.getGenero().equals("MASCULINO"))
//			{
//				filtrada.add(i);
//				System.out.println(i); 
//			}
//		}
		
		
		//Filtrar con el API Stream a las personas del genero femenino
//		filtrada=original.stream().filter(item -> item.getGenero().equals("FEMENINO"))
//				.collect(Collectors.toList());
//		
//		//Operador Lambda
//		filtrada.forEach(a -> System.out.println(a));
		
		//Ordenar a la spersonas por edad ascendente
//		filtrada=original.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
		
//		filtrada.forEach(System.out::println);
		
		
		//Contar numero de elementos de mi lista 
//		System.out.println(original.stream().count());
		
		//Solicitar una variable booleana si algun elemento 
		//o todos los elementos cumplen alguna condicion
		
//		boolean alguno=original.stream().anyMatch(a -> a.getEdad()<30);
//		System.out.println(alguno);
		
		//Retonar un valor a una clase Optional
		/*Optional es una clase que nos permite manejar valores nulos,
		 * en caso de que no se encuentren
		 */
		Optional<Persona> menorEdad=original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		
		System.out.println(menorEdad);

	
	}

}
