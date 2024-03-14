/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         RobotLimpieza robotl= new RobotLimpieza("Limpieza" ,20 ,0,0,4,'L');
         RobotMayordomo robotm = new RobotMayordomo("Mayordomo",15,0,0,3,'M');
        
         char [][]tablero= new char [10][10];
         
         int x=0;
         int y=0;
         int opcion;
         int n;
         do{
             System.out.println("Elige un robot");
             System.out.println("1.Robot Limpieza 2.Robot Mayordomo 3.Salir");
             opcion= sc.nextInt();
             
             do{
                 System.out.println("1.Avanzar 2.Retroceder 3.Accion 4.Mostrar 5.Mostrar en plano 6.Salir");
                 n=sc.nextInt();
                 
                 switch(n){
                     case 1:
                         if(opcion==1){
                             robotl.Avanzar();
                          //   robotl.Mostrar();
                            
//                             tablero[x+3][y+3]=tablero[x][y];
//                              tablero[x][y]='L';
                         }else if(opcion==2){
                             robotm.Avanzar();
                          //   robotm.Mostrar();
                             
//                             tablero[x+5][y+5]=tablero[x][y];
//                              tablero[x][y]='M';
                         }
                         break;
                     case 2:
                         if(opcion==1){
                             robotl.Retroceder();
                             //robotl.Mostrar();
                          
//                             tablero[x-2][y-2]=tablero[x][y];
//                             tablero[x][y]='L';
                         }else if(opcion==2){
                             robotm.Retroceder();
                           //  robotm.Mostrar();
//                           
//                             tablero[x-4][y-4]=tablero[x][y];
//                              tablero[x][y]='M';
                         }
                         break;
                     case 3:
                         if(opcion==1){
                             robotl.EjecutarAccion();
                         }else if(opcion==2){
                             robotm.EjecutarAccion();
                         }
                         break;
                     case 4:
                          if(opcion==1){
                             robotl.Mostrar();
                         }else if(opcion==2){
                             robotm.Mostrar();
                         }
                         break;
                     case 5:
                       
                         mostrar(tablero);
                        
                         break;                       
                 }
             }while(n!=6);
             
             
         }while(opcion!=3);
         
    }

    public static void mostrar(char[][]tablero){
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
               System.out.print(tablero[i][j]+"_");                
           }
           System.out.println(" ");
    }
    }
 
}
    
