/**
* Ejercicio42 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio42 {
    public static void main(String[] args) {
      System.out.print("Dime un numero: ");
      int n = Integer.parseInt(System.console().readLine());
      boolean esPrimo = true;
      
      for (int i = n; i < n+5; i++) {
        
        for (int cont = 2; cont < i; cont++) {
          if (i%cont == 0) {
              esPrimo = false;
          }
        } //for
        
        if (esPrimo) {
        System.out.println("El "+i+" es primo");
        } else {
      
        System.out.println("El "+i+" no es primo");
        esPrimo = true;
        }
      } //For
    }
  }
      
