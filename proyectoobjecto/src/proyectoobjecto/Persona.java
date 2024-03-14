/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoobjecto;

/**
 *
 * @author Medac
 */
public class Persona {
 //atributos o campos
    String nombre;
    int edad;
    String dni;
    String gmail;
  //int incrementar;
    
 //constructores
//    Persona(){
//        System.out.println("Has creado una persona");
//    }
//    Persona(String nom,int e){
//    nombre=nom;
//    edad=e;
//    } 
//    
    
 //metodos
//    void saludar(){
//        System.out.println(nombre+" dice hola");     
//    }
//    void comer(){
//    System.out.println("Estoy comiendo");   
//    }
//    void incrementar(int num){
//    edad=edad+num;
//    }
    Persona(String nombre,int edad,String dni){
        this.nombre=nombre;
       
    }
    boolean mayorEdad(){
        boolean resp;
        if(edad<18){
            resp=false;
        }else{
            resp=true;
        }
        return resp;
}
   void Pintar(){
        System.out.println("nombre"+nombre);
        System.out.println("Edad"+edad);
        System.out.println("dni"+dni);
         
   }

}
    

