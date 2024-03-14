/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioordenar3numeros;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ejercicioordenar3numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
       
     int num1,num2,num3;
        System.out.println("Intreoduce un numero: ");
        num1=sc.nextInt();
        System.out.println("Intreoduce un numero: ");
        num2=sc.nextInt();
        System.out.println("Intreoduce un numero: ");
        num3=sc.nextInt();
        
        if(num1>num2&&num1>num3){
            if(num2>num3){
                System.out.println("EL "+num1+" es mayor que "+num2+" es mayor que "+num3);
            }
            else if(num3>num2){
               System.out.println("EL "+num1+" es mayor que "+num3+" es mayor que "+num2); 
            }
        }
         if(num2>num1&&num2>num3){
             if(num1>num3){
                System.out.println("EL "+num2+" es mayor que "+num1+" es mayor que "+num3);
            }
            else if(num3>num1){
               System.out.println("EL "+num2+" mayor que "+num3+" es mayor que "+num1); 
            }
        }
        if(num3>num1&&num3>num2){
             if(num1>num2){
                System.out.println("EL "+num3+" es mayor que "+num1+" es mayor que "+num2);
            }
            else if(num2>num1){
               System.out.println("EL "+num3+" es mayor que "+num2+" es mayor que "+num1); 
            }
        }
                
    
    
    
    
    }
           
     
    
}
