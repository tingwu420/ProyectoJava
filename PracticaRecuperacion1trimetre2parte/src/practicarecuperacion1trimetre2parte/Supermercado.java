/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicarecuperacion1trimetre2parte;

/**
 *
 * @author Medac
 */
public class Supermercado {
    //Atributos
    String nombre;
    String listaproductos;
    //Constructor
public Supermercado(String nombre,String listaproductos){
    this.nombre=nombre;
    this.listaproductos=listaproductos;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getListaproductos() {
        return listaproductos;
    }

    public void setListaproductos(String listaproductos) {
        this.listaproductos = listaproductos;
    }

    @Override
    public String toString() {
        return "Supermercado{" + "nombre=" + nombre + ", listaproductos=" + listaproductos + '}';
    }
    

}
