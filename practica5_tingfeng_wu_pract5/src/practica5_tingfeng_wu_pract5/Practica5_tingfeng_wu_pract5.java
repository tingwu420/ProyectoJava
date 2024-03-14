/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5_tingfeng_wu_pract5;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Practica5_tingfeng_wu_pract5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Paciente[]paciente=new Paciente[10];
        String[]array=new String[10];
        int n;
        int cont=0;
        int id=0;
        System.out.println("Bienvenido a la empresa DAMDental");
        do{
        System.out.println("1.Crear paciente 2.Ver pacientes 3.Sondaje 4.Salir");
        n=sc.nextInt();
        
         switch(n){
             case 1:
                 System.out.println("Introduce nombre");
                 String nombre=sc.next();
                 System.out.println("Introduce apellido");
                 String apellido=sc.next();
                 System.out.println("Introduce edad");
                 int edad=sc.nextInt();
                 
                 try{
                     File file=new File("pacientes.txt");
                     FileWriter fileWriter=new FileWriter(file,true);
                     BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

                      bufferedWriter.write(nombre+"");
                      bufferedWriter.write(apellido+"");
                      bufferedWriter.write(edad+"");
                      paciente[cont]=new Paciente((array[0]),(array[1]),Integer.parseInt(array[2]));
                      
                 }catch(IOException e){
                     System.out.println("Error ");
                 }catch(Exception e){
                     System.out.println(e);
                 }

                 break;
             case 2:
               String frase;
                String frase2=" ";
                 try{
                 File file2=new File("pacientes.txt");
                 FileReader fileReader=new FileReader(file2);  
                 BufferedReader bufferedReader=new BufferedReader(fileReader);
                  frase=bufferedReader.readLine();
                while(frase!=null){
                  frase2= frase2 +frase+'\n';
             frase=bufferedReader.readLine();
     
               }
            System.out.println(frase2); 
                bufferedReader.close();
                }catch(IOException e1){
                    System.out.println("Error de lectura");
                }
                 break;
             case 3:
                 int num1;
         
                 boolean comentartodo=false;
                try{
                 File sondaje=new File("sondaje.txt");
                  FileReader fileReaderSondaje=new FileReader(sondaje);  
                  BufferedReader bufferedReaderSondaje=new BufferedReader(fileReaderSondaje);
                  
//                  while(num1!=null){
//                     if(!num1.contains("+")&&(!comentartodo)){
//                    System.out.println(num1);
//                    }else if(num1.contains("+")){
//                      comentartodo=true;
//                     }else {
//                      comentartodo=false;
//              }
//             }
//            num1=bufferedReaderSondaje.readLine();
//                  
                }catch(IOException e2){
                 System.out.println("No se puede leer");
             }
                 break;
         }
        
        
        }while(n!=4);
    }
    
}
