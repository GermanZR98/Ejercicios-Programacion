/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas;

/**
 *
 * @author Equipo
 */
public class Varias {

  /**
   * Esta función convierte el número n al sistema de palotes y lo devuelve en
   * una cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | -
   * | | | | | | | - - | | - | - | | | en el sistema de palotes
   *
   * @param n
   * @return
   */
  public static String convierteEnPalotes(long n) {
    String palotes = "";

    if (n == 0) {
      return "-";
    } else if (n < 0) {
      palotes += "-";
      n = Math.abs(n);
    }

    n = tratamiento.pegaPorDetras(n, 1);
    n = tratamiento.voltea(n);

    while (n != 1 && n > 0) {

      for (int i = 0; i < n % 10; i++) {
        palotes += "|";
      }

      n /= 10;
      if (n != 1) {
        palotes += "-";
      }

    }
    return palotes;
  }

  /**
   * Esta función convierte el número n al sistema de palotes y lo devuelve en
   * una cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | -
   * | | | | | | | - - | | - | - | | | en el sistema de palotes
   *
   * @param n
   * @return
   */
  public static String convierteEnPalotes(int n) {
    return convierteEnPalotes((long) n);
  }

  /**
   * Devuelve un array con todos los números primos que se encuentren en otro
   * array que se pasa como parámetro. Obviamente el tamaño del array que se
   * devuelve será menor o igual al que se pasa como parámetro.
   *
   * @param x
   * @return
   */
  public static int[] filtraPrimos(int x[]) {
    int tam = 0;
    for (int n : x) {
      if (tratamiento.esPrimo(n)) {
        tam++;
      }
    }
    int[] aux = new int[tam];
    tam = 0;
    for (int n : x) {
      if (tratamiento.esPrimo(n)) {
        aux[tam++] = n;
      }
    }
    return aux;
  }

  /**
   * Imprime por consola un array bidimensional.
   *
   * @param array
   */
  public static void printArrayBi(int[][] array) {
    for (int[] a : array) {
      for (int n : a) {
        System.out.print(n + " ");
      }
      System.out.println();
    }
    System.out.println("=================");
  }

  /**
   * Imprime por consola un array de una dimension.
   *
   * @param array
   */
  public static void printArray(int[] array) {
    System.out.print("[");
    for (int n : array) {
      System.out.print(" " + n + " ");
    }
    System.out.print("]\n");
  }

  /**
   * Esta función convierte el número n al sistema Morse y lo devuelve en una
   * cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _
   * _ en Morse.
   *
   * @param n
   * @return
   */
  public String convierteEnMorse(int n) {
    String morse = "";
    String[] diccionario = {"_ _ _ _ _ ", ". _ _ _ _ ", ". . _ _ _ ", ". . . _ _ ",
      ". . . . _ ", ". . . . . ", "_ . . . . ", "_ _ . . . ", "_ _ _ . . ", "_ _ _ _ . "};
    n = tratamiento.pegaPorDetras(n, 1);
    n = tratamiento.voltea(n);
    while (n != 1) {
      morse += diccionario[n % 10];
      n /= 10;
    }
    return morse;
  }

  /**
   * Devuelve un array con todos los números capicúa que se encuentren en otro
   * array que se pasa como parámetro. Obviamente el tamaño del array que se
   * devuelve será menor o igual al que se pasa como parámetro.
   *
   * @param x
   * @return
   */
  public int[] filtraCapicuas(int x[]) {
    int tam = 0;
    for (int n : x) {
      if (tratamiento.esCapicua(n)) {
        tam++;
      }
    }
    int[] aux = new int[tam];
    tam = 0;
    for (int n : x) {
      if (tratamiento.esCapicua(n)) {
        aux[tam++] = n;
      }
    }
    return aux;
  }

  /**
   * Esta función convierte los dígitos del número n en las correspondientes
   * palabras y lo devuelve todo en una cadena de caracteres. Por ejemplo, el
   * 470213 convertido a palabras sería: cuatro, siete, cero, dos, uno, tres
   *
   * @param n
   * @return
   */
  public String convierteEnPalabras(int n) {
    String numero = "";
    String[] dic = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
    n = tratamiento.pegaPorDetras(n, 1);
    n = tratamiento.voltea(n);
    while (n != 1) {
      numero += dic[n % 10] + " ";
      n /= 10;
    }
    return numero;

  }

  /**
   * Devuelve un array con todos los números que contienen el 7 (por ej. 7, 27,
   * 782) que se encuentren en otro array que se pasa como parámetro. El tamaño
   * del array que se devuelve será menor o igual al que se pasa como parámetro.
   *
   * @param x
   * @return
   */
  public int[] filtraCon7(int x[]) {
    int con = 0;
    boolean es7;

    for (int n : x) {
      es7 = false;
      while (n > 0 && !es7) {
        if (n % 10 == 7) {
          con++;
          es7 = true;
        }
        n /= 10;
      }
    }
    int[] aux = new int[con];
    int num;
    con = 0;
    for (int n : x) {
      es7 = false;
      num = n;
      while (n > 0 && !es7) {
        if (n % 10 == 7) {
          aux[con++] = num;
          es7 = true;
        }
        n /= 10;
      }
    }
    return aux;
  }
}
