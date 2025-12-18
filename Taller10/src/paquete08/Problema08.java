/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete08;

/**
 *
 * @author A S U S
 */
public class Problema08 {

    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};
        double[][] dato3 = new double[3][3];
        // En función de los arreglos dados, genere
        // un arreglo que tenga los siguientes valores
        /*
            1   1   2
            6   8   1
         */
        for (int f = 0; f < dato1.length; f++) {
            for (int c = 0; c < dato1[f].length; c++) {
                if (dato1[f][c] > dato2[f][c]) {
                    dato3[f][c] = dato2[f][c];
                } else {
                    dato3[f][c] = dato1[f][c];
                }
            }

        }
        for (int f = 0; f < dato1.length; f++) {
            for (int c = 0; c < dato1[f].length; c++) {
                System.out.printf("%s\t", dato3[f][c]);
            }
            System.out.println("");
        }
    }
}
