/**
* Ejercicio37 Tema5
*
* @author German Zambrana Ruiz
*/
  public class Ejercicio37 {
    public static void main(String[] args) {
      System.out.print("Dime un número: ");
      
      int numero = Integer.parseInt(System.console().readLine());
      int volteado = 0;
      int numero2 = 0;
      int palos = 0;
      
      while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
      }
      
      while (volteado > 0) {
        numero2 = volteado%10;
        volteado = volteado/10;
        
        while (numero2 > palos) {
          System.out.print("|");
          palos++;
        }
        if (numero2 == palos) {
            System.out.print("-");
        }
      }
    }
  }
