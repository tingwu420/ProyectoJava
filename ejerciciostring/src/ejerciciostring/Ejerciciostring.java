/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciostring;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ejerciciostring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        String texto1="hola";
        String texto2="que tal";
        String texto3=texto1 + texto2;
        String texto4="holas";
        System.out.println(texto1);
        System.out.println(texto2);
        System.out.println(texto3);
        //Comparacion equals
        System.out.println(texto1.equals(texto4));
        
        System.out.println(texto3.length());
       //Encuentra la posicion de h
        System.out.println(texto1.indexOf('h'));
        System.out.println(texto3.indexOf('9'));
        System.out.println(texto2.charAt(2));
        System.out.println(texto1.substring(0,2));
        System.out.println(texto1.toUpperCase());
        
        String palabra3 = String.valueOf(5);
         System.out.println(palabra3);
        
//        String palabra1;
//        String palabra2;
//        System.out.println("Escribe una palabra ");
//        palabra1=sc.nextLine();
//        System.out.println("Escribe otra palabra ");
//        palabra2=sc.nextLine();
//       if(palabra1.length()>palabra2.length()){
//        System.out.println("La palabra 1 es mas grande que palabra 2");
//    }  else{
//        System.out.println("La palabra 2 es mas grande que palabra 1");
//       }
//        
         String contraseña;
         System.out.println("Introduce contraseña ");
         contraseña=sc.nextLine();
         String palabra5=null;
         System.out.println("Letra inicial "+contraseña.charAt(0));
          System.out.println("Letra final "+contraseña.charAt(contraseña.length()-1));
          
          while(!palabra5.equals(contraseña)){
              palabra5=sc.nextLine();
          }
    
    
    
    }
    
}
