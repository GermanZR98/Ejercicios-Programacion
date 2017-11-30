package tema7;

/**
 * Ejercicio1 Tema7
 *
 * @author German
 */
import java.util.Scanner;

public class Ejercicio10 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] numero = new int[20];
    int[] parA = new int[20];
    int[] imParA = new int[20];
    int[] resultado = new int[20];
    int par = 0;
    int imPar = 0;

    for (int i = 0; i <= 19; i++) {
      int aleatorio = (int) (Math.random() * 100);
      numero[i] = aleatorio;
      System.out.print(numero[i] + " ");
      if (numero[i] % 2 == 0) {
        parA[par] = numero[i];
        par++;
      }
      if (numero[i] % 2 != 0) {
        imParA[imPar] = numero[i];
        imPar++;
      }
    }//for
    System.out.println();
    for (int x = 0; x < par; x++) {
      resultado[x] = parA[x];
    }
    int a = 0;
    for (int y = par; y <= 19; y++) {
      resultado[y] = imParA[a++];
    }

    for (int x = 0; x < par; x++) {
      System.out.print(resultado[x] + " ");
    }
    
    
    for (int y = par; y <= 19; y++) {
     System.out.print(resultado[y] + " ");
    }
  }
}
