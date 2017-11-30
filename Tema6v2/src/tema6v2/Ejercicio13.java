/**
* Ejercicio13 Tema 6
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio13 {
    public static void main(String[] args) {
      
      boolean tirada = true;
      
      while (tirada == true) {
        int dado1 = (int)(Math.random()*6);
        int dado2 = (int)(Math.random()*6);
        
        System.out.print(dado1+"y"+dado2+"   ");
        
        if (dado1 == dado2) {
        tirada = false;  
        }
      }//while
      
    }
  }
