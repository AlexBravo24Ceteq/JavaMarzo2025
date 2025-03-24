package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class javaFR {

	public static void main(String[] args) {
		//Uso de las clases FIle, FileReader y BufferedReader
		//Intentar realizaar una lectura de un archivo
		
		
		//Necesitamos un String donde guardar la info
		//que vamos a leer
		
		String linea;
		
		//Try Catch se utiliza para cuando sabesmos que puede fallar el codigo
		//por cuestiones que no estan en nuestras manos
		
		//La estructura try an catch es util para poder manejar una
		//exception ya que intenta ejecutar un bloquee de codigo
		//y si algo falla atrapa el msj de la exception para permitirnos
		//ejecutar otra cosa en lugar de mostrar la exception en consola
		
		try {//intenta ejecutar lo siguiente
			//traemos a la clase file para pasarle la ruta 
			//De donde se encutra el archivo
			File archivo= new File("C:\\Users\\Toño\\Desktop\\Archivo.txt");//ruta del archivo
			//necesitamos ahora a la clase FileReader para que se pueda abri el archivo
			FileReader fr = new FileReader(archivo);//pasamos "archivo" que contiene la ruta
			//Ahora necesitamos a la clase BufferReader para poder leer las lineas
			//que contenga nuentro archivo
			BufferedReader buffer = new BufferedReader(fr);
			//Las lineas o linea que va a leer el objeto buffer lo guardo en un string
//			linea= buffer.readLine();//metodo va leer mi archivo
//			
//			System.out.println(linea);//Solo lee una linea de texto
			
			//leer varias lineas de texto
			while ((linea = buffer.readLine()) !=null) {
				System.out.println(linea);
			}
					

		} catch (Exception e) {//si hay una exception se atrapa aqui 
			//y se ejecuta este otro bloquee de codigo

			System.out.println("No es posible localizar el archivo");
			//Si queremos ver el msj de la exception en consola utilizamos la sig linea
			
			e.printStackTrace();//Esto vuelve a mostrar la exception impresa en consola
		}

	}

}
