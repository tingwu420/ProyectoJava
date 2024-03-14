/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenar;

/**
 *
 * @author Medac
 */
public class Paciente implements Comparable <Paciente>{
    int id=0;
    static int cont = 0;
    String nombre;
    int edad;

    public Paciente(String nombre,int edad){
        id=cont++;
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Paciente p) {
          return edad-p.edad;
    }
   
}
