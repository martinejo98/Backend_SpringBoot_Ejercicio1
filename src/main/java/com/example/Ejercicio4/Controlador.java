package com.example.Ejercicio4;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controlador {

    @GetMapping("/user/{nombre}") //Establecemos la ruta y lo que esta entre {} son variables
    @ResponseBody
    public String user(@PathVariable String nombre){
        return "Hola "+nombre;
    }

    /*
    @PostMapping("/user/{nombre}/{edad}/{poblacion}") //podemos pasarle mas de una variable
    @ResponseBody
    public Persona getPersona(@PathVariable String nombre, @PathVariable int edad, @PathVariable String poblacion){
        Persona persona1 = new Persona(nombre, edad, poblacion);
        return persona1;
    }
    */

    @PostMapping("/useradd") //podemos pasarle mas de una variable
    @RequestMapping(value = "/useradd", method = RequestMethod.POST, consumes = "application/json")
    public String useradd(@RequestBody Persona persona1){
        return persona1.toStirng();
    }

}
