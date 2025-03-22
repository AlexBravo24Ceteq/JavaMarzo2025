package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO (Programacion orientada a objetos) solo debe 
		//existir una clase con el metodo main y se encargara de 
		//ejecutar el proyecto
		
		//Con lo que tenemos en la clase Computadora, podemos ya crear
		//objetos de esta clase aqui, aunque aun faltan muchas cosas
		
		//Ejemplo, crear una primera computadora
		Computadora dell = new Computadora(); //Computadora es la clase
		//que es un nuevo tipo de dato, dell es la variable que ahora es un objeto, llamado tambien
		//instancia de clase
		
		//Podria asignar valores a las variables de mi copmputadora dell
		//pero de una forma "incorrecta"
		// dell.marca="Dell";
		
		//Ejemplo de crear una nueva computadora pero con todos los
		//parametros iniciales
		Computadora hp = new Computadora("HP", "440G7", "Plata", "Laptop", 11000.5, 8, 250, 1.6);

		//Ejemplo de Get para recuperar el precio
		
		double precioHP = hp.getPrecio(); //Este metodo me devuelve el preacio
		//de mi objeto hp y lo puedo guardar en una variable local
		
		//O lo puedo mandar a imprimir directo en consola
		System.out.println(hp.getPrecio());
		
		//Utilizar el metodo Set para establecer valores en mi objeto vacio
		dell.setPrecio(13000);
		dell.setMarca("Dell");
		dell.setColor("Negro");
		
		System.out.println(dell.getPrecio());
		
	}

}
