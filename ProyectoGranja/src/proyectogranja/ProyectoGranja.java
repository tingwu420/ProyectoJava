/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectogranja;

/**
 *
 * @author Medac
 */
public class ProyectoGranja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro p=new Perro();
        Gato g=new Gato();
        p.comer();
        p.dormir();
        g.comer();
        g.dormir();
      //Polimorfismo
      Animal[]array={p,g};
    }
    
}
