package com;

public class perro {

	class Perro extends Mascota {
	    private String raza;

	    public Perro(String nombre, int edad, String raza) {
	        super(nombre, edad, "Perro");
	        this.raza = raza;
	    }

	    public void ladrar() {
	        System.out.println(nombre + " está ladrando: ¡Guau, guau!");
	    }

	    @Override
	    public void mostrarInfo() {
	        super.mostrarInfo();
	        System.out.println("Raza: " + raza);
	    }
	}
}