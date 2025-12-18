/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}
        };
        int[] zona = new int[4];
        String report = "";
        for (int f = 0; f < sensores.length; f++) {
            int suma = 0;
            for (int c = 0; c < sensores[f].length; c++) {
                if (sensores[f][c] == true) {
                    suma += 1;
                }
            }
            zona[f] = suma;
        }
        for (int f = 0; f < zona.length; f++) {
            if (zona[f] != 0) {
                report += String.format("la zona %s tine %s fallas\n", f + 1, zona[f]);
            } else {
                report += String.format("la zona %s no tiene fallas\n", f+1);
            }
        }
        System.out.println(report);
    }
}
