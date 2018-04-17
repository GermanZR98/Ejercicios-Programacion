package tema08;
import java.util.Scanner;
import matematicas.tratamiento;

/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej17 / T8
 *
 * Escribe un programa que pase de binario a decimal.
 */
public class Ej17 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número binario para convertirlo a decimal: ");

    long n = s.nextLong();
    long dec = 0;
    for (int i = 0; i < tratamiento.digitos(n); i++) {
      dec += tratamiento.potencia(2, i) * tratamiento.digitoN(n, tratamiento.digitos(n) - i - 1); //para que tome la posición i=0 como la última cifra del número
    }
    System.out.println("Resultado: " + dec);
  }
}
