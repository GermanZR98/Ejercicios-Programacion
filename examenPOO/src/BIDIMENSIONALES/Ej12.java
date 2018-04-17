
/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej12 / T7
 *
 * Realiza un programa que muestre por pantalla un array de 9 filas por 9
 * columnas relleno con números aleatorios entre 500 y 900. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 *
 */
public class Ej12 {

  public static void main(String[] args) {
    int[][] matriz = new int[9][9];
    int maximo = 499;
    int minimo = 901;
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        matriz[i][j] = (int) (Math.random() * (900 - 500) + 500);
        System.out.printf("%5d", matriz[i][j]);
      }
      System.out.println();
    }
    int sumaDia = 0;
    //recorre
    System.out.print("\nDiagonal: ");
    for (int i = 0; i < 9; i++) {
      if (matriz[i][8-i] < minimo) {
        minimo = matriz[i][8 - i];
      } else if (matriz[i][8 - i] > maximo) {
        maximo = matriz[i][8 - i];
      }
      System.out.print(matriz[i][8-i] + " ");
      sumaDia += matriz[i][8-i];
    }
    System.out.println("\nMedia: " + (double) (sumaDia / 9.0) + "\nMáximo: "
      + maximo + "\nMínimo: " + minimo);
  }
}
