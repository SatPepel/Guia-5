/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
 * y le pida al usuario un número a buscar en el vector. 
 * El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 */
package ejercicio2guia5;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Ejercicio2Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        
        int[] vector = new int[N];
        
        for (int i = 0; i < vector.length; i++) {
           vector[i] = (int)(Math.random()*20);
           
        }
        for (int i = 0; i <vector.length; i++) {
            System.out.print("[" + vector[i]+ "]");
        }
        
        System.out.println("Ingrese el numero a buscar");
        int num = leer.nextInt();
        int cont = 0;
        int aux = 0;
        
        
        for (int i = 0; i <vector.length; i++) {
            if(vector[i] == num){
                cont += cont;
                aux = i;
                System.out.println("La posicion del numero es: " + aux);
            }
        }   
    }
    
}
