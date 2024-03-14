/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectohotel;

/**
 *
 * @author Medac
 */
public abstract class Hotel {
    String nombre;
    int precio;
    boolean estado=true;
 public abstract void prueba();

public void Comprado(){
    estado=true;
}
public int getPrecio(){
    return precio;
}
 
 
 public  void Prueba(){
System.out.println("Hola");

}
}

