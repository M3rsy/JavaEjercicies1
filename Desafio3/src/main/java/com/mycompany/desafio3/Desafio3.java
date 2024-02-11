/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafio3;

/**
 *
 * @author ghot-
 */
public class Desafio3 {

    public static void main(String[] args) {
        int diasFaltantes = 3;
        System.out.println(multiplicadorDiasFaltantes(diasFaltantes));
        
        diasFaltantes = 7;
        System.out.println(multiplicadorDiasFaltantes(diasFaltantes));
    }
    
    public static double
            multiplicadorDiasFaltantes(int diasFaltantes){
                if (diasFaltantes >= 4){
                    return 0.85;
                }else {
                    return 1.0;
                }
            }
}
