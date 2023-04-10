/*
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales 
 * (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).

 */
package ejercicioextra2guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class EjercicioExtra2Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
         Random randon = new Random();

        int n;

        System.out.print("Ingrese el tamaño del vector: ");
        n = leer.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        for (int i = 0; i < n; i++) {
            vector1[i] = randon.nextInt(10);
        }
        for (int i = 0; i < n; i++) {
            vector2[i] = randon.nextInt(10);
        }
        boolean iguales = true;
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" " + vector1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + vector2[i] + " ");
        }    
        System.out.println("");
        if (iguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }
    }
    
}
