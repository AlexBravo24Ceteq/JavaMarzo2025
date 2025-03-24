package com;

public class Principal {

	public static void main(String[] args) {
		// 18/03/2025
		/*En la POO solo debe de existir una clase con el metodo
		 * main que se encargara de ejecutar el proyecto
		 */
		
		//Con lo que tenemos hasta ahorita en la clase Computadora
		//podemos ya crear objetos de esta clase aqui, aunque aun faltan
		//muchas cosas
		
		//Ej. Crear una computadora
		//Clase   //objeto
//		Computadora dell =  new Computadora();
//
//		//Podria asignar valores a las variables de mi computadora dell
//		//pero de una forma "incorecta"
//		//dell.marca="Dell";
//		
//		//Ej. Crear una nueva computadora con todos los parametros iniciados
//		Computadora hp = new Computadora("HP", "440G7", "Plata", "Laptop", 1100.50, 8, 250, 1.6);
//		
//		//Ej. de utilizar un metodo get para recuperar el precio del objeto hp
//		
//		double precioHp = hp.getPrecio();//este metodo get me devuelve el precio de mi objeto
//		//hp y lo pueda guardar en una variable local
//		
//		//O puedo mandarlo a imprimir directo en consla
//		System.out.println(hp.getPrecio());
//		
//		System.out.println(dell.getPrecio());
//		
//		//Ej. utilizar el metodo set para establecer valores en mi objeto vacio dell
//		dell.setPrecio(13000);
//		dell.setMarca("Dell");
//		dell.setColor("Negro");
//		
//		System.out.println(dell.getPrecio());
//		
//		//Que ocurre si quiero imprimir en consola todas las caracteristicas
//		//de mi objeto
//		System.out.println(hp);//esta impresion funciona bien hasta que creamos
//		//el metodo toString()
//		
//		System.out.println(dell);
		
		
		
		//Crear 1 clase para poder  crear 2 objetos. Uno vacio y el otro con todos los parametros
		//y los mandan a imprimir aqui en esta clase principal
		//El objeto debe tener por lo menos 5 atributos
		//Ej. celular 
		
		//MOTO
		Moto yamaha =  new Moto();
		
		Moto r = new Moto("Yamaha", "R6", "Negro", "Deportiva", 70.450, 87.1, 292);
		
		double precioR = r.getPrecio();
		
		System.out.println(r.getPrecio());
		
		System.out.println(yamaha.getPrecio());
		
		
		yamaha.setPrecio(90.450);
		yamaha.setMarca("BMW");
		yamaha.setColor("Rojo");
		
		System.out.println(yamaha.getPrecio());
		
		System.out.println(r);
		
		System.out.println(yamaha);
		
		
	}

}
