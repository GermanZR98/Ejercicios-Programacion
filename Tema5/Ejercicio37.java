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
      int digito = 0;
      int palos = 0;
      
      while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
      }
      
      while (volteado > 0) {
        digito = volteado%10;
        volteado = volteado/10;
        
        palos = 0;
        while (digito > palos) {
          System.out.print("|");
          palos++;
        }
        if (digito == palos) {
            System.out.print("-");
        }
      }
    }
  }
  
  
