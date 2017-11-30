package tema7;

/**
 * Ejercicio1 Tema7
 * @author German
 */
import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  int grados = 0;
  int[] numero = new int[12];
  int[] media = new int[12];
  
  for (int i = 0; i <= 11; i++) {
    System.out.print("Dime los grados del mes "+i+": ");
    numero [i] = Integer.parseInt(s.nextLine());
  }//for principal
  
  for (int i = 0; i <= 11; i++) {
    System.out.println();
   for (int j = 0;j <= numero[i]; j++) {
     System.out.print("*");
   }
  }
  
  }
}