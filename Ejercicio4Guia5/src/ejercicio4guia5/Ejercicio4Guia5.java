/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
 * y muestre la traspuesta de la matriz. 
 * La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando 
 * sus filas por columnas (o viceversa).


 */
package ejercicio4guia5;

import java.util.Random;

/**
 *
 * @author jose
 */
public class Ejercicio4Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Random aleatorio= new Random();
        int matriz [][] = new int[4][4];
        
        System.out.println("Matriz Original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = aleatorio.nextInt(10);
                System.out.print(" "+matriz[i][j]+ " ");
            } System.out.println("");
            
        }
        System.out.println("------------ ");
        System.out.println("Matriz traspuesta");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++){
                System.out.print(" "+matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    
    }
    
}
