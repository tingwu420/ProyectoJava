/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controldeexcepciones;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Controldeexcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
       int a=5;
        int b=0;
        int n;
       try{
       System.out.println(a/b);
           System.out.println("Entrando por el final del try");
       }
       catch(ArithmeticException e){
           System.out.println("No se puede dividir entre 0");
       }
        System.out.println("Saliendo del programa");
        
       
       int []array={2,3,7};
        /*
       System.out.println("Introduce un numero");
        try{
            n=sc.nextInt();
            System.out.println(array[n]/n);
            System.out.println("Final del try");
        }
        catch(ArithmeticException ex){
           ex.printStackTrace();
            System.out.println(ex.toString());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error tamaño array");
        }
         catch(InputMismatchException e4){
             System.out.println("Error string");
        }  
         catch(Exception e3){
            System.out.println(e3.toString());
        }
        finally{
            System.out.println("Entrando en el finally");
        }
        
        */
        
       try{
           division(array);
       }
       catch(ArithmeticException exc){
           System.out.println("Por division");
       }
    }     
 public static void division(int []array)throws ArithmeticException{
     Scanner sc=new Scanner(System.in);
     
     int num=sc.nextInt();
     System.out.println(array[num]/num);
     System.out.println("final del try");
    
     
     int edad;
     if(edad<18){
     throw new  EdadException();
    }
 
 }
public class EdadException extends Exception{
    public EdadException(){
        super("error");
    }
} 
        
    
   
}
