/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domino;
import java.util.Collections;
import java.util.LinkedList;
/**
 *
 * @author Medac
 */
public class Domino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <Ficha> lista= new LinkedList<>();
        LinkedList <Ficha> j1= new LinkedList<>();
        LinkedList <Ficha> j2= new LinkedList<>();
        
        
        for(int i=0;i<7;i++){
            for(int j=0;j<=i;j++){
                lista.add(new Ficha(i,j));
            }
        }
        Collections.shuffle(lista);
       for(int i=0;i<7;i++){
           j1.add(lista.pollFirst());
           j2.add(lista.pollFirst());
       }
       }
    Collections.sort(j1);
    
}
