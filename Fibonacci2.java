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
public class Fibonacci2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int n = 20;
        int [] serie_fibonacci = new int [n];
        
        for (int i = 0; i < n; i++) {
            serie_fibonacci[i] = fibonacci(i);
        }
        System.out.println(Arrays.toString(serie_fibonacci));
        
        int [] serie_dos_fibonacci = new int [20];
        fibonnaci(n-1, serie_dos_fibonacci);
        System.out.println(Arrays.toString(serie_fibonacci));
    }
    
    private static void fibonnaci(int n, int [] vector){
        switch (n) {
            case 0:
                vector[n] = 0;
                break;
            case 1:
                vector[n] = 1;
                break;
            default:
                fibonnaci(n-1, vector);
                vector[n] = vector[n-1] + vector[n - 2];
                break;
        }
    }
    
    private static int fibonacci (int n){
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    }