package tema08;
/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej29-34 / T8
 *
 */

import matematicas.tratamientoBiArrays;

public class Ej29_34 {

  public static void main(String[] args) {

    //GENERA UN ARRAY DE 5x7 CON NÚMEROS ALEATORIOS [0,9]
    int[][] array = tratamientoBiArrays.generaArrayBiInt(5, 7, 0, 9);
    System.out.println("Array de 5x7 con números aleatorios entre [0,9]");
    print(array);

    //OBTIENE LA FILA 4 (INDICE 3)
    System.out.print("Fila 4: ");
    print(tratamientoBiArrays.filaDeArrayBiInt(array, 3));

   
    //OBTIENE LA COLUMNA 5 (INDICE 4)
    System.out.print("Columna 5: ");
    print(tratamientoBiArrays.columnaDeArrayBiInt(array, 4));

    //OBTIENE LAS COORDENADAS DEL NÚMERO 5. [-1,-1] SI NO EXISTE
    System.out.print("Coordenadas del número 5 (primera ocurrencia): ");
    print(tratamientoBiArrays.coordenadasEnArrayBiInt(array, 5));

    //COMPRUEBA SI LA PRIMERA OCURRENCIA DEL NÚMERO 4 ES PUNTO DE SILLA
    if (tratamientoBiArrays.coordenadasEnArrayBiInt(array, 4)[0] != -1) {
      System.out.println("Es punto de silla el número 4: " + tratamientoBiArrays.esPuntoDeSilla(array, 4));
    } else {
      System.out.println("El número 4 no está dentro del Array");
    }

    //OBTIENE LA DIAGONAL NOSE (DIAGONAL DECRECIENTE)
    System.out.print("Diagonal nose [2,6]: ");
    print(tratamientoBiArrays.diagonal(array, 2, 6, "nose"));

    //OBTIENE LA DIAGONAL NESO (DIAGONAL CRECIENTE)
    System.out.print("Diagonal neso [4,1]: ");
    print(tratamientoBiArrays.diagonal(array, 4, 1, "neso"));

  }

  public static void print(int[][] array) {
    System.out.println("=================");
    for (int[] a : array) {
      System.out.print("| ");
      for (int n : a) {
        System.out.print(n + " ");
      }
      System.out.print("|\n");
    }
    System.out.println("=================");
  }

  public static void print(int[] array) {
    System.out.print("[");
    for (int n : array) {
      System.out.print(" " + n + " ");
    }
    System.out.print("]\n");
  }
}
