/**
* Ejercicio36 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio36 {
    public static void main(String[] args) {
      System.out.print("Dime un número: ");
      long numero = Long.parseLong(System.console().readLine());
      
      long n = numero;
      long reves = 0;
      
      while (n>0) {
        reves = (reves*10)+(n%10); //porque es *10
        n/=10;
      }
        if (reves == numero) {
          System.out.println("El número es capicúa");
        } else {
            System.out.println("El número no es capicúa");
          }
    }
  }
      
