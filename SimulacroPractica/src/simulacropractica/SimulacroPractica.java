/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacropractica;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class SimulacroPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc= new Scanner(System.in);
      int res;
      int pos=0;
    
      //Guardar datos
      Persona[]alumnes=new Persona[100];
      do{
        System.out.println("1.Insertar alumnos/as 2.Mostrar alumnos 3.Mostrar alumnas 4.Mostrar suspensos 5.Mostrar suspensos entre alumnos y alumnas 6.Salir");
      res=sc.nextInt();
      switch(res){
          case 1:
              System.out.println("1.Alumno 2.Alumna");
              res=sc.nextInt();
              System.out.println("Di el nombre");
              if(res==1){
                  alumnes[pos]=new Alumnos(sc.next());
                  alumnes[pos].insertarNotas();
              }else{
                  alumnes[pos]=new Alumnas(sc.next());
                  alumnes[pos].insertarNotas();
              }
              pos++;
          break;
          case 2:
          for(int i=0;i<alumnes.length;i++){
              //Que tipo de clase pertenece ese objeto alumno o alumna instanceof
              if(alumnes[i]instanceof Alumnos){
                  System.out.println(alumnes[i]);
              }
          }
          break;
          case 3:
            for(int i=0;i<alumnes.length;i++){
              if(alumnes[i]instanceof Alumnas){
                  System.out.println(alumnes[i]);
              }
          }
          break;
          case 4:
              System.out.println("1.Alumno 2.Alumna");
              res=sc.nextInt();
              
              for(int i=0;i<pos;i++){
                alumnes[i].estaAprobado();
                  if(res==1){   
                  if(alumnes[i]instanceof Alumnos && alumnes[i].isSuspenso()){
                      System.out.println(alumnes[i]);
                  }
               }else{
                if(alumnes[i]instanceof Alumnas && alumnes[i].isSuspenso()){
                      System.out.println(alumnes[i]);
                 }
               }
              }
          break;
          case 5:
             int contMas=0;
             int contFem=0;
              for(int i=0;i<pos;i++){
                 if(alumnes[i].isSuspenso() && alumnes[i] instanceof Alumnos){
                     contMas++;
                 }else if(alumnes[i].isSuspenso() && alumnes[i] instanceof Alumnas){
                     contFem++;
                 } 
              }
              System.out.println("Alumnos chicos "+contMas/pos + " Alumnos chicas "+contFem/pos);
          break;
          case 6:
          
          break;
      }
       }while(res !=6);
    }
    
}
      