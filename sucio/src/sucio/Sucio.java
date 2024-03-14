/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sucio;

/**
 *
 * @author Medac
 */
public class Sucio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        public class Ejercicio43161123Parking {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Coche [][] parking = new Coche[5][5];
        
        do {            
            
            System.out.println("1. insertar coche, 2. ver todos los coches, 3. buscar x matricula, 4. sacar coche, 5. salir");
            int opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Matricula: ");
                    String matricula = sc.next();
                    System.out.println("Modelo: ");
                    String modelo = sc.next();
                    
                    Coche c = new Coche(matricula, modelo);
                    int plazasDisponibles = 0;
                    for (int fila = 0; fila < parking.length; fila++) {
                        for (int columna = 0; columna < parking[fila].length; columna++) {
                            if(parking[fila][columna] == null){
                                plazasDisponibles++;
                                System.out.println("Posiciones: ");
                                System.out.println("Fila: " + fila + " columna: " + columna);
                            }
                        }
                    }
                    System.out.println("Plazas disponibles: " + plazasDisponibles);
                    
                    System.out.println("Donde quiere aparcar?");
                    System.out.println("PosX");
                    int posX = sc.nextInt();
                    System.out.println("PosY");
                    int posY = sc.nextInt();
                    
                    System.out.println("Ok, aparcado en: " + posX + " " + posY);
                    parking[posX][posY] = c;
                    break;
                case 2:
                    
                    for (int fila = 0; fila < parking.length; fila++) {
                        for (int columna = 0; columna < parking[fila].length; columna++) {
                            if(parking[fila][columna] != null){
                                System.out.println("fila: " + fila + " col: " + columna  + " = "+parking[fila][columna]);
                            }
                        }
                    }
                    
                    
                    
                    
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    System.out.println("El numero no esta entre el 1 - 5");
            }
            
        } while (true);
        
        
    }
    
}





public class Coche {
    
    // Atributos
    private String matricula;
    private String modelo;
    
    // Constructores
    
    public Coche(String matricula, String modelo){
        this.matricula = matricula;
        this.modelo = modelo;
    }
    
    
    //Metodos

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", modelo=" + modelo + '}';
    }
    
    
    
    
    
    
    
    
}


—-----------------------------------------------------------------------------------------------------------------------

package spinasantiago.practica.pkg4;
import java.util.Scanner;

