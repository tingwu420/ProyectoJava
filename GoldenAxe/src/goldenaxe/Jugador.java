/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package goldenaxe;

/**
 *
 * @author Medac
 */
public  class Jugador {
    int vida;
    int fuerza;
    String nombre;
    boolean muerto;
    Carta[]cartas;
 public Jugador(){
    cartas=new Carta[4];
     
     cartas[0]=new Carta("Tienes 1 punto de vida",1,0);
     cartas[1]=new Carta("Te quitan  1 punto de vida",-1,0);
     cartas[2]=new Carta("Obtines 1 punto de fuerza",0,1);
     cartas[3]=new Carta("Te quitan 1 punto de fuerza",0,-1);
     cartas[4]=new Carta("Tienes 2 punto de vida",2,0);

 }
}
