/**
* Ejercicio18 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio18 {
    public static void main(String[] args) {
      System.out.println("Dime un intervale de 2 numeros ");
      System.out.print("Numero 1: ");
      int n1 = Integer.parseInt(System.console().readLine());
      
      System.out.print("Numero 2: ");
      int n2 = Integer.parseInt(System.console().readLine());
      
      while (n1 < n2) {
        System.out.print(n1 + " ");
        n1 += 7;
        }
    }
  }
  
    
