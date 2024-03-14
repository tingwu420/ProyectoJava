/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package práctica3;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Práctica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Jugador[]jugadores=new Jugador[22];
        
        
        Jugador j1=new Jugador("Kroos","centrocampista",37000000);
        Jugador j2=new Jugador("Isco","centrocampista",65000000);
        Jugador j3=new Jugador("Gerard","delantero",35000000);
        Jugador j4=new Jugador("Valjient","defensa",36000000);
        Jugador j5=new Jugador("Paco","defensa",36000000);
        Jugador j6=new Jugador("Gabriel","defensa",32000000);
        Jugador j7=new Jugador("Antonio","centrocampista",52000000);
        Jugador j8=new Jugador("Oscar","centrocampista",58000000);
        Jugador j9=new Jugador("Carlos","delantero",78000000);
        Jugador j10=new Jugador("Jose","delantero",69000000);
        Jugador j11=new Jugador("Pepe","portero",460000000);
        Jugador j12=new Jugador("Ivan","defensa",420000000);
        Jugador j13=new Jugador("Daniel","defensa",560000000);
        Jugador j14=new Jugador("Luis","centrocampista",530000000);
        Jugador j15=new Jugador("Julio","centrocampista",490000000);
        Jugador j16=new Jugador("Salvador","delantero",360000000);
        Jugador j17=new Jugador("Samuel","delantero",370000000);
        Jugador j18=new Jugador("Alvaro","defensa",520000000);
        Jugador j19=new Jugador("Alex","defensa",640000000);
        Jugador j20=new Jugador("Santiago","centrocampoista",540000000);
        Jugador j21=new Jugador("Javi","centrocampista",320000000);
        Jugador j22=new Jugador("Victor","portero",460000000);
  
       jugadores[1]=j1;
       jugadores[2]=j2;
       jugadores[3]=j3;
       jugadores[4]=j4;
       jugadores[5]=j5;
       jugadores[6]=j6;
       jugadores[7]=j7;
       jugadores[8]=j8;
       jugadores[9]=j9;
       jugadores[10]=j10;
       jugadores[11]=j11;
       jugadores[12]=j12;
       jugadores[13]=j13;
       jugadores[14]=j14;
       jugadores[15]=j15;
       jugadores[16]=j16;
       jugadores[17]=j17;
       jugadores[18]=j18;
       jugadores[19]=j19;
       jugadores[20]=j20;
       jugadores[21]=j21;
       jugadores[22]=j22;
       
       int n = 0;
       boolean jugar=true;
       int opcion;
      System.out.println("Bienvenido");
       do{
           System.out.println("1.Mostrar 2.Cambiar jugador 3.Valor de tu equipo 4.Salir");
           opcion=sc.nextInt();
           
           switch(n){
               case 1:
                  System.out.println(jugadores.toString());
                   break;
               case 2:
                   
                   break;
               case 3:
                  
                   break;
               case 4:
                   System.out.println("Adiós");
                   jugar=false;
                   break;
           }
           
           
           
       }while(jugar);
        
        
//        Jugador[]plantilla=new Jugador[11];
//        rellenar(jugadores,plantilla);
//        
    }
//public static void rellenar(){
//    if(jugadores[posRandom]!=null){
//        plantilla[i]=jugadores[posRandom];
//        jugadores[posRandom]=null;
//        
//    }
//}
}
