/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starwars;

/**
 *
 * @author Medac
 */
public class Luke extends Darthvader {
   
    
public Luke (){
   //Atributos ocultos de Darthvader
    super();
    lado_oscuro=false;
    habilidad_espadalaser=5;
}
@Override
public void hablar(){
    System.out.println("Hola, soy tu hijo");
            
}
    
}
