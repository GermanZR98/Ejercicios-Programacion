/**
* Ejercicio5 Tema 6
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio5 {
    public static void main(String[] args) {
      
      int max = 1;
      int min = 9999999;
      int cont = 50;
      int suma = 0;

      
      for (int i = 1; i <= 50; i++) {
        
        int numero = ((int)(Math.random()*100) + 100);
        System.out.print(numero+" ");
        suma += numero;
        
        if (numero > max) {
          max = numero;
        }
        
        if (numero < min) {
          min = numero;
        }
        
      }//for
      System.out.println();
      System.out.println("EL numero maximo es: "+max);
      System.out.println("EL numero minimo es: "+min);
      System.out.println("La media es: "+suma/cont);
    }
  }
