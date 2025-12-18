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
        double[][] ingreso = new double[5][6];
        double[][] salida = new double[5][6];
        int multi;
        System.out.println("ingrese el multiplicador");
        multi = entrada.nextInt();
        for (int f = 0; f < ingreso.length; f++) {
            for (int c = 0; c < ingreso[f].length; c++) {
                System.out.printf("Ingrese los valores a multiplicar en la posicion %s %s\n", f, c);
                ingreso[f][c] = entrada.nextDouble();

            }
        }
        for (int f = 0; f < salida.length; f++) {
            for (int c = 0; c < salida[f].length; c++) {
                salida[f][c] = ingreso[f][c] * multi;
            }
        }
        System.out.println("Los valores ingresados son:");
        for (int f = 0; f < ingreso.length; f++) {
            for (int c = 0; c < ingreso[f].length; c++) {
                System.out.printf("%s\t", ingreso[f][c]);
            }
            System.out.println("");
        }
        System.out.println("los valores resultantes son:");
        for (int f = 0; f < salida.length; f++) {
            for (int c = 0; c < salida[f].length; c++) {
                System.out.printf("%s\t", salida[f][c]);
            }
            System.out.println("");
        }
    }
}
