package ExamenDam;

/**
 * Ejercicio18 tema6
 *
 * @author German
 */
import java.util.Scanner;

public class Ejercicio3 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] inicial = new int[15];
    int[] circuerizado = new int[15];

    System.out.println("Array original:");

    for (int i = 0; i <= 14; i++) {
      inicial[i] = (int) (Math.random() * 501);
      System.out.print(inicial[i] + " ");
    }
    System.out.println();
    System.out.println("Array cincuerizado:");
    
    for (int i = 0; i <= 14; i++) {
      if (inicial[i] % 5 == 0) {
        circuerizado[i] = inicial[i];
        System.out.print(circuerizado[i] + " ");
      } else {
        circuerizado[i] = inicial[i] - (inicial[i] % 5) + 5;
        System.out.print(circuerizado[i] + " ");
      }
    }
  }
}
