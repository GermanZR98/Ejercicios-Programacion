
package tema6v2;

/**
 * Ejercicio17 tema 6
 * @author German
 */
import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
  int alturaInt = Integer.parseInt(s.nextLine());
  int espacios = 2;
  
  for (int altura = 1; altura <= alturaInt-1; altura++){
    System.out.print("*"); 
    System.out.print("    ");
    System.out.print("*");
    System.out.println();
  }
  
  System.out.print("******");
  
  
  
  
  
  
  
  
  
  }
}