package tema7;

/**
 * Ejercicio1 Tema7
 *
 * @author German
 */
import java.util.Scanner;

public class Ejercicio12 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] arrayGeneral = new int[10];
    int[] arrayInicial = new int[10];
    int[] arrayUltima = new int[10];
    int inicial = 0;
    int ultima = 0;

    System.out.println("Dame 10 numeros");
    for (int i = 0; i <= 9; i++) {
      arrayGeneral[i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println();
    System.out.print("Dime la posicion inicial: ");
    inicial = Integer.parseInt(s.nextLine());
    System.out.print("Dime la posicion final: ");
    ultima = Integer.parseInt(s.nextLine());

    for (int i = 0; i <= 9; i++) {
      if (arrayGeneral[i] == inicial) {
      arrayUltima[ultima] = arrayGeneral[inicial];
      } 
      System.out.print(arrayUltima[ultima]);
    }

  }
}
