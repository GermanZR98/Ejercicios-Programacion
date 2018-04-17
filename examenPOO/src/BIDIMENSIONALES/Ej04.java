
/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej04 / T7
 *
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
 * total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
 * que el ordenador se queda “pensando” antes de mostrar los números.
 *
 */

public class Ej04 {

  public static void main(String[] args) throws InterruptedException {
    int[][] num = new int[4][5];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        num[i][j] = (int) (Math.random() * (999 - 100) + 100);
      }
    }

    int sumaF = 0;
    int total = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.printf("%10d", num[i][j]);
        sumaF += num[i][j];
      }
      Thread.sleep(1000);
      System.out.printf("%10s", "Σ= " + sumaF);
      total += sumaF;
      sumaF = 0;
      System.out.println();
    }

    int sumaC = 0;
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 4; j++) {
        sumaC += num[j][i];
      }
      Thread.sleep(1000);
      System.out.printf("%10s", "Σ= " + sumaC);
      total += sumaC;
      sumaC = 0;
    }
    Thread.sleep(1000);
    System.out.printf("%16s", "Σtotal= " + total);
  }
}
