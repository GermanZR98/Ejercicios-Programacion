package ExamenDam;

/**
 * Ejercicio17 tema 6
 *
 * @author German
 */
import java.util.Scanner;

public class Ejercicio4 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor introduzca la anchura de la pecera: ");
    int anchura = Integer.parseInt(s.nextLine());

    System.out.print("\nPor favor introduzca la altura de la pecera: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());

    int altura = 0;
    int espacios = anchura - 2;
    int espaciosTotales = (anchura - 2) * (alturaIntroducida - 2);
    int pez = 0;
    int caballito = 0;
    int caracola = 0;
    int contador = 0;

    while (pez == caballito || pez == caracola || caballito == caracola) {
      pez = (int) (Math.random() * espaciosTotales);
      caballito = (int) (Math.random() * espaciosTotales);
      caracola = (int) (Math.random() * espaciosTotales);
    }

    for (int i = 0; i <= anchura; i++) { //pinta la parte superior de la pecera
      System.out.print("*");
    }

    System.out.println();
    altura++;

    while (altura < alturaIntroducida) {
      System.out.print("*");

      for (int i = 0; i <= espacios; i++) {
        if (contador == caracola) {
          System.out.print("@");
        } else if (contador == caballito) {
          System.out.print("$");
        } else if (contador == pez) {
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
        contador++;
      }

      altura++;
      System.out.println("*");

    }

    for (int i = 0; i <= anchura; i++) { //pinta la base
      System.out.print("*");
    }

  }
}
