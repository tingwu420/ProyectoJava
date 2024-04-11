/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegouno;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class JuegoUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        LinkedList <Carta> cartas= new LinkedList<>();
        rellenar(cartas);
        Collections.shuffle(cartas);
   
        LinkedList<Carta>jugador1 = new LinkedList<>();
        LinkedList<Carta>jugador2 = new LinkedList<>();
        for(int i=0;i<7;i++){
            jugador1.add(cartas.pollFirst());             //Saca la primera carta 
            jugador2.add(cartas.pollFirst()); 
        }
                Collections.sort(jugador1);
                LinkedList <Carta> mesa= new LinkedList<>();
                mesa.add(cartas.pollFirst());
                System.out.println(mesa);
                int res;
             do{
                 //jugador 1
                 System.out.println("------------------Jugador 1--------------------");
                 System.out.println(jugador1);
                 mostrar(jugador1);

                 System.out.println("1.Robar carta 2.Jugar carta");
                  res=sc.nextInt();
                 
                 switch(res){
                     case 1:
                          jugador1.add(cartas.pollFirst());
                          System.out.println("Has robado una carta");
                         break;
                     case 2:
                         System.out.println("Elige la carta que quieres jugar");
                          res=sc.nextInt();
                        if(jugador1.get(res).getColor().equals(mesa.getLast().getColor())|| jugador1.get(res).getNumero()== mesa.getLast().getNumero() ){
                            mesa.add(jugador1.get(res));
                            jugador1.remove(res);
                        }else{
                            jugador1.add(cartas.pollFirst());
                        }
                         break;
                     }
                 
                   //jugador 2
                              System.out.println("------------------Jugador 2--------------------");
                 mostrar(jugador2);
                 System.out.println("1.Robar carta 2.Jugar carta");
                  res=sc.nextInt();
                 
                 switch(res){
                     case 1:
                          jugador2.add(cartas.pollFirst());
                          System.out.println("Has robado una carta");
                         break;
                     case 2:
                         System.out.println("Elige la carta que quieres jugar");
                          res=sc.nextInt();
                        if(jugador2.get(res).getColor().equals(mesa.getLast().getColor())|| jugador2.get(res).getNumero()== mesa.getLast().getNumero() ){
                            mesa.add(jugador2.get(res));
                            jugador2.remove(res);
                        }else{
                            jugador2.add(cartas.pollFirst());
                        }
                         break;
                     }
             } while(!jugador1.isEmpty()||jugador2.isEmpty());
             
             
             
    
             }
    private static void rellenar(LinkedList<Carta> cartas) {
           for(int i=0;i<10;i++){
               cartas.add(new Carta("rojo", i));
               cartas.add(new Carta("amarillo", i));
               cartas.add(new Carta("azul", i));
               cartas.add(new Carta("verde", i));
           }
    }

    private static void mostrar(LinkedList<Carta> jugador1) {
        for(int i=0;i<jugador1.size();i++){
            System.out.println(i+"."+jugador1.get(i));
        }
    }
    
}
