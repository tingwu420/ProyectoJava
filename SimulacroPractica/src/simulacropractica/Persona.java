/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacropractica;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public  class Persona {
      Scanner sc= new Scanner(System.in);
    //Atributos
    protected String nombre;
    protected double []nota;
    boolean suspenso=false;

public Persona(String nombre){
    this.nombre=nombre;
    nota=new double[6];
    
}
public String getNombre(){
    return nombre;
}
public String setNombre(){
    return nombre;
}
public double[] getNotas(){
    return nota;
}
public double[] setNotas(){
    return nota;
}

public void setSuspenso(boolean suspenso) {
        this.suspenso = suspenso;
    }

public boolean isSuspenso() {
        return suspenso;
    }
public void insertarNotas(){
    String[]nombre={"PROG","LLMM","BBDD","ENTORNO","SIST","FOL"};
    for(int i=0;i<nota.length;i++){
        System.out.println("¿Cual es la nota de "+nombre[i]);
        nota[i]=sc.nextDouble();
    }
 }

public void estaAprobado(){
    for(int i=0;i<nota.length;i++){
        if(nota[i]<5){
            suspenso=true;
        }
    }
  if(suspenso==true){
    
  }
}
@Override
public String toString(){
   String respuesta=" ";
    for(int i=0;i<nota.length;i++){
      respuesta=respuesta+nota[i]+"||";  
    }
   return nombre+respuesta;
}
}
