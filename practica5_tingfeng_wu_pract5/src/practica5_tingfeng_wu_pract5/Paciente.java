/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5_tingfeng_wu_pract5;

/**
 *
 * @author Medac
 */
public class Paciente {

    String nombre;
    String apellido;
    int edad;
public Paciente(String nombre,String apellido,int edad){

    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
}



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Paciente{ nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

}
