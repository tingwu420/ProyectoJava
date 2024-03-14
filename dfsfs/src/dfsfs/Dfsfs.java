/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dfsfs;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class Dfsfs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc=new Scanner(System.in);
    
    boolean salir=false,aux=false;
    char letra;
    int aciertos=5,cont;
    do{
    cont=0;    
    System.out.println("El juego tiene cinco intentos");
    System.out.println("introduce el tamaño del array");
    int size=sc.nextInt();    
    char [] palabraInicial=new char [size];
    char [] palabraJugada=new char [size];
    Arrays.fill(palabraJugada, '_');
    for (int i=0;i<palabraInicial.length;i++){
        System.out.println("introduce las letras");
        palabraInicial[i]=sc.next().charAt(0);
       
    System.out.print("\\ss");
  
    }
       
    do{
    aux=false;  
    
    System.out.println("introduce una letra");
    letra=sc.next().charAt(0);
  
        for (int i=0;i<palabraInicial.length;i++){
        if (letra==palabraInicial[i]){
        palabraJugada[i]=letra;   
        aux=true;
        cont++;
        }
        
        }
        if (aux){
            System.out.println("has acertado");  
            System.out.println(Arrays.toString(palabraJugada));
        }
        else{
            System.out.println("no has acertado");
           aciertos--; 
        }
       
        
    }while(!(aciertos==0||cont==size));
    if (aciertos==0){
        System.out.println("No lo has conseguido");
        
    }
    else{
        System.out.println("Enhorabuena, lo has conseguido");
    }
    System.out.println("quieres salir del juego: true o false");
    salir=sc.nextBoolean();
    }
    while(!salir);
    
    }
    
}
    


