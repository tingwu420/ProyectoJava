/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicoif2;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ejercicoif2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Introduce su nota: ");
        n=sc.nextInt();
        
        if(n==0||n<=4){
            System.out.println("Tiene un insuficiente ");
        }
        else if(n==5){
           System.out.println("Tiene un suficiente ");
          }
        else if(n==6){
            System.out.println("Tiene un bien ");
        }
        else if(n<=8){
            System.out.println("Tiene un notable "); 
        }
        else if(n<=10){
         System.out.println("Tiene un sobresaliente ");       
        }
        else if(n>10){
            System.out.println("El numero introducido no es correcto ");  
        }
    }
}
    

