package ExamenDam;

/**
 * Ejercicio18 tema6
 *
 * @author German
 */
import java.util.Scanner;

public class Ejercicio1 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numero = 0;
    int cont = 0;
    int cuentaPrimos = 0;
    int[] primos = new int[20];
    boolean esPrimo = true;

    for (int i = 0; i < 20; i++) {
      numero = (int) (Math.random() * 98) + 2;

      System.out.print(numero + " ");

      cont = 2;
      esPrimo = true;
      while (cont < numero) {
        if ((numero % cont) == 0) {
          esPrimo = false;
        }
        cont++;
      }

      if (esPrimo) {
        primos[cuentaPrimos] = numero;
        cuentaPrimos++;
      }
    }//for 
    System.out.println("Cuenta Primos: " + cuentaPrimos);
    System.out.println();
    System.out.print("Numero de primos: ");
    for (int k = 0; k < cuentaPrimos; k++) {
      System.out.print(primos[k] + " ");
    }
  }
}
