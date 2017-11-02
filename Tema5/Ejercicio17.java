/**
* Ejercicio17 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio17 {
    public static void main(String[] args) {
      System.out.print("Dame un nº y te sumo los 100 primeros: ");
      int n = Integer.parseInt(System.console().readLine());
      int total = n + 100;
      int suma = 0;
      while (n < total) {
        System.out.print(n+1+" ");
        n++;
        suma = n + suma;
        } 
        System.out.print("Total: " +suma);
      }
    }
    
