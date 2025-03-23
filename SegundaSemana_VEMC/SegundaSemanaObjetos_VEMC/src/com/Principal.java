package com;

public class Principal {

	public static void main(String[] args) {
		// En la P.O.O. solo debe existir una clase con el metodo Main.
		// Se encargara de ejecutar el proyecto.
		
		//Con lo que tenemos hasta ahora en la clase Computadora, podemos crear objetos de esta clase.
		//A pesar de que aun falten muchas cosas
		
		//Ej. Crear una primera computadora.
		
		Computadora dell = new Computadora();
		//Podria agisnar valores a las variables de mi computadora dell pero de una forma "Incorrecta"
		//dell.marca="Dell";
		
		//Ej. Crear una nueva computadora  pero con todos los parametros iniciados
		
		Computadora hp = new Computadora("HP", "440G7", "Plata", "Lapton", 11000.50, 8, 250, 1.6);
		
		
	//Ej de utilizar un metodo get para recuperar el precio del objeto hp.
		double precioHp = hp.getPrecio(); //Este metodo get me duevuelve el precio de mi objeto hp y lo puede guardar en una variable local
		
	//O puede mandarlo a imprimir directo en consola
		System.out.println(dell.getPrecio());
		
		
	//Ej. utilizar los metodos set para establecer valored en mi objeto vacio dell.
		dell.setPrecio(13000);
		dell.setMarca("Dell");
		dell.setColor("Negro");
		
		System.out.println(dell.getPrecio());
		
	//Ej. si quiero imprimir en consola todas las caracteristicas de mi objeto
		System.out.println(hp);//Esta impresion funciona bien hasta que crea,ps el metodo toString()
		
		System.out.println(dell);
		
		
		//Crear una clase para poder crear dos objetos, uno vacio y otro con todos los parametros.
		//Imprimir aqui en clase principal
		//El objeto debe tener por lo menos cinco atributos.
		//Ej. Celular - String Marca, String modelo, String precio, String color, String procesador.
		
		
		Autos autos = new Autos();
		Autos auto2 = new Autos("Nissan","2025","PickUp","Blanco",785500.00);
		
		autos.setMarca("Toyota");
		autos.setModelo("2024");
		autos.setTipo("Sedan");
		autos.setColor("Rojo");
		autos.setPrecio(360789.50);
		
		System.out.println();
		System.out.println(autos);
		System.out.println(auto2);
		
	}

}
