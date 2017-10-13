/**
* Ejercicio4 Tema3
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio4 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, dame el primer numero: ");
    double Num1 = Double.parseDouble(System.console().readLine());
    
    
    System.out.print("Por favor, dame otro numero: ");
    double Num2 = Double.parseDouble(System.console().readLine());
    
    double suma = Num1 + Num2;
    double resta = Num1 - Num2;
    double divi = Num1 / Num2;
    double mult = Num1 * Num2;
    
    System.out.println("Resultados: ");
    System.out.println("Suma: " + suma);
    System.out.println("Resta: " + resta);
    System.out.println("Multiplicación: " + mult);
    System.out.println("División: " + divi);
    
    
    }
}
