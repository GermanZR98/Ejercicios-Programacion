package tema7;

/**
 * Ejercicio1 Tema7
 *
 * @author German
 */
import java.util.Scanner;

public class Ejercicio16 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] numero = new int[20];
    int aleatorio = 0;

    for (int i = 0; i <= 19; i++) {
      aleatorio = (int) (Math.random() * 400);
      numero[i] = aleatorio;
    }

    System.out.print("¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7):");
    int opcion = Integer.parseInt(s.nextLine());

    if (opcion == 1) {
      for (int i = 0; i <= 19; i++) {
        if (numero[i] % 5 == 0) {
          System.out.print("[" + numero[i] + "]");
        } else {
          System.out.print(numero[i]);
        }
      }
    }

  }
}
