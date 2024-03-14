/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoobjeto1;

/**
 *
 * @author Medac
 */
public class CuentaCorriente {
 //atributos
   String nombre;
    String dni;
    double saldo;
    double limite;
    Persona persona;

//constructores
 

    
 CuentaCorriente(String nombre,String dni){
 this.nombre=nombre;
 this.dni=dni;
 saldo=0.0;
 limite=-50.0;     
}
public CuentaCorriente(double saldo){
this.saldo=saldo;
}

CuentaCorriente(String nombre,String dni,double saldo,double limite){
this.nombre=nombre;
this.dni=dni;
this.saldo=saldo;
this.limite=limite;
}    
  


CuentaCorriente(Persona persona,double saldo, double limite){
    this.persona=persona;
    this.saldo=saldo;
    this.limite=limite;
}

   
   
   
void Ingresar(double ingreso){
saldo=saldo+ingreso;
}
void SacarDinero(double dinero){
if(saldo-dinero<limite){
    System.out.println("No se puede");
   }else{
    saldo=saldo-dinero;
}
    
    
}
void Mostrar(){
System.out.println("Nombre es: "+nombre);
System.out.println("DNI es: "+dni);
System.out.println("Saldo es: "+saldo);
System.out.println("Limite es: "+limite);    
}
}