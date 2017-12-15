package ExamenDam;

/**
 * Ejercicio18 tema6
 *
 * @author German
 */
import java.util.Scanner;

public class Ejercicio1Capicua {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numero = 0;
    int cont = 0;
    int aux = 0;
    int volteado = 0;
    int cuentaVolteado = 0;
    int[] numeroVolteado = new int [20];
    
    for (int i = 0; i < 20; i++) {
      numero = (int) (Math.random() * 98) + 2;

      System.out.print(numero + " ");

      if (numero >= 0) {
        aux = numero;
        volteado = 0;

        while (aux > 0) {
          volteado = (volteado * 10) + (aux % 10);
          aux /= 10;

          if (volteado == numero) {
            numeroVolteado[cuentaVolteado] = numero;
            cuentaVolteado++;
          }
        }

      }
    }//for 
    System.out.println("Numeros Capicua: " + cuentaVolteado);
    System.out.println();
    System.out.print("Numeros Capicuas: ");
    for (int k = 0; k < cuentaVolteado; k++) {
      System.out.print(numeroVolteado[k] + " ");
    }
  }
}
