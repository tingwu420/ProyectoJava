/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegosecreto;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Juegosecreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n;
        int num=(int)(Math.random()*100+1);
        System.out.println("Introduce numero");
        n=sc.nextInt();
          while((n!=num) && (n !=-1)){
             if(n>num){
               System.out.println("El numero es menor ");
                n=sc.nextInt();
           }
             else if(n<num){
               System.out.println("El numero es mayor ");
               n=sc.nextInt();
           }
             else if(n==num){
               System.out.println("Has acertado el numero ");            
            }
            System.out.println("Introduce numero");
            n=sc.nextInt();
    }  
  } 
}