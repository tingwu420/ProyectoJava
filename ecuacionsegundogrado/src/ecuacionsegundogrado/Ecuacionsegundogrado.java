/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuacionsegundogrado;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ecuacionsegundogrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
         
         
         double a , b ,c;
         double x1,x2;
         double aux;
         System.out.println("Introduce a: ");
         a=sc.nextDouble();
         System.out.println("Introduce b: ");
         b=sc.nextDouble();
         System.out.println("Introduce b: ");
         c=sc.nextDouble();
         
         aux=b*b-4*a*c;
         if(aux<=0){
             System.out.println("La ecuacion no existe");
         }
         else{
         x1=(-b+ Math.sqrt(aux))/2*a;
         x2=(-b- Math.sqrt(aux))/2*a;
         System.out.println(x1);
         System.out.println(x2);
    }
  
   }
}
