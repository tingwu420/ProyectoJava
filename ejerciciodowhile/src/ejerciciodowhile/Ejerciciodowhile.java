/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciodowhile;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ejerciciodowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int min,max,n;
            System.out.println("Introduce un numero minimo : ");
            min=sc.nextInt();
            System.out.println("Introduce un numero maximo : ");
            max=sc.nextInt();
       
        System.out.println("El rango min es "+min + " y rango max "+max);
        do{
            System.out.println("Introduce un numero dentro del rango: ");
            n=sc.nextInt();
            
            
        }
        while(n<min || n>max);
        System.out.println("Bye");
    }
    
}
