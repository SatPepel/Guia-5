/*
 * Realice un programa que compruebe si una matriz dada es antisimétrica. 
 * Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
 * pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

 */
package ejercicio5guia5;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Ejercicio5Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        int n1, n2;
        System.out.println("Ingrese la cantidad de fila y coumnas de la matriz");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        boolean antisimetrica = true;
        int matriz1 [][] = new int[n1][n2];
        int matriz2[][] = new int[n1][n2];
        
        
        System.out.println(" Ingrese los valores para la matriz ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                
                matriz1[i][j]= leer.nextInt();
                matriz2[i][j] = -matriz1[i][j];
            } 
            System.out.println("");
           
        }
        System.out.println("Matriz Original");
        for (int i = 0; i <matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(" "+matriz1[i][j]+ " ");
                
            }
            System.out.println("");
        }
        System.out.println("------------ ");
        System.out.println("Matriz Traspuesta");
        for (int j = 0; j < matriz1.length; j++) {
            for (int i = 0; i < matriz1.length; i++){
                System.out.print(" "+matriz1[i][j]+ " ");
            }
            System.out.println("");
        }
        int i=0,j;
        
        while(i<matriz1.length && antisimetrica){
            j=0;
            while(j<matriz1.length && antisimetrica){
                if(matriz2[i][j]!=matriz1[j][i])
                   antisimetrica = false;
                j++;
            }
            i++; 
        }
        if(antisimetrica)
            System.out.println("Es antisimetrica");
        else 
            System.out.println("No es antisimetrica");
}
    
    
}
