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
public class límiteYSuma2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int limite;
        int suma= 0;
        int contador =0;
        
        Scanner Leer = new Scanner(System.in);
        System.out.println(" Ingrese un numero positivo ");
        limite = Leer.nextInt();
        
        while (suma<limite){
            System.out.println(" Ingrese un numero ");
            int numero = Leer.nextInt();
            suma += numero;
            contador++;
            
        }
        System.out.println(" La suma de los "+ contador + "Numeros ingresados supera el limite inicial de " + limite);

    }
    
}
