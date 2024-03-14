/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectolecturayescritura;

import java.io.*;
/**
 *
 * 
 * @author Medac
 */
public class ProyectoLecturayEscritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file=new File("inspector.txt");
        char letra='_';
        int num;
        char[]letras= new char[10];
        int contador=0;
     
        //archivo guardado en otro sitio
      //  File file=new File("/user/documents/inspector.txt");
 /*
      try{
           FileReader fileReader=new FileReader(file);   
 
         if(file.canRead()){

             int num=fileReader.read();
            
             int n=0;
             while(n!=-1){
                 
                 letra=(char) n;
              System.out.print(letra);
             n=fileReader.read();
             letras[contador]=letra;
             contador++;
          }
            System.out.println(" ");
           System.out.println("Se puede leer");
     
         }else{
          System.out.println("No se puede leer");
         }
        } catch(IOException e){
          System.out.println("No se puede leer el archivo");
   
      }
 */
      try{
              FileReader fileReader=new FileReader(file);  
            num=fileReader.read();
        
        for(int i=0;i<letras.length;i++){
                 letras[i]=letra;
                 num=fileReader.read();
                 letra=(char)num;
             }
        }catch(IOException e){
            System.out.println("Error del archivo");
        }
      
       
    
  
    String frase;
    String frase2=" ";
try{
    FileReader fileReader=new FileReader(file);
    BufferedReader bufferedReader=new BufferedReader(fileReader);
      frase=bufferedReader.readLine();
      while(frase!=null){
        frase2= frase2 +frase+'\n';
        frase=bufferedReader.readLine();
     
      }
       System.out.println(frase2); 
      bufferedReader.close();

      
}catch(IOException e1){
            System.out.println("error");
}

try{ 
FileWriter fileWriter=new FileWriter(file,false);
      BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
      bufferedWriter.write("Hola");
      bufferedWriter.newLine();
      bufferedWriter.write("que tal");
      bufferedWriter.close();
}
catch(IOException e2){
        System.out.println("error");
    }
    
    }
    
    
}
