/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioclase;

/**
 *
 * @author Medac
 */
public class Persona {
    private String nombre;
    private String dni;
    
public Persona(){
    
}
public Persona(String nombre,String dni){
    this.nombre=nombre;
    this.dni=dni;
}
public String getnombre(){
    return nombre;
}
public String getdni(){
    return dni;
}

@Override
public String toString() {
  return "Persona{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }


}
