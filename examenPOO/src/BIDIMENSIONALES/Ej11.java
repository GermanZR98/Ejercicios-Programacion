
/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej11 / T7
 *
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal
 *
 */
public class Ej11 {

  public static void main(String[] args) {
    int[][] matriz = new int[10][10];
    int maximo = 199;
    int minimo = 301;
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        matriz[i][j] = (int) (Math.random() * (300 - 200) + 200);
        System.out.printf("%5d", matriz[i][j]);
      }
      System.out.println();
    }
    int sumaDia = 0;
    //recorre
    System.out.print("\nDiagonal: ");
    for (int i = 0; i < 10; i++) {
      if (matriz[i][i] < minimo) {
        minimo = matriz[i][i];
      } else if (matriz[i][i] > maximo) {
        maximo = matriz[i][i];
      }
      System.out.print(matriz[i][i] + " ");
      sumaDia += matriz[i][i];
    }
    System.out.println("\nMedia: " + (double)(sumaDia/10.0) + "\nMáximo: "
      + maximo + "\nMínimo: " + minimo);
  }
}
