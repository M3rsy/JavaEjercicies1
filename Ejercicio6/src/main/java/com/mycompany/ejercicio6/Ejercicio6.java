/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

/**
 *
 * @author ghot-
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        imprimirCalificacion("Daniel", 65);
        imprimirCalificacion("Monica", 89);
    }

    public static void imprimirCalificacion(String nombre, int nota) {
        String estado = nota >= 70 ? "Aprobado" : "Reprobado";
        System.out.println(nombre + " " + nota + " " + estado);
    }
    }



