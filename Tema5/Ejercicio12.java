/**
* Ejercicio12 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio12 {
    public static void main(String[] args) {
      System.out.print("Cuántos nº quiere mostrar: ");
      
      int n = Integer.parseInt(System.console().readLine());
      int num1 = 0;
      int num2 = 1;
      int aux = 0;
      int control = 1;
     
      while (control <= n) {
        System.out.print(" " + aux);
        
        num1 = num2;
        num2 = aux;
        aux = num1+num2;
        control++;
      }
    }
  }
    
      
      
