package tema7;

/**
 * Ejercicio1 Tema7
 * @author German
 */
import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  System.out.println("Dime 15 numeros: ");
  int[] numero = new int[15];
  
  for (int i = 0; i <= 14; i++) {
   numero[i] = Integer.parseInt(s.nextLine());
  }
  
  System.out.println("------------------------------------");
  
  for (int i = 1; i <= 14; i++) {
   System.out.println(numero[i]);
  }
  
  System.out.println(numero[0]);
  
  }
}
  