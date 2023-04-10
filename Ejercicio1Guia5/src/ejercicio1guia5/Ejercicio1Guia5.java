/*
 * Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
 * y los muestre por pantalla en orden descendente.

 */
package ejercicio1guia5;

/**
 *
 * @author jose
 */
public class Ejercicio1Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vectoR1[]=new int[100];
       
        for (int i = 0; i < vectoR1.length; i++){
            vectoR1[i]= i+1;
        }
        for (int i = vectoR1.length-1; i>=0 ; i--){
            System.out.println("["+vectoR1[i]+"]");
        }
        
    }

}
