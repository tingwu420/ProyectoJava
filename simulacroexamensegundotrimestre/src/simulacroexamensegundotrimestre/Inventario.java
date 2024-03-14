/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacroexamensegundotrimestre;

/**
 *
 * @author Medac
 */
public class Inventario {
    String item;
    int precio;
    int cantidad;
 public Inventario(String item, int precio, int cantidad){
     this.item=item;
     this.precio=precio;
     this.cantidad=cantidad;
 }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Inventario{" + "item=" + item + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
 
}
