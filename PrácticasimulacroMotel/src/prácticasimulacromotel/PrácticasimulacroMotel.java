/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prácticasimulacromotel;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class PrácticasimulacroMotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc=new Scanner(System.in);
          
          Huesped[]arrayhuesped= new Huesped[20];
          
          int n;
          int j=0;
          boolean jugar=true;
          System.out.println("Bienvenido");
   do{
   System.out.println("1.Insertar huesped ,2. nºhabitaciones libre 3.Calcula precio por nombre del huesped 4.Elimina huesped por nombre 5.Buscar huesped por nombre 6.Buscar huesped por nºhabitaciones 7.Salir");
    n=sc.nextInt();
   
    switch(n){
        case 1:
          if(estalleno(arrayhuesped)){
            System.out.println("Esta lleno");
          }
          else{
             System.out.println("Introduce tu nombre");
            String nombre=sc.next();
            System.out.println("Introduce tu nº noches");
            int n_noches=sc.nextInt();
            Huesped h=new Huesped(nombre,n_noches);
              
            
            for(int i=0;i<arrayhuesped.length;i++){
                  if(arrayhuesped[i]==null){
                     arrayhuesped[i]=new Huesped(nombre,n_noches);
                      i=arrayhuesped.length;
                  }
                  
              }
          }
         
            
            break;
        case 2:
            
            for(int a=0;a<j;a++){
                 if(arrayhuesped[a]==null){
                      System.out.println("No hay habitaciones libre ");
                  }
            else{
                  
                  System.out.println("Nº de habitaciones libre: ");
                 }
         
                 }
            
            break;
        case 3:
            break;
        case 4:
            break;
        case 5:
            break;
            
        case 6:
            break;
        case 7:
            System.out.println("Adiós");
            jugar=false;
            break;
    }
   
   
   
   
   
   }while(jugar);

}

 public static boolean estalleno(Huesped[]arrayhuesped) {
        int cont=0;
        boolean respuesta=false;
        for(int i=0;i<arrayhuesped.length;i++){
            if(arrayhuesped[i]==null){
                cont++;
            }
        } 
        if(cont==0){
            respuesta=true;
        }
        return respuesta;
    }
}
