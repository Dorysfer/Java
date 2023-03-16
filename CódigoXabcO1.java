package ejercicioscomplejos;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author Home
 */
public class CódigoXabcO1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        String cadena = null;
        String fde = "&&&&&";
        int a,b;
        a=b=0;
            System.out.println("Ingrese una frase de 5 caracteres que empiece en X y termine en O");
            cadena= Leer.nextLine();        
        while (cadena.length()==5){       
            
            if (cadena.substring(0, 1).equalsIgnoreCase("X") && cadena.substring(4,5).equalsIgnoreCase("O")){
                a++;
                System.out.println("La cadena es correcta");
                System.out.println("Ingrese una frase de 5 caracteres que empiece en X y termine en O");
                cadena= Leer.nextLine();
                if (cadena.equalsIgnoreCase(fde)){
                System.out.println("Este es el final de los envios");
                System.out.println("El numero de ingresos correctos es: " +a);
                System.out.println("El numero de ingresos incorrectos es; " +b);
                }
                break;
            }else{
                b++;
                System.out.println("Incorrecta");
                System.out.println("Ingrese una frase de 5 caracteres que empiece en X y termine en O");
                cadena= Leer.nextLine();
            }
               
        } 
    }
}
    
        