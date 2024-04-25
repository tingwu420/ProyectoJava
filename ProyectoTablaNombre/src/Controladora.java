
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Medac
 */
public class Controladora {
     ArrayList<Persona> personas = new ArrayList<>();
     
     public ArrayList<Persona>LeerArchivo(){
         File file = new File("persona.txt");
         
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String texto= br.readLine();
            
            while(texto != null){
                String[]array = texto.split(" ");
                personas.add(new Persona(array[0],array[1]));
                texto= br.readLine();
            }
            
        }catch(IOException e){
            System.out.println("Error");
        }
        return personas;
     }
     public  void EscribirArchivo(ArrayList<Persona>personas){
         File f = new File("persona.txt");
         try{
             BufferedWriter bw= new BufferedWriter(new FileWriter(f,false));
             for(int i=0;i<personas.size();i++){
                 bw.write(personas.get(i).getNombre()+ " "+personas.get(i).getEdad());
                 bw.newLine();
             }
             bw.close();
         }catch(IOException e1){
             System.out.println("Error de escribir");
         }
     }
}
