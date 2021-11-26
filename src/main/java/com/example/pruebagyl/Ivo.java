package com.example.pruebagyl;

public class Ivo {

    String nombre;
    String apellido;

    public Ivo() {
    }

    public Ivo(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = "Alagastino";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
