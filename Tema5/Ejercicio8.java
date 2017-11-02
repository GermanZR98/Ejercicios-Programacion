/**
* Ejercicio8 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio8 {
    public static void main(String[] args) {
      
      System.out.print("Dame un número: ");
      int num = Integer.parseInt(System.console().readLine());
      
      for (int i = 0; i < 11 ; i++) {
      
        int result = i * num;
        System.out.println(i + " * " + num + " = " + result);
      }
    }
  }
  
