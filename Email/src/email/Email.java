/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package email;
import java.io.*;

/**
 *
 * @author Medac
 */
public class Email {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file =new File("frase.txt");
        File file1 =new File("palabra.txt");
        String [][] matriz=new String[100][2];
       
        String frase;
        String palabra=" ";
        String []array;
  
        int i=0;
     
        try{ 
        FileReader fileReader=new FileReader(file);  
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String[]array=palabra.split(" ");
         frase=bufferedReader.readLine();
         System.out.println(frase);
    }catch(IOException e){
        System.out.println("Error de lectura");
    }
     try{
          FileReader fileReader1=new FileReader(file1);  
          BufferedReader bufferedReader1=new BufferedReader(fileReader1);
         while(palabra!=null){
            array=palabra.split(";");
            matriz[i][0]=array[0];
            matriz[i][1]=array[1];
            i++;
            palabra=bufferedReader1.readLine();
             System.out.println(palabra);
           bufferedReader1.close();
           
         }
     }catch(IOException e1){
         System.out.println("Error de archivo");
         
         
     }
 }
} 
