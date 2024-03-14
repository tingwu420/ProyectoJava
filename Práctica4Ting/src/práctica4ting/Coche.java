/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package práctica4ting;

/**
 *
 * @author Medac
 */
public class Coche extends Vehiculo{
    public Coche(){
        super();
        nombre="Coche";
        posx=0;
        posy=0;
    }
public  void avanzar(){
    posx=3;
    posy=3;
}
public void retroceder(){
    posx=-3;
    posy=-3;
}

}
