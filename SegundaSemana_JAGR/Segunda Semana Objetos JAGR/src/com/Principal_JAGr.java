package com;

public class Principal_JAGr {

    public static void main(String[] args) {
        
        // Listado de computadora de escritorio
        Computadoras escritorio = new Computadoras();
        
        // Creando una computadora armada
        Computadoras armada = new Computadoras("Ryzen", "Gigabyte", "CoreReactor", "Nvidia", "Balamrush", "MSI", 5, 16, 512); 
        
        // CORRECCIÓN: Tipo de dato debe ser String
        String procesadorarmada = armada.getProcesador();
        
        Computadoras sininventario = new Computadoras();
        System.out.println("Sin inventario o sin piezas:");
        System.out.println(sininventario);
        
        
        // Imprimiendo el procesador de la computadora armada
       // System.out.println("Procesador: " + armada.getProcesador());

        // Modificando valores de la computadora armada
        armada.setProcesador("Ryzen");
        armada.setPsu("Nvidia");
        armada.setTarjetamadre("Asus");
        armada.setGabinete("Balamrush");
        armada.setVentiladores(5);

       
     
        
        		
        // Imprimiendo la computadora con sus nuevos valores

      System.out.println("Computadora Armada con las siguientes especificaciones");
        System.out.println(armada);
    }
}











//Computadoras piezas = new Computadoras ("ryzen", "Nvidia", "Asus", "Balamrush",5);
