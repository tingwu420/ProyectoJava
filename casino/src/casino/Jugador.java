/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casino;

/**
 *
 * @author Medac
 */
public class Jugador {
    String nombre;
    String dni;
    int edad;
    int fichas;

public Jugador(){

}
public Jugador(String nombre,String dni,int edad){
     this.nombre=nombre;
     this.dni=dni;
     this.edad=edad;

}
public String getnombre(){
    return nombre;
}
public String getdni(){
    return dni;
}
public int getedad(){
    return edad;
}

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + '}';
    }



}