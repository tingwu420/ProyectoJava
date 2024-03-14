/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoobjecto;

/**
 *
 * @author Medac
 */
public class Proyectoobjecto {



    public static void main(String[] args) {
        // TODO code application logic here
//        Persona persona1= new Persona();
//        Persona persona2= new Persona();
//        Persona persona3= new Persona("Juan",18);
//        
//        
//        
//        persona1.nombre="Ting";
//        persona1.edad= 19;
//        persona1.dni="X7629296N";
//        persona1.gmail="twu0001@alu.medac.es";
//        persona1.saludar();
//        
//        persona2.nombre="Jose";
//        persona2.edad= 25;
//        persona2.dni="X7625257N";
//        persona2.gmail="twu0001@alu.medac.es";
//        persona2.comer();
//        
//        System.out.println(persona3.nombre);
//        
//       Persona persona5= new Persona("Paco",18);
//       persona5.incrementar(5);
//       System.out.println(persona5.edad);
         
         Persona persona6= new Persona("Paco",18,"x8855");
         System.out.println(persona6.dni);
         System.out.println(persona6.edad);
         
         persona6.edad=15;
         System.out.println(persona6.mayorEdad());
         persona6.edad=19;
         System.out.println(persona6.mayorEdad());
         
        persona6.Pintar();
        
          
    }
    
}
