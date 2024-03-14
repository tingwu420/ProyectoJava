/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domino;

/**
 *
 * @author Medac
 */
public class Ficha implements Comparable<Ficha>{
    int der;
    int izq;
    int peso;
    public Ficha(int der, int izq) {
        this.der = der;
        this.izq = izq;
        
       if(izq == der){ 
           peso=izq+der+100;
       }else{
           peso=izq+der;
       }
           
    }

    @Override
    public String toString() {
        return "Ficha{" + "der=" + der + ", izq=" + izq + '}';
    }

    @Override
    public int compareTo(Ficha f) {
       return (peso-f.peso);
    }
    
}
