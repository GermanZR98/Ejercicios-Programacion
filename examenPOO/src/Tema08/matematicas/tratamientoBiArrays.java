package matematicas;

/**
 *
 * @author Juan Francisco Bernal Rodríguez
 */
public class tratamientoBiArrays {

  /**
   * Genera un array de bidimensional, de tamaño <code>n</code> x <code>m</code>
   * relleno de números aleatorios comprendidos entre
   * [<code>minimo</code>,<code>maximo</code>]
   *
   * @param n
   * @param m
   * @param minimo
   * @param maximo
   * @return Array de 1 dimensión
   */
  public static int[][] generaArrayBiInt(int n, int m, int minimo, int maximo) {
    int[][] aux = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        aux[i][j] = (int) (Math.random() * (maximo - minimo + 1) + minimo);
      }
    }
    return aux;
  }

  /**
   * Devuelve la fila i-ésima del array que se pasa como parámetro
   *
   * @param array
   * @param fila
   * @return
   */
  public static int[] filaDeArrayBiInt(int[][] array, int fila) {
    int[] aux = new int[array[0].length];
    for (int i = 0; i < aux.length; i++) {
      aux[i] = array[fila][i];
    }
    return aux;
  }

  /**
   * Devuelve la columna j-ésima del array que se pasa como parámetro
   *
   * @param array
   * @param columna
   * @return
   */
  public static int[] columnaDeArrayBiInt(int[][] array, int columna) {
    int[] aux = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      aux[i] = array[i][columna];
    }
    return aux;
  }

  /**
   * Devuelve la fila y la columna (en un array con dos elementos) de la primera
   * ocurrencia de un número dentro de un array bidimensional. Si el número no
   * se encuentra en el array, la función devuelve el array {-1, -1}
   *
   * @param array
   * @param elemento
   * @return
   */
  public static int[] coordenadasEnArrayBiInt(int[][] array, int elemento) {
    int[] aux = {-1, -1};
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        if (array[i][j] == elemento) {
          aux[0] = i;
          aux[1] = j;
          return aux;
        }
      }
    }
    return aux;
  }

  /**
   * Dice si un número es o no punto de silla, es decir, mínimo en su fila y
   * máximo en su columna.
   *
   * @param array
   * @param elemento
   * @return
   */
  public static boolean esPuntoDeSilla(int[][] array, int elemento) {
    int[] cord = coordenadasEnArrayBiInt(array, elemento);
    int[] fila = filaDeArrayBiInt(array, cord[0]);
    int[] columna = columnaDeArrayBiInt(array, cord[1]);

    return (tratamientoArrays.minimoArrayInt(fila) == elemento
      && tratamientoArrays.maximoArrayInt(columna) == elemento);
  }

  /**
   * Devuelve un array que contiene una de las diagonales del array
   * bidimensional. La fila y la columna determinan el número que marcará las
   * dos posibles diagonales dentro del array. La dirección es una cadena de
   * caracteres que puede ser “nose” o “neso”. La cadena “nose” indica que se
   * elige la diagonal que va del noroeste hacia el sureste, mientras que la
   * cadena “neso” indica que se elige la diagonal que va del noreste hacia el
   * suroeste. Por defecto es nose.
   *
   * @param array
   * @param fila
   * @param columna
   * @param direccion
   * @return
   */
  public static int[] diagonal(int[][] array, int fila, int columna, String direccion) {
    int[] t = {fila, columna};
    int[] t2 = {fila, columna};
    //obtencion de coordenadas de inicio
    do {
      if (direccion.equals("neso".toLowerCase())) {
        if (t[0] > 0 && t[1] < array[0].length - 1) {
          t[0]--;
          t[1]++;
        }
      } else if (t[0] > 0 && t[1] > 0) {
        t[0]--;
        t[1]--;
      }
    } while (t[0] > 0 & t[1] > 0 & t[0] < array.length - 1 & t[1] < array[0].length - 1);

    //obtencion de coordenadas de fin
    do {
      if (direccion.equals("neso".toLowerCase())) {
        if (t2[0] < array.length - 1 && t2[1] > 0) {
          t2[0]++;
          t2[1]--;
        }
      } else if (t2[0] < array.length - 1 && t2[1] < array[0].length - 1) {
        t2[0]++;
        t2[1]++;
      }
    } while (t2[0] > 0 & t2[1] > 0 & t2[0] < array.length - 1 & t2[1] < array[0].length - 1);

    //obtencion del tamaño y creacion del array de la diagonal
    int tam = t2[0] - t[0] + 1;
    int[] aux = new int[tam];

    for (int i = 0; i < tam; i++) {
      if (!direccion.equals("neso".toLowerCase())) {
        aux[i] = array[t[0]++][t[1]++];
      } else {
        aux[i] = array[t[0]++][t[1]--];
      }
    }
    return aux;
  }

}
