/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6v2;

import java.util.Scanner;

public class Ejercicio22 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
    int longitud = Integer.parseInt(s.nextLine());
    
    for (int i = 0; i <= longitud; i++) {
    int numero = (int) (Math.random() * 3) + 1;
    }
    
    for (int i = 0; i <= 12; i++) {
    System.out.print(" ");
    }
    System.out.print("@");
    System.out.println();
  }
}