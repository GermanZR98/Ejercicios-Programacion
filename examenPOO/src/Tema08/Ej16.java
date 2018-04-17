package tema08;
import matematicas.tratamiento;

/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej15 / T8
 *
 * Muestra los números capicúa que hay entre 1 y 99999.
 */

public class Ej16 {

  public static void main(String[] args) {
    System.out.print("Capicúas entre 1 y 99999: ");
    for (int i = 1; i <= 99999; i++) {
      if (tratamiento.esCapicua(i)) {
        System.out.print(i + " ");
      }
    }

  }
}
