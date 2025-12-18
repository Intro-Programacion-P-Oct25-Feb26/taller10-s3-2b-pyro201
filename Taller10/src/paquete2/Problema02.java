/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };
        int[] adultos = new int[3];
        int niños = 0;
        int suma;
        String report="";

        for (int f = 0; f < edades.length; f++) {
            suma=0;
            for (int c = 0; c < edades[f].length; c++) {
                if (edades[f][c] < 18){
                    niños+=1;
                }else{
                    suma+=1;
                }
                        
            }
            adultos[f]=suma;
        }
        for (int f = 0; f < edades.length; f++) {
            report+=String.format("En la familia %s hay %s adultos\n", f+1, adultos[f]);
        }
        System.out.printf("%s\nEntre todas las familias hay %s niños",report,niños);
    }
}
