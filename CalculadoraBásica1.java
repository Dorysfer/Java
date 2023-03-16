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
public class CalculadoraBásica1 {

    /**
     * @param args the command line arguments
     */


/*con boolean*/
    public static void main (String[]asrg){
    Scanner sc =new Scanner(System.in);
    boolean cerrar=true;
   int menu;
   double num1;
   double num2;
   double num3;
   while(cerrar==true){
        System.out.println("Ingrese primer numero");
        num1=sc.nextDouble();
        System.out.println("Ingrese segundo numero");
        num2=sc.nextDouble();
        
            System.out.println("Menu");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Salir");
            menu=sc.nextInt();
            switch (menu){
                case 1:
                    num3=num1 + num2;
                    System.out.println("La suma de los numeros es ="+num3);
                    break;
                case 2:
                    num3=num1 - num2;
                    System.out.println("La Resta de los numeros es ="+num3);

                case 3:
                    num3=num1 - num2;
                    System.out.println("La Resta de los numeros es ="+num3);
                    break;   
                case 4:
                    num3=num1 / num2;
                    System.out.println("La divicion de los numeros es ="+num3);
                    break;
                case 5:
                    String a;
                    System.out.println("Seguro que desea salir? (s/n)");
                    a=sc.next();
                    if("s".equals(a)){
                    menu=6;
                        System.out.println("bye bye");
                    }else{
                        System.out.println("Gracias por continuar");
                        System.out.println("__________________________");
                    }
                    
            }         
        
    }
    }

    }
    
