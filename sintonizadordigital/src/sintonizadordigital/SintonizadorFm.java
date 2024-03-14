/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintonizadordigital;

/**
 *
 * @author Medac
 */
public class SintonizadorFm {
    private double frecuencia;
    double minimo=80;
    double maximo=108;
    
SintonizadorFm(){
frecuencia=80;

}  
SintonizadorFm(double frecuencia){
    this.frecuencia=frecuencia;
  
}
      
void Subir(){
    frecuencia=frecuencia + 0.5;
    if(frecuencia>108){
        frecuencia=80;
    }
    
}
void Bajar(){
    frecuencia=frecuencia-0.5;
    if(frecuencia<80){
        frecuencia=108;
    }
    
}
 
void Display(){
   
    System.out.println("Frecuencia es: "+frecuencia); 
    
}
}
