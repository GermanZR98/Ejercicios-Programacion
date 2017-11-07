/**
* Ejercicio22 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio22 {
    public static void main(String[] args) {
      
      for (int numero = 2; numero < 100; numero++) {
      int cont = 2;
      boolean primo = true;
      
      while (cont < numero) {
      int resultado = numero%cont;
      if (resultado == 0) {
          primo = false;
          }
        cont++;
        }
        
      if (primo) {
        System.out.print(numero + " ");
        } 
      }
  }
}
  
    
