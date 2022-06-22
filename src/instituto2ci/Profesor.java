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
public class Profesor extends Persona {
    
        private String materia;
        private String cargo;

    public Profesor(String materia, String cargo, String nombre, int edad) {
        super(nombre, edad);
        this.materia = materia;
        this.cargo = cargo;
    }

    public Profesor(String materia, String cargo) {
        this.materia = materia;
        this.cargo = cargo;
    }

        
        
        
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
