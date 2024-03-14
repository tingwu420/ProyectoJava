/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package práctica4ting;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Práctica4Ting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        char [][]pista=new char[3][10];     
        Vehiculo[]carta=new Vehiculo[4];
        Camion camion=new Camion();
        Coche coche=new Coche();
        Moto moto=new Moto();
     
        rellenarpista(pista,'_');    
        mostrarpista(pista);
        
        int res;
        System.out.println("Elige un vehiculo 1.Coche 2.Camion 3.Moto");
         res=sc.nextInt();
        System.out.println("Elige un carta");
        System.out.println("1.Camion primero y moto segundo");
        System.out.println("2.Camion segundo y coche primero");
        System.out.println("3.Camion tercero y moto primero");
        res=sc.nextInt();
         switch(res){
          case 1:
               
              System.out.println("Camion_ _ _ _ _ _ _ _ _");
              System.out.println("Moto_ _ _ _ _ _ _ _ _");
              System.out.println("Coche_ _ _ _ _ _ _ _ _");
              break;
          case 2:
              System.out.println("Coche_ _ _ _ _ _ _ _ _");
              System.out.println("Camion_ _ _ _ _ _ _ _ _");
              System.out.println("Moto_ _ _ _ _ _ _ _ _");
              break;
          case 3:
              System.out.println("Moto_ _ _ _ _ _ _ _ _");
              System.out.println("Coche_ _ _ _ _ _ _ _ _");
              System.out.println("Camion_ _ _ _ _ _ _ _ _");
              break;
              
          }
          System.out.println("Quien quieres que avance?");
          res=sc.nextInt();
    } 
   
    
    
           
   public static void mostrarpista(char [][]a){
    for(int i=0;i<a.length;i++){
        
        System.out.println(Arrays.toString(a[i]));
  }
 }

public static void rellenarpista(char[][] pista, char letra) {
        for(int i=0;i<pista.length;i++){
            Arrays.fill(pista[i], letra);
        }
    }
public static void rellenarletra(char[][]pista,char letra){
    for(int i=0;i<pista.length;i++){
        
    }
  }

}
 

