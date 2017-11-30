package tema7;

/**
 * Ejercicio1 Tema7
 * @author German
 */
import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  System.out.println("Dame 8 números: ");
  int[] numero = new int[8];
  
  for (int i = 0; i <= 7; i++) {
  numero[i] = Integer.parseInt(s.nextLine());
  }
  
  System.out.println("---------------------------");
  
  for (int i = 0; i <= 7; i++) {
   System.out.print(numero[i]);
   if (numero[i] % 2 == 0) {
    System.out.print(" Par ");
    } else  {
    System.out.print(" Impar ");
    }
  }

  }
}
  