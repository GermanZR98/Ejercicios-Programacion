package tema7;

/**
 * Ejercicio1 Tema7
 *
 * @author German
 */
import java.util.Scanner;

public class Ejercicio13 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int max = 0;
    int min = 9999;
    int[] array = new int[100];

    for (int i = 0; i <= 99; i++) {
      array[i] = (int) (Math.random() * 500);
      System.out.print(array[i] + " ");

      if (array[i] < min) {
        min = array[i];
      }

      if (array[i] > max) {
        max = array[i];
      }

    }

    System.out.println();
    System.out.println("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
    int mostrar = Integer.parseInt(s.nextLine());

    if (mostrar == 1) {

      for (int i = 0; i <= 99; i++) {
        if (array[i] == min) {
          System.out.print("**********" + array[i] + "*********");
        } else {
          System.out.print(array[i] + " ");
        }
      }

    }

    if (mostrar == 2) {

      for (int i = 0; i <= 99; i++) {
        if (array[i] == max) {
          System.out.print("**********" + array[i] + "*********");
        } else {
          System.out.print(array[i] + " ");
        }
      }

    }

    System.out.println();
  }
}
