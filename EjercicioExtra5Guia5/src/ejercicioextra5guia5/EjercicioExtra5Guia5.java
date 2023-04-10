/*
 * Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios 
 * y muestre la suma de sus elementos.
 */
package ejercicioextra5guia5;

import java.util.Random;

/**
 *
 * @author jose
 */
public class EjercicioExtra5Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Random randon = new Random();
        int suma = 0;
        int n = 3;
        int m = 4;

        int[][] matriz1 = new int[n][m];

        rellenarMatriz(matriz1);

        imprimirMatriz(matriz1, suma);
        
        

    }   
    private static void imprimirMatriz(int matriz1[][], int suma) {
       System.out.println("Matriz : ");
       for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[i][j] + " ");
                suma += matriz1[i][j];              
            }System.out.println("");
        }
       System.out.println("La Suma de todos los valores es :" + suma);
    }

    private static void rellenarMatriz(int matriz1[][]) {
           Random randon = new Random();
         for (int i = 0; i < matriz1.length; i++){
                for (int j = 0; j < matriz1.length; j++) {
                    matriz1[i][j] = randon.nextInt(10);
            }
         }
    }
    
}
