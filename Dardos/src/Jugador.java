
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Medac
 */
public class Jugador {
    //Atributos
    String nombre;
    HashMap<String,Integer>puntuacion= new HashMap<>();
    
    
    public Jugador(){
        
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        
        for(int i=15;i<21;i++){
        puntuacion.put("centro", 0);
          puntuacion.put(String.valueOf(i), 0);
    }
        System.out.println(puntuacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<String, Integer> getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(HashMap<String, Integer> puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", puntuacion=" + puntuacion + '}';
    }
    
}
