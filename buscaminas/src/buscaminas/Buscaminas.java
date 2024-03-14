/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscaminas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Buscaminas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [][]matriz=new char[3][3];
        char [][]copiamatriz=new char[3][3];
        rellenartablero(matriz,'x');
        rellenartablero(copiamatriz,'x');
        mostrarmatriz(matriz);
        introducirbomba(matriz);
        mostrarmatriz(matriz);
        jugar(matriz,copiamatriz);
    }       
     public static void mostrarmatriz(char [][]a){
    for(int i=0;i<a.length;i++){
        
        System.out.println(Arrays.toString(a[i]));
  }
 }
public static void rellenartablero(char[][]matriz){
    for(int fila=0;fila<matriz.length;fila++){
       Arrays.fill(matriz[fila],'x');

    }
}
public static void introducirbomba(char[][]matriz){

     int posx;
     int posy;
     
     posx=(int)(Math.random()*3);
     posy=(int)(Math.random()*3);
     matriz[posx][posy]='B';
    

}

    public static void rellenartablero(char[][] matriz, char letra) {
        for(int i=0;i<matriz.length;i++){
            Arrays.fill(matriz[i], letra);
        }
    }

public static void jugar(char[][] matriz, char[][] copiamatriz) {
       Scanner sc=new Scanner(System.in);
      int posx;
      int posy;
      boolean aux=true;
      int turno=3;
     
    do{ 
      
        do{
           System.out.println("Introduce el valor x ");
           posx=sc.nextInt();
           System.out.println("Introduce el valor y ");
           posy=sc.nextInt();
       
       }while(!(posx>=0&&posx<3)||!(posy>=0&&posy<3));
      
      if(matriz[posx][posy]=='B'){
          System.out.println("Boom");
         aux=false; 
         turno=0;
         mostrarmatriz(matriz);
         
      }else if(matriz[posx][posy]=='x'){
          System.out.println("sigue ");
          copiamatriz[posx][posy]=' ';
          matriz[posx][posy]=' ';
          turno--;
          mostrarmatriz(copiamatriz);
      }else{
          System.out.println("Ya elegiste esta coordenada");
          System.out.println("sigue ");
          mostrarmatriz(copiamatriz);
      }

    
    }while(turno>0);
    

 }
}
