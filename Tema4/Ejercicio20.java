/**
* Ejercicio20 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio20 {
  public static void main(String[] args) {
    System.out.println("Dime un número y te daré la primera cifra");
    System.out.println("Máximo 5 cifras");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero % 11 == 0) {
      System.out.println("El número introducido es capicúa");
      } else {
    
    if (numero % 11 != 0) {
      System.out.println("El número no es capicua");
      }
      }
    }
  }
  
    
