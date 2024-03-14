/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenar;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Ordenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        ArrayList<Paciente> pacientes = new ArrayList <> (); 
        int n;
        int num=0;
        do{
            System.out.println("1.Añadir 2.Salir");
            num=sc.nextInt();
        switch(num){
            case 1:
               
                 pacientes.add(new Paciente (sc.next(),sc.nextInt()));
            break;
            
            case 2:
                   Collections.sort(pacientes);
                   System.out.println(pacientes);
        
            break;
        }    
            
        }while(num!=2);
        
        
    }
    
}
