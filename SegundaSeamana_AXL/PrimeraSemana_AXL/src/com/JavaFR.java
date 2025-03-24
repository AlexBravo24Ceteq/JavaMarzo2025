package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// 14 DE MARZO DEL 2025
		
		/*CLASE FILE, FILEREADER y BUFFERREADER
		 * Intentaremos realizar una lectura de un archivo
		 */
		
		//Necesitamos un String donde guardar la info que vamos a leer
		
		String linea;
		
		//La estructura try and catch es util para poder manejar una 
		//exepcion, ya que intenta ejecutar un bloque de codigo
		//y si algo falla atrapara el mensaje de la exepcion para
		//permitirnos ejecutar otra cosa en lugar de mostrar la 
		//exepcion en consola
		
		
		try { //Intenta ejecutar lo siguiente
			/*Traemos a la clase File para pasarle la ruta
			 * de donde se encuentra el archivo
			 */
			
			//El String osea la direccion del bloque de notas se guara aqui
			File archivo = new File("C:\\Users\\Alexandra\\Desktop\\archivo.txt"); 
			/*Necesitamos ahora a la clase FileReader para que se pueda abrir
			 * el archivo 
			 */
			
			FileReader fr = new FileReader(archivo);//Identifica el archivo que queremos manejar
			
			/*Ahora necesitamos a la clase BufferedReader, para poder leer las lineas
			 * que contenga nuestro archivo
			 */
			BufferedReader buffer = new BufferedReader(fr);
			//las lineas o linea que va a leer el objeto buffer lo guarda en un String
			linea = buffer.readLine();
			
			System.out.println(linea);
			
			
			while((linea = buffer.readLine()) !=null) {
				System.out.println(linea);
			}
			
		} catch (Exception e) { //si hay una exepcion se atrapa aqui
			// Y se ejecuta este otro bloque de codigo
			System.out.println("No es posible localizar el archivo");
			//Si quisieramos ver el msj de exepcion en consola utilizamos la 
			//sig. linea
			e.printStackTrace();//esto vuelve a mostrar la exepcion 
			//impresa en consola
			
			
			
		}

	}

}
