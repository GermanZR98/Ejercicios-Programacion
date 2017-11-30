package tema7;

/**
 * Ejercicio1 Tema7
 * @author German
 */
import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  int[] numero = new int[10];
  System.out.println("Dime 10 numeros: ");
  
  for (int i = 0; i <= 9; i++) {
   numero[i] = Integer.parseInt(s.nextLine());
  }
  
  for (int j = 9; j >= 0; j--) {
   System.out.print(numero[j]+" "); 
  }
  
  }
}
  