/**
* Ejercicio25 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio25 {
    public static void main(String[] args) {
      System.out.print("Dame un número y te lo muestro al revés: ");
      
      int n = Integer.parseInt(System.console().readLine());
      int resto = 0;

      while (n > 0) {
        resto = (resto * 10) + (n % 10);
        n /= 10;
        }
      System.out.println("El nº del revés es: " + resto);
    }
  }
  
