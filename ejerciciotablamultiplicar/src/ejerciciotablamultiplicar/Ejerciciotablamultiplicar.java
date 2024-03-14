/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ejerciciotablamultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int min,max,n,a;
            a=1;
            min=1;
            max=100;
            
         do{
              System.out.println("Introduce un numero dentro del rango: ");
              n=sc.nextInt();
                    
         }
         while(n<min || n>max);
               System.out.println("El numero esta dentro del rango");
               
               while(a<11){
                   System.out.println(n+"*"+a+"="+(n*a));
                   a++;
            
                   
               }
                       
               
         
         
    }
    
}
