/**
* Ejercicio6 Tema4
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio6 {
  public static void main(String[] args) {
    System.out.println("Dame h para calcular el tiempo en caer un objeto");
    
    int h = Integer.parseInt(System.console().readLine());
    
    if (h == 0) {
        System.out.println("Si no tiene altura no puede caer");
      }
      
    if (h > 0) {
    
        System.out.println("Tarda " + Math.sqrt (((2*h))/9.81) + " s en caer");
    }
    
    if (h < 0) {
    
        System.out.println("Lo siento, es un numero negativo");
    }
  }
}

      
