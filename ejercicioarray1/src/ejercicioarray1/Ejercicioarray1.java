/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarray1;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ejercicioarray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
//         
//         int[]array1={3,2,4,7};
//        
//         int[] array2=new int [5];
//         
//         for(int i=0;i<2;i++){
//             array2[i]=array1[i];
//         }
//         System.out.println("Introduce un numero");
//         array2[2]=sc.nextInt();
//        
//         for(int i=3;i<array2.length;i++){
//             array2[i]=array1[i-1];
//         }
//          System.out.println(Arrays.toString(array2));
    }
     int[]array1={3,2,4,7};
        
       int[]array2=Arrays.copyOf(array1, 5);
         
         System.out.println("Introduce un numero");
         array2[2]=sc.nextInt();
        
         for(int i=3;i<array2.length;i++){
             array2[i]=array1[i-1];
         }
          System.out.println(Arrays.toString(array2));
    }
    

