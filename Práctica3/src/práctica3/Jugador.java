/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package práctica3;

/**
 *
 * @author Medac
 */
public class Jugador {
   //Atributos
    private String nombre;
    private String posición;
   private int  precio;
  
    //Constructores
public Jugador(String nombre,String posición , int precio){ 
   
    this.nombre=nombre;
    this.posición=posición;
    this.precio=precio;
} 

public String getNombre(){
    return nombre;
}
public String setPosición(String nuevo){
   nuevo=posición;
   
   return nuevo;
}
public int setPrecio(int nuevoprecio){
   nuevoprecio=precio; 
  return nuevoprecio;
  
}

 @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posici\u00f3n=" + posición + ", precio=" + precio + '}';
    }

}