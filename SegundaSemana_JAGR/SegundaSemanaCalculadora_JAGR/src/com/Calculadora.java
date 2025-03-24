package com;

public abstract class Calculadora {
    private String marca;
    private String color;
    private double precio;

    // Constructor
    public Calculadora(String marca, String color, double precio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    // Getters y Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    // Método toString
    @Override
    public String toString() {
        return "Calculadora [Marca=" + marca + ", Color=" + color + ", Precio=" + precio + "]";
    }

    // Métodos abstractos
    public abstract double sumar(double a, double b);
    public abstract double restar(double a, double b);
    public abstract double multiplicar(double a, double b);
    public abstract double dividir(double a, double b);
}

