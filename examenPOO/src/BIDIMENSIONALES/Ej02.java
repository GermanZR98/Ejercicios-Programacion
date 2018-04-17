
/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej02 / T7
 *
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 *
 */
import java.util.Scanner;

public class Ej02 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[][] num = new int[4][5];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print("Introduce un numero para [" + i + "," + j + "]: ");
        num[i][j] = s.nextInt();
      }
    }

    int sumaF = 0;
    int total = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.printf("%10d", num[i][j]);
        sumaF += num[i][j];
      }
      System.out.printf("%10s", "Σ =" + sumaF);
      total += sumaF;
      sumaF = 0;
      System.out.println();
    }

    int sumaC = 0;
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 4; j++) {
        sumaC += num[j][i];
      }
      System.out.printf("%10s", "Σ =" + sumaC);
      total += sumaC;
      sumaC = 0;
    }
    System.out.printf("%15s", "Σtotal = " + total);
  }
}
