/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instituto2ci;

/**
 *
 * @author Lab10
 */
public class Estudiante extends Persona {
    
    private String carrera;
    private int legajo;

    public Estudiante(String carrera, int legajo, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.legajo = legajo;
    }

    public Estudiante(String carrera, int legajo) {
        this.carrera = carrera;
        this.legajo = legajo;
    }

    
    
    
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

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


    
}
