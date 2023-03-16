package ejercicioscomplejos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class RellenarVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        // Declarar el vector de tamaño 100
        int[] numeros = new int[100];

        // Llenar el vector con los 100 primeros números enteros
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        // Recorrer el vector en orden descendente y mostrar cada elemento por pantalla
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i]+", ");
            System.out.print(" ");
        }
    }
}
