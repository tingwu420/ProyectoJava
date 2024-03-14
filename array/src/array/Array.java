/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        
//        int[] array={5,3,2,1,7};
//        int[]array2=new int[4];
//        array2[0]=2;
//        array2[1]=3;
//        array2[2]=4;
//        array2[3]=5;
//        System.out.println(array2[0]+";"+array2[1]+";"+array2[2]+";"+array2[3]);
         
//        int[]tabla=new int[4];
    //Rellenar con el teclado
//        for(int i=0;i<4;i++){
//        System.out.println("Introduce el valor ");
//        tabla[i]=sc.nextInt();
//        }
//        //Mostrar
//        for(int i=0;i<4;i++){
//        System.out.print(tabla[i]);
       
    //Ejercicio Array
//    int[]numero=new int[7];
//    
//    
//     for(int i=0;i<7;i++){
//        System.out.println("Introduce el valor ");
//        numero[i]=sc.nextInt();
//         
//  
//   
//    }
//       System.out.println(sumaArray(numero));
//   }
// public static int sumaArray(int[]numero){
//     int suma=0;
//     for(int i=0;i<7;i++){
//     suma+=numero[i];
//             }
// 
// return suma;
    
   //MOstrar inversa
//    int numero;
//    System.out.println("Introduce el tamaño ");
//    numero=sc.nextInt();
//    int[]tamaño= new int[numero];
//  
//     for(int i=0;i<numero;i++){
//        System.out.println("Introduce el valor ");
//        tamaño[i]=sc.nextInt();
//     }
//     for(int i=0;i<numero;i++){
//     System.out.println(tamaño[i]);
//     
//     }
//     System.out.println("Inversa");
//     for(int i=numero;i>0;i--){
//         System.out.print(tamaño[i-1]+" ");
//     }
//      int[] array={7,5,3,4};
//      int size=array.length;
//      System.out.println(size);
//      
//      int[]a={3,2,7};
//      int[]b=new int[3];
//      b=a;
//      System.out.println(b[0]);
//      a[0]=5;
//      System.out.println(b[0]);
//      
         int[] n=new int[3];
         int[]secreta=new int [3];
         secreta[0]=(int)(Math.random()*10);
         secreta[1]=(int)(Math.random()*10);
         secreta[2]=(int)(Math.random()*10);
         
         System.out.println(Arrays.toString(secreta));
         
         System.out.println("Introduce primer numero");
         n[0]=sc.nextInt();
         System.out.println("Introduce segundo numero");
         n[1]=sc.nextInt();
         System.out.println("Introduce tercer numero");
         n[2]=sc.nextInt();
         
         while(n!=secreta){
             for(int i=0;i<3;i++){
             System.out.println("Vuelve a introducir primer numero");
             n[0]=sc.nextInt();
             System.out.println("Vuelve a introducir segundo numero");
             n[1]=sc.nextInt();
             System.out.println("Vuelve a introducir tercer numero");
             n[2]=sc.nextInt();
         }
        if(n[0]==secreta[0]){
                 System.out.println("Correcto");
                 }
        else if(n[1]==secreta[0]){
            System.out.println("Correcto");
        }else if(n[2]==secreta[2]){
            System.out.println("Correcto");
       }
    }
}
}