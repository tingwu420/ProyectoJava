/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casino;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Casino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        Jugador[] arrayjudador=new Jugador[100];
        int i=0;
     int opcion;
     do{
         
         System.out.println("Bienvenido 1.Crear persona 2.Mostrar persona 3.Buscar dni  ");
           opcion=sc.nextInt();
         
          switch(opcion){
              case 1 ://Crear persona
                  System.out.println("Introducir nombre");
                  String nombre=sc.next();
                  System.out.println("Introducir dni");
                  String dni=sc.next();
                  Jugador j1=new Jugador(nombre,dni);
                 arrayjugador[i]=j1;
                  i++;
                  break;
              case 2://Mostrar
                  for(int a=0;a<i;a++){
                      System.out.println(arrayjugador[a]);
                  }
                    break;
                    
              case 3://Buscar Dni
                  System.out.println("Introduce un dni: ");
                  String dniIntroducido=sc.next();
                  for(int a=0;a<i;a++){
                     if(dniIntroducido.equals(arrayjugador[a].getdni())){
                        System.out.println("la persona con dni "+dniIntroducido+ " es "+arrayjugador[a]);
                      }
                  }
                  break;
              case 4://Buscar nombre
                        System.out.println("Introduce un nombre: ");
                  String nombreIntroducido=sc.next();
                  for(int a=0;a<i;a++){
                     if(nombreIntroducido.equals(arrayjugador[a].getnombre())){
                        System.out.println("la persona con dni "+nombreIntroducido+ " es "+arrayjugador[a]);
                      }
                  }
         
            
     }while(opcion!=5);
    
    
  }
}

        
    
    

