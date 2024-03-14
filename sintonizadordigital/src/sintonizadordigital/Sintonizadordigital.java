/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sintonizadordigital;

/**
 *
 * @author Medac
 */
public class Sintonizadordigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SintonizadorFm fm=new SintonizadorFm();
        SintonizadorFm fm1=new SintonizadorFm(107);
        
       fm.Subir();
       fm.Subir();
       fm.Bajar();
       fm.Display();
       fm1.Bajar();
       fm1.Bajar();
       fm1.Subir();
       fm1.Display();
    }
    
}
