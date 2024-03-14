/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegoahorcado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Juegoahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
         
         
         System.out.println("Introduce turno: ");
         int num=sc.nextInt();
         int[]turno=new int [num];
         System.out.println("Dame tamaño: ");
         int size=sc.nextInt();
         int[] array=new int [size];
         
         char letra;
         char palabra[]=new char[size];
         Arrays.fill(palabra,'_');
         System.out.println(Arrays.toString(palabra));
        
          do{
            aux=false;
            System.out.println("Introduce una letra ");
            letra=sc.next().charAt(0);
         for(int i=0;i<size ;i++){
           if(letra==palabra[i]){
            letra=sc.next().charAt(0);
            palabra[i]=letra;
           aux=true;
         }
  //       System.out.println(adivinarPalabra(array,palabra));

    }
   
     
    }
    } 
    
//public static boolean adivinarPalabra(int[]array,char[]palabra){
//      boolean resultado=true;
//     for(int i=0;i<size;i++){
//      System.out.println("Adivina la letra "+i);
//     }
//    
//    return resultado;
//}