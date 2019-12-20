/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejer2;

/**
 *
 * @author César Fernández
 */

public class Persona {

    public int edad;
    public String nombre;
    public String apellido;

    public Persona() {
        this.edad = 0;
        this.nombre = "";
        this.apellido = "";
    }

    @Override
    public String toString() {
        return this.nombre
                + ", " + this.apellido
                + ", " + this.edad;
    }
}
