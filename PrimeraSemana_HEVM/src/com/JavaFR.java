package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader y BufferedReader
		//intentaremos realizar una lectura de un archivo
		
		//Necesitamos un String donde guardar la info que vamos a leer
		
		String linea;
		
		//La estructura try and catch es util para manejar una excepción,
		//ya que intenta ejecutar un bloque de codigo y si algo falla atrapa
		//el msj de la excepcion para permitirnos ejecutar otra cosa en lugar de
		//mostrar la excepcion en consola.
		
		try {//intentaremos ejecutar los siguiente
			//traemos a la clase File para pasarle la ruta
			//de donde se encuentra el archivo
			File archivo = new File("C:\\Users\\sayae\\Desktop\\prueba.txt");
			//Necesitamos ahora a la clase FileReader para que se pueda abrir el archivo
			FileReader fr = new FileReader(archivo);
			//Ahora necesitamos a la clase BufferedReader para poder leer las lineas
			//que contenga nuestro archivo
			BufferedReader buffer = new BufferedReader(fr);
			//Las lineas o linea que va a leer el objeto buffer lo guardo en un String
			
			while ((linea = buffer.readLine()) != null) {
				System.out.println(linea);
			}
//			linea = buffer.readLine();//readLine solo lee una linea
//			System.out.println(linea);
			
		}catch (Exception e) {//si hay una excepcion se atrapa aqui y se
			//ejecuta este otro bloque de codigo
			System.out.println("No es posible localizar el archivo");
			//si quisieramos ver el msj de excepcion en consola utilizamos la siguiente linea
			e.printStackTrace();//esto vuelve a mostrar la excepcion impresa en consola
			
		}

	}

}
