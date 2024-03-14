/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioswitch;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ejercicioswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
         
         int nota;
         System.out.println("Introduce una nota: ");
         nota=sc.nextInt();
         
         switch(nota){
             case 0: 
                 System.out.println("insuficiente");
             break;
              case 1: 
                 System.out.println("insuficiente");
             break;
              case 2: 
                 System.out.println("insuficiente");
             break;
              case 3: 
                 System.out.println("insuficiente");
             break;
              case 4: 
                 System.out.println("insuficiente");
             break;
              case 5:
                  System.out.println("Suficiente");
             break;
              case 6:
                  System.out.println("bien");
              break;
              case 7:
                  System.out.println("notable");
              break;
              case 8:
                  System.out.println("notable");
               break;
              case 9:
                  System.out.println("Sobresaliente");
               break;
              case 10:
                  System.out.println("Sobresaliente");
               break;
              default: 
                 System.out.println("El numero introducido es incorrecto");
             
         }
                 
    }
    
}
