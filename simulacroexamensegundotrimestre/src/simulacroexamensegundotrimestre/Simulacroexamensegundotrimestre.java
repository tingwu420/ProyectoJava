/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacroexamensegundotrimestre;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Medac
 */
public class Simulacroexamensegundotrimestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file=new File("texto.txt");
        Inventario[] inventarios=new Inventario[100];
        String texto;
        String texto2="";
        int contador=0;
         String[]array=new String[100];
         // int numEntero = 4;    
//      String numCadena= String.valueOf(numEntero);
//        System.out.println(numEntero);


     try{ 
        FileReader fileReader=new FileReader(file);  
        BufferedReader bufferedReader=new BufferedReader(fileReader);
         texto=bufferedReader.readLine();
         while(texto!=null){
             if(texto.contains("/")){
                 throw new Excepcion();
             }
        array=texto.split(":");
        texto2= texto2 +texto+'\n';
        texto=bufferedReader.readLine();
        inventarios[contador]=new Inventario(array[0],Integer.parseInt(array[1]),Integer.parseInt(array[2]));

        contador++;
   
        }
        System.out.println(texto2);
        bufferedReader.close();
 
    }catch(IOException e){
       
        System.out.println("Error de lectura");
    }catch(Excepcion e1){
         System.out.println(e1);
    }
     for(int i=0;i<inventarios.length;i++){
           
         if(inventarios[i]!=null){
         System.out.println(inventarios[i]);
     }
     }
    
}
}
