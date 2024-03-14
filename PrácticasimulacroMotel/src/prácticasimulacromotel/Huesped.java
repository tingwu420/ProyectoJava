/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prácticasimulacromotel;

/**
 *
 * @author Medac
 */
public class Huesped {
    //Atributos
    private String nombre;
    private int num_noches;
    private int precio;
    //Constructores
public Huesped(String nombre, int num_noches){
    this.nombre=nombre;
    this.num_noches=num_noches;
    precio=num_noches*50;
   
}
public String getNombre(){
    return nombre;
}
public int getNum_noches(){
    return num_noches;
}



    @Override
    public String toString() {
        return "Huesped{" + "nombre=" + nombre + ", num_noches=" + num_noches + '}';
    }

}