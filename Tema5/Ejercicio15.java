/**
* Ejercicio15 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio15 {
    public static void main(String[] args) {
      System.out.print("Dame una base: ");
      int b = Integer.parseInt(System.console().readLine());
      
      System.out.print("Dame un exponente: ");
      int e = Integer.parseInt(System.console().readLine());
      int result = 1;
      int cont = 0;
      
      while (cont < e) {
        result *= b;
        cont++;
        System.out.println(b+"^"+cont+"="+result);
        }
    }
  }
  
