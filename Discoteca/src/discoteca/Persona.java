/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discoteca;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Persona {
      Scanner sc=new Scanner(System.in);
    int edad;
    String nombre;
    double dinero;
    
public Persona()throws EdadException,SaldoException{
    edad=sc.nextInt();
    nombre=sc.next();
    dinero=sc.nextInt();
     if (edad<18){
         
     }
}  
    
    Persona(nombre,edad,dinero);
    SacarDinero(double dinero);
    MeterDinero(double dinero);

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    
}
