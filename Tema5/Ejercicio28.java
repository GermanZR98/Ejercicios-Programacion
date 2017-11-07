/**
* Ejercicio28 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio28 {
    public static void main(String[] args) {
      System.out.print("Dime un número: ");
      int numero = Integer.parseInt(System.console().readLine());
      int factorial = numero;
      int result = 1;
      
      while (factorial > 0) {
        int operacion = result * factorial;
        result = operacion;
        factorial--;
        }
        System.out.println(result);
    }
  }
