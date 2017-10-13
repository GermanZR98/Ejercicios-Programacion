/**
* Ejercicio1 Tema3
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio1 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, dame un número: ");
    int Num1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, dame otro número: ");
    int Num2 = Integer.parseInt(System.console().readLine());
    
    int mult = (Num1 * Num2);
    System.out.println("El resultado de la multiplicación es: " +  mult);
    
    
    }
}
