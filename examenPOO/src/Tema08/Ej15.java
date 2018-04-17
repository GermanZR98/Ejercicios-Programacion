package tema08;

import matematicas.tratamiento;

/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej15 / T8
 *
 * Muestra los números primos que hay entre 1 y 1000
 */
public class Ej15 {

  public static void main(String[] args) {
    System.out.print("Primos entre 1 y 1000: ");
    long primo = 1;
    while (primo < 1000) {
      primo = tratamiento.siguientePrimo(primo);
      if (primo < 1000) {
        System.out.print(primo + " ");
      }
    }
  }
}
