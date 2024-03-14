/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacroexamen;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Simulacroexamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner sc= new Scanner(System.in);
        Aragon aragon=new Aragon();
        Legolos legolos=new Legolos();
        Gimli gimli=new Gimli();
        Orco orco=new Orco();
        Jugador[]jugadores={aragon,legolos,gimli};
        Carta[]mazo=new Carta[10];
        //Rellenar cartas
        for(int i=0;i<mazo.length;i++){
            int ataque=(int)(Math.random()*10);
            int vida=(int)(Math.random()*10);
            mazo[i]=new Carta(ataque,vida);
        }
        do{
            for(int i=0;i<jugadores.length;i++){
                int random=(int)(Math.random()*10);
                jugadores[i].robarCarta(mazo[random]);
                jugadores[i].verCarta();
                System.out.println("¿Que quieres hacer?  1:usar carta 2:atacar");
                int res=sc.nextInt();
                switch(res){                   
                    case 1://usar carta
                         System.out.println("¿Que posicion quieres jugar?");
                         int resp=sc.nextInt();
                          jugadores[i].usarCarta(resp);
                        break;
                    case 2://atacar
                        orco.setVida(orco.getVida()-jugadores[i].getAtaque());
                        break;
                }
     
            }
            int rand=(int)(Math.random()*3);
            jugadores[rand].setVida(jugadores[rand].getVida()-orco.getAtaque());
       
        }while(jugadores[0].getVida()>0 || jugadores[1].getVida()>0 || jugadores[2].getVida()>0 || orco.getVida()>0);
         
    }
    
}
