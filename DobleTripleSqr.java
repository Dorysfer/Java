package ejercicioscomplejos;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class DobleTripleSqr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num;
       Scanner leer = new Scanner(System.in);
       num=leer.nextDouble();
        System.out.println("el doble es: "+num*2);
        System.out.println("el triple es: "+num*3);
        System.out.println("la raiz cuadrada es: "+Math.sqrt(num));
    }

    }