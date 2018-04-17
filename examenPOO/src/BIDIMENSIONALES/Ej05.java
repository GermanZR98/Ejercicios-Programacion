
/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej05 / T7
 *
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 * A continuación, el programa deberá dar la posición tanto del máximo como
 * del mínimo
 *
 */
public class Ej05 {

  public static void main(String[] args) {
    int[][] num = new int[6][10];
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        num[i][j] = (int) (Math.random() * 1001);
      }
    }
    System.out.println("Array:");
    for (int[] num1 : num) {
      for (int n : num1) {
        System.out.printf("%5d", n);
      }
      System.out.println();
    }

    int maximo = -1;
    int minimo = 1001;
    int filMaximo = 0;
    int colMaximo = 0;
    int filMinimo = 0;
    int colMinimo = 0;
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        if (num[i][j] > maximo) {
          maximo = num[i][j];
          filMaximo = i;
          colMaximo = j;
        } else if (num[i][j] < minimo) {
          minimo = num[i][j];
          filMinimo = i;
          colMinimo = j;
        }
      }
    }
    System.out.println("\nMáximo: " + maximo + " situado en la posicion [" + filMaximo + "," + colMaximo + "]");
    System.out.println("Mínimo: " + minimo + " situado en la posicion [" + filMinimo + "," + colMinimo + "]");
  }
}
