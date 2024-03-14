/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package detective;

/**
 *
 * @author Medac
 */
public class Persona {
   //Atributos
    String Nombre;
    String lugar;
    boolean asesino=false;
    
    //Constructores


public Persona(String Nombre,String lugar){
    this.Nombre=Nombre;
    this.lugar=lugar;
}
    
    
public String dondeEstaban(){
      if(asesino){
        String []lugares= {"mayordomo","amadellaves","jardinero","cocinero","propietario","esposapropietario"};  
      int pos=(int)(Math.random()*6);
      lugar =lugares[pos];
    }
        
    return lugar;
   
}

public void setAsesino(boolean asesino) {
        this.asesino = asesino;
    }


public String getNombre(){
    return Nombre;
}
}


