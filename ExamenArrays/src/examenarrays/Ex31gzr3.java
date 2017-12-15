/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenarrays;

/*
 * Ejercicio 3 del examen
 * 
 * @author German Zambrana Ruiz
 * 12/12/2017
 * 1º Turno 
 */
import java.util.Scanner;

public class Ex31gzr3 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("   * * * * * * *");
    System.out.print("\n   *           *");
    System.out.println();
    System.out.print("   *");

    int anchura = 19;
    int posicion = 0;
    int posicionV = 0;
    int posicionS = 0;
    int posicionO = 0;

    while ((posicionV == posicionS) || (posicionO > posicionV) || (posicionO < posicionS)) {
      posicionV = (int) (Math.random() * (11));
      posicionS = (int) (Math.random() * (11));
      posicionO = (int) (Math.random() * (9));
    }

    for (int i = 1; i < anchura; i++) {
      if (posicion == posicionV) {
        System.out.print("V");
      } else if (posicion == posicionS) {
        System.out.print("S");
      } else if (posicion == posicionO) {
        System.out.print("o");
      } else {
        System.out.print(" ");
      }
      posicion++;
    }
    
    System.out.println();
    System.out.print("-------------------");
  } //Class
} //Static