public class SpinaSantiagoPractica4 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Tablero
        Vehiculo [][] tablero = new Vehiculo [3][10];
        
        //Introducimos los vehiculos
        Camion camion = new Camion();
        tablero[0][0] = camion;
        Moto moto = new Moto();
        tablero[1][0] = moto;
        Coche coche = new Coche();
        tablero[2][0] = coche;

        
        
        //Cartas objetivo
        String [] cartasObjetivo = {"Camión primero y Moto segundo", "Camión segundo y coche primero", "Camión tercero y moto primero"};
       
        
        //Mazo de cartas (de avanzar y retroceder)
        Carta [] mazo = new Carta [10];
        
        //Bucle para crear 5 cartas de avanzar y 5 de retroceder
        for (int i = 0; i < mazo.length; i++) {
            if(i < 5){
                mazo[i] = new Carta("Avanzar", 0);
            }
            else{
                mazo[i] = new Carta("Retroceder", 1);
            }
        }        
        
        
        //Mostramos el objetivo
        System.out.println("Carta objetivo: ");
       
        //Damos una carta objetivo a cada jugador de forma random
        for (int i = 0; i < 3; i++) {
            int randomObjetivo = (int) (Math.random()*3);
            System.out.println("El objetivo del "+ tablero[i][0].getNombre() + " es " + cartasObjetivo[randomObjetivo]);
        }
        
        
        System.out.println("");
        
        //Mostramos el tablero
        mostrarTablero(tablero);
        
        //Cada vehiculo agarra una carta
        
        do {            
            
            
            for (int i = 0; i < tablero.length; i++) {
                
                //Esto es simplemente que muestre un sout distinto segun el turno en el que va
                switch (i) {
                    case 0:
                        System.out.println("Camion coge carta");
                        break;
                    case 1:
                        System.out.println("Moto coge carta");
                        break;
                    default:
                        System.out.println("Coche coge carta");
                        break;
                }
                
                int cartaRandom = (int) (Math.random()*10);

                System.out.println("Salió una carta de: " + mazo[cartaRandom].getNombre());

                System.out.println("Con quien usas la carta?");
                System.out.println("1.Camion, 2.Moto, 3. Coche");
                int eleccion = sc.nextInt();

                switch (eleccion) {
                    case 1:
                        if(mazo[cartaRandom].getEstado() %2==0){
                            tablero[0][camion.getPosX()] = null;
                                camion.avanzar();
                        }
                        else{
                                tablero[0][camion.getPosX()] = null;
                                camion.retroceder();
                        }
                        actualizarTablero(tablero, camion);
                        break;
                    case 2:
                        if(mazo[cartaRandom].getEstado() %2==0){
                            tablero[1][moto.getPosX()] = null;
                                moto.avanzar();
                        }
                        else{
                                tablero[1][moto.getPosX()] = null;
                                moto.retroceder();
                        }
                        actualizarTablero(tablero, moto);
                        break;
                    case 3:
                        if(mazo[cartaRandom].getEstado() %2==0){
                            tablero[2][coche.getPosX()] = null;
                                coche.avanzar();
                        }
                        else{
                                tablero[2][coche.getPosX()] = null;
                                coche.retroceder();
                        }
                        actualizarTablero(tablero, coche);
                        
                        break;
                    default:
                        System.out.println("El numero no esta entre el 1 y el 3");
                }
            }            
            //Mostramos el tablero
            mostrarTablero(tablero);
            
            
            
            
        } while (!algunoGano(tablero));
        
        
        
        
        
        
    }

    public static void mostrarTablero(Vehiculo[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < 10; j++) {
                if(tablero[i][j] != null){
                    System.out.print(tablero[i][j].getNombre());
                }
                else{
                    System.out.print("_");
                }
            }
            System.out.println("");
        }
    }

    public static void actualizarTablero(Vehiculo[][] tablero, Vehiculo vehiculo) {
        tablero[vehiculo.getPosY()][vehiculo.getPosX()] = vehiculo;
    }

    public static boolean algunoGano(Vehiculo[][] tablero) {
        if((tablero[0][9] == null) && (tablero[1][9] == null) && (tablero[2][9] == null)){
            return false;
        }
        else{
            System.out.println("Alguien llego a la meta");
            
            return true;
            
        }
    }

    
}
—------------------------------------------------------------------------------------------------------------------

public class Carta {
    //Atributos
    private String nombre;
    private int estado;
    
    //Constructor

    public Carta(String nombre, int estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Carta{" + "nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
}
—---------------------------------------------------------------------------------------------------------------
public class Coche extends Vehiculo {

    //Constructor
    public Coche(){
        posX = 0;
        posY = 2;
        nombre = "Coche";
    }
    
    //Metodos
    @Override
    public void avanzar() {
        posX += 3;
        if(posX>9){
            posX = 9;
        }
    }

    @Override
    public void retroceder() {
        if(posX - 3 < 0){
            posX =0;
        }
        else{
            posX -= 3;
        }
        
        
    }

    @Override
    public String toString() {
        return "Coche" ;
    }
    
    
    
    
}
public class Estudiante extends Persona{
    int notafinal;
    float codigo;
    public Estudiante(String nombre, String apellido, int edad,int notafinal, float codigo) {
        super(nombre, apellido, edad);
        this.notafinal=notafinal;
        this.codigo=codigo;
    }
 public void mostrardatos(){
     System.out.println("El nombre es: "+ getNombre());
          System.out.println("El apellido es: "+ getApellido());
               System.out.println("El edad es: "+ getEdad());
                    System.out.println("La nota final es: "+ notafinal);
                       System.out.println("El codigo es: "+ codigo);
 }   
}


public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Estudiante estudiante= new Estudiante("Ting","WU",20,10,1);
       estudiante.mostrardatos();
    }
    
}

    }
    
}
