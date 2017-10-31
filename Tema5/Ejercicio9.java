/**
* Ejercicio9 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio9 {
    public static void main(String[] args) {
      System.out.print("Dime un número y te diré el nº de dígitos: ");
      
      int num = Integer.parseInt(System.console().readLine());
      int contador = 0;
      
      while (num > 0) {
        num = num/10;
        contador ++;
      }
      System.out.print("El nº tiene: " +contador+ " dígitos" );
    }
  }
  
