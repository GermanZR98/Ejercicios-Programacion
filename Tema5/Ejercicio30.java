/**
* Ejercicio30 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio30 {
    public static void main(String[] args) {
      System.out.print("Dime un número: ");
      long numero = Long.parseLong(System.console().readLine());
      long numerodiez = 10;
      long numero2 = 0;
      
      while (numero > 0) {
        numero2 = numero%numerodiez;
        if (numero2 % 2 == 0) {
          System.out.println(numero2);
        }
        numerodiez*=10;
      }
    }
  }

