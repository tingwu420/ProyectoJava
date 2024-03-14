/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioif;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ejercicioif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
         int a;
         boolean bigote,gafas,barba,sombrero,pelo;
         
        
         System.out.println("¿Quieres jugar quien es quien? 1YES  2NO ");
         a=sc.nextInt();
         if(a==1){
             System.out.println("¿Tiene bigote? ");
             bigote=sc.nextBoolean();
             System.out.println("¿Tiene pelo? ");
             pelo=sc.nextBoolean();
             System.out.println("¿Tiene gafas? ");
             gafas=sc.nextBoolean();
             System.out.println("¿Tiene barba? ");
             barba=sc.nextBoolean();
             System.out.println("¿Tiene sombrero? ");
             sombrero=sc.nextBoolean();
                
                if(bigote&&pelo==false){
                    System.out.println("Es Alejandro");
                }
                else if(bigote&&!sombrero){
                    System.out.println("Es Nike ");
                }
                else if(sombrero&&!barba){
                    System.out.println("Es Kiko ");
                }
                else if(pelo&&!gafas){
                    System.out.println("Es Monico");
                }
                else if(gafas&&!pelo){
                    System.out.println("Es Lupas");
                }
                else if(barba&&!pelo){
                    System.out.println("Es Medinilla");
                }
         }
         else if(a==2){
             System.out.println("No quieres jugar ");
             
           
             
             
             
         }
         
         
    }
    
}
