/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}
        };

        String[] nombres = {"Ana", "Luis", "Carlos", "María"};
        int[] asist = new int[5];
        int suma;
        String reporte = "";
        for (int f = 0; f < asistencia.length; f++) {
            suma = 0;
            for (int c = 0; c < asistencia[f].length; c++) {
                if (asistencia[f][c] == true) {
                    suma += 1;
                }
            }
            asist[f] = suma;
        }
        for (int f = 0; f < asistencia.length; f++) {
            if (asist[f] != 5){
                reporte += String.format("El Estudiante %s asistio %s dias\n"
                        ,nombres[f],asist[f]);
            }else{
                reporte+= String.format("El estudiante %s tiene asistencia "
                        + "completa de 5 dias\n",
                        nombres[f]);
            }
        }
        System.out.println(reporte);
    }

}
