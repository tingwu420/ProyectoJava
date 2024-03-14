/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacroexamen;

/**
 *
 * @author Medac
 */
public abstract class Jugador {
   //Atributo
protected int vida;
protected int ataque;
protected boolean vivo;
int size;

protected Carta[]cartas;
//Constructor
public Jugador(){
    vivo=true;
    cartas=new Carta[100];
}

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }
    

    public Carta[] getCartas() {
        return cartas;
    }

public void robarCarta(Carta carta){
 
        if(cartas[size]==carta){          
            size++;
        }
    
           
}
public void verCarta(){
    for(int i=0;i<cartas.length;i++){
         if(cartas[i]!=null){
        System.out.println(cartas[i].toString());
         }
    }
   
}
public void usarCarta(int pos){
    vida=vida+cartas[pos].getVida();
    ataque=ataque+cartas[pos].getVida();
}

    @Override
    public String toString() {
        return "Jugador{" + "vida=" + vida + ", ataque=" + ataque + ", vivo=" + vivo + ", cartas=" + cartas + '}';
    }

}
