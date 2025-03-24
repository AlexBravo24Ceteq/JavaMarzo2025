package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		
		// Intentar realizar una escritura en un archivo de texto
		
		String linea = "\nHoy es 14 de marzo de 2025\n";
		
		try {
			File archivo = new File("C:\\Users\\jorge\\OneDrive\\Escritorio\\archivo.txt");
			//Ahora necesitamos a la clase FileWriter para poder escribir info en mi archivo
			FileWriter writer = new FileWriter(archivo, true); //con el valor booleano true
			//se respeta el contenido del archivo original
			
			//Escribimos la info en el archivo
			writer.write(linea);
			
			//Para guardar los cambios y cerrarlos
			writer.close();
			System.out.println("Se han guardado los cambios en el archivo");
			
		} catch (Exception e) {
			System.out.println("Hubo un error");
		}

	}

}
