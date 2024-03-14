/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioswitch2;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ejercicioswitch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int dia;
        System.out.println("¿Qué dia es hoy?  ");
        dia=sc.nextInt();
        switch(dia){
            case 1:
                System.out.println("Hoy es Lunes ");
            break;
            case 2:
                System.out.println("Hoy es Martes ");
            break;
            case 3:
                System.out.println("Hoy es Miércoles ");
            break;
            case 4:
                System.out.println("Hoy es Jueves ");
            break;
            case 5:
                System.out.println("Hoy es Viernes ");
            break;
            case 6:
                System.out.println("Hoy es Sábado ");
            break;
            case 7:
                System.out.println("Hoy es Domingo ");
            break;
            default:
                System.out.println("No ha introducido bien el número ");
        }
    }
    
}
