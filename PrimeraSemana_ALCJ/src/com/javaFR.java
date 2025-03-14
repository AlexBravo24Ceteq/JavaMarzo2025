package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class javaFR {

	public static void main(String[] args) {
		// Uso de clases file, file reader y bufferReader
		// Intentaremos realizar una leccura de un archivo

		// Necesitamos un String donde guardar la info
		// que vamos a leer

		String linea;
		// la estructura try and catch es util para poder manejar una excepcion
		// ya que intenta ejecutar un bloque de codigo, y si algo falla
		// atrapa el msj de la excepcion para permitirnos
		// ejecutar otra cosa en lugar de mostrar la excepcion en consola

		try { // intenta ejectar lo siguiente
				// Traemos a la clase File para pasarle la ruta
				// de donde se encuentre el archivo
			File archivo = new File("C:\\Users\\lizam\\OneDrive\\Escritorio\\archivo.txt");
			// necesitamos ahora a la clase fileReader para que se pueda abrir el archivo
			FileReader fr = new FileReader(archivo);
			// Ahora necesitamos a la clase BufferReader para poder leer las lineas que
			// contengan
			// nuestro archivo
			BufferedReader buffer = new BufferedReader(fr);
			// las lineas o linea que va a leer el objeto bufffer lo guardo en un String
			while((linea = buffer.readLine()) !=null) {
				System.out.println(linea);
			}

		} catch (Exception e) { // si hay una excepcion se atrapa aqui
			// y se ejecuta este otro bloque de codigo
			System.out.println("No es posible localizar el archivo");
			//Si quisieramos ver el msj de la excepcion en consola utilizamos la sig. linea
			e.printStackTrace();//Esto vuelve a mostrar la excepcion impresa en consola
		}

	}

}
