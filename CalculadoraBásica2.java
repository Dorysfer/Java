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
public class CalculadoraBásica2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lire=new Scanner(System.in);
        int opcion=0;
        System.out.println("Ingrese dos números");
        double num1=lire.nextDouble();
        double num2=lire.nextDouble();
        
        while(opcion!=5){
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Escoja una opción");
        System.out.println("--------------------");
        
        //Esta no es necesaria o sino tartamudea opcion = lire.nextInt();
        
                        
        
        System.out.println("Escoja una opción");
        opcion = lire.nextInt();
        switch (opcion){
            case 1:
                System.out.print("El resultado es: ");
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.print("El resultado es: ");
                System.out.println(num2-num1);
                break; 
            case 3:
                System.out.print("El resultado es: ");
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.print("El resultado es: ");
                System.out.println(num2/num1);
               break;
            case 5:
                System.out.println("¿Está seguro que quiere salir? (S/N)");
                String decision;
                decision=lire.next();
                if ("n".equals(decision)){
                  System.out.println("Escoja una opción");
                  opcion = lire.nextInt();
                  
                  System.out.println("Bye-bye");
                }else{
                    System.out.println("------------");
                }
            
            }
              
            
        }
    }
}
        