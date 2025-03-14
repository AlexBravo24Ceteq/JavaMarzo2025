package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		
		
		//Se hara el uso de las clases File, File Reader y BufferdReader
		//se intentara realizar una lectura de un archivo.
		
		//Necesitamos un String donde guardar la info 
		//que vamos a leer
		
		String linea;
		
		//La estructura try and catch es util para poder manejar una
		//excepcion ya que intenta ejecutar un bloque de codigo
		//y si algo falla atrapa el msj de la excepcion en consola
		// atajo try crtl + espacio
		
		try { // intenta ejecutar lo siguiente
			//Traemos a la clase File para pasarle la ruta
			//de donde se encuentra el archivo
			
			File archivo = new File("C:\\Users\\George\\Desktop\\archivo2.txt"); 
			
			//Necesitamos ahora a la clase FileReader para que se pueda abrir el archivo del File Archivo
			
			FileReader fr = new FileReader(archivo);
			//Ahora se necesita a la clase BufferedReader para poder leer las lineas 
			//que contenga nuestro archivo
		BufferedReader buffer = new BufferedReader (fr);
		//las lineas o linea que va a leer el objeto buffer lo guardo en un String
		//linea = buffer.readLine();
		
		while((linea = buffer.readLine()) !=null) { //este comando es para que el archivo texto lea los parrafos
		System.out.println(linea);
		
		}
			
		} catch (Exception e) { //si hay una excepcion se atrapa aqui
			// y se ejecuta este  otro bloque fr codigo
			System.out.println("no es posible localizar el archivo");
			//Si quisireramos ver el msj de excepcion en consola utilizamos la sig. linea
			
			e.printStackTrace(); //esto vuelve a mostrar la excepcion impresa en consola 
			
			//ese comando es para ver el trazo de error en consola
		}
		

	}

}
