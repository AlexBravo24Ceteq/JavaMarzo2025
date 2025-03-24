package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Interntar realizar una escritura en un archivo de txt 
		
		String linea = "\nHoy es 14 de marzo del 2025 Arriba sinaloa\n"; //lleva salto de linea
		
		try {
			File archivo= new File("C:\\Users\\Toño\\Desktop\\Archivo.txt");
			//Ahora necesitamos ala clase File writer para poder escribir info en mi archivo
			FileWriter writer = new  FileWriter(archivo,true);// Con el valor boolean true
			//se respesta el contenido del archivo original
			
			//Escribimos la info en el archivo
			writer.write(linea);
			
			//Para guardar los cmabios y cerrarlos 
			writer.close();
			System.out.println("Se han guardado los cambios");
			
			
		} catch (Exception e) {
			System.out.println("ERROR: ");
			// TODO: handle exception
		}

	}

}
