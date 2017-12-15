/*
 *  @author David León
 */
package ejerciciosjava;

import java.util.Scanner;

public class EjerciciosJava {
    public static void main(String[] args) {
    
        Scanner n = new Scanner(System.in);
       int[] array = new int[10];
       int [] aux = new int[10];
       
       for (int i = 0; i < 10; i++) {
           array[i] = (int)(Math.random()*100);
           System.out.print(array[i] + "     ");
       }
       
       for (int i = 1; i < 10; i++) {
           aux[i] = array[i - 1];
       }
       
       System.out.println();
       System.out.println();
       
       aux[0] = array[9];
       
       for (int i = 0; i < 10; i++) {
           System.out.print(aux[i] + "     ");
       }       
    }    
}
