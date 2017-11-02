/**
* Ejercicio13 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio13 {
    public static void main(String[] args) {
  
      int n = 0;
      int cont = 0;
      int neg = 0;
      int pos = 0;
     
      while (cont < 10) {
        System.out.print("Dime 10 números: ");
        n = Integer.parseInt(System.console().readLine());
        cont++;
        
        if (n < 0) {
          neg++;
          }
          
        if (n > 0) {
          pos++;
          }
      }
      System.out.println("Positivos: " + pos);
      System.out.println("Negativos: " + neg);
    }
  }
    
