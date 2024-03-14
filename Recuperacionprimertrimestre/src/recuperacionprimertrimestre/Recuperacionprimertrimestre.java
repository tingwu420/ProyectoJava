/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuperacionprimertrimestre;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Recuperacionprimertrimestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               Scanner sc=new Scanner(System.in);

        char[][]tablero=new char[8][8];
        
        rellenar(tablero);
        mostrar(tablero);
        
        int posx=0;
        int posy=0;
        int res;
        
        System.out.println("Bienvenido al manual de ajederez");
       
      do{
          System.out.println("Introduce la que piezas quieres mover 1.TORRE 2.CABALLO 3.ALFIL 4.REY 5.REYNA 6.PEÓN 7.SALIR");
          res=sc.nextInt();
         
          switch(res){
        //TORRE
           case 1:
               System.out.println("Introduzca una coordena");
               posx=sc.nextInt();
               posy=sc.nextInt();
             if(posx==0&&posy==0 || posx==0 && posy==7&& tablero[posx][posy]=='_'){             
             tablero[posx+5][posy]=tablero[posx][posy];
             tablero[posx][posy]='_';             
             mostrar(tablero);
         }else if(posx==7&&posy==0 || posx==7 && posy==7&& tablero[posx][posy]=='_'){
              tablero[posx-5][posy]=tablero[posx][posy];
              tablero[posx][posy]='_';             
              mostrar(tablero);
         } break;
         //CABALLO
         case 2:
             System.out.println("Introduzca una coordena");
               posx=sc.nextInt();
               posy=sc.nextInt();
         if(posx==0&&posy==1 || posx==0 && posy==6&& tablero[posx][posy]=='_'){
              tablero[posx+3][posy+1]=tablero[posx][posy];
              tablero[posx][posy]='_';             
              mostrar(tablero);
         
         }else if(posx==7&&posy==1 || posx==7 && posy==6&& tablero[posx][posy]=='_'){       
              tablero[posx-3][posy+1]=tablero[posx][posy];
              tablero[posx][posy]='_';             
              mostrar(tablero);
         }
         break;
         //AlFIL
         case 3:
             System.out.println("Introduzca una coordena");
               posx=sc.nextInt();
               posy=sc.nextInt();
         if(posx==0&&posy==2 || posx==0 && posy==5 && tablero[posx][posy]=='_'){       
              tablero[posx+2][posy-2]=tablero[posx][posy];
              tablero[posx][posy]='_';             
              mostrar(tablero);
                  
         }else if(posx==7&&posy==2 || posx==7 && posy==5 && tablero[posx][posy]=='_'){
              tablero[posx-2][posy-2]=tablero[posx][posy];
              tablero[posx][posy]='_';             
              mostrar(tablero);
              
         } break;
         //REY
         case 4:
             System.out.println("Introduzca una coordena");
               posx=sc.nextInt();
               posy=sc.nextInt();
          if(tablero[posx][posy]=='R'){
              tablero[posx+2][posy]=tablero[posx][posy];
              tablero[posx][posy]='_';             
              mostrar(tablero);
         }else if(posx==7 && posy==4 && tablero[posx][posy]=='_'){
              tablero[posx-2][posy]=tablero[posx][posy];
              tablero[posx][posy]='_';             
              mostrar(tablero);
         }break;
         //REYNA
         case 5:
             System.out.println("Introduzca una coordena");
               posx=sc.nextInt();
               posy=sc.nextInt();
          if(posx==0&&posy==4 ){
              tablero[posx+2][posy+2]=tablero[posx][posy];
              tablero[posx][posy]='_';             
              mostrar(tablero);
         }else if(posx==7&&posy==3 ){
              tablero[posx-2][posy+2]=tablero[posx][posy];
              tablero[posx][posy]='_';             
              mostrar(tablero);
         }break;
         //PEÓN
         case 6:
             System.out.println("Introduzca una coordena");
               posx=sc.nextInt();
               posy=sc.nextInt();
         if(tablero[1][posy]=='P'){
              tablero[posx+1][posy]=tablero[posx][posy];
              tablero[posx][posy]='_';             
              mostrar(tablero);          
         }else if(tablero[6][posy]=='P'){
              tablero[posx-1][posy]=tablero[posx][posy];
              tablero[posx][posy]='_';             
              mostrar(tablero);                 
                 }
                   break;
          }
       }while(res!=7);
        
     
       
 }
    public static void rellenar(char[][] tablero) {
       for(int i=0;i<tablero.length;i++){
           tablero[0][0]='T';
           tablero[0][1]='C';
           tablero[0][2]='A';
           tablero[0][3]='R';
           tablero[0][4]='Q';
           tablero[0][5]='A';
           tablero[0][6]='C';
           tablero[0][7]='T';
           tablero[1][i]='P';
           tablero[6][i]='P';
           tablero[7][0]='T';
           tablero[7][1]='C';
           tablero[7][2]='A';
           tablero[7][3]='Q';
           tablero[7][4]='R';
           tablero[7][5]='A';
           tablero[7][6]='C';
           tablero[7][7]='T';
           tablero[2][i]='_';
           tablero[3][i]='_';
           tablero[4][i]='_';
           tablero[5][i]='_';         
       }    
    }

    public static void mostrar(char[][] tablero) {
       for(int i=0;i<tablero.length;i++){
           for(int j=0;j<tablero.length;j++){
               System.out.print(tablero[i][j]+" ");                
           }
           System.out.println(" ");
       }
    }
    
}
