/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Medac
 */
public abstract class Robot {
    String nombre;
    int bateria;
    int posx;
    int posy;
    int potencia;
    char letra;

    public Robot(String nombre, int bateria, int posx, int posy, int potencia, char letra) {
        this.nombre = nombre;
        this.bateria = bateria;
        this.posx = posx;
        this.posy = posy;
        this.potencia = potencia;
        this.letra = letra;
    }
    public abstract void Avanzar();
    public abstract void Retroceder();
    public abstract void Mostrar();
    public abstract void EjecutarAccion();
    
    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Robot{" + "nombre=" + nombre + ", bateria=" + bateria + ", posx=" + posx + ", posy=" + posy + ", potencia=" + potencia + ", letra=" + letra + '}';
    }
    
    
  
}
