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

public class Profesor
        extends Persona {

    public String horario;

    @Override
    public String toString() {
        return super.toString()
                + ", " + horario;
    }
}
