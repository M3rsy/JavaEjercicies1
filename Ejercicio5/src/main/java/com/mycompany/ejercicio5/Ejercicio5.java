/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author ghot-
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        String[][] datos = {
            {"Daniel", "Medina", "Electrónica", "TEST"},
            {"Monica", "Jiz", "Computación", "IMSA"},
            // Agrega más registros con la misma estructura
        };

        for(String[] fila : datos) {
            System.out.println(fila[0] + " " + fila[1] + " " + fila[2] + " " + fila[3]);
        }
    }
}
