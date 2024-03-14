/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicarecuperacion1trimetre2parte;

/**
 *
 * @author Medac
 */
public class Cesta {
    //Atributos
    String producto;
    int unidad;
public Cesta(String producto,int unidad){
    this.producto=producto;
    this.unidad=unidad;
}

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Cesta{" + "producto=" + producto + ", unidad=" + unidad + '}';
    }

}
