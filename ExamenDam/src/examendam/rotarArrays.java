/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendam;

import java.util.Scanner;

/**
 *
 * @author German
 */
public class rotarArrays {

  public static void main(String[] args) {

    Scanner n = new Scanner(System.in);
    int[] array = new int[10];
    int[] aux = new int[10];

    for (int i = 0; i < 10; i++) {
      array[i] = (int) (Math.random() * 100);
      System.out.print(array[i] + "     ");
    }

    for (int i = 1; i < 10; i++) {
      aux[i] = array[i - 1];
    }

    System.out.println();
    System.out.println();

    aux[0] = array[9];

    for (int i = 0; i < 10; i++) {
      System.out.print(aux[i] + "     ");
    }
  }
}
