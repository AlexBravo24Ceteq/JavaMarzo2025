package com;

public class gato {

	class Gato extends Mascota {
	    private String color;

	    public Gato(String nombre, int edad, String color) {
	        super(nombre, edad, "Gato");
	        this.color = color;
	    }

	    public void maullar() {
	        System.out.println(nombre + " está maullando: ¡Miau, miau!");
	    }

	    @Override
	    public void mostrarInfo() {
	        super.mostrarInfo();
	        System.out.println("Color: " + color);
	    }
	}
	
}
