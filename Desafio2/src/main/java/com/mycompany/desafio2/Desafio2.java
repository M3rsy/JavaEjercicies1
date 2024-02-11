/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafio2;
import java.util.List;
/**
 *
 * @author ghot-
 */
public class Desafio2 {

    public static void main(String[] args) {
        
 List<Integer> puntajes = List.of(15,30,50,20,70,150,31);
 System.out.println("El ultimo puntaje es: " + ultimoPuntajeRegistrado(puntajes));
    }
 public static int
         
   ultimoPuntajeRegistrado(List<Integer>puntajes){
       //Verifica si la lista esta vacia y retona +1 si lo esta de lo cotraio retorna ultimo elemento en list
       return puntajes.isEmpty() ? -1 : puntajes.get(puntajes.size() -1);
   }



 }
                   