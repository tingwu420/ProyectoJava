/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laberinto;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Laberinto {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

Scanner sc=new Scanner(System.in);

char [][] tablero=new char[10][10];
// char [][] tableroJuego=new char [10][10];
rellenarTablero(tablero);
rellenarLaberinto(tablero);
jugar(tablero);
}
public static void rellenarTablero(char[][] tablero) {
for (int fila=0;fila<tablero.length;fila++){
for (int col=0;col<tablero[0].length;col++){
tablero[fila][col]='x';
}
}
}
public static void mostrar(char[][] tablero) {
for (int fila=0;fila<tablero.length;fila++){
for (int col=0;col<tablero[fila].length;col++){
System.out.print(tablero[fila][col]);
}
System.out.println("");
}
System.out.println("----------");
}
private static void rellenarLaberinto(char[][] tablero) {
for (int col=0;col<2;col++){
tablero[0][col]=' ';
}
for (int fila=0;fila<8;fila++){
tablero[fila][2]=' ';
}
for (int col=2;col<6;col++){
tablero[8][col]=' ';
}
for (int col=5;col<10;col++){
tablero[9][col]=' ';
}
}
private static void jugar(char[][] tablero) {
Scanner sc=new Scanner(System.in);
    char letra='o';
tablero[0][0]=letra;
int pos=0;
int posFila;
int posColumna;
boolean respuesta=true;
int fallos;
while(respuesta){
System.out.println("BIENVENIDOS AL JUEGO DEL LABERINTO");
tablero[0][0]='o';
mostrar(tablero);
fallos=0;
posFila=0;
posColumna=0;
do{
System.out.println("Indica la posicion donde moverte: 1.derecha 2.izquierda 3.arriba 4.abajo");
pos=sc.nextInt();
tablero[posFila][posColumna]=' ';
switch (pos){
case 1:
if ((posFila<0)||(posFila>9)||(posColumna+1<0)||(posColumna+1>9)){
System.out.println("no puedes moverte a esa posicion fuera del tablero");
fallos++;
}else if(tablero[posFila][posColumna+1]=='x'){
System.out.println("No puedes moverte ahi, es la pared");
fallos++;
}
else{
tablero[posFila][posColumna+1]='o';
mostrar(tablero);
posColumna=posColumna+1;
}
break;
case 2:
if ((posFila<0)||(posFila>9)||(posColumna-1<0)||(posColumna-1>9)){
System.out.println("no puedes moverte a esa posicion fuera del tablero");
fallos++;
}else if(tablero[posFila][posColumna-1]=='x'){
System.out.println("No puedes moverte ahi, es la pared");
fallos++;
}
else{
tablero[posFila][posColumna-1]='o';
mostrar(tablero);
posColumna=posColumna-1;
}
break;
case 3:
if ((posFila-1<0)||(posFila-1>9)||(posColumna<0)||(posColumna>9)){
System.out.println("no puedes moverte a esa posicion fuera del tablero");
fallos++;
}else if(tablero[posFila-1][posColumna]=='x'){
System.out.println("No puedes moverte ahi, es la pared");
fallos++;
}
else{
tablero[posFila-1][posColumna]='o';
mostrar(tablero);
posFila=posFila-1;
}
break;
case 4:
if ((posFila+1<0)||(posFila+1>9)||(posColumna<0)||(posColumna>9)){
System.out.println("no puedes moverte a esa posicion fuera del tablero");
fallos++;
}else if(tablero[posFila+1][posColumna]=='x'){
System.out.println("No puedes moverte ahi, es la pared");
fallos++;
}
else{
tablero[posFila+1][posColumna]='o';
mostrar(tablero);
posFila=posFila+1;
}
break;
default:
System.out.println("el numero introducido no es valido, vuelvelo a introducir");
break;
}
}while((fallos<3)&&!((posFila==9)&&(posColumna==9)));
if (fallos==3){
System.out.println("Has perdido");
}
else{
System.out.println("Has ganado");
}
System.out.println("Quieres jugar al juego del laberinto: true o false");
respuesta=sc.nextBoolean();
}


    }
    
}
