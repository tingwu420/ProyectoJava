/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.java;

/**
 *
 * @author Medac
 */
public class EjemploJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //Caluclo de farenge
        float f ;
       float grado=40;
       f= grado * 9/5 + 32;
       System.out.println(f);
       
       //Char 
       char letra='a';
       char letra2='b';
       System.out.println("la letra es: "+letra);
       System.out.println(letra- letra2);
       
       //Datos booleano
       boolean respuesta1 =true;
       System.out.println(respuesta1);
       
       boolean booleano1=true,booleano2=false;
       boolean resultado;
       resultado = booleano1 && booleano2;
       System.out.println(resultado);
       resultado= booleano1 | booleano2;
       System.out.println(resultado);
       resultado=!booleano1;
       System.out.println(resultado);
       resultado=!booleano2;
       System.out.println(resultado);
       
       //Operadores relacionales
       int num1=5;
       int num2=8;
       System.out.println("¿es igual?" + (num1== num2));
       
       char letra1='s';
       char letra3='c';
       System.out.println("¿es igual?"+ (letra1 == letra3));
       
       //Resto de operaciones
       Math.sqrt(25);
       System.out.println(Math.sqrt(25));
       
       //Casting como double es mas grando tenemos que poner otro tipo de variable entre parentesis
       double num=8.3;
       int resul= (int)num;
       System.out.println(resul);
       
       int n=8;
       double resul1=n;
       System.out.println(resul1);
       
       char let='a';
       int resul2=let;
       System.out.println(resul2);
       
       int n1=20;
       char resul3=(char)n1;
       System.out.println(resul3);
  
       /*fwemwkefmkfmwemfwkemfkwe*/
       
       //par impar//
       
       int numero;
       System.out.println("Introduce un numero entero: ");
       numero=sc.nextInt();
       
    }
    
    
}