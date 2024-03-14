/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package goldenaxe;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class GoldenAxe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        
     
        
        System.out.println("Elige nº jugadores del 1 al 5");
        int players=sc.nextInt();
        int vidaCtlhulhu= 20+players*2;
        Ctlhulhu ctlhulhu =new Ctlhulhu(vidaCtlhulhu);
        Jugador[]jugadores=new Jugador[players];
        for(int i=0;i<players;i++){
        System.out.println("Selecciona jugador:1.Enano 2.Guerrero 3.Amazona");
        int nombre=sc.nextInt();
        switch(nombre){
            case 1:
                Enano enano=new Enano();
                jugadores[i]=enano;
                break;
        
          case 2:
                Guerrero guerrero=new Guerrero();
                jugadores[i]=guerrero;
                break;
        
          case 3:
                Amazona amazona=new Amazona();
                jugadores[i]=amazona;
                break;
        }
    }
        
    }
    
}
