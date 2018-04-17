package matematicas;

/**
 *
 * @author Equipo
 */
public class tratamientoArrays {

  /**
   * Genera un array de 1 dimensión, de tamaño <code>tam</code> y rellenado
   * de números aleatorios comprendidos entre
   * [<code>minimo</code>,<code>maximo</code>]
   *
   * @param tam
   * @param minimo
   * @param maximo
   * @return Array de 1 dimensión
   */
  public static int[] generaArrayInt(int tam, int minimo, int maximo) {
    int[] aux = new int[tam];
    for (int i = 0; i < aux.length; i++) {
      aux[i] = (int) (Math.random() * (maximo - minimo + 1) + minimo);
    }
    return aux;
  }

  /**
   * Extrae el valor entero más bajo de un array[n]
   *
   * @param array
   * @return
   */
  public static int minimoArrayInt(int array[]) {
    int minimo = Integer.MAX_VALUE;
    for (int n : array) {
      if (n < minimo) {
        minimo = n;
      }
    }
    return minimo;
  }

  /**
   * Extrae el valor entero más alto de un array[n]
   *
   * @param array
   * @return
   */
  public static int maximoArrayInt(int array[]) {
    int maximo = Integer.MIN_VALUE;
    for (int n : array) {
      if (n > maximo) {
        maximo = n;
      }
    }
    return maximo;
  }

  /**
   * Extrae la media de los números contenidos en un array[n]
   *
   * @param array
   * @return
   */
  public static double mediaArrayInt(int array[]) {
    int suma = 0;
    for (int n : array) {
      suma += n;
    }
    return suma / array.length;
  }

  /**
   * Comprueba si el valor <code>n</code> está en un array[n]
   *
   * @param array
   * @param n
   * @return <code>true</code> o <code>false</code>
   */
  public static boolean estaEnArrayInt(int array[], int n) {
    for (int a : array) {
      if (a == n) {
        return true;
      }
    }
    return false;
  }

  /**
   * Devuelve el ínidice que ocupa un número <code>n</code> en un
   * <code>array[n]</code>
   *
   * @param array
   * @param n
   * @return
   */
  public static int posicionEnArray(int array[], int n) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == n) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Devuelve un <code>array[n]</code> invertido
   *
   * @param array
   * @return
   */
  public static int[] volteaArrayInt(int array[]) {
    int aux[] = new int[array.length];
    int cont = aux.length;
    for (int n : array) {
      aux[--cont] = n;
    }
    return aux;
  }

  /**
   * Devuelve la copia de un <code>array[]</code> rotado <code>n</code> veces
   * hacia la derecha
   *
   * @param array
   * @param n
   * @return
   */
  public static int[] rotaDerechaArrayInt(int array[], int n) {
    int aux[] = array.clone();
    int a;
    for (int i = 0; i < n; i++) {
      a = aux[aux.length - 1];
      for (int j = aux.length - 2; j >= 0; j--) {
        aux[j + 1] = aux[j];
      }
      aux[0] = a;
    }
    return aux;
  }

  /**
   * Devuelve la copia de un <code>array[]</code> rotado <code>n</code> veces
   * hacia la izquierda
   *
   * @param array
   * @param n
   * @return
   */
  public static int[] rotaIzquierdaArrayInt(int array[], int n) {
    int aux[] = array.clone();
    int a;
    for (int i = 0; i < n; i++) {
      a = aux[0];
      for (int j = 0; j < aux.length - 1; j++) {
        aux[j] = aux[j + 1];
      }
      aux[aux.length - 1] = a;
    }
    return aux;

  }
}
