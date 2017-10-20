/**
* Ejercicio18 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("Dime un número y te daré la primera cifra");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero < 100) {
      int numero1 = (numero % 100);
      System.out.println("La primera cifra es: " + numero1);
      }
    
    if (numero < 1000) {
      int numero3 = numero % 10; 
      System.out.println("La primera cifra es: " + numero3);
      }
      
      
    if (numero > 9999) {
      System.out.println("Lo siento el numero tiene mas de 5 cifras :c");
      }
  }
}

