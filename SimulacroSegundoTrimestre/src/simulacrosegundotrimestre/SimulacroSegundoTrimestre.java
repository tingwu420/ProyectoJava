/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacrosegundotrimestre;
import java.io.*;
/**
 *
 * @author Medac
 */
public class SimulacroSegundoTrimestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file=new File("Codigo.txt");
        
        String linea=" ";
        String linea2=" ";
        boolean comentartodo=false;
         try{ 
        FileReader fileReader=new FileReader(file);  
        BufferedReader bufferedReader=new BufferedReader(fileReader);
     
       
        while(linea!=null){
            if(!linea.contains("//")&&(!linea.contains("/*"))&& (!linea.contains("*/"))&&(!comentartodo)){
//        if(linea.contains("//")&& linea.contains("/*")&& linea.contains("*/")){
            System.out.println(linea);
        }else if(linea.contains("/*")){
            comentartodo=true;
        }else if(linea.contains("*/")){
            comentartodo=false;
        }
           linea=bufferedReader.readLine();
        
        if(linea.endsWith(" ")){
            throw new ExceptionSinPuntoyComa("Error");
        }
        else if(!linea.endsWith(";"))|| (!linea.endsWith("}")){
            throw new ExceptionSinPuntoyComa("error");
        }
      }
    }catch(IOException e){
        System.out.println("Error de lectura");
        
        
    }
    
 }
}
