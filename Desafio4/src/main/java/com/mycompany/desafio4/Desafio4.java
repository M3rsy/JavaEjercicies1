/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafio4;

/**
 *
 * @author ghot-
 */
public class Desafio4 {

    public static void main(String[] args) {
            
        int productosVendidos = 19;
        System.out.println(multiplicadorProductosVendidos(productosVendidos));
        
            productosVendidos = 7;
            System.out.println(calcularBonoVentas(productosVendidos));
    }
    public static int
            multiplicadorProductosVendidos(int productosVendidos){
                return productosVendidos > 20 ? 13:10;
            }
            public static int 
                    calcularBonoVentas(int productosVendidos)
                    {
                        return multiplicadorProductosVendidos(productosVendidos) * productosVendidos ;
                        
            }
}
