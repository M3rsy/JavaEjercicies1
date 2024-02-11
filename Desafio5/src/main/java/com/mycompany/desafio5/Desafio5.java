/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafio5;

/**
 *
 * @author ghot-
 */
public class Desafio5 {

    private static  final double SALARIO_BASE = 1000.00;
    public static void main(String[] args) {
       int diasFaltantes = 2;
       int productosVendidos = 80;
       
       System.out.println(calcularSalarioFinal(diasFaltantes ,productosVendidos ));
       
    }
    
    public static double
           calcularSalarioFinal(int diasFaltantes , int productosVendidos) {
               double salarioFinal = SALARIO_BASE * multiplicadorDiasFaltantes(diasFaltantes) + calculadoraBonoVentas(productosVendidos);
               return Math.min(salarioFinal, 2000.00);
           }
           
    public static double multiplicadorDiasFaltantes (int diasFaltantes ){
        if (diasFaltantes >=5){
            return 0.85;
} else{
            return 1.0;
        }
    }
    
    public static double calculadoraBonoVentas(int productosVendidos){
        int pagoPorProducto = productosVendidos > 20 ? 13 : 10;
        return productosVendidos * pagoPorProducto ;
    }
}
