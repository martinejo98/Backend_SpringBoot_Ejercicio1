package com.example.Ejercicio4;


public class Persona {
    protected String nombre;
    protected int edad;
    protected String poblacion;

    public Persona(String nombre, int edad, String poblacion){
        this.nombre=nombre;
        this.edad=edad;
        this.poblacion=poblacion;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getPoblacion(){
        return poblacion;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String toStirng(){
        return "Nombre: "+nombre+", edad: "+edad+", poblacion: "+poblacion;
    }

}
