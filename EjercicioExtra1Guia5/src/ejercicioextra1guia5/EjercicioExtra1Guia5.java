/*
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
 * con los valores ingresados por el usuario.

 */
package ejercicioextra1guia5;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class EjercicioExtra1Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int aux;
        aux =0;
        Scanner leerN = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leerN.nextInt();
        int[] vec1 = new int[n];
        
        
        System.out.println("  ");
        
        for (int i = 0; i < vec1.length; i++)
        {
            System.out.print("Ingrese elementos al vector: " +"["+ i + "]");
            vec1[i]= leerN.nextInt();
        }
        for (int i = 0; i < vec1.length; i++)
        {
            aux +=vec1[i];
        }
        System.out.println("La suma de todos los elementos del vector es: " + aux);
    }
    
}
