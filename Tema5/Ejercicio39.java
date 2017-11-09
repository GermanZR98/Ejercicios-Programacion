/**
* Ejercicio39 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio39 {
    public static void main(String[] args) {
      System.out.print("Dime un número: ");
      int numero = Integer.parseInt(System.console().readLine());
      int result = 1;
      
      for (int factorial = 1; factorial <= numero; factorial++) {
        int operacion = result * factorial;
        result = operacion;
        System.out.println(factorial+"! = "+result);
        }
    }
  }

