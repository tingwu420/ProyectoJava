/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.Arrays;

/**
 *
 * @author Medac
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int[][]matriz=new int[4][4];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j]=3;
            }
        }
        for(int fila=0;fila<matriz.length;fila++){
           System.out.println(Arrays.toString(matriz[fila]));
        }
    


//        char [][]matriz=new char[3][4];
//        mostrar(matriz);  
//    
//    }
//public static void mostrar(char [][]matriz){
//    for(int i=0;i<matriz.length;i++){
//        for(int j=0;j<matriz[0].length;j++){
//                matriz[i][j]='x';
//     }
//        System.out.println(Arrays.toString(matriz[i]));
// }
//}



//       char[][]matriz=new char[10][10];
//        for(int i=0;i<matriz.length;i++){
//            for(int j=0;j<matriz[0].length;j++){
//               matriz[i][j]='A';
//            }
//        }
//        for(int i=0;i<matriz.length;i++){
//           System.out.println(Arrays.toString(matriz[i]));
//        }
//    
//    }
}
}