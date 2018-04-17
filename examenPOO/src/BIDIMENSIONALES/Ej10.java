
/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Ej10 / T10
 *
 * Realiza el juego de las tres en raya.
 *
 */
import java.util.Scanner;

public class Ej10 {

  public static void main(String[] args) throws InterruptedException {
    String[][] tablero = new String[3][3];
    //inicia el tablero

    for (int i = 0; i < 3; i++) {
      System.out.print(i + 1 + " ");
      for (int j = 0; j < 3; j++) {
        tablero[i][j] = "-";
        System.out.print(tablero[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("  1 2 3\n¿Quién va a comenzar: 1) Máquina   Enter) Usuario: ");
    Scanner s = new Scanner(System.in);

    int ficha;
    int x;
    int y;
    boolean valido;
    boolean libre;
    boolean ganaPc;
    boolean ganaUser;
    int hor;
    int ver;
    int diaIz;
    int diaDe;
    switch (s.nextLine()) {
      case "1":
        tablero[(int) (Math.random() * 3)][(int) (Math.random() * 3)] = "X";
        break;
      default:
        System.out.println("Comienza el usuario.");
    }
    do {
      valido = false;
      libre = false;
      ganaPc = false;
      ganaUser = false;
      diaIz = 0;
      diaDe = 0;
      // comprueba si hay ganador
      for (int i = 0; i < 3 && !ganaPc && !ganaUser; i++) {
        hor = 0;
        ver = 0;
        for (int j = 0; j < 2; j++) {
          if (tablero[i][j].equals(tablero[i][j + 1])) {
            hor++;
          }
          if (tablero[j][i].equals(tablero[j + 1][i])) {
            ver++;
          }
        }
        if (i < 2 && tablero[i][i].equals(tablero[i + 1][i + 1])) {
          diaIz++;
        }
        if (i < 2 && tablero[i][2 - i].equals(tablero[i + 1][2 - i - 1])) {
          diaDe++;
        }
        if (hor == 2) { //hay dos repeticiones en la horizonal i
          switch (tablero[i][0]) {
            case "X":
              ganaPc = true;
              break;
            case "O":
              ganaUser = true;
              break;
          }
        } else if (ver == 2) { //hay dos repeticiones en la vertical i
          switch (tablero[0][i]) {
            case "X":
              ganaPc = true;
              break;
            case "O":
              ganaUser = true;
              break;
          }
        } else if (diaDe == 2) { //hay dos repeticiones en la diagonal derecha
          switch (tablero[1][1]) {
            case "X":
              ganaPc = true;
              break;
            case "O":
              ganaUser = true;
              break;
          }
        } else if (diaIz == 2) { //hay dos repeticiones en la diagonal izquierda
          switch (tablero[1][1]) {
            case "X":
              ganaPc = true;
              break;
            case "O":
              ganaUser = true;
              break;
          }
        }
      }
      if (!ganaPc && !ganaUser) { //si no hay ganador aún...
        //imprime tablero
        for (int i = 0; i < 3; i++) {
          System.out.print(i + 1 + " ");
          for (int j = 0; j < 3; j++) {
            System.out.print(tablero[i][j] + " ");
          }
          System.out.println();
        }
        System.out.println("  1 2 3");

        //Comprueba si hay casillas libres
        for (String[] lib : tablero) {
          for (String l : lib) {
            if (l.equals("-")) {
              libre = true;
            }
          }
        }
        //Juega usuario
        while (!ganaPc && !ganaUser && libre && !valido) {
          System.out.println("Introduce una coordenada xy. Ejemplo 12");
          ficha = s.nextInt();
          x = ficha % 10;
          y = ficha / 10;
          if (x < 1 || x > 3 || y < 1 || y > 3) {
            System.out.println("No es una posición válida.");
          } else if (!tablero[x - 1][y - 1].equals("-")) {
            System.out.println("Ya hay una ficha en esa posición, introduce otra coordenada: ");
          } else {
            tablero[x - 1][y - 1] = "O";
            valido = true;
          }
        }

        //Juega Maquina
        valido = false;
        Thread.sleep(1000);
        while (!ganaPc && !ganaUser && libre && !valido) {
          x = (int) (Math.random() * 3);
          y = (int) (Math.random() * 3);
          if (tablero[x][y].equals("-")) {
            valido = true;
            tablero[x][y] = "X";
          }
        }
      }
    } while (!ganaUser && !ganaPc && libre);

    //imprime tablero
    for (int i = 0; i < 3; i++) {
      System.out.print(i + 1 + " ");
      for (int j = 0; j < 3; j++) {
        System.out.print(tablero[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("  1 2 3");

    if (ganaUser) {
      System.out.println("Enhorabuena, has ganado.");
    } else if (ganaPc) {
      System.out.println("Ha ganado la máquina.");
    } else {
      System.out.println("La partida ha terminado en tablas.");
    }

  }
}
