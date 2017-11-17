/**
* Ejercicio16 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio16 {
    public static void main(String[] args) {
      System.out.print("Dame un nº: ");
      int n = Integer.parseInt(System.console().readLine());
      int cont = 2;
      boolean primo = true;
      
      while (cont < n) {
      int resultado = n%cont;
      if (resultado == 0) {
          primo = false;
          }
        cont++;
        } //Cierra el while
        
      if (primo) {
        System.out.print("El nº es primo");
        } else {
      
        System.out.print("El nº no es primo");
        }
    }
  }
    
