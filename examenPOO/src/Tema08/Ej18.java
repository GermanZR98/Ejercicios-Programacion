package tema08;
import java.util.Scanner;
import matematicas.tratamiento;

/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej18 / T8
 *
 * Escribe un programa que pase de decimal a binario.
 */
public class Ej18 extends tratamiento {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número decimal para convertirlo a binario: ");
    long n = s.nextLong();
    System.out.println("El resultado en binario es: " + decimalABinario(n));
  }

  /**
   * Pasa un número en base 10 a binario.
   *
   * @param decimal número entero en base 10
   * @return número inicial pasado a binario
   */
  public static long decimalABinario(long decimal) {

    if (decimal == 0) {
      return 0;
    }
    //evitamos los 0 mal leidos en los extremos 
    long binario = 1;
    while (decimal > 1) {
      binario = tratamiento.pegaPorDetras(binario, decimal%2);
      decimal = decimal / 2;
    }
    binario = pegaPorDetras(binario,1);
    binario = voltea(binario);
    return quitaPorDetras(binario, 1);
  }
}
