/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciofor;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ejerciciofor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
          
         int resultado=1;
         
          System.out.println("El producto de los 10 numeros impares es: ");
          for(int i=1;i<20;i=i+2){
             resultado= resultado*i;
             
         }
         System.out.println("Resultado="+resultado);
    }
    
}
