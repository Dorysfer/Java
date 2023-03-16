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
public class RecorrerMatriz21conIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        
        int[][] matriz = new int [5][5];
        int [][] matrizP = new int [3][3];
        
        matriz [0][0] = 3;
        matriz [0][1] = 4;
        matriz [0][2] = 4;
        matriz [0][3] = 1;
        matriz [0][4] = 5;
        matriz [1][0] = 6;
        matriz [1][1] = 6;
        matriz [1][2] = 9;
        matriz [1][3] = 5;
        matriz [1][4] = 1;
        matriz [2][0] = 2;
        matriz [2][1] = 4;
        matriz [2][2] = 4;
        matriz [2][3] = 9;
        matriz [2][4] = 7;
        matriz [3][0] = 6;
        matriz [3][1] = 6;
        matriz [3][2] = 9;
        matriz [3][3] = 9;
        matriz [3][4] = 7;
        matriz [4][0] = 8;
        matriz [4][1] = 10;
        matriz [4][2] = 12;
        matriz [4][3] = 9;
        matriz [4][4] = 7;
       // Matriz pequeña 
        matrizP [0][0] = 2;
        matrizP [0][1] = 4;        
        matrizP [0][2] = 4;
        matrizP [1][0] = 6;

        matrizP [1][1] = 6;
        matrizP [1][2] = 9;
        matrizP [2][0] = 8;
        matrizP [2][1] = 10;
        matrizP [2][2] = 12;
        
        
        int i = 0;
        int j = 0;
        int m = 0;
        int n = 0;
        
        for (i=0; i<matriz.length; i++){
            for (j=0; j<matriz[0].length; j++){
                if (matrizP [0][0] == matriz [i][j]) {
                    m = i;
                    n = j;
                    if (matrizP [0][0] == matriz [i][j] && (matriz.length - i) >= 2 ){
                        if (matrizP [0][0] == matriz [i][j] && (matriz.length - i) >= 2 ) {
                            if (matrizP [0][0] == matriz [i][j] && (matriz.length - i) >= 2 ) {
                                if (matrizP [0][0] == matriz [i][j] && (matriz.length - i) >= 2 ) {
                                    if (matrizP [0][0] == matriz [i][j] && (matriz.length - i) >= 2 ) {
                                        if (matrizP [0][0] == matriz [i][j] && (matriz.length - i) >= 2 ) {
                                            if (matrizP [0][0] == matriz [i][j] && (matriz.length - i) >= 2 ) {
                                                if (matrizP [0][0] == matriz [i][j] && (matriz.length - i) >= 2 ) {
                                                    System.out.println("Se encuentra coincidencia en: "+m+","+n);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    }else {
                            System.out.println("No se encuentra coincidencia");
                        }
                    }
                }
        for (int[] matriz1 : matriz) {
            for (int k = 0; k < matriz[0].length; k++) {
                System.out.println("[" + matriz1[k] + "]");
            }
            System.out.println("");
        }
         for (int k = 0; k < matrizP[0].length; k++) {
            for (int l = 0; l< matrizP[0].length; l++) {
                System.out.println("["+matrizP[k][l]+"]");
            }
            System.out.println("");   
        }
    }
}
    
  

