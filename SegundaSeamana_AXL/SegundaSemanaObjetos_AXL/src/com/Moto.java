package com;
//18/03/20225
//Este es el primer trabajo de respecto al tema de POO <3

public class Moto {
	
	//Estos son los atributos
		private String marca;
		private String modelo;
		private String color;
		private String tipo;
		private double precio;
		private double potencia;
		private double velocidad;
		
		public Moto() {
			
		}

		//Metodo constuctor con todos los parametros
		public Moto(String marca, String modelo, String color, String tipo, double precio, double potencia,
				double velocidad) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.color = color;
			this.tipo = tipo;
			this.precio = precio;
			this.potencia = potencia;
			this.velocidad = velocidad;
		}
		
		public Moto(String marca, double precio) {
			super();
			this.marca=marca;
			this.precio=precio;
		}

		
		//Metodos Geters y Setters
		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public double getPotencia() {
			return potencia;
		}

		public void setPotencia(double potencia) {
			this.potencia = potencia;
		}

		public double getVelocidad() {
			return velocidad;
		}

		public void setVelocidad(double velocidad) {
			this.velocidad = velocidad;
		}
		
		
		

		//METODO TO STRING
		@Override
		public String toString() {
			return "Moto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipo=" + tipo + ", precio="
					+ precio + ", potencia=" + potencia + ", velocidad=" + velocidad + "]";
		}
		
		
		
		
		
		
		
		
		

}
