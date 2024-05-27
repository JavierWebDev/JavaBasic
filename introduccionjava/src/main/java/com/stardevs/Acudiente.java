package com.stardevs;

public class Acudiente {
    String nombre;
    String edad;
    String estudiante;

    public Acudiente() {}

    public Acudiente(String nombre, String edad, String estudiante) {
        this.nombre = nombre;
        this.edad = edad;
        this.estudiante = estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }
}


