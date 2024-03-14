/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package práctica4ting;

/**
 *
 * @author Medac
 */
public abstract class Vehiculo {
   //Atributos
    String nombre;
    int posx;
    int posy;
 
   //Constructor
public void Vehiculo(String nombre,int posx,int posy){
    this.nombre=nombre;
    this.posx=posx;
    this.posy=posy;
}

    public String getNombre() {
        return nombre;
    }

     public String setNombre() {
        return nombre;
    }
    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }


}
