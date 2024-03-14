/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectohotel;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class ProyectoHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        HotelBoom b=new HotelBoom();
        HotelChinatown c=new HotelChinatown();
        HotelPresident p=new HotelPresident();
        HotelWaikiki w=new HotelWaikiki();
        HotelFontaine f=new HotelFontaine();
        HotelBlue blue=new HotelBlue();
        
        Hotel[]array={b,c,p,w,f,blue};
        
        System.out.println("********COMIENZA EL JUEGO : EL COMPLEJO HOTELERO  NO TAN COMPLEJO********");
        System.out.println("                          Ó");
        System.out.println("************QUE LA AVARICIA NO ROMPA EL SACO************");
        System.out.println("Nombre del jugador:");
        Jugador j=new Jugador(sc.next());
        
        int turno =12;
        int opcion;
        int dado,dado2;
       
       do{
            dado=(int)(Math.random()*6);
             if(array[dado].Comprado()){
                 j.setDinero(j.getDinero()-500000);
             }else{
                 System.out.println("1.JUGAR  2.PASAR");
                 opcion=sc.nextInt();
                 if(opcion==1){
                     dado2=(int)(Math.random()*4);
                     
                     switch(dado2){
                         case 0:
                             j.setDinero(j.getDinero()-array[dado].getPrecio());
                             break;
                         case 1:
                             
                             break;
                         case 2:
                             
                             break;
                         case 3:
                             
                             break;
                             
                     }
                 }
             }
       
        
        }while();
        
        do{
            
            System.out.println("1.HOTEL BOOM  2.HOTEL CHINATOWN  3.HOTEL PRESIDENT  4.HOTEL WAIKIKI  5.HOTEL FONTAINE  6.HOTEL BLUE");
            opcion=sc.nextInt();
        }while();
        
   }
    
}
