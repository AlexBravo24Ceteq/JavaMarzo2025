package com;

import com.gato.Gato;
import com.perro.Perro;

public class Principal {

	public static void main(String[] args) {

        Perro miPerro = new Perro("Max", 3, "Labrador");
        miPerro.mostrarInfo();
        miPerro.ladrar();
        miPerro.comer();
        miPerro.dormir();

        System.out.println("\n----------------------\n");

        // Crear un gato
        Gato miGato = new Gato("Misu", 2, "Negro");
        miGato.mostrarInfo();
        miGato.maullar();
        miGato.comer();
        miGato.dormir();
    }
}
