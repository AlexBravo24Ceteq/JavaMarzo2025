package com;

public class Computadoras {

    private String procesador;
    private String tarjetamadre;
    private String psu;
    private String gpu;
    private String gabinete;
    private String disipador;
    private double ventiladores;
    private double ram;
    private double almacenamiento;

    // Constructor vacío
    public Computadoras() {
    }

    // Constructor con todos los parámetros
    public Computadoras(String procesador, String tarjetamadre, String psu, String gpu, String gabinete,
                        String disipador, double ventiladores, double ram, double almacenamiento) {
        this.procesador = procesador;
        this.tarjetamadre = tarjetamadre;
        this.psu = psu;
        this.gpu = gpu;
        this.gabinete = gabinete;
        this.disipador = disipador;
        this.ventiladores = ventiladores;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    // Constructor con solo procesador y GPU
    public Computadoras(String procesador, String gpu) {
        this.procesador = procesador;
        this.gpu = gpu;
    }

    // Getters y Setters
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTarjetamadre() {
        return tarjetamadre;
    }

    public void setTarjetamadre(String tarjetamadre) {
        this.tarjetamadre = tarjetamadre;
    }

    public String getPsu() {
        return psu;
    }

    public void setPsu(String psu) {
        this.psu = psu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getGabinete() {
        return gabinete;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }

    public String getDisipador() {
        return disipador;
    }

    public void setDisipador(String disipador) {
        this.disipador = disipador;
    }

    public double getVentiladores() {
        return ventiladores;
    }

    public void setVentiladores(double ventiladores) {
        this.ventiladores = ventiladores;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Computadoras [procesador=" + procesador + ", tarjetamadre=" + tarjetamadre + ", psu=" + psu
                + ", gpu=" + gpu + ", gabinete=" + gabinete + ", disipador=" + disipador + ", ventiladores="
                + ventiladores + ", ram=" + ram + ", almacenamiento=" + almacenamiento + "]";
    }
}
