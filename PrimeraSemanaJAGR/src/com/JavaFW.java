package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		
		
		//Se va a intentar realizar una escritura en un archivo de texto
		
		String linea = "\nHoy es 14 de marzo del 2025\n";
		
		try {
			
			File archivo = new File("C:\\Users\\George\\Desktop\\archivo2.txt"); 	
			//Ahora necesitamos a la clase FileWriter para poder escribir info en mi archivo
			
			FileWriter writer = new FileWriter(archivo, true); // este valor booleano true 
			//se respeta el archivo original
			
			//Escribimos la info en el archivo
			writer.write(linea);
			
			//Para guardar los cambios y cerrarlos
			writer.close();
			System.out.println("Se a guaradado los datos en el archivo");
			
	
					
			} catch (Exception e) {
			// TODO: handle exception
		}				

	}

}
