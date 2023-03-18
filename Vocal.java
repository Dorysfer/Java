/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
package ejerciciosextra;*/
import java.util.Scanner;
/**
 *
 * @author Home
 */
public class Vocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lire=new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String vocal=lire.nextLine();
        
        if (vocal.equals("a")|| vocal.equals("e")|| vocal.equals("i")||vocal.equals("o")||vocal.equals("u")){
            System.out.println("La letra ingresada es una vocal");
        } else {
            System.out.println("La letra ingresada no es una vocal");
        }
       /* String[] vocales = new String[5];
         for (int i = 0; i < 5; i++) {
            vocales[0]= "a";*/
            
        }
                
    }
  
