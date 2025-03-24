package com;

public class Mascota {

	    protected String nombre;
	    protected int edad;
	    protected String especie;

	    public Mascota(String nombre, int edad, String especie) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.especie = especie;
	    }

	    public void comer() {
	        System.out.println(nombre + " est� comiendo.");
	    }

	    public void dormir() {
	        System.out.println(nombre + " est� durmiendo.");
	    }

	    public void mostrarInfo() {
	        System.out.println("Nombre: " + nombre + ", Edad: " + edad + " a�os, Especie: " + especie);
	    }
	}


