/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscomplejos;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class CentigAFarenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double gradosCentigrados;
        double gradosFarenheit;
        Scanner Leer = new Scanner(System.in);
        
        System.out.println(" Ingrese los grados Centigrados ");
        gradosCentigrados = Leer.nextDouble();
        
        gradosFarenheit = 32 + (9 * gradosCentigrados / 5);
        
        System.out.println( gradosCentigrados + " Convertidos a Grados Farenheit son " + gradosFarenheit + " Grados " );
    }
    
}