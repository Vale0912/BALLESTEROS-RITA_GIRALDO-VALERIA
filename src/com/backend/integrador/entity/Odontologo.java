package com.backend.integrador.entity;

public class Odontologo {

    private int id;
    private String nombre;
    private String apellido;
    private int numeroMatricula;

    public Odontologo(int id, String nombre, String apellido, int numeroMatricula) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroMatricula = numeroMatricula;
    }

    public Odontologo(String nombre, String apellido, int numeroMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroMatricula = numeroMatricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String toString() {
        return '\n' + "Id: " + id + '\n' +  "Nombre: '" + nombre + '\n' + "Apellido: '" + apellido + '\n' + "Matricula: " + numeroMatricula;
    }
}
