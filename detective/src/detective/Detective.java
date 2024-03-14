/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package detective;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Detective {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner sc=new Scanner(System.in);
      
      Persona mayordomo=new Persona("Mayordomo","Entrada");
      Persona amadellaves=new Persona("Ama de llaves","Dormitorio");
      Persona jardinero=new Persona("Jardinero","Jardin");
      Persona cocinero=new Persona("Cocinero","Cocinero");
      Persona propietario=new Persona("Propietario","Salon");
      Persona esposapropietario=new Persona("Esposa propietario","Baño");
      Persona []personajes= {mayordomo,amadellaves,jardinero,cocinero,propietario,esposapropietario};
     
      int opcion;
      int turno=3;
      boolean ganar=false;
      int randomAsesino=(int)(Math.random()*6);
      personajes[randomAsesino].setAsesino(true);
      do{
      System.out.println("Bienvenido 1.Dime asesino 2.Hablar con un personaje 3.salir ");
      opcion=sc.nextInt();
      
      switch(opcion){
          case 1:
              System.out.println("Introduce un asesino");
               String nombre_asesino=sc.next();
                    if(nombre_asesino.equalsIgnoreCase(personajes[randomAsesino].getNombre())){
                        System.out.println("Has ganado");
                        turno=0;
                        ganar=true;
                    }else{
                        System.out.println("Has perdido");
                        turno=0;
                        ganar=false;
                    }
               
               break;
          case 2:
              System.out.println("Con quién quieres hablar? 1.Mayordomo 2.Ama de llaves 3.Jardinero 4.Cocinero 5.Propietario 6.Esposa propietario");
            opcion=sc.nextInt();
            personajes[opcion].dondeEstaban();
            break;
          case 3:
           System.out.println("Fin de juego");
           break;
            }
      
       }while(turno>0);
     }
}
    

