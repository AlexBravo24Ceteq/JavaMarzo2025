package com;

public abstract class Persona { //la clase de volvio abstracta

		private String nombre;
		private String genero;
		private int edad;
		
		public Persona() {
			
		}

		public Persona(String nombre, String genero, int edad) {
			super();
			this.nombre = nombre;
			this.genero = genero;
			this.edad = edad;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
		}
	
		
		//Metodos Propios- 
		//Nuetros objetos pueden tener comportamient que nosotros les vayamos
		//a definir
		
		//Acciones que nuestros objetos pueden realizar
		
		//Metodos sin retorno
		//son aquellos que nos van a permitir ejecutar algo, pero no necesitan regresar 
		//o devolver un tipo de dato. llevan la palabra reservada "void"
		
		/**
		 * Este metodo envia en mensaje impreso en consola que dice "Estoy comiendo"
		 */
		public void comer() {
			System.out.println("Soy "+ nombre+ ". Estoy comiendo..."); //solo esun msj que se va a mostrar
		}
		
		//MEtodo con retorno 
		//son aquellos que ejecutan algo, pero ademas se ven obligados a devolver
		//un tipo de dato. El tipo de dato que declaran
		
		
		//Se le conoce como JAVA DOC
		/**
		 * Este metodo devuelve un String con un saludo
		 * @return Devuelve el sauldo y el nombre de objeto
		 */
		public String saludar () {
			String saludo ="Hola buen dia mi nombre es " + nombre;
			//Si yo quiero que este metodo imprima en consolo el saludo lo podemos hacer
			System.out.println(saludo);
			return saludo; // este metodo va a devolver el String saludo
		}
		
		//Polimorfismo
		
		//Metodo Polimorfico
		//Son metodos que se llamana igual, pero que se ejecutan de distinta manera
		//gracias a la sobrecarga de elementos
		
		public void comer (String comida) {
			System.out.println("Soy "+ nombre + " Estoy comiendo "+comida);
		}
		
		//otro metodo comer
		public void comer (String comida, int raciones) {
			System.out.println("Soy "+ nombre+ ".Estoy comiendo "+raciones+" raciones de "+comida);
		}
		
		//Crando un metodo sumar abstracto
		//Un metodo abstracto es aquel que nos dice que hacer
		//pero no como hacerlo. Es decir es un metodo sin cuerpo.
		
		public abstract int sumar (int a, int b);
		
		
		
		
} 