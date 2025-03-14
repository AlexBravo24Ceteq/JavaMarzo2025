package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Intentar realizar una escritura en un archivo de texto.
		
		String linea = "\nHoy es 14 de Marzo de 2025.\n";
		
		try {
			File archivo = new File("C:\\Users\\mflog\\OneDrive\\Escritorio\\Fichero.txt");
			//Ahora necesitamos a la clase FileWriter para poder escribir inf. en mi archivo.
			FileWriter writer = new FileWriter(archivo, true);// con el valor booleano True se respeta el contenido del archivo original.
			
			//Escribirmos la info. en el archivo.
			writer.write(linea);
			
			//Para guardar los cambios y cerrarlos.
			writer.close();
			System.out.println("Se han guardado los cambios en el archivo.");
			
		} catch (Exception e) {
			System.out.println("Hubo un error.");
		}

	}

}
