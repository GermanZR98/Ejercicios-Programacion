/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenarrays;

/*
 * Ejercicio 1 del examen
 * 
 * @author German Zambrana Ruiz
 * 12/12/2017
 * 1º Turno 
 */
import java.util.Scanner;

public class Ex31gzr1 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numero = 0;
    int cont = 0;
    int cuentaPares = 0;
    int[] pares = new int[20];
    int cuentaMultCinco = 0;
    int[] MultCinco = new int[20];
    int cuentaMultTres = 0;
    int[] MultTres = new int[20];

    for (int i = 0; i < 20; i++) {
      numero = (int) (Math.random() * 100) + 1;

      System.out.print(numero + " ");

      if (numero % 2 == 0) {
      pares[cuentaPares] = numero;
        cuentaPares++;
      }
      
      if (numero % 5 == 0) {
      MultCinco[cuentaMultCinco] = numero;
        cuentaMultCinco++;
      }
      
      if (numero % 3 == 0) {
      MultTres[cuentaMultTres] = numero;
        cuentaMultTres++;
      }
    }//for 
    System.out.println();
    System.out.print("Múltiplos de 2: ");
    for (int k = 0; k < cuentaPares; k++) {
      System.out.print(pares[k] + " ");
    }
    System.out.println();
    System.out.print("Múltiplos de 3: ");
    for (int k = 0; k < cuentaMultTres; k++) {
      System.out.print(MultTres[k] + " ");
    }
    System.out.println();
    System.out.print("Múltiplos de 5: ");
    for (int k = 0; k < cuentaMultCinco; k++) {
      System.out.print(MultCinco[k] + " ");
    }
  }
}