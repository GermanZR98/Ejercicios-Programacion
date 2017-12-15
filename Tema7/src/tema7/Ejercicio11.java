package tema7;

/**
 * Ejercicio1 Tema7
 *
 * @author German
 */
import java.util.Scanner;

public class Ejercicio11 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] arrayGeneral = new int[10];
    int[] arrayNoPrimo = new int[10];
    int[] arrayAux = new int[10];
    int cont = 2;
    int numero = 0;
    int posicion = 0;
    boolean esPrimo = true;

    for (int i = 0; i <= 9; i++) {
      System.out.print("Dame un número: ");
      numero = Integer.parseInt(s.nextLine());
      arrayGeneral[i] = numero;
      esPrimo = true; ////////////////////////hay que reiniciar
      cont = 2;      ///////////////////////hay que reiniciar
      while (cont < arrayGeneral[i]) {
        if ((arrayGeneral[i] % cont) == 0) {
          esPrimo = false;
        }
        cont++;
      }
      if (esPrimo) {
        arrayAux[posicion] = arrayGeneral[i];
        posicion++;
      }

    }//for

    for (int i = 0; i <= 9; i++) {
      esPrimo = true;
      cont = 2;     
      while (cont < arrayGeneral[i]) {
        if ((arrayGeneral[i] % cont) == 0) {
          esPrimo = false;
        }
        cont++;
      }
      if (esPrimo == false) {
        arrayAux[posicion] = arrayGeneral[i];
        posicion++;
      }
    }//for

    for (int i = 0; i <= 9; i++) {
    System.out.print(arrayAux[i]);
    }
  }
}
