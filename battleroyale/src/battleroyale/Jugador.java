/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battleroyale;

/**
 *
 * @author Medac
 */
public class Jugador {
//atributos    
    private String nombre;
    private int vida;
    
//constructores
public Jugador(){
        
    }

public Jugador(String nombre){
    this.nombre=nombre;
    vida=5;
}    
//metodos get solo mostrar cuando la clase es privada
public String getNombre(){
    return nombre;
}
 public int getVida(){   
    return vida;
 }
public void Luchar(Jugador jugador){
   int v= jugador.getVida();
    jugador.setVida(v-1);
}
public void setVida(int vida){
    this.vida=vida;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}
//@Override public String toString(){
//    return "nombre "+nombre+" vida "+vida;
//}

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", vida=" + vida + '}';
    }

}