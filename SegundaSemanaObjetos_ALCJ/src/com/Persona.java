package com;

public class Persona {
	private String nombre;
    private int edad;
    private String direccion;
    private String telefono;
    private String email;
    private String genero;
    private boolean activo;

    // Constructor vacío
    public Persona() {
    }

    // Constructor con todos los parámetros
    public Persona(String nombre, int edad, String direccion, String telefono, String email, String genero, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.genero = genero;
        this.activo = activo;
    }

// Getters y Setters
public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public String getDireccion() {
    return direccion;
}

public void setDireccion(String direccion) {
    this.direccion = direccion;
}
public String getTelefono() {
    return telefono;
}

public void setTelefono(String telefono) {
    this.telefono = telefono;
}

public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}

public String getGenero() {
    return genero;
}

public void setGenero(String genero) {
    this.genero = genero;
}

public boolean isActivo() {
    return activo;
}
public void setActivo(boolean activo) {
    this.activo = activo;
}
//Método toString para imprimir los datos de la persona
@Override
public String toString() {
    return "Persona{" +
            "nombre='" + nombre + '\'' +
            ", edad=" + edad +
            ", direccion='" + direccion + '\'' +
            ", telefono='" + telefono + '\'' +
            ", email='" + email + '\'' +
            ", genero='" + genero + '\'' +
            ", activo=" + activo +
            '}';
}
}



