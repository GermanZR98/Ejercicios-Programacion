
/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej08 / T7
 *
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
 * a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
 * indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
 * 64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
 * se indican del 1 al 8.
 *
 */
import java.util.Scanner;

public class Ej08 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String[][] tablero = new String[8][8];
    boolean posicion = false;
    char c;
    String pos;
    String alfilPos;
    int xAlfil = 0;
    int yAlfil = 0;

    //rellena un tablero guia con las posiciones y comprueba que la posicion sea correcta
    do {
      System.out.print("Introduzca la posición del alfil [a1-h8]: ");
      alfilPos = s.next().toLowerCase();
      for (int i = 0; i < 8; i++) {
        c = 'a';
        for (int j = 0; j < 8; j++) {
          pos = String.valueOf(c) + (8 - i);
          if (pos.equals(alfilPos)) {
            xAlfil = j;
            yAlfil = i;
            tablero[i][j] = " ♝ ";
            posicion = true;
          } else {
            tablero[i][j] = pos;
          }
          c++;
        }
      }
      if (!posicion) {
        System.out.println("No se ha introducido una posición válida.");
      }
    } while (!posicion);
 
    System.out.println("El alfil puede moverse a las siguientes posiciones: ");
    
    //casillas permitidas superiores
    String[] mov = new String[13]; //maximos movimientos
    int cont = 0;
    int x = xAlfil;
    int x2 = x;

    for (int i = yAlfil - 1; i >= 0; i--) {
      if (x < 7) {
        x++;
        System.out.print("[" +tablero[i][x] + "] ");
        mov[cont++] = tablero[i][x];
      }
      if (x2 > 0) {
        x2--;
        System.out.print("[" +tablero[i][x2] + "] ");
        mov[cont++] = tablero[i][x2];
      }
    }
    //casillas permitidas inferiores
    x = xAlfil;
    x2 = x;
    for (int i = yAlfil + 1; i < 8; i++) {
      if (x > 0) {
        x--;
        System.out.print("[" + tablero[i][x] + "] ");
        mov[cont++] = tablero[i][x];
      }
      if (x2 < 7) {
        x2++;
        System.out.print("["+tablero[i][x2] + "] ");
        mov[cont++] = tablero[i][x2];
      }
    }
    //pinta un tablero con el alfil y los movimientos
    String casilla;
    System.out.println("\n");
    boolean permitido;

    for (int i = 0; i < 8; i++) {
      System.out.print(8 - i + " ");
      for (int j = 0; j < 8; j++) {
        casilla = tablero[i][j];
        permitido = false;
        for (String p : mov) {
          if (p != null && p.equals(casilla)) {
            permitido = true;
          }
        }
        if (!casilla.equals(" ♝ ") && !permitido) {
          if ((i + j) % 2 == 0) {
            System.out.print("███");
          } else{
            System.out.print("▒▒▒");
          }
        } else if (!casilla.equals(" ♝ ") && permitido) {
          if ((i + j) % 2 == 0) {
            System.out.print("█○█");
          } else{
            System.out.print("▒●▒");
          }
        } else {
          System.out.print(casilla); //alfil
        }
      }
      System.out.println();
    }
    System.out.println(("   a  b  c  d  e  f  g  h\n"));
  }
}
