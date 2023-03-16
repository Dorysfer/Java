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
public class CódigoXabcO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
       int c,in,s;
       c=in=0;
       s=0;
        String frase,FDE;
        FDE="&&&&&";
        do {
        System.out.println("Ingrese una frase que comienze con X, termine con O y tenga 5 caracteres en total; para salir ingrese &*5");
        frase=leer.nextLine();
        if (frase.length()==5) {
            if (frase.substring(0,1).equals("X")) {
                if (frase.substring(frase.length()-1).equals("O")) {
                    c+=1;
                }else{
                    in+=1;
                }
            } else {
                in+=1;
            }
        } else{
            in+=1;
        }
            if (frase.equals(FDE)) {
                s=1;
                in-=1;
            }
        } while (s==0);
        System.out.println("el número de frases ingresadas que son correctas es igual a: "+c);
        System.out.println("el número de frases ingresadas que son incorrectas es igual a: "+in);

    }
    
}
