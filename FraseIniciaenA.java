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
public class FraseIniciaenA {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa una frase o palabra que inicie con A ");
        String fraseU = leer.nextLine();
        fraseU = fraseU.toUpperCase();
        String literal = fraseU.substring(0,1);
        
        if (literal.equals("A")) { 
            System.out.println("C O R R E C T O");
        } else {
            System.out.println("I N C O R R E C T O");
        }
    }
}
