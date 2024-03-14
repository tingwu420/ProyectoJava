/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicarecuperacion1trimetre2parte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class PracticaRecuperacion1trimetre2parte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
//        Supermercado supermercado1=new Supermercado("Aldi","productos");
//        Supermercado supermercado2=new Supermercado("Mercadona","productos");
//   
        Productos[]producto=new Productos[10];
        char []letras=new char[10];
        char letra='_';
        Cesta[]cesta=new Cesta[10];
        
        Productos p0=new Productos("Platano",0.70);
        Productos p1=new Productos("Mantequilla",1.20);
        Productos p2=new Productos("Queso",1.30);
        Productos p3=new Productos("Mango",3.50);
        Productos p4=new Productos("Huevo",4.00);
        Productos p5=new Productos("Naranja",1.2);
        Productos p6=new Productos("Jamon",4.10);
        Productos p7=new Productos("Pera",0.8);
        Productos p8=new Productos("Pan",0.70);
        Productos p9=new Productos("Leche",1.30);
        
      File file=new File("mercadona.txt");
      File file1=new File("aldi.txt");
      
       
        int n; 
        int num;
        int u;
        int suma;
    
  String frase;

try{
    FileReader fileReader=new FileReader(file);
    BufferedReader bufferedReader=new BufferedReader(fileReader);
      frase=bufferedReader.readLine();
      while(frase!=null){
      
        frase=bufferedReader.readLine();
     
      }
       System.out.println(frase); 
      bufferedReader.close();

       
}catch(IOException e1){
            System.out.println("error");
}
        
        
        
        
        
        
        System.out.println("----------------Bienvenidos a la APP SuperComparator----------------");
        
        do{
            System.out.println("1.COMPARAR PRODUCTOS 2.VER  LA CESTA 3.SALIR");
            n=sc.nextInt();
            
         switch(n){
             case 1:
                 System.out.println("Introduce nombre del producto");
                 String nombre = sc.next();
                 
                 
                
                 System.out.println("Quieres añadir a la cesta? 1.si 2.no");
                 num=sc.nextInt();
                if(num==1){
//               for(int i=0;i<cesta.length;i++){
//                    cesta[i]=producto;
//                }
//                
                }
                  System.out.println("Cuantas unidades"); 
                  u=sc.nextInt();
                  
               
                 break;

             case 2:
                 for(int i=0;i<cesta.length;i++){
                     System.out.println(cesta[i]+"---");
                 }
//                 suma+=producto;
//                 System.out.println("Precio total es "+producto.getPrecio());
//             
                 break;
         
        }
            
        }while(n!=3);
    }

  

    
 

    }


