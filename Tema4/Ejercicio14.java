/**
* Ejercicio14 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("Dime un número y te diré si es par y divisible por 5:");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero%2 == 0) {
      System.out.println("El número " + numero + " es par");
      }
      
    if (numero%5 == 0) {
      System.out.println("El número " + numero + " es divisible por 5");
      }
      
  }
}

