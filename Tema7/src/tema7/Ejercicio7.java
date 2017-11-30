package tema7;

/**
 * Ejercicio1 Tema7
 * @author German
 */
import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
 
  int aleatorio = 0;
  int sustituir = 0;
  int[] numero = new int[100];
  
  for (int i = 1; i <= 99; i++) {
  aleatorio = (int)(Math.random()*20);
  numero[i] = aleatorio;
  System.out.print(numero[i]+" ");
  }
  
  System.out.println();
  System.out.println("Dame el numero al que sustituir: ");
  sustituir = Integer.parseInt(s.nextLine());
  
  System.out.println("Dime el numero por el que sustituir: ");
  int sustituto = Integer.parseInt(s.nextLine());
  
  for (int i = 1; i <= 99; i++) {
    if (numero[i] == sustituir) {
    numero[i] = sustituto;
    }
    if (numero[i] == sustituto) {
    System.out.print("'"+numero[i]+"' ");
    } else {
    System.out.print(numero[i]+" ");
    }
  }////for
  
  }
}
