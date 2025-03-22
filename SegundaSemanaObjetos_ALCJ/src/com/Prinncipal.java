package com;

public class Prinncipal {

	public static void main(String[] args) {
		// En la POO solo debe existir una clase con el metodo main
		//Que se encargara de ejecutar el proyecto
		
		//Con lo que tenemos hasta ahorita en la clase computadora
		//podemos ya crear objetos de esta clase aqui, aunque aun faltan muchas cosas
		
		//Ej. crear una primera computadora
		
		Computadora dell = new Computadora();
		
		//Podria asignar valores a las variables de mi computadora dell
		//pero de una forma incorrecta		
		//dell.marca="Dell";
		
		//Ej. crear nueva computadora con todos los parametros
		
		Computadora hp = new Computadora("HP", "440G7","Plata", "Laptop", 110000.50, 8, 250, 1.6);
		
		//Ej. de utilizar un metodo get para recuperar el precio del objeto HP
		
		double precioHp = hp.getPrecio(); //Este metodo get me devuelve el precio 
		//de mi obbjeto hp y lo puedo guardar en una variable
		
		//System.out.println(hp.getPrecio());
		
		//System.out.println(dell.getPrecio());
		
		//Ej. utilizar los metodos set para establecer valores en mi objeto vacio dell
		dell.setPrecio(13000);
		dell.setMarca("Dell");
		dell.setColor("Negro");
		
		//System.out.println(dell.getPrecio());
		
		//Vamos a ver que ocurre si quiero imprimir en consola todas las caracteristicas de mi
		//objeto
		
		//System.out.println(hp); //esta impresion funciona bien hasta que creamos el metodo toString()
		
		
		//System.out.println(dell);
		
		//crear 1 clase para poder crear 2 objetos. 1 vacio y oro con todos los parametros
		//y los mandan a imprimir aqui en esta clase principal
		//el objeto debe tener por lo menos 5 atributos
		//ej. celular -String marca, String modelo, String precio, String color
		
		{
	Persona personaUno = new Persona();
    System.out.println("Datos personales:");
    System.out.println(personaUno);

    Persona personaDos = new Persona("María López", 25, "Avenida Siempre Viva 742", "555-9876", "maria.lopez@example.com",  "Femenino", true);
    System.out.println("\nDatos Personales Completos:");
    System.out.println(personaDos);
	
    
	}
	
	}
}


