/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package damas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Damas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        char[][]tablero=new char[5][5];
        rellenar(tablero);
        mostrar(tablero);
        int turno=0;
        
        do{
            System.out.println("Juega la negra");
            mostrar(tablero);
            System.out.println("Elige la pieza ");
           int posx;
           int posy;
           
            do{
                
              posx=sc.nextInt();
              posy=sc.nextInt();
              
            }while(tablero[posx][posy]!='N');
           
           if(tablero[posx+1][posy]=='*'){
               tablero[posx+1][posy]=tablero[posx][posy];
               tablero[posx][posy]='*';
           
           }else if((posx>0)&&(tablero[posx+1][posy-1]=='B')){
                tablero[posx+1][posy-1]=tablero[posx][posy];
                tablero[posx][posy]='*';
           }else if((posy<4)&&(tablero[posx+1][posy+1]=='B')){
                tablero[posx+1][posy+1]=tablero[posx][posy];
                tablero[posx][posy]='*';
           }else if(tablero[posx+1][posy]=='B'){
               System.out.println("No se puede mover");
           }
           
            System.out.println("Juega la blanca");
            mostrar(tablero);
            System.out.println("Elige la pieza ");
          do{
                
              posx=sc.nextInt();
              posy=sc.nextInt();
              
            }while(tablero[posx][posy]!='B');
           
           if(tablero[posx-1][posy]=='*'){
               tablero[posx-1][posy]=tablero[posx][posy];
               tablero[posx][posy]='*';
           
         
           }
           else if((posx>0)&&(tablero[posx-1][posy-1]=='N')){
                tablero[posx-1][posy-1]=tablero[posx][posy];
                tablero[posx][posy]='*';
           }else if((posy<4)&&(tablero[posx-1][posy+1]=='N')){
                tablero[posx-1][posy+1]=tablero[posx][posy];
                tablero[posx][posy]='*';
           }  else if(tablero[posx+1][posy]=='N'){
               System.out.println("No se puede mover");
           }
            
            turno++;
        }while(turno<=10);
       
        
    }
public static void rellenar(char[][]tablero){
    for(int i=0;i<tablero.length;i++){
        tablero[0][i]='N';
        tablero[4][i]='B';
        tablero[1][i]='*';
        tablero[2][i]='*';
        tablero[3][i]='*';
    }
}

public static void mostrar(char[][] tablero) {
    for(int i=0;i<tablero.length;i++){
        for(int j=0;j<tablero[i].length;j++){
            System.out.print(tablero[i][j]+" ");
        }
        System.out.println(" ");
    }


}

    
}
