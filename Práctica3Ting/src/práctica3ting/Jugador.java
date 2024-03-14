/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package práctica3ting;

/**
 *
 * @author Medac
 */
public class Jugador {
       //Atributos
    private String nombre;
    private String posición;
    private double  precio;
  
    //Constructores
public Jugador(String nombre,String posición , double precio){ 
   
    this.nombre=nombre;
    this.posición=posición;
    this.precio=precio;
} 

public String getNombre(){
    return nombre;
}
public String getPosición(){
   
   return posición;
}
public double getPrecio(){
   
    return precio;
  
}

 @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posici\u00f3n=" + posición + ", precio=" + precio + '}';
    }


}
