/**
* Ejercicio1 Tema 6
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio1 {
    public static void main(String[] args) {
      System.out.println("Tirada de 3 dados: ");
      
      int tirada;
      int suma = 0;
      
      for (int i = 1; i <= 3; i++) {
       tirada = (int)(Math.random()*7) + 1;
      
       System.out.println(tirada);
       suma += tirada;
      } //for
      System.out.println();
      System.out.print("La suma total es: "+suma);
    }
  }
  
