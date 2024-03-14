/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Medac
 */
public class RobotMayordomo extends Robot{

    public RobotMayordomo(String nombre, int bateria, int posx, int posy, int potencia, char letra) {
        super(nombre, bateria, posx, posy, potencia, letra);
    }

    @Override
    public void Avanzar() {
         posx+=5;
        posy+=5;
        System.out.println("Avanzando.....");
    }

    @Override
    public void Retroceder() {
         if(posx -4 <0 && posy-4 <0){
           
              System.out.println("No se puede retroceder");
        }else if(posx > 0 && posy >0){
            posx-=4;
            posy-=4;
            System.out.println("Retrocediendo.....");
        }
    }

    @Override
    public void Mostrar() {
        System.out.println("Posicion :x="+getPosx()+", y="+getPosy());
        System.out.println("Bateria: "+getBateria());
    }

    @Override
    public void EjecutarAccion() {
        bateria=bateria-6;
        System.out.println("Cogiendo");
        System.out.println("bateria= "+bateria);
        
        if(bateria<=0){
              System.out.println("Saliendo del programa");
              
          }
    }
    
}
