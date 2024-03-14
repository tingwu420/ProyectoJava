/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogranja;

/**
 *
 * @author Medac
 */
public class Gato extends Animal {
    @Override
    public void comer(){
        System.out.println("Esta comiendo, gato");
    }
    @Override
    public void dormir(){
        System.out.println("Esta durmiendo, gato");
    }
public Gato(){
    patas=4;
    nombre="Tudou";
}
   
}
