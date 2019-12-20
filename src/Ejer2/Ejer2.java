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

public class Ejer2 {

    public static void main(String[] args) {
        Estudiante es = new Estudiante();
        es.nombre = "Cesar";
        es.apellido = "Fernandez";
        es.edad = 23;
        System.out.println(es.toString());

        Profesor pro = new Profesor();
        pro.nombre = "Rosa";
        pro.apellido = "Gutierrez";
        pro.edad = 35;
        System.out.println(pro.toString());

        Curso cur = new Curso();
        cur.nombre = "Progra 2";
        cur.creditos = 4;
        cur.id = 1;
        System.out.println(cur.toString());
    }

}
