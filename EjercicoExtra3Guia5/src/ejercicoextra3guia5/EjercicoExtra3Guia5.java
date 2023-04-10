/*
 * Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
 * Después haremos otra función o procedimiento que imprima el vector.
 */
package ejercicoextra3guia5;

import java.util.Random;

/**
 *
 * @author jose
 */
public class EjercicoExtra3Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n = 5;
        int[] vector = new int[n];
        // Llamamos a la función rellenarVector para rellenar el vector con números aleatorios
        rellenarVector(vector);
        // Llamamos a la función imprimirVector para imprimir el vector
        imprimirVector(vector);
    }
    public static void rellenarVector(int vector[]) {
        Random randon = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = randon.nextInt(10);
        }
    }
    public static void imprimirVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    
}
