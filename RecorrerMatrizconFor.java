
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
public class RecorrerMatrizconFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
     Scanner sc = new Scanner(System.in);

        // Leer las matrices M y P desde el usuario
        int[][] M = new int[10][10];
        int[][] P = new int[3][3];
        System.out.println("Introduzca la matriz M:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                M[i][j] = sc.nextInt();
            }
        }
        System.out.println("Introduzca la matriz P:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                P[i][j] = sc.nextInt();
            }
        }

        // Iterar sobre todas las submatrices de 3x3 de la matriz M
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int[][] submatriz = new int[3][3];
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        submatriz[k][l] = M[i+k][j+l];
                    }
                }
                if (sonIguales(submatriz,P)) {//si la submatriz es igual a matriz P
                    System.out.println("La matriz P está contenida dentro de la matriz M");
                    System.out.println("Comienza en la fila"+(i+1)+ " y la columna" +(j+1) );
                    return;
                }
            }
        }
        //Si se han recorrido todas las submatrices de la matriz M y no se ha encontrado ninguna coincidencia con la matrizP
           System.out.println("La matriz P no está contenida dentro de la matriz M.");
        }
//Función que devuelve true si las dos matrices de 3x3 son iguales, false en caso contrario
public static boolean sonIguales(int[][] matriz1,int[][]matriz2){
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (matriz1[i][j]!=matriz2[i][j]){
                return false;
            }
        }
    }
    return true;
}
}
