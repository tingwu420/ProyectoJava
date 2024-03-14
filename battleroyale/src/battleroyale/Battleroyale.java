/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package battleroyale;

/**
 *
 * @author Medac
 */
public class Battleroyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jugador j1=new Jugador("Alfonso");
        Jugador j2=new Jugador("Monico");
        
        do{
         int a=(int)(Math.random()*2);
         
         if(a==0){   //jugador 1 pega jugador 2
             j1.Luchar(j2);
         }
         else{       //jugador 2 pega jugador 1
            j2.Luchar(j1);
         }
   
        System.out.println("vida del jugador 1= "+j1.getVida()+ " vida del jugador 2= "+j2.getVida());
    }while((j1.getVida()>0) && (j2.getVida()>0));
    
        if(j1.getVida()==0){
            System.out.println("Ha ganado "+ j2.getNombre()+" "+ j2.getVida());
        }else{
            System.out.println("Ha ganado "+j1.toString());
        }
    
    }
}