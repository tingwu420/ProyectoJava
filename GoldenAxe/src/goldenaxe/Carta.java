/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package goldenaxe;

/**
 *
 * @author Medac
 */
public class Carta {
    String nombre;
    int vida;
    int fuerza;
    
public Carta(String nombre,int vida,int fuerza){
    this.nombre=nombre;
    this.fuerza=fuerza;
    this.vida=vida;
}
public void getNombre(){
    return nombre;
}
public void setNombre(){
    return nombre;
}
public void getFuerza(){
    return fuerza;
}
}
