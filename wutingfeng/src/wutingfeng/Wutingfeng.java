/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wutingfeng;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Wutingfeng {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     char [][]matriz=new char[10][10];
        
        rellenartablero(matriz,'x');
        introducirposicion(matriz);
        mostrarcamino(matriz);
        mostrarmatriz(matriz);
        jugar(matriz);
        
    }       
     public static void mostrarmatriz(char [][]a){
    for(int i=0;i<a.length;i++){
        
        System.out.println(Arrays.toString(a[i]));
  }
 }
public static void rellenartablero(char[][]matriz){
    for(int i=0;i<matriz.length;i++){
       Arrays.fill(matriz[i],'x');

    }
}
public static void introducirposicion(char[][]matriz){

     int posx;
     int posy;
     
     posx=0;
     posy=0;
     matriz[posx][posy]='o';
    

}

public static void rellenartablero(char[][] matriz, char letra) {
        for(int i=0;i<matriz.length;i++){
            Arrays.fill(matriz[i], letra);
        }
    }




public static void mostrarcamino(char[][] matriz) {
 
    for(int i=0;i<1;i++){
            for(int j=1;j<6;j++){
                matriz[i][j]=' ';
            }
        }
    for(int j=5;j<6;j++){
            for(int i=1;i<4;i++){
                matriz[i][j]=' ';
            }
        }
    for(int i=3;i<4;i++){
            for(int j=6;j<7;j++){
                matriz[i][j]=' ';
            }
        }
     for(int j=6;j<7;j++){
            for(int i=4;i<7;i++){
                matriz[i][j]=' ';
            }
        }
       for(int i=7;i<8;i++){
            for(int j=6;j<8;j++){
                matriz[i][j]=' ';
            }
        }
       for(int j=7;j<8;j++){
            for(int i=8;i<9;i++){
                matriz[i][j]=' ';
            }
        }
    
    for(int i=9;i<10;i++){
            for(int j=7;j<10;j++){
                matriz[i][j]=' ';
            }
        }
      }

public static void jugar(char[][]matriz){
     Scanner sc=new Scanner(System.in);
    int num,turno;
    int posfila=0,poscol=0;
    turno=3;
    boolean aux=true;
   
    while(aux){
    System.out.println("Bienvenido");
    mostrarmatriz(matriz);
    }
    do{
    System.out.println("Indica la poscion donde moverse: 1.derecha 2.izquierda 3.arriba 4.abajo");
    num=sc.nextInt();
  
    switch(num){
        case 1://mover a la derecha
        if(poscol+1<10){
            if(matriz[posfila][poscol]==' '){
                matriz[posfila][poscol]==' ';
            }
        }
    
    
    }while(num>4);
   

}    
}

