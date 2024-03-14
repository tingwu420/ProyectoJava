/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unirlista;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class UnirLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
         
         ArrayList<Character> texto1 = new ArrayList <> ();
         
         System.out.println("Introduce un texto");
         String texto=sc.next();
      
         for(int i=0;i<texto.length();i++){
             texto1.add(texto.charAt(i));
         }
         
         ArrayList<Character> texto2 = new ArrayList <> ();
         System.out.println("Introduce otro texto");
         texto=sc.next();
         
          
         for(int i=0;i<texto.length();i++){
         texto2.add(texto.charAt(i));
         }
         texto1.addAll(texto2);
         System.out.println(texto1);
    }
    
}
