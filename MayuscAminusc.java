package ejercicioscomplejos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Home
 */
/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.*/
public class MayuscAminusc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // TODO code application logic here
        Scanner lire= new Scanner(System.in);
        System.out.println("Escriba una frase");
        String frase=lire.nextLine();
        frase=frase.toUpperCase();
        System.out.println(frase);
        frase=frase.toLowerCase();
        System.out.println(frase);
           
    }
    
}
