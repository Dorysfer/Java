/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra;

/**
 *
 * @author Home
 */
public class Ejercicio3v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String vocal;
       boolean f;
       f=false;
       Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese una vocal");
       vocal=leer.next();
        String vocales []= new String [5];
       vocales[0]="a";
       vocales[1]="e";
       vocales[2]="i";
       vocales[3]="o";
       vocales[4]="u";
        for(String n: vocales){
            if (n.equals(vocal)) {
                f=true;
            }
        }
        if (f) {
            System.out.println("es una vocal!");
        }else{System.out.println("NO es una vocal");}

    }
    
}
