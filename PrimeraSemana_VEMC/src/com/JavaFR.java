package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
	
		//Uso de las clases File, FileReader y BufferReader
		//Intentaremos realizar una lectura de un archivo.
		
		//Necesitamos un String donde guardas la info. que vamos a leer.
		
		String linea;

		//La estructura try and catch es util para poder manejar una excepcion,
		//Ya que intenta ejecutar un bloque de codigo, si algo falla atrapa el msj de la excepcion
		//Permitiendo ejecutar otra cosa en lugar de mostrar la excepcion en consola.
	
		try { //intenta ejecutar lo siguiente
			//Traemos a la clase File para pasarle la ruta de donde se encuentra el archivo.
			File archivo = new File("C:\\Users\\mflog\\OneDrive\\Escritorio\\Fichero.txt");
			//Necesitamos ahora a la clase FileReader para que se pueda abrir el archivo (en modo lectura)
			FileReader fr = new FileReader(archivo);
			//Ahora necesitamos a la clase BufferReader para poder leear las lineas que contenga nuestro archivo.
			BufferedReader buffer = new BufferedReader(fr);
			//Las lineas o linea que va a leer el objeto Buffer lo guardo en un String
//			linea = buffer.readLine();	
//			System.out.println(linea);
//				
			while ((linea = buffer.readLine()) !=null){
				System.out.println(linea);
			}
					} catch (Exception e) { //si hay una excepcion se atrapa en esta variable
			// Y se ejecuta este otro bloque de codigo.
			System.out.println("No es posible localizar el archivo.");
			//Si quisieramos ver el mensaje de excepcion en consola utilizamos la sig. linea
			e.printStackTrace();//esto vuelve a mostrar la excepcion impresa en consola.
		}
	}

}
