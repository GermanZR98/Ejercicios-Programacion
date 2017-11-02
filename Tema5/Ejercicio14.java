/**
* Ejercicio14 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio14 {
    public static void main(String[] args) {
      System.out.print("Dame una base: ");
      int b = Integer.parseInt(System.console().readLine());
      
      System.out.print("Dame un exponente: ");
      int e = Integer.parseInt(System.console().readLine());
      
      while ((b > 0) && (e > 0)) {
        System.out.print(b+"^"+e+"=");
        e++;
        }
    }
  }
  
