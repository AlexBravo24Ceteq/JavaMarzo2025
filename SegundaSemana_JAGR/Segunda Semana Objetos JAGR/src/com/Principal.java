package com;

public class Principal {

	public static void main(String[] args) {
		
		//En la POO solo debe existir una clase con el metodo main
		//se encargara de ejecutar el proyecto
		
		Computadora dell = new Computadora();
		
		//Podria asignar valores a las variables de mi computadora dell
		//pero de una forma "Incorrecta"
		
		//dell.marca="Dell";
		
		//Ej. de crear una nueva computadora pero
		//Con todos los parametros iniciados
		
		Computadora hp = new Computadora("HP","440G7", "Plata", "Laptop", 11000.50, 8, 250, 1.6);
		
		//Ej de utilizar un metodo get para recuperar el precio del objeto HP
		
		double precioHP = hp.getPrecio();  //=11000.50 este metodo es lo que da el precio en tipo double
		//de mi objeto hp y lo puedo guardar en una variable local
		
		//o puedo mandarlo a imprimir directo a consola
		System.out.println(hp.getPrecio());
		
		System.out.println(dell.getPrecio());
		
		//Ej utilizar los metodos set para establecer valores en mi objeto vacio dell
		dell.setPrecio(13000);
		dell.setMarca("Dell");     //Computadora (String marca, color y precio)
		dell.setColor("Negro");
		
		
		System.out.println(dell.getPrecio());
		
		//vamos a ver que ocurre si quiero imprimir en consola todas las caracteristicas
		//de mi objeto
		
		System.out.println(hp); //Esta impresion funciona bien hasta que creamos 
		//el metodo String
		
		System.out.println(dell);
		
		//Van a crear una clase para crear 2 objetos. Uno vacio y otro con todos los 
		//parametros 
		//y los mandan a imprimir aqui en esta clase principal
		//el objeto debe tener por lo menos 5 atributos
		//Ej celular - string marca, string modelo, string precio, string color, string precio
		
		
		
	}

}
