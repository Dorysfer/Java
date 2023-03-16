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
public class RellenarVectorYbuscar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lire= new Scanner(System.in);
        System.out.println("Escriba el tamaño del vector que desea");
        int n=lire.nextInt();
        int contador=0;
        System.out.println("Escriba un número que quiera encontrar en el vector");
        int num=lire.nextInt();
        
        int [] vector = new int[n];
        
        for (int i = 0; i < n; i++){
            vector[i]= (int) (Math.random()*10);
            System.out.print(vector[i]+" ");
        }
        for (int i = 0; i < n; i++){
        if(vector[i]==num){
                contador++;
            }
                System.out.println("El número "+num+" se encuentra en la(s) posición(es):"+i);
        }
        System.out.println("Y se repite"+contador+" veces");
    }
    }
    