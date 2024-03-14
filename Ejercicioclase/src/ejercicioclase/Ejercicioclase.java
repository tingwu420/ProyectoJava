/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ejercicioclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc=new Scanner(System.in);
       Persona [] arraypersonas= new Persona[100];
     int i=0;
     int opcion;
     do{
         
         System.out.println("Bienvenido 1.Crear persona 2.Mostrar persona 3.Buscar dni 4.Buscar nombre 5.Salir ");
           opcion=sc.nextInt();
         
          switch(opcion){
              case 1 ://Crear persona
                  System.out.println("Introducir nombre");
                  String nombre=sc.next();
                  System.out.println("Introducir dni");
                  String dni=sc.next();
                  Persona p1=new Persona(nombre,dni);
                 arraypersonas[i]=p1;
                  i++;
                  break;
              case 2://Mostrar
                  for(int a=0;a<i;a++){
                      System.out.println(arraypersonas[a]);
                  }
                    break;
                    
              case 3://Buscar Dni
                  System.out.println("Introduce un dni: ");
                  String dniIntroducido=sc.next();
                  for(int a=0;a<i;a++){
                     if(dniIntroducido.equals(arraypersonas[a].getdni())){
                        System.out.println("la persona con dni "+dniIntroducido+ " es "+arraypersonas[a]);
                      }
                  }
                  break;
              case 4://Buscar nombre
                        System.out.println("Introduce un nombre: ");
                  String nombreIntroducido=sc.next();
                  for(int a=0;a<i;a++){
                     if(nombreIntroducido.equals(arraypersonas[a].getnombre())){
                        System.out.println("la persona con dni "+nombreIntroducido+ " es "+arraypersonas[a]);
                      }
                  }
              case 5:
                 System.out.println("Adiós");
                
                  break;
            }
            
     }while(opcion!=5);
    
    
  }
}


