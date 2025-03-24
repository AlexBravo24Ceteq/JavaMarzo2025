package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		//API Stream - funcionalidad a partir de Java 8
		// que nos va a permitir gestionar de una forma mas 
		//rapida e imperativa la informacion que tengamos 
		//en nuetras colecciones de datos
		//Las colecciones se vuelve un flujo de datos a partir
		//del cual podemos solicitar la informacion que necesitamos

		//Ejemplo de el uso de Stream (Flujo de estos datos) estan en movimiento
		Stream<String> nombres = Stream.of("Carlos", "Frida", "Alex", "Alberto")
				.filter(item->item.contains("i"));
		//Filtrar y como filtralos con expresones de tipo lambda
		
		//una vez filtramos la informacion la llevo hacia una lista 
		List<String> names =nombres.collect(Collectors.toList()); //Recolectamos el nombre con la letra i
		
		
		//Mostrar los resultados en consola
		//System.out.println(names);
		
		//Declaramos  una lista para guardar a nuestros objetos persona
		List<Persona> original = new ArrayList<Persona>(); //lista de Objeto persona(clase)
		
		//creamos una lista para recolectar la informacion filtrada
		List<Persona> filtrada = new ArrayList<Persona>(); //Y solicita la informacion
		
		
		//añadir elementos a mi lista original
		original.add(new Persona("Jorge", "MASCULINO", 37));
		original.add(new Persona("Alicia", "FEMENINO", 25));
		original.add(new Persona("Cesar", "MASCULINO", 27));
		original.add(new Persona("Mauricio", "MASCULINO", 30));
		original.add(new Persona("Guadalupe", "FEMENINO", 25));
		original.add(new Persona("Lucia", "FEMENINO", 26));
		original.add(new Persona("Raul", "MASCULINO", 27));
		original.add(new Persona("Sergio", "MASCULINO", 38));
		original.add(new Persona("Gabriela", "FEMENINO", 22));
		original.add(new Persona("Rafael", "MASCULINO", 24));
		
		//Imprimir la lista original en consola
		//System.out.println(original);
		
		//Recorrer nuetra lista para ver cada elemento con
		//un ciclo for
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
//		}
		
		//hcarlro con foreach
		
		//Recorrer todos los elementos con el ciclo forEach
//		for(Persona i:original) {
//			System.out.println(i);
//		}
		
		//forEach pero ahora a traves de nuestra lista
		//original.forEach(a -> System.out.println(a));
		
		//Si filtraramos a los elementos del genero masculino
		//con un ciclo convencional
//		for (Persona i: original) {
//			if(i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//				System.out.println(i);
//			}
//		}
		
		
		//filtrar con API stream a las persona del genero femenino
		//Los elementos que estan en  mi lista original los convierto en stream para seleccionar los datos
		//que quiero despues se agrega el metodo filter para selecionar "FEMENINO" una ves del filtro
		//los llevamos a una coleccion de lsita con .collect
		filtrada = original.stream().filter(item -> item.getGenero().contentEquals("FEMENINO"))
				.collect(Collectors.toList());
		
//		//despues de almacenarla los mndamos a pedir en una exprsion lambda
//		filtrada.forEach(a -> System.out.println(a));
//		
//		//otra manera
//		filtrada.forEach(System.out::println);
		
		
		//Ordenar a las personas por edad ascendente
//		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		
//		filtrada.forEach(a->System.out.println(a));
//		
		
		//Contar el numero de elementos de mi lista
		//Es un tipo de elemento long
		long conteo = original.stream().count();
//		System.out.println(conteo);
		
		//Solicitar una variable boolean si algun elemento o todos 
		//los elementos cumplen alguna condicion
		
//		boolean alguno = original.stream().anyMatch(a-> a.getEdad()<30);
//		
//		//.aalMatch metodo que dice que si todos son menores a 30 es false
//		System.out.println(alguno);
		
		
		//vamos a retornar un valor a una clase Optional
		//Optional es una clase que nos permite manejar valores nulos,
		//en caso de que no se encuetren
		
		Optional<Persona> menorEdad = original.stream()
				.min(Comparator.comparing(Persona::getEdad)); //Elije que sea menor
		System.out.println(menorEdad);
		
	}

}
