/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafio1;
import java.util.List;
/**
 *
 * @author ghot-
 */
public class Desafio1 {

    public static void main(String[] args) {
       List<Integer> puntajes = List.of(30,50,20,70,150);
       System.out.println("El Mayor puntajes es: " + mayorPuntaje(puntajes));
       //La funcion toma de la lista todos los enteros y devuelve el mas alto
    }
    public static int
    mayorPuntaje(List<Integer> puntajes){
        //Uso de la API de Stream para lograr encontar el maximo en la lista
        return
    puntajes.stream().max(Integer::compare).orElse(-1);
        //Integer::Compare es un metodo que los tream para poder comparar enteros
                }
}
