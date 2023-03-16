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
public class Eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
       String frase = leer.nextLine();
       String eureka = "eureka";
       
        System.out.println("la frase " + frase + "es :" + eureka.equals(frase));

    }
    
}
