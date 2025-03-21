package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo debe de existir una clase con el metodo main
		//que se encargue de ejecutar el proyecto
		
		// con lo que tenemos hasta ahoortia en la clase Computadora
		//podemos crear objetos de esta clase aqui, aunqeu aun falta muchas cosas
		
		//ej. crear una primera computadora
		Computadora dell = new Computadora(); //crear objeto computadora
		
		//Podria asignar valores a las varibales de mi computadora dell
		//pero de una forma "incorrecta"
		
		//dell.marca="Dell";
		
		
		//Ej. de crear una nueva computadora pero 
		//con todos los parametros iniciados
		//CRTl + espacio
		Computadora hp = new Computadora("HP", "440G7", "Plata", "Laptop", 11000.50, 8, 250, 1.6);
		
		
		//Ejemplo de utilizar un metodo GET para recuperar el precio del objeto hp
		
		double precioHP = hp.getPrecio(); //es el quivalente a escribir el precio de mi objeto
		//Este metodo get me devuelve el precio de  mi objeto y lo puedo guardar en una varibale local
		
		//o puedo mandarle a imprimir directo en consola
		System.out.println(hp.getPrecio());
		
		System.out.println(dell.getPrecio());
		
		//EJ. utilizar los metodos set para establecer valores en mi objeto vacio dell
		dell.setPrecio(11300);
		dell.setModelo("T460");
		dell.setColor("Negro");
		
		System.out.println(dell.getPrecio());
		
		//Vamos a ver que ocure si quiero imprimir en consola todas las caracteristicas
		//de  mi objeto 
		System.out.println(hp);// esta impresion funciona bien hasta que creamos
		//el metodo toString()
		
		System.out.println(dell);
		
		//van a crear una clase para poder crear 2 objetos. uno vacio y otro con todos los 
		//parametros 
		//Y los mandan a imprimir aqui en clase principal
		//el objeto debe tener por lo mneos 5 atributos
		//Ejem. Celular- String marca, modelo, precio,color
		
		//Crear objeto las variables van en minuscula
		Estudiante estudiante1 = new Estudiante(); //vacio
		
		Estudiante estudiante2 = new Estudiante("Pedro", 20, "2025GRTEA", "Programacion", 87.0);//con parametros
		
		estudiante1.setNombre("Juan"); //Agregamos el parametro con el metodo set
		estudiante1.setMatricula("2025GETR");
		estudiante1.setEdad(21);
		estudiante1.setCurso("Programación");
		estudiante1.setCalificaciones(90.6);
		
		System.out.println();
		System.out.println(estudiante1);
		System.out.println(estudiante2);
		
		System.out.println(estudiante1.getCalificaciones());
		System.out.println(estudiante2.getCalificaciones());
	}

}
