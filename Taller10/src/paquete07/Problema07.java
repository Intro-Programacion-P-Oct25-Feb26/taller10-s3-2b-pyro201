/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete07;

import java.util.Scanner;

/**
 *
 * @author A S U S
 */
public class Problema07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] ingreso = new double[3][3];
        double[][] matA = new double[3][3];
        double[][] matB = new double[3][3];
        boolean ide = true;
        for (int f = 0; f < ingreso.length; f++) {
            for (int c = 0; c < ingreso[f].length; c++) {
                System.out.printf("Ingrese los valores a multiplicar en la posicion %s %s\n", f, c);
                ingreso[f][c] = entrada.nextDouble();
            }
        }
        for (int f = 0; f < matA.length; f++) {
            for (int c = 0; c < matA[f].length; c++) {
                matA[f][c] = (ingreso[f][c]+1)*(ingreso[f][c]+1);
            }
        }
        for (int f = 0; f < matB.length; f++) {
            for (int c = 0; c < matB[f].length; c++) {
                double x = ingreso[f][c];
                matB[f][c] = x * x + 2 * x + 1  ;
            }
        }
        for (int f = 0; f < matB.length; f++) {
            for (int c = 0; c < matB[f].length; c++) {
                if (matA[f][c] != matB[f][c]) {
                    ide = false;
                }
            }
        }
        if (ide) {
            System.out.println("la identidad algebraica si se cumple");
        } else {
            System.out.println("la identidad algebraica no se cumple");
        }
        
        
    }
}
