/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioswitch3;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ejercicioswitch3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc=new Scanner(System.in);
        char dia;
        System.out.println("¿Qué dia es hoy?  ");
        dia=sc.next().charAt(0);
        switch(dia){
            case 'l':
                System.out.println("Hoy es Lunes ");
            break;
            case 'm':
                System.out.println("Hoy es Martes ");
            break;
            case 'x':
                System.out.println("Hoy es Miércoles ");
            break;
            case 'j':
                System.out.println("Hoy es Jueves ");
            break;
            case 'v':
                System.out.println("Hoy es Viernes ");
            break;
            case 's':
                System.out.println("Hoy es Sábado ");
            break;
            case 'd':
                System.out.println("Hoy es Domingo ");
            break;
            default:
                System.out.println("No ha introducido bien el número ");
        }
    
    }
    
}
