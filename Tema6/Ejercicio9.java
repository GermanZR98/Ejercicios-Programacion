/**
* Ejercicio9 Tema 6
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio9 {
    public static void main(String[] args) {
      
      int cont = 0;
      
      for (int i = 1; i <= 100; i++) {
      int numero = (int)(Math.random()*100);
      
      System.out.print(numero+" ");
      cont++;
      
        if (numero == 24) {
        i = 100;  
        }
      }//for
      
      System.out.println();
      System.out.println("Hay "+cont+" numeros");
    }
  }
