/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author ghot-
 */
public class Principal {

    public static void main(String[] args) {
        Recursos recursos = new Recursos();

        // Llamada al primer método
        System.out.println(recursos.bienvenida());

        // Llamada al segundo método con un ejemplo de edad
        System.out.println(recursos.verificarEdad(30));

        // Llamada al tercer método con ejemplo de números a multiplicar
        System.out.println(recursos.multiplicar(6, 4));

        // Llamada al cuarto método y impresión de la lista de números
        int[] numeros = recursos.listaNumeros(10);
        for (int numero : numeros) {
            System.out.print(numero + " ");
    }
}


public static class Recursos {
    // Primer método: Retorna un mensaje fijo
    public String bienvenida() {
        return "Programación Orientada a Objetos 2021";
    }

    // Segundo método: Retorna un mensaje dependiendo de la edad
    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Tercer método: Retorna el resultado de una multiplicación
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Cuarto método: Retorna una lista de números del 1 al X
    public int[] listaNumeros(int x) {
        int[] lista = new int[x];
        for (int i = 0; i < x; i++) {
            lista[i] = i + 1;
        }
        return lista;
    }
}
}