package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// 14/03/2025
		/*Este es el FileWrite, para realizar una escritura en un archivo 
		 * de texto
		 */
		
		String linea = "\nHoy es 14 de marzo del 2025\n";
		
		try {
			File archivo = new File("C:\\Users\\Alexandra\\Desktop\\archivo.txt");
			//Ahora necesitamos a la clase FileWriter para poder escribir info en mi archivo
			FileWriter writer = new FileWriter(archivo, true); //con el valor booleano true
			//se respeta el contenido del archivo original
			
			
			//Escribimos la info en el archivo
			writer.write(linea);
			
			//Para guardar la info escritay cambios
			writer.close();
			System.out.println("Se ha guardado la información");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
