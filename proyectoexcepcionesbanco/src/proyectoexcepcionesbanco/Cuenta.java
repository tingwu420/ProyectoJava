/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexcepcionesbanco;

/**
 *
 * @author Medac
 */
public class Cuenta {
    //Atributo
    String nombre;
    int num;
    double saldo;
           
    //Constructor
public Cuenta(String nombre,int num,double saldo)throws SaldoInsuficienteException{
    if(saldo<0){
        throw new SaldoInsuficienteException("Saldo inicial negativo");
    }
    this.nombre=nombre;
    this.num=num;
    this.saldo=saldo;
    
}

    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", num=" + num + ", saldo=" + saldo + '}';
    }

    public void movimiento(double valor)throws SaldoInsuficienteException{
        if(saldo + valor <0 ){
             throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo+=valor;
    }
}

