/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package práctica3ting;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Práctica3Ting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
         Scanner sc=new Scanner(System.in);
        
        Jugador[]jugadores=new Jugador[22];
        Jugador[]plantilla=new Jugador[11];
        
        Jugador j0=new Jugador("Victor","portero",4600000.0);
        Jugador j1=new Jugador("Kroos","centrocampista",3700000.0);
        Jugador j2=new Jugador("Isco","centrocampista",6500000.0);
        Jugador j3=new Jugador("Gerard","delantero",3500000.0);
        Jugador j4=new Jugador("Valjient","defensa",3600000.0);
        Jugador j5=new Jugador("Paco","defensa",3600000.0);
        Jugador j6=new Jugador("Gabriel","defensa",3200000.0);
        Jugador j7=new Jugador("Antonio","centrocampista",5200000.0);
        Jugador j8=new Jugador("Oscar","centrocampista",5800000.0);
        Jugador j9=new Jugador("Carlos","delantero",7800000.0);
        Jugador j10=new Jugador("Jose","delantero",6900000.0);
        Jugador j11=new Jugador("Pepe","portero",4600000.0);
        Jugador j12=new Jugador("Ivan","defensa",4200000.0);
        Jugador j13=new Jugador("Daniel","defensa",5600000.0);
        Jugador j14=new Jugador("Luis","centrocampista",5300000.0);
        Jugador j15=new Jugador("Julio","centrocampista",4900000.0);
        Jugador j16=new Jugador("Salvador","delantero",3600000.0);
        Jugador j17=new Jugador("Samuel","delantero",3700000.0);
        Jugador j18=new Jugador("Alvaro","defensa",5200000.0);
        Jugador j19=new Jugador("Alex","defensa",6400000.0);
        Jugador j20=new Jugador("Santiago","centrocampoista",5400000.0);
        Jugador j21=new Jugador("Javi","centrocampista",3200000.0);
        
//       jugadores[0]=j0;
//       jugadores[1]=j1;
//       jugadores[2]=j2;
//       jugadores[3]=j3;
//       jugadores[4]=j4;
//       jugadores[5]=j5;
//       jugadores[6]=j6;
//       jugadores[7]=j7;
//       jugadores[8]=j8;
//       jugadores[9]=j9;
//       jugadores[10]=j10;
//       jugadores[11]=j11;
//       jugadores[12]=j12;
//       jugadores[13]=j13;
//       jugadores[14]=j14;
//       jugadores[15]=j15;
//       jugadores[16]=j16;
//       jugadores[17]=j17;
//       jugadores[18]=j18;
//       jugadores[19]=j19;
//       jugadores[20]=j20;
//       jugadores[21]=j21;
       
       
       
       boolean jugar=true;
       double suma;
       int n;
       int opcion;
      System.out.println("BIENVENIDO");
      System.out.println("--------------TODOS LOS JUGADORES----------------");
             for(int i=0;i<jugadores.length;i++){
        System.out.println("Pos= "+i+" "+jugadores[i]);
             }
      
      do{
          
           System.out.println("1.Mostrar 2.Cambiar jugador 3.Valor de tu equipo 4.Salir");
           opcion=sc.nextInt();
      
                  
           switch(opcion){
               case 1:
                 
                  System.out.println("----------------MI PLANTILLA------------------");
                 
                  for(int j=0;j<plantilla.length;j++){
                      int posRandom=(int)(Math.random()*22);
                    
                      System.out.println("Pos= "+j+" "+jugadores[posRandom]);
                       if(jugadores[posRandom]!=null){
                          plantilla[j]=jugadores[posRandom];
                          jugadores[posRandom]=null;
                      }
                   
                  }
                 
                   break;
               case 2:
                   System.out.println("Elige una posción del jugador que quieres cambiar");
                   
                   break;
               case 3:
                  System.out.println("Suma total de la plantilla");
                  
                   break;
               case 4:
                   System.out.println("Seguro que quieres salir? 1.Si 2.NO");
                   n=sc.nextInt();
                   if(n==1){
                   jugar=false;
                   }else{
                   jugar=true;
                   }
                   break;
           }
           
           
           
       }while(jugar);
        
        
     
        
    }
}

    
    

