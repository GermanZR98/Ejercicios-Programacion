/**
* Ejercicio22 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio22 {
    public static void main(String[] args) {
      
      int i = 1;
      int n = 2;
      boolean primo = true;
      int resultado = 0;
      
      while (n <= 100) {
        while (i < 100) {
          resultado = n%i;
          if (resultado == 0) {
          primo = false;
          }
          i++;
          n++;
        }
       if (primo) {
        System.out.println(n);
        } 
      }
    }
  }
  
    
