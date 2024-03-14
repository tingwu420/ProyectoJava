/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocolecciones;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
/**
 *
 * @author Medac
 */
public class ProyectoColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Lista de numeros
        ArrayList<Integer>numeros= new ArrayList<>();
        System.out.println(numeros.size());
        numeros.add(5);
        numeros.add(3);
        numeros.add(8);
        System.out.println(numeros);
        System.out.println(numeros.size());
        numeros.add(1,4);
        System.out.println(numeros);
        System.out.println(numeros.get(0));
        
        
    
        
        //Lista de nombres
         ArrayList<String>nombres= new ArrayList<>();
         nombres.add("Juan");
         nombres.add("Pepe");
         nombres.add("Elena");
         nombres.remove(1);
         System.out.println(nombres);
         
         
         //LinkedList
         LinkedList<String> arrayLink = new LinkedList <> ();
         arrayLink.add("Pepe");
         arrayLink.add("Juan");
         arrayLink.add(1,"Elena");
         arrayLink.addFirst("Antonio");
         arrayLink.addLast("Silvia");
         System.out.println(arrayLink);
         
         //Clase persona
         ArrayList<Persona>personas = new ArrayList<>();
         personas.add(new Persona("Juan",18));
         personas.add(new Persona("Pepe",20));
         personas.add(new Persona());
         personas.add(new Persona("Elena",25));
         System.out.println(personas);
         
         for(Persona p:personas){
            if(p.getNombre()==null){
                p.setNombre("Emilio");
                p.setEdad(24);
            }
         }
         System.out.println(personas);
         
         //Otra forma
//         Persona p= new Persona();
//         int pos= personas.indexOf(p);
//         Persona p1=new Persona("Juan",26);
//         personas.set(pos, p1);

         




        ArrayList<Integer>num= new ArrayList<>();
        num.add(7);
        num.add(2);
        num.add(3);
        System.out.println(num);
       
        //Ordenada
        Collections.sort(num);
        System.out.println(num);
        
        //desordenadad
        Collections.shuffle(num);
        System.out.println(num);

    }
       
}
