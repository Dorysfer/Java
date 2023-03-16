/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/
package ejercicioscomplejos;
import java.util.Scanner;
/**
 *
 * @author Dorys
 */
public class EurosAdólares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lire = new Scanner(System.in);
        String moneda=null;
        System.out.println("Ingrese la cantidad de Euros que quiere convertir");
        double euros=lire.nextDouble();
        
        convertidorMoneda(euros,moneda);
        System.out.println("Gracias por utilizar este convertidor");
        System.out.println("-------------------------------------");
        
    }
    
    public static void convertidorMoneda(double euros, String moneda){
        Scanner lire = new Scanner(System.in);
        double conversion;
        System.out.println("¿A qué moneda quiere convertir: Libras, Dólares o Yenes?");
        //System.out.println("1. Libras, 2. Yenes o 3. Dólares? Escoja una opción");
        /*int opcion=0;
        switch (opcion){
            case 1:
                moneda="libras";
                System.out.println(moneda);
                break;
            case 2:
                moneda="dolares";
                System.out.println(moneda);
                break;
            case 3:
                moneda="yenes";
                System.out.println(moneda);
                break;
        }*/
        moneda=lire.nextLine();
        switch (moneda){
            case "libras":
                conversion=0.86*euros;
                System.out.println(euros+ " € son "+conversion+" £");
                break;
            case "dolares":
                conversion=1.28611*euros;
                System.out.println(euros+ " € son "+conversion+" $");
                break;
            case "yenes":
                conversion=129852*euros;
                System.out.println(euros+ " € son "+conversion+" ¥");
                break;
            
        }
       
    }
}
