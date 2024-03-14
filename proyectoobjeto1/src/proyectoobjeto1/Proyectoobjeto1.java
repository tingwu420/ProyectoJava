/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoobjeto1;

/**
 *
 * @author Medac
 */
public class Proyectoobjeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaCorriente cc=new CuentaCorriente("Juan","X7777N");
        CuentaCorriente cc2=new CuentaCorriente(0);
        CuentaCorriente cc3=new CuentaCorriente("Juan","X7777N",100,5555555);
        Persona persona1=new Persona("Antonio","X4484N");
        CuentaCorriente cc1=new CuentaCorriente(persona1,100,50);
        
        
        cc.Ingresar(100);
        cc.Ingresar(52);
        cc.Mostrar();
        cc.SacarDinero(1000);
       
        cc2.Ingresar(50);
        cc2.Mostrar();
        
        cc3.Ingresar(55645);
        cc3.SacarDinero(54588);
        cc3.SacarDinero(5);
        cc3.Mostrar();
        
    
        
    }
    
}
