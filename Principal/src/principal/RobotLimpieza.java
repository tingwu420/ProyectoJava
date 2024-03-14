/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Medac
 */
public class RobotLimpieza extends Robot {
       
    
    public RobotLimpieza(String nombre,int bateria, int posx, int posy, int potencia, char letra) {
        super( nombre, bateria,  posx,  posy,  potencia, letra);
     
    }

 
    public int getBateria() {
        return bateria;
    }

 
    public void setBateria(int bateria) {
        this.bateria = bateria;
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

    @Override
    public String toString() {
        return "RobotLimpieza{" + '}';
    }

    
     @Override
    public void Avanzar() {
        posx+=3;
        posy+=3;
         System.out.println("Avanzando.....");
    }

    @Override
    public void Retroceder() {
        if(posx -2 <0 && posy-2 <0){
           
              System.out.println("No se puede retroceder");
        }else if(posx > 0 && posy >0){
            posx-=2;
            posy-=2;
            System.out.println("Retrocediendo.....");
        }
        
        
    }
    

  
    @Override
    public void Mostrar() {
        System.out.println("Posicion : x= "+getPosx()+", y="+getPosy());
        System.out.println("Bateria: "+getBateria());
    }

    @Override
    public void EjecutarAccion() {
        bateria=bateria-4;
        System.out.println("Aspirando");
          System.out.println("Bateria ="+bateria);
          
          if(bateria<=0){
              System.out.println("Saliendo del programa");
              
          }
    }

  
    
}
