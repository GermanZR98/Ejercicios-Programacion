
/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej06 / T7
 *
 * Modifica el programa anterior de tal forma que no se repita ningún número en
 * el array.
 */
public class Ej06 {

  public static void main(String[] args) {
    int[][] num = new int[6][10];
    boolean rep = false;
    int aux;
    int cont = 0;

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        do {
          aux = (int) (Math.random() * 1001);
          //el 0 esta en todas las posiciones al inicio, entonces solo permitiremos que se genera 1 vez
          if (aux == 0 && cont == 0) {
            num[i][j] = aux;
            cont++;
          } else if (aux != 0) {
            rep = false;
            for (int f = 0; f < 6 && !rep; f++) {
              for (int c = 0; c < 10; c++) {
                if (num[f][c] == aux) {
                  System.out.println("Rep: " + aux);
                  rep = true;
                }
              }
            }
            if (!rep) {
              num[i][j] = aux;
            }
          }
        } while (rep);
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
