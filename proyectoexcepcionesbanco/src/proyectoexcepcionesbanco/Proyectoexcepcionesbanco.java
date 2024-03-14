/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoexcepcionesbanco;

/**
 *
 * @author Medac
 */
public class Proyectoexcepcionesbanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta c;
        String []valores={"50","2500","100"};
        
        try{
            c=new Cuenta("Antonio",25,1000.00);
            System.out.println(c);
            procesarMovimiento(c,valores);
            System.out.println(c);
        }
        catch(SaldoInsuficienteException e1){
            System.out.println(e1.getMessage());
        }
        catch(NumberFormatException e3){
            System.out.println(e3.getMessage());
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
 public static void procesarMovimiento(Cuenta c,String[]valores)throws SaldoInsuficienteException{
     for(int i=0;i<valores.length;i++){
         c.movimiento(Double.parseDouble(valores[i]));
     }
 }
    
}
