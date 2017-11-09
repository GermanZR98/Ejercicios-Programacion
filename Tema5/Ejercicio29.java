/**
* Ejercicio29 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio29 {
    public static void main(String[] args) {
      System.out.print("Dime un número: ");
      int numero = Integer.parseInt(System.console().readLine());
      
      System.out.print("Dime el nº por el que no sea divisible: ");
      int divisible = Integer.parseInt(System.console().readLine());
      int cont = 0;
      
      while (cont < numero) {
        if (cont % divisible != 0) {
        System.out.println(cont);
        }
        cont++;
      }
  }
}

