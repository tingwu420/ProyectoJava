/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciowhile;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ejerciciowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Introduce un numero: ");
        n=sc.nextInt();
        
        while(n!=0){
            if(n%2==0){
                System.out.println("El numero es par ");   
            }
            else{
                System.out.println("El numero es impar ");
            }
            System.out.println("Introduce otro numero: ");
            n=sc.nextInt();
        }
    }
    
}
