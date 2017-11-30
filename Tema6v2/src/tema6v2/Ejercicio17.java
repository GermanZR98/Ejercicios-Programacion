
package tema6v2;

/**
 * Ejercicio17 tema 6
 * @author German
 */
import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  System.out.print("Dime la altura (min: 4): ");
  int alturaInt = Integer.parseInt(s.nextLine());
  
  System.out.print("Dime la anchura (min: 4): ");
  int anchuraInt = Integer.parseInt(s.nextLine());
  
  int altura = 1;
  int anchura = 1;
  int posicion = 0;
  int pez = (int)(Math.random()*(anchuraInt-2)*(alturaInt-2));
  
  while (anchura <= anchuraInt) {
   System.out.print("*");
   anchura++;
  }
  
  ////////////////////////////////relleno
  for (int i = 2; i < alturaInt; i ++) {
        System.out.print("\n*");//parte izq
        for (int espacios = 2; espacios < anchuraInt; espacios++) {
          
          if (posicion == pez) {
          System.out.print("&");
          } else {
          System.out.print(" ");
          }
          posicion++;
          
        }//for relleno
        System.out.println("*");
      }////for izq
      
  ///////////////////////////////Linea de abajo
   anchura = 1;
   while (anchura <= anchuraInt) {
   System.out.print("*");
   anchura++;
  }
   
  }
}
