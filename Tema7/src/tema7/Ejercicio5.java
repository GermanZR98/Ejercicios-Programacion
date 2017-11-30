package tema7;

/**
 * Ejercicio1 Tema7
 * @author German
 */
import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  
  System.out.println("Dime 10 numeros: ");
  
  int[] numero = new int[10];
  int max = 0;
  int min = 999999;
  
  for (int i = 0; i <= 9; i++) {
   numero[i] = Integer.parseInt(s.nextLine());
   
   if (numero[i] < min) {
    min = numero[i];
  }   
   if (numero[i] > max) {
    max = numero[i];
  }
  }//for

  System.out.println("-----------------------------------");

  for (int i = 0; i <= 9; i++) {
    System.out.print(numero[i]);
    
    if (numero[i] == min) {
     System.out.print(" Minimo");
    }
    if (numero[i] == max) {
     System.out.print(" Maximo");
    }
    System.out.println();
  }//for
  
  }
}