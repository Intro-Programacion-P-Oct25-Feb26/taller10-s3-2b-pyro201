/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] ingreso = new int[5][6];
        int[][] salida = new int[5][6];
        int multi;
        System.out.println("ingrese el multiplicador");
        multi = entrada.nextInt();
         for (int f = 0; f < ingreso.length; f++) {
            for (int c = 0; c < ingreso[f].length; c++) {
                System.out.printf("Ingrese los valores de A en la posicion %s %s\n", f, c);
                matA[f][c] = entrada.nextInt();
                
            }
            }
    }
}
