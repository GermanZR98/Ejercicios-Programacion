/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendam;

/**
 *
 * @author German
 */

import java.util.Scanner;
public class explicacionArrays {

  public static void main(String[] args) {

    Scanner n = new Scanner(System.in);
    int[] array = new int[10];
    //cajoneras:                         0    |   1 |  2  |   3  |   4 |   5    | 6 ...7... 8... 9
    //valor de las cajoneras: 212 | 22 | 32 | 53 | 42 | 4324| ......

    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 101);
      System.out.print(array[i] + " ");
    }

    System.out.print("\nNúmero a buscar: ");
    int numeroConcretoDeLaKaleeshi = Integer.parseInt(n.nextLine());

    for (int i = 0; i < array.length; i++) {
      if (i == numeroConcretoDeLaKaleeshi) { //preguntamos por el ÍNDICE
        System.out.println("El número que se encuentra en el índice " + i + " es el : " + array[i]);
      }
    }

    for (int i = 0; i < array.length; i++) {
      if (array[i] == numeroConcretoDeLaKaleeshi) { //preguntamos por el VALOR del índice
        System.out.println("El número se encuentra en el índice " + i);
      }
    }

  }
}
