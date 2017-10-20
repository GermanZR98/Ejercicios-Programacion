/**
* Ejercicio17 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Dime un número y te diré su última cifra");
    
    int numero = Integer.parseInt(System.console().readLine());
    int numero2 = numero % 10; 
    
    System.out.println("La última cifra es: " + numero2);
    
  }
}
