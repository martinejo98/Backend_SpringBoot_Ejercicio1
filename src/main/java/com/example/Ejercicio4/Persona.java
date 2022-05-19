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
    public String toStirng(){
        return "Nombre: "+nombre+", edad: "+edad+", poblacion: "+poblacion;
    }

}
