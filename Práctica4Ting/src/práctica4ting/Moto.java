/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package práctica4ting;

/**
 *
 * @author Medac
 */
public class Moto extends Vehiculo{
    public Moto(){
        super();
        nombre="Moto";
        posx=0;
        posy=2;
    }
public  void avanzar(){
    posx=4;
    posy=4;
}
public void retroceder(){
    posx=-4;
    posy=-4;
}

}
