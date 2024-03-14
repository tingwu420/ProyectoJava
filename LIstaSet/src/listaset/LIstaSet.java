/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaset;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Medac
 */
public class LIstaSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Integer>numeros =new HashSet<>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(2);
        numeros.add(9);
        System.out.println(numeros);
        numeros.add(9);
        System.out.println(numeros);
     
        
        for(int i=0;i<11;i++){
            if(numeros.contains(i)){
                System.out.println(i);
            }
        }
        
        
        HashSet<String> nombre= new HashSet<>();
        nombre.add("Juan");
        nombre.add("Pepe");
        nombre.add("Dani");
        System.out.println(nombre);
        
        Iterator<String>it=nombre.iterator();
        while(it.hasNext()){
            System.out.println("nombre es "+it.next());
        }
        //Sale true ya que hemos puesto ese nombre
        String prueba="Pepe";
        System.out.println(nombre.contains(prueba));
        
         HashSet<Persona> personas= new HashSet<>();
//         personas.add(new Persona("Pepe","888",18));
//         personas.add(new Persona("Juan","444",19));
//         personas.add(new Persona("Elena","999",17));
//         Persona p1= new Persona("Alex","111",42);
//         personas.add(p1);
//         System.out.println(personas);
//         Persona p2= new Persona("Alex","111",42);
//         personas.add(p2);
//         System.out.println(personas);
//         System.out.println(personas.contains(p1));
         
         Persona p3= new Persona("Alex","111",42);
         Persona p4= new Persona("Alex","111",42);
         personas.add(p3);
         personas.add(p4);
         System.out.println(personas);
    
    }
    
}
