
package tema6v2;

/**
 * Ejercicio17 tema 6
 * @author German
 */
import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  int parMax = 1;
  int impMin = 999999;
  int cont = 0;
  int suma = 0;
  
  for (int i = 1; i <= 50; i++) {
   int numero = (int)((Math.random()*301)-100);
   System.out.print(numero+" ");
   
   suma += numero;
   cont++;
   
    if (numero % 2 == 0) {   
      if (numero > parMax) {
       parMax = numero;
      }
    }//ifpar
     
    if (numero % 2 != 0) {   
      if (numero < impMin) {
       impMin = numero;
      }
    }//ifimpar
  }//for
  System.out.println();
  System.out.println("La media es de: "+suma/cont);
  System.out.println("El numero par mas grande es: "+parMax);
  System.out.println("El numero impar mas pequeño es: "+impMin);
  
  }
}
  
