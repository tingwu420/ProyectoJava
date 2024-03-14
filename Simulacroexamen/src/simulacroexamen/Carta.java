/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacroexamen;

/**
 *
 * @author Medac
 */
public class Carta {
    int vida;
    int ataque;
   
public Carta(int vida,int ataque){
    this.vida=vida;
    this.ataque=ataque;
}
public int getVida(){
    return vida;
}
public int setVida(){
    return vida;
}
public int getAtaque(){
    return ataque;
}
public int setAtaque(){
    return ataque;
}
    @Override
    public String toString() {
        return "Carta{" + "vida=" + vida + ", ataque=" + ataque + '}';
    }

    

}
