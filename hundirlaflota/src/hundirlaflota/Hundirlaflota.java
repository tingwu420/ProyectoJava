/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundirlaflota;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Hundirlaflota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
    
        char [][]tablero=new char[10][10];
        char [][]copiatablero=new char[10][10];
        rellenartablero(tablero);
        rellenartablero(copiatablero);
        introducirbarco(tablero,5,'B');
        introducirbarco(tablero,3,'C');
        introducirbarco(tablero,1,'D');
        mostrarmatriz(tablero);
       
        int contb1=5,contb2=3,contb3=1;
        int coordx,coordy;
        System.out.println(" ");
        do{
            
            mostrarmatriz(copiatablero);
            System.out.println("Introduce coordenada x ");
            coordx=sc.nextInt();
            System.out.println("Introduce coordenada y ");
            coordy=sc.nextInt();
        
       
      char letra1=tablero[coordx][coordy];
      switch(letra1){
          case '*':
              System.out.println("Agua");
              break;
          case 'B':
              tablero[coordx][coordy]='T';
              copiatablero[coordx][coordy]='T';
              contb1--;
              break;    
          case 'C':
              tablero[coordx][coordy]='T';
              copiatablero[coordx][coordy]='T';
              contb2--;
              break;
          case 'D':
              tablero[coordx][coordy]='T';
              copiatablero[coordx][coordy]='T';
              contb3--;
              break;    
      }


   }while(!(contb1==0&&contb2==2&&contb3==0));
        
     
        
       
               
    
    }
public static void mostrarmatriz(char [][]a){
    for(int i=0;i<a.length;i++){
        
        System.out.println(Arrays.toString(a[i]));
  }
}
 
public static void rellenartablero(char[][]tablero){
    for(int fila=0;fila<tablero.length;fila++){
       Arrays.fill(tablero[fila],'*');

    }
}

    
     
     
       
public static void introducirbarco(char[][]m,int tam,char letra){ 
    
    
     boolean aux=false;
     int posx;
     int posy;
 do{ 
     posx=(int)(Math.random()*10);
     posy=(int)(Math.random()*10);
    
      if(posy +tam<m[0].length){
        aux=true;
        //COMPROBAR QUE NO HAY OTRO BARCO
        for(int i=0;i<tam;i++){
            if(m[posx][posy+i]!='*'){
             //Si entra hay otro barco
             aux=false;
        }
    }
    if(aux){
        for(int i=0;i<tam;i++){
            m[posx][posy+i]=letra;
            }
        }
 }
  
 
 
 }
 while(!aux);
}
}
