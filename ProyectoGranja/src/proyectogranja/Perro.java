/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogranja;

/**
 *
 * @author Medac
 */
public class Perro extends Animal{
  
@Override
public void comer(){
    System.out.println("Esta comiendo, perro");
}
@Override
public void dormir(){
    System.out.println("Esta durmiendo, perro");
}
public Perro(){
       patas=4;
       nombre="Momo";
   }
}