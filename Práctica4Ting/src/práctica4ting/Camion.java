/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package práctica4ting;

/**
 *
 * @author Medac
 */
public class Camion extends Vehiculo{
    public Camion(){
        super();
        nombre="Camion";
        posx=0;
        posy=1;
    }
public  void avanzar(){
    posx=2;
    posy=2;
}
public void retroceder(){
    posx=-2;
    posy=-2;
}
}
