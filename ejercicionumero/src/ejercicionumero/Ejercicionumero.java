/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicionumero;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ejercicionumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    
    
    int num1,num2;
    
    System.out.println("Introduce un numero: ");
    num1=sc.nextInt();
    System.out.println("Introduce otro numero: ");
    num2=sc.nextInt();
    if(num1==num2){
    System.out.println("Son iguales");
     }
    else{
        System.out.println("No son iguales");
       if(num1>num2){
           System.out.println("El numero " + num1 + " es mayor que " + num2);
       }
       else if(num1<num2){
            System.out.println("El numero " + num1 +" es menor que " + num2);
       }
        
    }
   }
  }
   

